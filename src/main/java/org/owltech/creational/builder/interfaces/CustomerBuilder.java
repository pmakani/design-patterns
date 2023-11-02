package org.owltech.creational.builder.interfaces;

public class CustomerBuilder implements ICustomerBuilder {
    private String firstName;
    private String lastName;
    private String primaryEmail;
    private String mobile;


    @Override
    public CustomerBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public CustomerBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public CustomerBuilder primaryEmail(String email) {
        this.primaryEmail = email;
        return this;
    }

    @Override
    public CustomerBuilder mobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public Customer build() {
        return new Customer(this);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public String getMobile() {
        return mobile;
    }
}
