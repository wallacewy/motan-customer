package com.wallace.motan;

public class CustomerServiceImpl implements CustomerService {
	
	public String hello(String name) {
        System.out.println(name + " invoked customer service");
        return "Hello " + name + ", it's greeting from customer service (group v1)";
    }
}
