package com.model.design.adapter;

/**
 * Created by shuiyu lei
 * date 2020/5/4
 * 圆孔
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    /**
     * 如果孔的大小大于钉的大小，
     * 则可以匹配
     * @param peg
     * @return
     */
    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}
