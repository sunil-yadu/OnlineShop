package com.yash.shoppingmart.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.yash.shoppingmart.entities.Cart;
import com.yash.shoppingmart.entities.CartItem;

@Repository
@Transactional
public class CartDao {
	
	@Autowired
	private SessionFactory factory;

	public Session getSession() {
		Session session = factory.getCurrentSession();
		if (session == null) {
			session = factory.openSession();
		}

		return session;
	}

	
	@SuppressWarnings("deprecation")
	public Cart getCartById(int id) {
		Cart crt=new Cart();
		crt.setId(id);
		Criteria c= getSession().createCriteria(Cart.class);
		c.add(Restrictions.eq("id",id));
		List<Cart> a= c.list();
        return a.get(0);
	}
	
}
