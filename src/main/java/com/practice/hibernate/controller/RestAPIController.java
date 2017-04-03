package com.practice.hibernate.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.practice.hibernate.entities.Employee;

@Controller
@RequestMapping("/employee")
public class RestAPIController {
	public static final Logger logger = LoggerFactory
			.getLogger(RestAPIController.class);

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ResponseEntity<Employee> getEmployee() {
		logger.error("In getEmployee()");
		return null;
	}
}
