package Q2.model.service;

import Q2.model.persistance.Customer;

public interface CustomerDto {
	void addCustomer(Customer c);

	Customer getById(int id);
}