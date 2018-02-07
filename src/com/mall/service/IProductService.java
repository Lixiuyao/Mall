package com.mall.service;

import java.util.List;

import com.mall.common.ServerResponse;
import com.mall.entity.Product;

public interface IProductService {

	ServerResponse<List<Product>> pageList(Integer page, Integer limit, Product product);
	
}
