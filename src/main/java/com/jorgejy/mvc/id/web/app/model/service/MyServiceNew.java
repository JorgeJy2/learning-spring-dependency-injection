package com.jorgejy.mvc.id.web.app.model.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("myservicenew")
@Primary  // same to qualifier
public class MyServiceNew implements IService {
	@Override
	public String getHello() {
		return "Hi from new service!!";
	}
	// if have constructor whit params need a constructor empty
}
