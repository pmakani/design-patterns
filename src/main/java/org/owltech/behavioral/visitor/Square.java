package org.owltech.behavioral.visitor;

public class Square implements Shape {
    private final double length;

    public Square(final double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}
