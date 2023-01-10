package com.systemproduct.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.systemproduct.model.ProductDetails;
import com.systemproduct.repo.ProductRepository;

//@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api")
public class ProductController {
	
	

	@Autowired
    ProductRepository repo;
	
	@RequestMapping(value="/product",method=RequestMethod.GET)
	public List<ProductDetails> getAllPtoductDetails(){
		return repo.findAll();
	}
	
	@RequestMapping(value="/product/{id}",method=RequestMethod.GET)
	  public Optional<ProductDetails> getProductDetails(@PathVariable String id) {
		return repo.findById(id);
	  }
	
	@RequestMapping(value="/product/{productId}",method=RequestMethod.GET)
	  public List<ProductDetails> getByProductId(@PathVariable String productId) {
		return repo.findByProductId(productId);
	  }
	


	  @RequestMapping(value="/product",method=RequestMethod.POST)
	  public String addProductDetails(@RequestBody ProductDetails product) {
		  
		  repo.insert(product);
		  return "product added sucessfully";
		  
	  }

	  @RequestMapping(value="/product/{id}",method=RequestMethod.PUT)
	  public String updateProductDetails(@PathVariable String id, @RequestBody ProductDetails product) {

		repo.save(product);
		return "product updated sucessfully";
	  }

	  @RequestMapping(value="/product/{id}",method=RequestMethod.DELETE)
	  public String deleteProductDetails(@PathVariable String id) {
	    repo.deleteById(id);
	    return "product deletd sucessfully";
	  }

}
