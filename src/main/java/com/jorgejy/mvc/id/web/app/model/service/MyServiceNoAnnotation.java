package com.jorgejy.mvc.id.web.app.model.service;

public class MyServiceNoAnnotation implements IService {
	@Override
	public String getHello() {
		return "Hi no use @componente";
	}
	// if have constructor whit params need a constructor empty
}
