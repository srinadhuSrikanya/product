package com.systemproduct.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.systemproduct.model.ProductDetails;
import com.systemproduct.repo.ProductRepository;


@Service
public class ProductService {
@Autowired
     public ProductRepository ProductDetailsRepo;
	private String productId;
	
	public Boolean addProduct(ProductDetails product) {
		ProductDetailsRepo.insert(product);
		return true;
		}

	public List<ProductDetails> getAllProduct() {
		
		return ProductDetailsRepo.findAll();
	}

	public Optional<ProductDetails> getAllDetails(String movieId) 
	{
		return ProductDetailsRepo.findById(productId);
	}
	public boolean deleteProduct(String productId) {
		ProductDetailsRepo.deleteById(productId);
		return true;
		
	}

//	public String updateEmployee(Productlist ) {
//		// TODO Auto-generated method stub
//		ProductDetailsRepo.save(product);
//		return "product UPdated Successfully";
	//

	public List<ProductDetails> findAll() {
		
		 return ProductDetailsRepo.findAll();
	}

	public Optional<ProductDetails> findById(String id) {
		ProductDetailsRepo.findById(productId);
		return null;
	}

	/*
	 * public void updateProductByFarmer(String ProductId, ProductModel product) {
	 * productRepository.
	 * 
	 * }
	 */
	
	
	
}
