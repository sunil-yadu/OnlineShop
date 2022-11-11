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
public class UserDao {
	
	@Autowired
	private SessionFactory factory;

	public Session getSession() {
		Session session = factory.getCurrentSession();
		if (session == null) {
			session = factory.openSession();
		}

		return session;
	}

	public void saveUser(User user) {
		getSession().saveOrUpdate(user);
	}
	
	@SuppressWarnings("deprecation")
	public List<User> getUser(){
		return getSession().createCriteria(User.class).list();
	}
	
	public void deleteUserById(User user) {
		getSession().delete(user);
		
		}

}
