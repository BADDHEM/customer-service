package com.customer.wc.reviews;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customer.wc.reviews.dto.ProductReviewDTO;
import com.customer.wc.util.Response;

@RestController
public class ReviewContoller {

	public ResponseEntity<Response<String>> addReview(@RequestBody ProductReviewDTO reviewDTO){
		
		return null;
		
	}
	
	public ResponseEntity<Response<String>> getReviewsByProductId(@RequestParam(name="productId") String productId) {

		return null;

	}
	
	public ResponseEntity<Response<String>> deleteReviewsByProductId(@RequestParam(name="productId") String productId) {

		return null;

	}
}
