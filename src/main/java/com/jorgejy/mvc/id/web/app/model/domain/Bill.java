package com.jorgejy.mvc.id.web.app.model.domain;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Component
@RequestScope // live only for petition
// @SessionScope // sesion http  
// session need Serializable
// @ApplicationScope // same no add
public class Bill implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Value("${bill.description}")
	private String description;
	@Autowired
	private Client client;
	@Autowired
	private List<ItemBill> items;

	@PostConstruct
	public void init() {
		System.out.println("Init bill ");
		client.setName(client.getName().concat(" ").concat("Antonio"));
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("PRE DRESTROY");
	}
	
	
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<ItemBill> getItems() {
		return items;
	}

	public void setItems(List<ItemBill> items) {
		this.items = items;
	}
	
	

}
