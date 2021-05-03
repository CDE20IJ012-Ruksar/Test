package com.cognizant.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.model.Loan;

@RestController
public class LoanController {
	ApplicationContext context=new ClassPathXmlApplicationContext("loan.xml");
	Loan loan=(Loan) context.getBean("loan",Loan.class);
	@GetMapping("loan/{number}")
	public Loan getAccount(@PathVariable String number) {
		return loan;
	}
}
