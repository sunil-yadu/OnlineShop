package com.yash.shoppingmart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.shoppingmart.entities.OrderDetails;
import com.yash.shoppingmart.models.CartItemModel;
import com.yash.shoppingmart.models.CartItemModelRes;
import com.yash.shoppingmart.models.OrderDetailsModel;
import com.yash.shoppingmart.models.OrderModel;
import com.yash.shoppingmart.models.ProductModel;
import com.yash.shoppingmart.models.UserModel;
import com.yash.shoppingmart.service.MainService;

@RestController
@RequestMapping("/os")
@CrossOrigin(origins = "http://localhost:3000")
public class MainController {

	@Autowired
	private MainService mainService;

	// save a product
	@PostMapping("/saveProduct")
	public String save(@RequestBody ProductModel productModel) {
		mainService.saveProduct(productModel);
		return "saved successfully";
	}

	// get all products
	@GetMapping("/getAllProduct")
	public List<ProductModel> getAllProduct() {
		return mainService.findAllProduct();

	}

	// delete a product by id
	@DeleteMapping("/deleteProduct/{id}")
	public void deleteProduct(@PathVariable("id") int id) {
		this.mainService.deleteById(id);
	}

	// edit a product
	@PutMapping("/updateProduct/{id}")
	public String updateProduct(@PathVariable("id") int id, @RequestBody ProductModel productModel) {
		productModel.setId(id);
		this.mainService.saveProduct(productModel);
		return "update successfully";
	}

	// save a User
	@PostMapping("/saveUser")
	public String save(@RequestBody UserModel userModel) {
		mainService.saveUser(userModel);
		return "saved successfully";
	}

	// get all users
	@GetMapping("/getAllUsers")
	public List<UserModel> getAllUser() {
		return mainService.findAllUser();

	}

	// delete a user by id
	@DeleteMapping("/deleteUser/{id}")
	public void deleteUser(@PathVariable("id") int id) {
		this.mainService.deleteUserById(id);
	}

	// edit a user
	@PutMapping("/updateUser/{id}")
	public String updateUser(@PathVariable("id") int id, @RequestBody UserModel userModel) {
		userModel.setId(id);
		this.mainService.saveUser(userModel);
		return "update successfully";
	}

	// save to cartItem
	@PostMapping("/addProductToCartItem")
	public String saveProductToCartItem(@RequestBody CartItemModel cartItemModel) {
		System.out.println(cartItemModel);
		mainService.saveProductToCartItem(cartItemModel);
		return "saved successfully";
	}

	// show  all cartItems
	@GetMapping("/ShowAllCartItemProducts/{crt_id}")
	public List<CartItemModelRes> showCartItems(@PathVariable("crt_id") int crt_id) {
		return mainService.findAllCartItems(crt_id);
	}
	
	@PutMapping("/updateCartItem/{id}")
	public String updateCartItem(@PathVariable("id") int id, @RequestBody CartItemModel cartItemModel) {
	     cartItemModel.setItemid(id);
		this.mainService.updateCartItem(cartItemModel);
		return "update successfully";
	}
	
	@DeleteMapping("/deleteCartItem/{id}")
	public void deleteCartItemById(@PathVariable("id") int id) {
		this.mainService.deleteCartById(id);
	}
	
	
	// get  a product by id
    @GetMapping("/getProductById/{id}")
    public ProductModel getProductById(@PathVariable("id") int id) {
        return this.mainService.getProductById(id);
    }
	
 // saveOrder
    @PostMapping("/saveOrder")
    public String saveOrder(@RequestBody OrderModel orderModel) {
        System.out.println(orderModel);
        mainService.saveOrder(orderModel);
        return "order placed";
    }
 

    @PostMapping("/saveOrderDetails/{id}")
    public String saveOrderDetails(@PathVariable("id") int id) {
    	mainService.saveOrderDetails(id);
    	return "order details saved";
    }
    
    @GetMapping("/getOrder")
    	public List<OrderDetailsModel> getOrders(){
    	return mainService.getOrders();
    }
    
    @DeleteMapping("/deleteOrder/{orderid}")
    public void deleteOrder(@PathVariable("orderid") int orderid)
    {
    mainService.deleteOrderByOrdrId(orderid);	
    }
    
    
    
	
	

}
