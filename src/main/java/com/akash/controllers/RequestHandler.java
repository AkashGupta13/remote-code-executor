package com.akash.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.akash.services.CodeExecutorService;

@RestController
public class RequestHandler {
	
	@Autowired
	CodeExecutorService codeExecutor;
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String request() throws Exception {
//		codeExecutor.execute();
		return "Hello World!";
	}
	
}
