package com.customer.wc.products;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.customer.wc.products.dto.ProductDTO;

@Service
public class ProductManagerImpl implements ProductManager {

	@Resource
	ProductRepository productRepository;
	
	@Override
	public void addProduct(ProductDTO product) {
		 productRepository.addProduct(product);
	}

	@Override
	public void deleteProduct(String productId) {
		productRepository.deleteProduct(productId);
	}

	@Override
	public ProductDTO editProduct(ProductDTO product) {
		productRepository.editProduct(product);
		return product;
	}

	@Override
	public List<ProductDTO> getProducts() {
		return productRepository.getProducts();
	}

	@Override
	public ProductDTO getProductById(String productId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
