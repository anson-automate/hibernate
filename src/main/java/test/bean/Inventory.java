package test.bean;

import java.util.Objects;

public class Inventory {

    private Long Id;
    private String productName;
    private Integer quantity;
    private Float productPrice;
    
    
    
	public Inventory(String productName, Integer quantity, Float productPrice) {
		super();
		this.productName = productName;
		this.quantity = quantity;
		this.productPrice = productPrice;
	}
	
	
	public Inventory() {
	}


	public Long getId() {
		return Id;
	}
	
	public void setId(Long id) {
		Id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Inventory [Id=" + Id + ", productName=" + productName + ", quantity=" + quantity + ", productPrice="
				+ productPrice + "]";
	}
    
    

   
}