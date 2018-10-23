package com.customer.wc.Util;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty
	private String stausCode;
	
	@JsonProperty
	private T data;
	
	@JsonProperty
	private String message;

	public Response(String stausCode, T data, String message) {
		super();
		this.stausCode = stausCode;
		this.data = data;
		this.message = message;
	}
	
	public Response(String stausCode, T data) {
		super();
		this.stausCode = stausCode;
		this.data = data;
	
	}
	
	public Response(String stausCode, String message) {
		super();
		this.stausCode = stausCode;
		this.message = message;
	
	}
	
	public Response(T data) {
		super();
		this.data = data;
	
	}
	
	
	public static <T> Response<T> successResponse(String stausCode, T data, String message) {
		return new Response<>(stausCode, data, message);
	}
	
	public static <T> Response<T> successResponse(String stausCode, T data) {
		return new Response<>(stausCode, data);
	}
	
	public static <T> Response<T> failureResponse(String stausCode, String message) {
		return new Response<>(stausCode,message);

	}
	

}
