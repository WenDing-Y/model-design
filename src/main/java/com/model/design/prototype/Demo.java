package com.model.design.prototype;

/**
 * Created by shuiyu lei
 * date 2020/5/4
 */
public class Demo {

    public static void main(String[] args) {
        BundledShapeCache cache = new BundledShapeCache();
        Circle circle1 = (Circle) cache.get("Big green circle");
        Circle circle2 = (Circle) cache.get("Big green circle");
        if (circle1 != circle2) {
            System.out.println("这是两个不同对象");
            if (circle1.equals(circle2)){
                System.out.println("两个对象的值一样");
            }
        }
    }
}
