package org.owltech.creational.builder.interfaces;

public class Customer {
    private final String firstName;
    private final String lastName;
    private final String primaryEmail;
    private final String mobile;

    public Customer(CustomerBuilder builder) {
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.primaryEmail = builder.getPrimaryEmail();
        this.mobile = builder.getMobile();
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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Customer{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", primaryEmail='").append(primaryEmail).append('\'');
        sb.append(", mobile='").append(mobile).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
