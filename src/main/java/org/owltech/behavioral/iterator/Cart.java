package org.owltech.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Cart {
    private List<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public Iterator<Product> iterator() {
        return new CartIterator();
    }

    class CartIterator implements Iterator<Product> {
        int currentPosition = 0;

        @Override
        public boolean hasNext() {
            if (currentPosition >= products.size()) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Product next() {
            return products.get(currentPosition++);
        }

        @Override
        public void remove() {
            products.remove(--currentPosition);
        }

    }

}
