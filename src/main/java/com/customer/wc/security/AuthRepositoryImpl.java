package com.customer.wc.security;

import javax.annotation.Resource;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.customer.wc.customer.dto.CustomerDTO;

@Repository
public class AuthRepositoryImpl implements AuthRepository{

	@Resource
	MongoOperations mongoOperations;
	
	@Override
	public CustomerDTO authenticateUser(String UserName) {
		// TODO Auto-generated method stub
		Query query = new Query(Criteria.where("username").is(UserName));
		return mongoOperations.findOne(query, CustomerDTO.class);
	}

	
}
