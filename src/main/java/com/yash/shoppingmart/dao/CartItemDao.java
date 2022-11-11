package com.yash.shoppingmart.dao;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.yash.shoppingmart.entities.CartItem;
import com.yash.shoppingmart.entities.Product;



@Repository
@Transactional
public class CartItemDao {
	
	@Autowired
	private SessionFactory factory;
	

	public Session getSession() {
		Session session = factory.getCurrentSession();
		if (session == null) {
			session = factory.openSession();
		}

		return session;
	}
	
	
	public void saveCartItem(CartItem cartitem) {
		getSession().saveOrUpdate(cartitem);
	}
	
	@SuppressWarnings("deprecation")
	public List<CartItem> getAllCartItemsById(int id) {
		CartItem crtitm=new CartItem();
		crtitm.setId(id);
		Criteria c= getSession().createCriteria(CartItem.class);
		c.add(Restrictions.eq("cart.id",id));
		List<CartItem> a= c.list();
        return a;
	}
	
	public void deleteCartItemById(CartItem cartitem) {
		getSession().delete(cartitem);
		}
	
	public List<CartItem> getAllCartItems(){
		return getSession().createCriteria(CartItem.class).list();
	}
	
	public void deleteCartItemByCartId(int id) {
	  Query q= getSession().createQuery("delete from CartItem  where CRT_ID=:c");
	  q.setParameter("c","1");
	  int r=q.executeUpdate();
	}
	

    
}
