package com.yuvi.springdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yuvi.springdemo.entity.Customer;
import com.yuvi.springdemo.hibernateDAO.CustomerDAO;
import com.yuvi.springdemo.serviceDAO.CustomerServiceDAO;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerServiceDAO customerserviceDAO;
	
	@RequestMapping("/list")
	public String customerForm(Model model)
	{
		System.out.println("Inside customerForm");
//		Customer c=new Customer();
		List<Customer> customer = customerserviceDAO.getCustomers();
		model.addAttribute("customer",customer);
		System.out.println(customer);
		return "customer-form";
	}
	
	@GetMapping("/showFormForAdd")
	public String addCustomer(Model model)
	{
		
		System.out.println("Add");
		Customer c=new Customer();
		model.addAttribute("customer",c);
		return "customer-form-add";
	}
	
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer)
	{
	
		customerserviceDAO.saveCustomer(customer);
	    return "redirect:/customer/list";
		
		
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId,Model model)
	{
		Customer c=customerserviceDAO.getCustomer(theId);
		model.addAttribute("customer", c);
		
		return "customer-form-add";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int theId)
	{
		customerserviceDAO.deleteCustomer(theId);
		   return "redirect:/customer/list";
	}
	
	
	
}
