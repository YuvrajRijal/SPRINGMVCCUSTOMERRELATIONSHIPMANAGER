package com.yuvi.springdemo.serviceDAO;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yuvi.springdemo.entity.Customer;
public interface CustomerServiceDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
}
