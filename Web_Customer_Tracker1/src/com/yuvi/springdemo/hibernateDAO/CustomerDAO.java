package com.yuvi.springdemo.hibernateDAO;

import java.util.List;

import com.yuvi.springdemo.entity.Customer;

public interface CustomerDAO {
public List<Customer> getCustomers();

public void saveCustomer(Customer customer);

public Customer getCustomer(int theId);

public void deleteCustomer(int theId);
}
