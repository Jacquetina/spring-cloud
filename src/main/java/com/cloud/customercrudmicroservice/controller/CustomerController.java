package com.cloud.customercrudmicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.customercrudmicroservice.model.Customer;
import com.cloud.customercrudmicroservice.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/all")
	public List<Customer> getAllCustomers()
	{
		return customerService.getAllCustomers();
	}
	
	@GetMapping("/{id}")
	public Customer findCustomer(@PathVariable int id)
	{
		return customerService.findCustomer(id);
	}
	
	@GetMapping("/add")
	public String addCustomer()
	{
		return customerService.addCustomer();
	}
}
