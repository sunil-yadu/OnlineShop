package com.yash.shoppingmart.service;

import java.util.List;

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



public interface MainService {
	
	List<ProductModel> findAllProduct();

	Product saveProduct(ProductModel productModel);

	void deleteById(int id);
	
	User saveUser(UserModel userModel);
	
	List<UserModel> findAllUser();
	
	void deleteUserById(int id);

	CartItem saveProductToCartItem(CartItemModel cartItemModel);

	List<CartItemModelRes> findAllCartItems(int crt_id);

	void deleteCartById(int id);
	
	ProductModel getProductById(int id);

	void updateCartItem(CartItemModel cartItemModel);
	
	Order saveOrder(OrderModel ordermodel);

	void saveOrderDetails(int id);

	List<OrderDetailsModel> getOrders();

	void deleteOrderByOrdrId(int orderid);

	
	

}
