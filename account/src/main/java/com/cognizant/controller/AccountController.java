package com.cognizant.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.Account;

@RestController
public class AccountController {
	ApplicationContext context=new ClassPathXmlApplicationContext("account.xml");
	Account account=(Account) context.getBean("account",Account.class);
	@GetMapping("/account/{accountNumber}")
	public Account getAccount(@PathVariable int accountNumber) {
		return account;
	}
}
