package com.rapipay.springboot.controller;
import com.rapipay.springboot.services.ProductServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rapipay.springboot.exception.ProductNotFoundException;
import com.rapipay.springboot.model.Product;



@RestController
@RequestMapping("/api/v1")
public class ProductController {
	
	@Autowired
	private ProductServices productServices;
	
	@PostMapping("/products")
	public ApplicationResponseEntity<Product> insertProduct(@RequestBody Product product) {
		
		try {
			Product response =  productServices.insertProductService(product);
			return new ApplicationResponseEntity<>("200","Success",response);
		}
		catch(Exception e){
			return new ApplicationResponseEntity<>("999",e.toString(),null);
		}		
	}
	@PutMapping("/products/{id}")
	public ApplicationResponseEntity<Product> updateProduct(@PathVariable(value="id") long productID,@RequestBody Product productDetails )throws ProductNotFoundException,Exception{
		try {
			Product response =  productServices.updateProductService(productID,productDetails);
			return new ApplicationResponseEntity<>("200","Success",response);
		}
		catch(Exception e){
			return new ApplicationResponseEntity<>("999",e.toString(),null);
		}
	}
	@GetMapping("/products/emi/{id}")
	public ApplicationResponseEntity<Integer>  getEmi(@PathVariable(value = "id") long productID) throws ProductNotFoundException{
		try {
			int response =  productServices.getEmiServices(productID);
			return new ApplicationResponseEntity<>("200","Success",response);
		}
		catch(Exception e){
			return new ApplicationResponseEntity<>("999",e.toString(),null);
		}
	}
	@GetMapping("/products/{id}")
	public ApplicationResponseEntity<Product> getProductByID(@PathVariable(value = "id") Long productID) throws ProductNotFoundException{
		try {
			Product response =  productServices.getProductByID(productID);
			return new ApplicationResponseEntity<>("200","Success",response);
		}
		catch(Exception e){
			return new ApplicationResponseEntity<>("999",e.toString(),null);
		}

	}
}
