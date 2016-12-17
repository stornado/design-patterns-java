package com.zxytech.designpatterns.gof.structuralpatterns.adapterpattern;

/**
 * Created by ryan on 2016/12/17.
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    public void play(String mediaType, String fileName) {
        // 播放MP3音乐文件的内置支持
        if (mediaType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        // mediaAdapter提供了播放其他文件格式的支持
        else if (mediaType.equalsIgnoreCase("vlc") || mediaType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(mediaType);
            mediaAdapter.play(mediaType, fileName);
        } else {
            System.out.println("Invalid media. " + mediaType + " format not supported.");
        }
    }
}
