package com.customer.wc.products.dto;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.customer.wc.reviews.dto.ProductReviewDTO;

@Document(collection = "tbl_product_dto")
public class ProductDTO {

	@Id
	private long id;
	private String productId;
	private String productName;
	private String productCode;
	private String description;
	private String rating;
	private int price;
	private String productImageUrl;
	private List<ProductReviewDTO> reviews;
	private List<SpecificationDTO> specifications;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProductImageUrl() {
		return productImageUrl;
	}
	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}
	public List<ProductReviewDTO> getReviews() {
		return reviews;
	}
	public void setReviews(List<ProductReviewDTO> reviews) {
		this.reviews = reviews;
	}
	public List<SpecificationDTO> getSpecifications() {
		return specifications;
	}
	public void setSpecifications(List<SpecificationDTO> specifications) {
		this.specifications = specifications;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
}
