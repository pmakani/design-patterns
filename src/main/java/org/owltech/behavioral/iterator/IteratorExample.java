package org.owltech.behavioral.iterator;

import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        Product p1 = new Product("tooth paste", 15);
        Product p2 = new Product("pen", 30);
        Product p3 = new Product("bottle", 20);

        Cart cart = new Cart();
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        System.out.println("Displaying Cart:");
        //Printing the cart items
        Iterator<Product> iterator = cart.iterator();
        //using while loop to iterate
        while (iterator.hasNext()) {
            Product product = iterator.next();
            //printing the product
            System.out.println(product);
        }

        System.out.println("Removing last product returned");
        iterator.remove();

        System.out.println("Displaying Cart:");
        iterator = cart.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println(product);
        }
    }
}
