package Q2.model.service;

import Q2.model.persistance.*;

public class CustomerDtoImp implements CustomerDto {
	CustomerDao cs = new CustomerDaoImp();

	@Override
	public void addCustomer(Customer c) {
		cs.addCustomer(c);
	}

	@Override
	public Customer getById(int id) {
		return cs.getById(id);
	}

}