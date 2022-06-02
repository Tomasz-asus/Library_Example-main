package com.example.Library.model;


import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class Customer {

    private final String nameCustomer;
    private final int IdCustomer;

    private final List<Customer> customerList = new ArrayList<>();

    public Customer(String nameCustomer, int idCustomer) {
        this.nameCustomer = nameCustomer;
        IdCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public int getIdCustomer() {
        return IdCustomer;
    }

    public void addCustomer(Customer customer){this.customerList.add(customer);}

    public class CustomerService{}

    public class CustomerRepo{}

    public List<Customer> getCustomerList(){return customerList;}

}