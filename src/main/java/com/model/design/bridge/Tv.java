package com.model.design.bridge;

/**
 * Created by shuiyu lei
 * date 2020/5/4
 */
public class Tv implements Device {

    private int volume = 30;

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }
    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm TV set.");
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("------------------------------------\n");
    }
}
