package com.ruoyi.demoTest.designPattern.adapterPatternDemo;

/**
 * 适配器模式是实现接口与接口之间的通信的，相当于是在用一个接口增强另一个接口
 */
public class AdapterPatternTest {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
