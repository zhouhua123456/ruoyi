package com.ruoyi.demoTest.EsTest;


import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.BulkResponse;
import co.elastic.clients.elasticsearch.core.GetResponse;
import co.elastic.clients.elasticsearch.core.IndexResponse;
import co.elastic.clients.elasticsearch.core.bulk.BulkOperation;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import com.ruoyi.lims.domain.LimsiSrollMain;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
public class TestRestClient {

    private static  ElasticsearchClient elasticsearchClient = null;


    @Test
    public void ElasticsearchClientBuild() {
        // Create the low-level client
        RestClient restClient = RestClient.builder(
                new HttpHost("127.0.0.1", 9200)).build();

        // Create the transport with a Jackson mapper
        ElasticsearchTransport transport = new RestClientTransport(
                restClient, new JacksonJsonpMapper());
        // And create the API client
        elasticsearchClient = new ElasticsearchClient(transport);//这个就是操作es的客户端
        System.out.println("elasticsearchClient = " + elasticsearchClient);

        //插入
        //this.insertObject();

        //查询
        //this.queryObject();

        //删除
        //this.deleteObject();

        //批量添加文档
        //this.addDocumentList();

        //批量删除文档
        //this.deleteDocumentList();

    }

    //插入对象信息
    public void insertObject(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("a2","a2");

        //这个是创建索引为lqz,id为20220424100,对象是map的---插入对象
        IndexResponse indexResponse = null;
        try {
            indexResponse = elasticsearchClient.index(a ->
                    a.index("lqz").id(String.valueOf("20220424101")).document(map));

            System.out.println("result = " + indexResponse.result().jsonValue());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //查询文档
    public void queryObject(){
        try {
            GetResponse getResponse = elasticsearchClient.get(a -> a.index("lqz").id("20220424101"), HashMap.class);
            System.out.println("result"+getResponse.source().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //删除文档
    public void deleteObject(){
        try{
            elasticsearchClient.delete(a->{
                return a.index("lqz").id("20220424101");
            });
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    //批量添加文档
    public void addDocumentList(){
        ArrayList<LimsiSrollMain> limsiSrollMains = new ArrayList<>();
        LimsiSrollMain limsiSrollMain1 = new LimsiSrollMain();
        limsiSrollMain1.setSampleId("100");
        limsiSrollMain1.setSampleName("a");

        LimsiSrollMain limsiSrollMain2 = new LimsiSrollMain();
        limsiSrollMain2.setSampleId("101");
        limsiSrollMain2.setSampleName("b");

        limsiSrollMains.add(limsiSrollMain1);
        limsiSrollMains.add(limsiSrollMain2);

        ArrayList<BulkOperation> ls = new ArrayList<>();

        limsiSrollMains.forEach(a->{
             ls.add(BulkOperation.of(b->
                    b.index(c->
                         c.id(String.valueOf(a.getSampleId())).document(a)
                    )
               ));
            }
        );

        try {
            BulkResponse responses = elasticsearchClient.bulk(x -> x.index("lqz").operations(ls));
            responses.items().forEach(i-> System.out.println("i= "+i.result()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //批量删除文档
    public void deleteDocumentList(){
        List<String> list = new ArrayList<String>();
        list.add("100");
        list.add("101");
        ArrayList<BulkOperation> bulkOperations = new ArrayList<>();
        list.forEach(a->
                        bulkOperations.add(BulkOperation.of(b ->
                                    b.delete(c->c.id(a))
                                ))
                );

        try {
            BulkResponse bulkResponse  = elasticsearchClient.bulk(a ->
                    a.index("lqz").operations(bulkOperations)
            );
            bulkResponse.items().forEach(a->
                            System.out.println("result = " + a)
                    );
            System.out.println("bulkResponse.errors() = " + bulkResponse.errors());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
