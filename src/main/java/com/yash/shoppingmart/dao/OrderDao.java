package com.yash.shoppingmart.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



import com.yash.shoppingmart.entities.Order;





@Repository
@Transactional
public class OrderDao {
    
    @Autowired
    private SessionFactory factory;



   public Session getSession() {
        Session session = factory.getCurrentSession();
        if (session == null) {
            session = factory.openSession();
        }



       return session;
    }
    
    
    public Order saveOrder(Order order) {
        getSession().saveOrUpdate(order);
        return order;
    }
    
	public void deleteById(Order order) {
		getSession().delete(order);
		
		}
    



}