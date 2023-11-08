package org.owltech.behavioral.iterator;

public class Product {
    private String name;
    float quantity;

    public Product(String name, float quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Product{");
        sb.append("name='").append(name).append('\'');
        sb.append(", quantity=").append(quantity);
        sb.append('}');
        return sb.toString();
    }
}
