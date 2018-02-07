package com.mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall.common.ServerResponse;
import com.mall.entity.Product;
import com.mall.mapper.ProductMapper;
import com.mall.service.IProductService;
@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	private ProductMapper productMapper;
	@Override
	public ServerResponse<List<Product>> pageList(Integer page, Integer limit,Product product) {
		//1.设置分页
		PageHelper.startPage(page,limit);
		
		List<Product> list = productMapper.pageList(product);
		//第二种分页
		PageInfo pageInfo = new PageInfo<>(list);
		Integer count = (int) pageInfo.getTotal();
		
		return ServerResponse.createSuccess("查询成功", count,list);
	}

}
