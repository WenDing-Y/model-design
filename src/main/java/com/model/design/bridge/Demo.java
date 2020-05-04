package com.model.design.bridge;

/**
 * Created by shuiyu lei
 * date 2020/5/4
 */
public class Demo {


    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.volumeDown();
        device.printStatus();

    }

}
