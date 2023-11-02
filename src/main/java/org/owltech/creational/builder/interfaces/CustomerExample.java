package org.owltech.creational.builder.interfaces;

public class CustomerExample {
    public static void main(String[] args) {
        Customer customer = new CustomerBuilder()
                .firstName("Praful")
                .lastName("Makani")
                .primaryEmail("test@gmail.com")
                .mobile("1234567890")
                .build();
        System.out.println(customer);

    }
}
