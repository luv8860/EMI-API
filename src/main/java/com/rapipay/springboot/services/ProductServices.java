package com.rapipay.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rapipay.springboot.exception.ProductNotFoundException;
import com.rapipay.springboot.model.Product;
import com.rapipay.springboot.repository.ProductRepository;

@Service
public class ProductServices {
	@Autowired
	ProductRepository productRepository;
	
	public Product insertProductService(Product product) throws Exception{
		product.setCreatedOn();
		product.setUpdatedOn();
		return this.productRepository.save(product);

	}
	public Product updateProductService(long productID,Product productDetails )throws ProductNotFoundException,Exception{
		Product product = productRepository.findById(productID).orElseThrow(()->new ProductNotFoundException("Unable to Find the product"));
		product.setProductName(productDetails.getProductName());
		product.setTenure(productDetails.getTenure());
		product.setRateOfInterest(productDetails.getRateOfInterest());
		product.setPrinclpleAmount(productDetails.getPrinclpleAmount());
		product.setActive(productDetails.isActive());
		product.setUpdatedBy(productDetails.getUpdatedBy());
		product.setUpdatedOn();
		productRepository.save(product);
		return product;
	}
	public int getEmiServices(long productID) throws ProductNotFoundException{
		Product product = productRepository.findById(productID).orElseThrow(()->new ProductNotFoundException("Unable to Find the product"));
		return (int) ((product.getPrinclpleAmount()*product.getRateOfInterest()*(1+product.getRateOfInterest())*product.getTenure())/((1+product.getRateOfInterest())*product.getTenure()-1));
		
	}
	public Product getProductByID(Long productID) throws ProductNotFoundException {
		Product product = productRepository.findById(productID).orElseThrow(()->new ProductNotFoundException("Unable to Find the product"));
		return product;
	}
	
}
