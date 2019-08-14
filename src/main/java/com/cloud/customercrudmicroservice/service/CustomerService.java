package com.cloud.customercrudmicroservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cloud.customercrudmicroservice.model.Customer;

@Service
public class CustomerService {
	
	List<Customer> customerList = new ArrayList<Customer>();
	
	

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerList;
	}

	public Customer findCustomer(int id) {
		return customerList.stream().filter(customer->customer.getCustomerId()==id).findAny().orElse(null);
	}

	public String addCustomer() {
		Customer c = new Customer();
		c.setCustomerId(1);
		c.setCustomerName("Adrian");
		c.setCustomerContact("789456123");
		
		customerList.add(c);
		
		return "Customer Added";
	}

	
}
