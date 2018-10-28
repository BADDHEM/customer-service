package com.customer.wc.products;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customer.wc.Util.Response;
import com.customer.wc.products.dto.ProductDTO;

@RestController
@RequestMapping("/products")
public class ProductController {

	@PostMapping
	public ResponseEntity<Response<String>> addProduct(@RequestBody ProductDTO product) {

		return null;
	}

	@PutMapping
	public ResponseEntity<Response<String>> editProduct(@RequestBody ProductDTO product) {

		return null;
	}

	@DeleteMapping
	public ResponseEntity<Response<String>> deleteProduct(@RequestParam(name = "productId") String productId) {

		return null;
	}

	@GetMapping
	public ResponseEntity<Response<String>> getProducts() {

		return null;
	}

	@GetMapping
	public ResponseEntity<Response<String>> getProductById(@RequestParam(name = "productId") String productId) {

		return null;
	}
}
