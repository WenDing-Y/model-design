package com.model.design.factory_method;

/**
 * Created by shuiyu lei
 * date 2020/5/4
 */
public class Application {
    private Button button;

    public Application(GUIFactory factory) {
        button = factory.createButton();
    }

    public void paint() {
        button.paint();
    }
}
