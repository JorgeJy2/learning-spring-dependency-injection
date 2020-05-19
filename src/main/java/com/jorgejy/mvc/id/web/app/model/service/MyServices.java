package com.jorgejy.mvc.id.web.app.model.service;

import org.springframework.stereotype.Service;

@Service("myservice")
public class MyServices implements IService {
	@Override
	public String getHello() {
		return "Hi from service!!";
	}
	// if have constructor whit params need a constructor empty
}
