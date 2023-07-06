package com.shoppingCart.ShopTry;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class DaoOrder {

	@PersistenceContext
	EntityManager enty;
	
	public void addOrder(Orders ordr) {
		enty.persist(ordr);
	}
	
	@SuppressWarnings("unchecked")
	public List<Orders> allOrders(){
		String str="select s from orders s order by id asc ";
		Query qr=enty.createQuery(str);
		return qr.getResultList();
	}
	
	public void removeOrder(long id) {
		Orders odr=enty.find(Orders.class, id);
		enty.remove(odr);
	}
}
