package com.mall.controller.back;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mall.common.ServerResponse;
import com.mall.entity.Product;
import com.mall.service.IProductService;
@Controller
@RequestMapping("manager/product")
public class ProductManagerController {
	@Autowired
	private IProductService productService;
	
	@RequestMapping(value="/getproduct")
	public String getUserpage(){
		return "product_list";
	}
	@RequestMapping(value="pageList")
	@ResponseBody
	public ServerResponse<List<Product>> pageList(Integer page, Integer limit,Product product){
		return productService.pageList(page,limit,product);
	}
	
	
}
