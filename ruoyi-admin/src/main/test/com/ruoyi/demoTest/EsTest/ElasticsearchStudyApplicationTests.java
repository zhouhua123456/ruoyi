package com.ruoyi.demoTest.EsTest;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryBuilders;
import com.ruoyi.framework.config.MyElasticsearchConfig;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.io.IOException;

@SpringBootTest
public class ElasticsearchStudyApplicationTests {

    @Autowired
    private ThreadPoolTaskExecutor threadPoolTaskExecutor;

    @Test
    public void addOneDocument() throws IOException {
        System.out.println(threadPoolTaskExecutor);

        MyElasticsearchConfig myElasticsearchConfig = new MyElasticsearchConfig();
        ElasticsearchClient clint = myElasticsearchConfig.getClint();
        System.out.println(clint);

        QueryBuilders.bool();
    }


}
