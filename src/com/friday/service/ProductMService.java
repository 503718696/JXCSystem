package com.friday.service;

import java.util.List;

import com.friday.model.ProductType;

public interface ProductMService {
	public int addType(ProductType productType) throws Exception;
	
	public ProductType getType(String name) throws Exception;
	
	public List<ProductType> getAllType() throws Exception;
	
	public int removeType(int id) throws Exception;

}