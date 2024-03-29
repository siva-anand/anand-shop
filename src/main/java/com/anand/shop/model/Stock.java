package com.anand.shop.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
@Table(name    = "stock", 
indexes = {@Index(name = "i_stock", columnList = "stock_name")})
public class Stock {
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "item_name",unique = true)   
	private Item item_name;
	
	@Id
	@Column(name = "stock_name", nullable = false)
	private String stock_name;
	
	private String remarks;
	private int brought_price;
	private int selling_price;
	private int available_quantity;	
	
	 
	public Item getItem_name() {
		return item_name;
	}
	public void setItem_name(Item item_name) {
		this.item_name = item_name;
	}
	public String getStock_name() {
		return stock_name;
	}
	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}
	public int getBrought_price() {
		return brought_price;
	}
	public void setBrought_price(int brought_price) {
		this.brought_price = brought_price;
	}
	public int getSelling_price() {
		return selling_price;
	}
	public void setSelling_price(int selling_price) {
		this.selling_price = selling_price;
	}
	public int getAvailable_quantity() {
		return available_quantity;
	}
	public void setAvailable_quantity(int available_quantity) {
		this.available_quantity = available_quantity;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
}
