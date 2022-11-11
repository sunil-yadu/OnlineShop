package com.yash.shoppingmart.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.yash.shoppingmart.entities.Product;
import com.yash.shoppingmart.entities.User;

@Repository
@Transactional
public class ProductDao {

	@Autowired
	private SessionFactory factory;

	public Session getSession() {
		Session session = factory.getCurrentSession();
		if (session == null) {
			session = factory.openSession();
		}

		return session;
	}

	public void saveProduct(Product product) {
		getSession().saveOrUpdate(product);
	}

	@SuppressWarnings("deprecation")
	public List<Product> getproduct() {
		return getSession().createCriteria(Product.class).list();
	}
    
	
	public void deleteById(Product product) {
		getSession().delete(product);
		
		}
	
	 public Product getProductById(int id) {
	        return getSession().get(Product.class, id);
	    }
	
	
	
}



