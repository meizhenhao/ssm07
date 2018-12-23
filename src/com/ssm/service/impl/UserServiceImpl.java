package com.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.UserMapper;
import com.ssm.pojo.User;
import com.ssm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	private int result;

	@Override
	public boolean add(User user) {
		result = userMapper.save(user);
		if (result > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean delete(int id) {
		result = userMapper.delete(id);
		if (result > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean update(User user) {
		result = userMapper.update(user);
		if (result > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public User queryOne(int id) {
		User user = userMapper.getUser(id);
		return user;
	}

	@Override
	public List<User> queryAll() {
		List<User> users = userMapper.getUsers();
		return users;
	}

}
