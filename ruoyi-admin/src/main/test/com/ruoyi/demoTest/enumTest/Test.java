package com.ruoyi.demoTest.enumTest;

public class Test {
    public static void main(String[] args) {
        MessageType collectMessage = MessageType.COLLECT_MESSAGE;
        System.out.println(collectMessage.getCode()+" "+collectMessage.getName());
        CeshiState[] values = CeshiState.values();
        System.out.println(values.length);
    }

    public void mothod(MessageType MessageType){

    }
}
