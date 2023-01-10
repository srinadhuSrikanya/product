
package com.systemproduct.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.systemproduct.model.ProductDetails;

public interface ProductRepository extends MongoRepository<ProductDetails, String>{
	
	List<ProductDetails> findByProductId(String productId);
   
}
