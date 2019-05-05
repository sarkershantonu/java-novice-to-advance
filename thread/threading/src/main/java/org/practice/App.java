package org.practice;

public class App {
    public static void main(String[] args) {
        Communication chatSession = new Communication();
        Customer customer = new Customer(100,chatSession);
        CustomerService customerServiceAgent = new CustomerService(200,chatSession);


    }
}
