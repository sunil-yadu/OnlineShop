package com.yash.shoppingmart.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.yash.shoppingmart.entities.OrderDetails;
import com.yash.shoppingmart.entities.Product;


@Repository
@Transactional
public class OrderDetailsDao {
	
	 @Autowired
	    private SessionFactory factory;



	   public Session getSession() {
	        Session session = factory.getCurrentSession();
	        if (session == null) {
	            session = factory.openSession();
	        }



	       return session;
	    }
	    
	    
	    public void saveOrderDetails(OrderDetails orderdetails) {
	        getSession().saveOrUpdate(orderdetails);
	        
	    }
	    
	    
	    public List<OrderDetails> getOrder(){
	    	Query q= getSession().createQuery("From OrderDetails where orderId=(select MAX(id) from Order)");
	    	return q.list();
	    }
	    
	    
		public void deleteByOrderId(int orderid) {
			List<OrderDetails> odtls=getOrder();
			for(OrderDetails ordr:odtls) {
			getSession().delete(ordr);
			}
			
			}
	    

}
