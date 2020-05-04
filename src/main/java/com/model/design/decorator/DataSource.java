package com.model.design.decorator;

/**
 * Created by shuiyu lei
 * date 2020/5/4
 */
public interface DataSource {
    void writeData(String data);

    String readData();

}
