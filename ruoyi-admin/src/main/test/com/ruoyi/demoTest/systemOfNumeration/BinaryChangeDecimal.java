package com.ruoyi.demoTest.systemOfNumeration;

/**
 * 二进制转十进制11001
 * 其实是（（（（（0*2）+1）*2+1）*2+0）*2+0）*2+1 = 25
 *
 */
public class BinaryChangeDecimal {
    public static void main(String[] args) {
        int dec = change("1010101");
        System.out.println(dec);
    }

    public static int change(String binary){
        int length = binary.length();//这个长度决定了这个方法的执行次数
        char[] chars = binary.toCharArray();


        int sum=0;
        for(int i=0;i<chars.length;i++){
            if(i == 0){
                sum = i * 2 + Integer.parseInt(String.valueOf(chars[i]));
            }else{
                sum = sum* 2 + Integer.parseInt(String.valueOf(chars[i]));
            }
        }

        return sum;
    }
}
