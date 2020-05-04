package com.model.design.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shuiyu lei
 * date 2020/5/4
 */
public class BundledShapeCache {

    private Map<String, Shape> cache = new HashMap<>();

    public BundledShapeCache() {
        Circle circle = new Circle();
        circle.x = 5;
        circle.y = 7;
        circle.radius = 45;
        circle.color = "Green";
        cache.put("Big green circle", circle);
    }

    public Shape put(String key, Shape shape) {
        cache.put(key, shape);
        return shape;
    }

    public Shape get(String key) {
        return cache.get(key).clone();
    }

}
