package com.customer.wc.Util;

import java.io.Serializable;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

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
	
	
	public static <T> ResponseEntity<Response<T>> successResponse(String stausCode, T data, String message) {
		Response<T> response =  new Response<T>("200", data, message);
		return new ResponseEntity<Response<T>>(response,HttpStatus.OK);
	}
	
	public static <T> ResponseEntity<Response<T>> successResponse(String stausCode, T data) {
		Response<T> response =  new Response<T>("200", data);
		return new ResponseEntity<Response<T>>(response,HttpStatus.OK);
	}
	
	public static <T> ResponseEntity<Response<T>> successResponse(String message) {
		Response<T> response =  new Response<T>("200",message);
		return new ResponseEntity<Response<T>>(response,HttpStatus.OK);
	}
	
	public static  <T> ResponseEntity<Response<T>> failureResponse(String stausCode, String message) {
		Response<T> response =  new Response<T>(stausCode, message);
		return new ResponseEntity<Response<T>>(response,HttpStatus.INTERNAL_SERVER_ERROR);

	}
	
	public static  <T> ResponseEntity<Response<T>> deleteResponse(String stausCode, String message) {
		Response<T> response =  new Response<T>("204", message);
		return new ResponseEntity<Response<T>>(response,HttpStatus.NO_CONTENT);

	}

}
