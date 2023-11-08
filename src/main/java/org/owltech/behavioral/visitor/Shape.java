package org.owltech.behavioral.visitor;

public interface Shape {
    void accept(ShapeVisitor visitor);
}
