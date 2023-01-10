package com.systemproduct.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.systemproduct.model.ProductDetails;
import com.systemproduct.repo.EmployeeRepository;
import com.systemproduct.repo.ProductRepository;


@Service
public class ProductService {
@Autowired
     public ProductRepository ProductDetailsRepo;
	private String productId;
	
	public Boolean addProduct(ProductDetails product) {
		ProductDetails.insert(product);
		return true;
		}

	public List<ProductDetails> getAllProduct() {
		
		return ProductDetails.findAll();
	}

	public List<ProductDetails> getAllProductByProduct(String productId) 
	{
		return ProductDetails.findByProductId(productId);
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
		
		 return productDetailsRepo.findAll();
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
