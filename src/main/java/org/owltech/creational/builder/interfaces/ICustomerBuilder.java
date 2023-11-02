package org.owltech.creational.builder.interfaces;

public interface ICustomerBuilder {

    ICustomerBuilder firstName(String firstName);
    ICustomerBuilder lastName(String lastName);
    ICustomerBuilder primaryEmail(String email);
    ICustomerBuilder mobile(String mobile);
}
