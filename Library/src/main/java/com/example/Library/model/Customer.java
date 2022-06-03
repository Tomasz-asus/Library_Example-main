package com.example.Library.model;


import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class Customer extends Book{

    private final String nameCustomer;
    private final int idCustomer;

    private final List<Customer> customerList = new ArrayList<>();

    public Customer(String nameCustomer, int idCustomer) {
        super();
        this.nameCustomer = nameCustomer;
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void addCustomer(Customer customer){this.customerList.add(customer);}

    public class CustomerService{}

    public class CustomerRepo{}

    public List<Customer> getCustomerList(){return customerList;}

}