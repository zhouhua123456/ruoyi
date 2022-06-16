package com.ruoyi.demoTest.designPattern.adapterPatternDemo;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
