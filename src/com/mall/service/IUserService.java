package com.mall.service;

import java.util.List;

import com.mall.common.ServerResponse;
import com.mall.entity.User;

public interface IUserService {

	ServerResponse<User> login(String username, String password);

	ServerResponse<List<User>> pageList(Integer page, Integer limit);
	
}
