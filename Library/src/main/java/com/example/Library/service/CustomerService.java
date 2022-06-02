package com.example.Library.service;


import com.example.Library.model.Customer;
import com.example.Library.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {
    private CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo) {this.customerRepo=customerRepo;}

   public void addCustomer(String nameCustomer, int idCustomer) {
        Customer customer = new Customer(nameCustomer, idCustomer);
   }

   public Customer getCustomer(String nameCustomer) {
        customerRepo.getNameCustomer(nameCustomer).orElseThrow(() ->new IllegalArgumentException("ni ma takiego"));
        return null;
   }

}
