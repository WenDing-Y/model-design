package com.model.design.factory_method;

/**
 * Created by shuiyu lei
 * date 2020/5/4
 */
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
