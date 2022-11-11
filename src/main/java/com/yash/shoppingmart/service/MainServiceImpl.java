package com.yash.shoppingmart.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.shoppingmart.dao.CartDao;
import com.yash.shoppingmart.dao.CartItemDao;
import com.yash.shoppingmart.dao.OrderDao;
import com.yash.shoppingmart.dao.OrderDetailsDao;
import com.yash.shoppingmart.dao.ProductDao;
import com.yash.shoppingmart.dao.UserDao;
import com.yash.shoppingmart.entities.Cart;
import com.yash.shoppingmart.entities.CartItem;
import com.yash.shoppingmart.entities.Order;
import com.yash.shoppingmart.entities.OrderDetails;
import com.yash.shoppingmart.entities.Product;
import com.yash.shoppingmart.entities.User;
import com.yash.shoppingmart.models.CartItemModel;
import com.yash.shoppingmart.models.CartItemModelRes;
import com.yash.shoppingmart.models.OrderDetailsModel;
import com.yash.shoppingmart.models.OrderModel;
import com.yash.shoppingmart.models.ProductModel;
import com.yash.shoppingmart.models.UserModel;

@Service
public class MainServiceImpl implements MainService {

	@Autowired
	ProductDao productDao;

	@Autowired
	UserDao userDao;

	@Autowired
	CartItemDao cartItemDao;
	
	@Autowired
	OrderDao orderDao;
	
	@Autowired
	CartDao cartDao;
	
	@Autowired
	OrderDetailsDao orderdetailsDaO;
	

	@Override
	public List<ProductModel> findAllProduct() {
		List<Product> product = (List<Product>) productDao.getproduct();
		List<ProductModel> productModel = new ArrayList<ProductModel>();

		for (Product prod : product) {
			ProductModel prodModel = new ProductModel();
			prodModel.setId(prod.getId());
			prodModel.setName(prod.getName());
			prodModel.setPrice(prod.getPrice());
			prodModel.setDesc(prod.getDesc());
			productModel.add(prodModel);
			

		}
		return productModel;

	}

	@Override
	public Product saveProduct(ProductModel productModel) {

		Product product = new Product();
		product.setId(productModel.getId());
		product.setName(productModel.getName());
		product.setPrice(productModel.getPrice());
		productDao.saveProduct(product);
		return null;
	}

	@Override
	public void deleteById(int id) {
		Product product = new Product();
		product.setId(id);
		productDao.deleteById(product);

	}

	@Override
	public User saveUser(UserModel userModel) {
		User user = new User();
		user.setId(userModel.getId());
		user.setEmail(userModel.getEmail());
		user.setName(userModel.getName());
		userDao.saveUser(user);
		return null;
	}

	@Override
	public List<UserModel> findAllUser() {
		List<UserModel> userModel = new ArrayList<UserModel>();
		List<User> user = (List<User>) userDao.getUser();

		for (User usr : user) {
			UserModel usrModel = new UserModel();
			usrModel.setId(usr.getId());
			usrModel.setEmail(usr.getEmail());
			usrModel.setName(usr.getName());
			userModel.add(usrModel);

		}

		return userModel;
	}

	@Override
	public void deleteUserById(int id) {
		User user = new User();
		user.setId(id);
		userDao.deleteUserById(user);

	}

	@Override
	public CartItem saveProductToCartItem(CartItemModel cartItemModel) {
		
		List<CartItem> crtItem=(List<CartItem>)cartItemDao.getAllCartItems();
		int flag=0;
		
		for(CartItem crtitm :crtItem) {
			int x=crtitm.getCart().getId();
			int y=crtitm.getProduct().getId();
			
			if(x==cartItemModel.getCartID()&&y==cartItemModel.getProductID()) {
				
				flag++;
			}
		}
		
		if(flag==0) {
		CartItem cartItem = new CartItem();
		cartItem.setQuantity(cartItemModel.getQuantity());
		cartItem.setId(cartItemModel.getItemid());

		int prdctId = cartItemModel.getProductID();
		Product product = new Product();
		product.setId(prdctId);
		cartItem.setProduct(product);

		int crtId = cartItemModel.getCartID();
		Cart cart = new Cart();
		cart.setId(crtId);
		cartItem.setCart(cart);

		cartItemDao.saveCartItem(cartItem);
		}
		
		else {
			return null;
		}
		return null;
	}
	
	@Override
	public void updateCartItem(CartItemModel cartItemModel) {
		
		List<CartItem> crtItem=(List<CartItem>)cartItemDao.getAllCartItems();
	
		CartItem cartItem = new CartItem();
		cartItem.setQuantity(cartItemModel.getQuantity());
		cartItem.setId(cartItemModel.getItemid());

		int prdctId = cartItemModel.getProductID();
		Product product = new Product();
		product.setId(prdctId);
		cartItem.setProduct(product);

		int crtId = cartItemModel.getCartID();
		Cart cart = new Cart();
		cart.setId(crtId);
		cartItem.setCart(cart);

		cartItemDao.saveCartItem(cartItem);
		}
	
	  
	  @Override public List<CartItemModelRes> findAllCartItems(int crt_id) { 
		  int crtId=crt_id;
		  List<CartItem> cartItem=(List<CartItem>)cartItemDao.getAllCartItemsById(crtId); 
		  List<CartItemModelRes> cartItemModelRes=new ArrayList<CartItemModelRes>();
	  
	  for(CartItem crtitm:cartItem) { 
		  CartItemModelRes crtitemModelRes = new CartItemModelRes();
		  crtitemModelRes.setItemid(crtitm.getId());
		  crtitemModelRes.setQuantity(crtitm.getQuantity());
	      crtitemModelRes.setCartID(crtitm.getCart().getId());
	      
	      Product product=new Product();
	      product.setId(crtitm.getProduct().getId());
	      product.setName(crtitm.getProduct().getName());
	      product.setPrice(crtitm.getProduct().getPrice());
	      
	      crtitemModelRes.setProduct(product);
	      
	      cartItemModelRes.add(crtitemModelRes);
	  
	  
	  } 
	  return cartItemModelRes;
 
	  }

	@Override
	public void deleteCartById(int id ) {
		CartItem cartitem=new CartItem();
	     cartitem.setId(id);
		cartItemDao.deleteCartItemById(cartitem);
		
	}
	
	 @Override
	    public ProductModel getProductById(int id) {
	        Product prdct=productDao.getProductById(id);
	        ProductModel prdctMdl=new ProductModel();
	        prdctMdl.setId(prdct.getId());
	        prdctMdl.setName(prdct.getName());
	        prdctMdl.setPrice(prdct.getPrice());
	        return prdctMdl;
	    
	    }
	 
	 @Override
	    public Order saveOrder(OrderModel ordermodel) {
	        Order order = new Order();
	        Cart crt = new Cart();
	        crt.setId(ordermodel.getCartmodel());
	       
	        orderDao.saveOrder(order);
	        return null;
	    }

	@Override
	public void saveOrderDetails(int id) {
		
		List<CartItem> cartItem=(List<CartItem>)cartItemDao.getAllCartItemsById(id);
		int crtid=cartItem.get(0).getCart().getId();
		
		Cart crt=cartDao.getCartById(crtid);
		User user=crt.getUser();
		Order order=new Order();
		order.setUser(user);
		
		Order ordr=orderDao.saveOrder(order);
		
		for(CartItem crtitem:cartItem) {
			OrderDetails ordrdtls=new OrderDetails();
			ordrdtls.setOrderId(ordr.getId());
			
			Product prdct=crtitem.getProduct();
			ordrdtls.setProductId(prdct.getId());
			ordrdtls.setName(prdct.getName());
			ordrdtls.setPrice(prdct.getPrice());
		
			ordrdtls.setQuantity(crtitem.getQuantity());
			orderdetailsDaO.saveOrderDetails(ordrdtls);
		}
		cartItemDao.deleteCartItemByCartId(crtid);

		
	}

	@Override
	public List<OrderDetailsModel> getOrders() {
	   List<OrderDetails> ordrdtls= (List<OrderDetails>)orderdetailsDaO.getOrder();
	   List<OrderDetailsModel> ordrmdl= new ArrayList<OrderDetailsModel>();
	   
	   for(OrderDetails ordr:ordrdtls)
	   {
         OrderDetailsModel obj=new OrderDetailsModel();
         obj.setId(ordr.getId());
         obj.setName(ordr.getName());
         obj.setPrice(ordr.getPrice());
         obj.setProductId(ordr.getProductId());
         obj.setOrderId(ordr.getOrderId());
         obj.setQuantity(ordr.getQuantity());
         
		  ordrmdl.add(obj); 
	   }
	   
	   return ordrmdl;
	
	}

	@Override
	public void deleteOrderByOrdrId(int orderid) {
		Order ordr=new Order();
		ordr.setId(orderid);
		orderdetailsDaO.deleteByOrderId(orderid);
		orderDao.deleteById(ordr);
		
	}
	
	
	 
	 

	 

}
