package Q2.controller;

import java.sql.Date;

import Q2.model.persistance.*;
import Q2.model.service.*;

public class CustomerApp {

	public static void main(String[] args) {
		CustomerDto customerService = new CustomerDtoImp();

		System.out.println("add new customer");
		customerService.addCustomer(new Customer(332, "Akshat", "ymsli", "9012345678", Date.valueOf("2000-12-10")));
		customerService.addCustomer(new Customer(456, "Mayank", "ymsli", "9087654321", Date.valueOf("1999-08-09")));

		Customer customer = customerService.getById(1);
		System.out.println("get by id");
		System.out.println(customer);

	}

}