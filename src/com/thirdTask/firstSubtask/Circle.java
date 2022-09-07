package com.thirdTask.firstSubtask;

import com.thirdTask.InitializationException;

public class Circle {

    private Integer radius, diameter;
    private Double length;

    private final Double PI = 3.14;

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public Integer getDiameter() {
        return diameter;
    }

    public Double getLength() {
        return length;
    }

    public final void CalcParameters() throws InitializationException {

        if (this.radius == null || this.radius <= 0) {
            throw new InitializationException("Unable to calculate properties. Wrong radius.");
        }

        this.diameter = this.radius * 2;
        this.length = 2 * PI * radius;
    }

    public final void Clear() {

        this.radius = null;
        this.diameter = null;
        this.length = null;
    }

    @Override
    public String toString() {
        return "Circle {" +
                " radius = " + radius +
                ", diameter = " + diameter +
                ", length = " + String.format("%.2f", length)  +
                " }";
    }
}
