package com.example.lanouhn.zhibo.contants.zhibo;

import java.util.List;

/**
 * Created by lanouhn on 2016/8/16.
 */
public class columns {

    private game game;
    private int viewers;
    private int channels;
    private String channelsText;
    private List<rooms> rooms;

    public com.example.lanouhn.zhibo.contants.zhibo.game getGame() {
        return game;
    }

    public void setGame(com.example.lanouhn.zhibo.contants.zhibo.game game) {
        this.game = game;
    }

    public int getViewers() {
        return viewers;
    }

    public void setViewers(int viewers) {
        this.viewers = viewers;
    }

    public int getChannels() {
        return channels;
    }

    public void setChannels(int channels) {
        this.channels = channels;
    }

    public String getChannelsText() {
        return channelsText;
    }

    public void setChannelsText(String channelsText) {
        this.channelsText = channelsText;
    }

    public List<com.example.lanouhn.zhibo.contants.zhibo.rooms> getRooms() {
        return rooms;
    }

    public void setRooms(List<com.example.lanouhn.zhibo.contants.zhibo.rooms> rooms) {
        this.rooms = rooms;
    }
}