package com.jorgejy.mvc.id.web.app.model.domain;

public class ItemBill {
	private Product product;
	private int quantity;

	public ItemBill(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int calculateInport() {
		return quantity * product.getPrice();
	}

}
