package com.tcode.repository;

import java.util.List;

import com.tcode.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}