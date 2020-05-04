package com.model.design.factory_method;

/**
 * Created by shuiyu lei
 * date 2020/5/4
 */
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
