package com.chat.sys.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.chat.sys.dao.UserMapper;
import com.chat.sys.entity.User;
import com.chat.sys.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userDao;

	public User getUserById(Integer id) {
		return this.userDao.selectByPrimaryKey(id);
	}

}
