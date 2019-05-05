package org.practice.threading.apps;

import org.practice.threading.processors.Customer;
import org.practice.threading.processors.CustomerSupport;
import org.practice.threading.services.Communication;

public class ThreadCommunicationApp {
    public static void main(String[] args) {
        Communication chatSession = new Communication();
        Customer customer = new Customer("Customer",chatSession);
        CustomerSupport customerSupportAgent = new CustomerSupport("AGENT",chatSession);
    }
}
