package com.shoppingCart.ShopTry;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name="orders")
public class Orders {

	@Id
	private long id;
	@OneToOne
	private Product product;
	private int qntyNeed;
	private String adrs;
	
	
	public Orders(long id, Product prdtId, int qntyNeed, String adrs) {
		super();
		this.id = id;
		this.product = prdtId;
		this.qntyNeed = qntyNeed;
		this.adrs = adrs;
	}
	
	public Orders() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	/*public int getPrdtId() {
		return prdtId;
	}

	public void setPrdtId(int prdtId) {
		this.prdtId = prdtId;
	}  */
	
    
	public int getQntyNeed() {
		return qntyNeed;
	}
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setQntyNeed(int qntyNeed) {
		this.qntyNeed = qntyNeed;
	}
	public String getAdrs() {
		return adrs;
	}
	public void setAdrs(String adrs) {
		this.adrs = adrs;
	}
	
}
