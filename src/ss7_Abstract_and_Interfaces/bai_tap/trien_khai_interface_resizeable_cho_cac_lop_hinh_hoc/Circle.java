package ss7_Abstract_and_Interfaces.bai_tap.trien_khai_interface_resizeable_cho_cac_lop_hinh_hoc;

import ss7_Abstract_and_Interfaces.bai_tap.trien_khai_interface_colorable_cho_cac_lop_hinh_hoc.Shape;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius= " + getRadius() + ", which is a subclass of " + super.toString();
    }


    @Override
    public void resize(double percent) {
        percent = percent / 100.0;
        double result = getArea() + getArea() * percent;
        System.out.println("New Circle's Area: " + result);
    }
}
