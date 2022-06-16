package com.ruoyi.demoTest.formula;

import com.ruoyi.common.utils.StringUtils;
import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlExpression;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * 将公式作为一个对象
 */
public class Formula {

    private String formula;//公式字符串

    //定义数字报表的小数位
    private final DecimalFormat df = new DecimalFormat("#.#####");

    //d定义公式中的操作符号
    public final static Character[] OPS = {'+','-','*','/','^'};


    //判断是不是公式
    public static boolean isFoemula(String f){

        if(StringUtils.isEmpty(f))
            return false;
        int i=0;
        while(i<f.length()){
            char c = f.charAt(i++);
            System.out.println(c);
            if(index(OPS,c) > 0 || c == '('|| c == ')')
                return true;
        }

        return false;
    }

    /**
     * 计算两个操作符的优先级<br>
     * ^  >  * / >  +- <br>
     * 若两操作符优先级相等，则返回0；
     * 若op1优先级大于op2优先级，则返回正数；
     * 若op1优先级小于op2优先级，则返回负数。
     *
     * @param op1 操作符1
     * @param op2 操作符2
     * @return 比较结果
     */
    private int prior(char op1,char op2){
        int i = index(OPS,op1);
        int j = index(OPS,op2);
        return i/2-j/2;
    }




    public static void main(String[] args) {
        String formula = "1+2*3+(4+5)*2/3+((9+1)*2)";
        JexlEngine jexlEngine = new JexlBuilder().create();
        JexlExpression expression = jexlEngine.createExpression(formula);
        Object evaluate = expression.evaluate(null);
        System.out.println(evaluate);

    }

    //找到深度最深的直接计算了
    public String [] method(String f){
        int start = 0;
        int end = 0;
        int deep = 0;
        ArrayList<Object> list = new ArrayList<>();
        for(int i=0;i<f.length();i++){
            if(f.charAt(i) == '('){

                start = i;

                deep++;
                list.add(start);

            }

        }

        for(int p = list.size()-1;p>=0;p--){
            int start1 =(int) list.get(p);
            int end1 = find(f, start1);
            String substring = f.substring(start1+1, end1);
            System.out.println(substring);
            //开始计算

            //第一次计算完成
            String jisuan = jisuan(substring);
            String concat = f.substring(0, start1).concat(jisuan).concat(f.substring(end1+1, f.length()));
            System.out.println("计算胡"+concat);



            break;
        }

        return null;
    }

    public int find(String f,int index){
        int end = 0;
        for(int i=index;i<f.length();i++){
            if(f.charAt(i) == ')'){
                end = i;
                break;
            }
        }
        return end;
    }

    //1+1
    public String jisuan(String f){
        Integer ff = null;
        for(int q=0;q<OPS.length;q++){
            if(f.indexOf(OPS[q]) != -1){
                if(OPS[q] == '+') {

                    String a = f.substring(0, f.indexOf(OPS[q]));
                    String b = f.substring(f.indexOf(OPS[q]),f.length());
                    ff = Integer.parseInt(a)+Integer.parseInt(b);
                }

            }
        }
        return ff.toString();
    }


    public static int index(Object [] arr,Object o){
        if(StringUtils.isEmpty(arr))
            return -1;
        int index = -1;
        for (int i=0;i<arr.length;i++){
            //String dto = "scwt";
            if(o==null&&arr[i]==null){
                index = i;
                break;
            }
            if(o!=null&&o.equals(arr[i])){
                index = i;
                break;
            }
        }
        System.out.println(index);
        return index;
    }

    private String[] prepare(String f){
        if(f==null)
            return null;
        String first = f;
        char op = 0;
        int index = -1;
        String second = null;
        int deep = 0;
        for(int i=0;i<first.length();i++){
            char c = first.charAt(i);
            boolean isOp = false;
            if(c=='('){
                deep++;
            }else if(c==')'){
                deep--;
            }else if(index(OPS,c)>=0){
                if(deep==0)
                    isOp = true;
            }
            if(isOp){
                if(op==0){
                    index = i;
                    op = c;
                }else{
                    int p = prior(op,c);
                    if(p>=0){//op优先级大
                        op = c;
                        index = i;
                    }
                }
            }
        }
        if(index>-1){
            second = first.substring(index+1);
            first = first.substring(0,index);
        }

        String[] ss = new String[3];
        ss[0] = format(first);
        if(second!=null){
            ss[1] = String.valueOf(op);
            ss[2] = format(second);
        }
        return ss;
    }

    private String format(String m){
        String f = m.trim();
        if(f.indexOf('(')==0&&f.endsWith(")")){
            int deep = 0;
            int i = 0;
            for(;i<m.length();i++){
                char c = m.charAt(i);
                if(c=='(')
                    deep++;
                if(c==')')
                    deep--;
                if(deep==0)
                    break;
            }
            if(i==f.length()-1)
                f = f.substring(1, f.length()-1);
        }
        return f;
    }

}
