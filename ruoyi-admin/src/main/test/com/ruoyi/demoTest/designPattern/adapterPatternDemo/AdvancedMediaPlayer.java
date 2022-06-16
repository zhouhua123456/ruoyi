package com.ruoyi.demoTest.designPattern.adapterPatternDemo;

//MP4,可以播放音频
public interface AdvancedMediaPlayer {

    public void playVlc(String fileName);
    public void playMp4(String fileName);
}
