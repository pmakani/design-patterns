package org.owltech.creational.builder.classes;

public class UserExample {
    public static void main(String[] args) {
        User user = User.newBuilder()
                .firstName("Praful")
                .lastName("Makani")
                .email("test@gmail.com")
                .mobile("123456789")
                .build();
        System.out.println(user);
    }
}
