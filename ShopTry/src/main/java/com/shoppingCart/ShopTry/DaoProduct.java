package com.shoppingCart.ShopTry;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class DaoProduct {

	@PersistenceContext
	EntityManager enty;
	
	public void addNewProduct(Product prdt) {
		enty.persist(prdt);
	}
	
	public Product getProduct(int id) {
		return enty.find(Product.class, id);
	}
	
	public void editProduct(Product prdt) {
		//Product prd= getProduct(prdt.getId());
	    enty.merge(prdt);
	}
	
	public void deleteProd (int id) {
		Product prdt=getProduct(id);
		enty.detach(prdt);
	}
	
	public List<Product> allProducts(){
		Query qr=enty.createQuery("select p from product p order by id asc");
		return qr.getResultList();
	}
}
