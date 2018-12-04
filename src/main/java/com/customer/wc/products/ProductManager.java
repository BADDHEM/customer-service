package com.customer.wc.products;

import java.util.List;

import com.customer.wc.products.dto.ProductDTO;

public interface ProductManager {

	void addProduct(ProductDTO product);
	
	void  deleteProduct(String productId);
	
	ProductDTO editProduct(ProductDTO product);
	
	List<ProductDTO> getProducts();
	
	ProductDTO getProductById(String productId);
	
}
