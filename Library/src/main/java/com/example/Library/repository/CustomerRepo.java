package com.example.Library.repository;



import com.example.Library.model.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class CustomerRepo {
    private final List<Customer> customerList = new ArrayList<>();

    public Optional<Customer> getNameCustomer(String nameCustomer){
        return customerList.stream()
                .filter(book ->book.getNameCustomer().equals(nameCustomer))
                .findFirst();
    }

    public List<Customer> getCustomerList(){return customerList;}

    public void addCustomer(Customer customer) {customerList.add(customer);}
}
