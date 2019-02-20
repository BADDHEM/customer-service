package com.customer.wc.products;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customer.wc.products.dto.ProductDTO;
import com.customer.wc.util.Response;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Resource
	ProductManager productManager;
	
	@PostMapping
	public ResponseEntity<Response<String>> addProduct(@RequestBody ProductDTO product) {
		productManager.addProduct(product);
		return Response.successResponse("Product Added SuccesFully");
	}

	@PutMapping
	public ResponseEntity<Response<String>> editProduct(@RequestBody ProductDTO product) {
		productManager.editProduct(product);
		return Response.successResponse("Product Edited SuccesFully");
	}

	@DeleteMapping
	public ResponseEntity<Response<String>> deleteProduct(@RequestParam(name = "productId") String productId) {
		productManager.deleteProduct(productId);
		return Response.deleteResponse("204", "Product Deleted");
	}

	@GetMapping
	public ResponseEntity<Response<List<ProductDTO>>> getProducts() {
		List<ProductDTO>  products = productManager.getProducts();
		return Response.successResponse(products);
	}

	@GetMapping(value="/productId")
	public ResponseEntity<Response<ProductDTO>> getProductById(@RequestParam(name = "productId") String productId) {
		ProductDTO product = productManager.getProductById(productId);
		return Response.successResponse(product);
	}
}
