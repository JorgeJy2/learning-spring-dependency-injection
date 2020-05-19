package com.jorgejy.mvc.id.web.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.jorgejy.mvc.id.web.app.model.domain.ItemBill;
import com.jorgejy.mvc.id.web.app.model.domain.Product;
import com.jorgejy.mvc.id.web.app.model.service.IService;
import com.jorgejy.mvc.id.web.app.model.service.MyServiceNoAnnotation;

@Configuration
public class AppConfig {
	
	// only use when register external class
	
	@Bean("noAnnotationService")
	// can use @Primary
	public IService registerService() {
		return new MyServiceNoAnnotation();
	}
	
	@Bean("itemsBill")
	public List<ItemBill> itemsBill(){
		Product product = new Product("Celphone", 50000);
		Product product1 = new Product("Lap", 50000);
		Product product2 = new Product("Monitor", 50000);
		Product product3 = new Product("Mouse", 50000);
		Product product4 = new Product("keyboard", 50000);
		
		ItemBill itemBill = new ItemBill(product, 2);
		ItemBill itemBill1 = new ItemBill(product1, 1);
		ItemBill itemBill2 = new ItemBill(product2, 2);
		ItemBill itemBill3 = new ItemBill(product3, 3);
		ItemBill itemBill4 = new ItemBill(product4, 4);
		
		return Arrays.asList(itemBill, itemBill1, itemBill2, itemBill3, itemBill4);	
		
	}
	
	@Bean("itemsBillOffice")
	@Primary
	public List<ItemBill> itemsBillOffice(){
		Product product = new Product("LG LCD", 20000);
		Product product1 = new Product("Beats", 10000);
		Product product2 = new Product("Printer", 10000);
		Product product3 = new Product("Desktop", 50000);
		
		ItemBill itemBill = new ItemBill(product, 1);
		ItemBill itemBill1 = new ItemBill(product1, 1);
		ItemBill itemBill2 = new ItemBill(product2, 4);
		ItemBill itemBill3 = new ItemBill(product3, 4);
		
		return Arrays.asList(itemBill, itemBill1, itemBill2, itemBill3);	
		
	}
}
