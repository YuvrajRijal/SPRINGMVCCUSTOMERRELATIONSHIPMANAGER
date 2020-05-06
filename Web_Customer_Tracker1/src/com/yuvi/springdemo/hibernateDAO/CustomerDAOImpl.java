package com.yuvi.springdemo.hibernateDAO;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yuvi.springdemo.entity.Customer;
@Repository
public class CustomerDAOImpl  implements CustomerDAO{

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public List<Customer> getCustomers() {
	 Session session = sessionFactory.openSession();
	 Query<Customer> query = session.createQuery("from Customer",Customer.class);
	 List<Customer> customerList = query.getResultList();
		// TODO Auto-generated method stub
		return customerList;
		
	}
	@Override
	public void saveCustomer(Customer customer) {
		
		Session session = sessionFactory.getCurrentSession();
//		session.save(customer);
	session.saveOrUpdate(customer);
	}
	@Override
	public Customer getCustomer(int theId) {
		Session session = sessionFactory.getCurrentSession();
		Customer customer = session.get(Customer.class,theId);
		return customer;
	}
	@Override
	public void deleteCustomer(int theId) {
		Session session = sessionFactory.getCurrentSession();
		Customer c = session.get(Customer.class, theId);
		session.delete(c);
		
	}

}
