package com.tcode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.tcode.model.Customer;
import com.tcode.repository.CustomerRepository;

@Service("customerService")
@Scope("prototype")

public class CustomerServiceIml implements CustomerService {

	
	public CustomerRepository customerRepository;

	public CustomerServiceIml() {
		
	}
	
	public CustomerServiceIml(CustomerRepository customerRepository) {
		System.out.println("this is constructor Injection");
		this.customerRepository=customerRepository;
		
		
	}
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("This is setter Injection");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();

	}
}