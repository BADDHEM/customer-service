package com.customer.wc.products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.customer.wc.products.dto.ProductDTO;

@Repository
public class ProductRepositorympl implements ProductRepository {

	@Autowired
	MongoOperations mongoOperations;
	
	@Override
	public void addProduct(ProductDTO product) {
		mongoOperations.save(product);	
	}

	@Override
	public void deleteProduct(String productId) {
		Query query = new Query(Criteria.where("productId").is(productId));	
		mongoOperations.remove(query, ProductDTO.class);
	}

	@Override
	public ProductDTO editProduct(ProductDTO product) {
		 mongoOperations.save(product);
		 return product;
	}

	@Override
	public List<ProductDTO> getProducts() {
		return mongoOperations.findAll(ProductDTO.class);
	}

	@Override
	public ProductDTO getProductById(String productId) {
		Query query = new Query(Criteria.where("productId").is(productId));
		return mongoOperations.findOne(query, ProductDTO.class);
	}

	
	
}
