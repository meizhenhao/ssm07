package com.ssm.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssm.pojo.User;

@Repository
public interface UserService {
	// 添加一条用户信息
	public boolean add(User user);

	// 删除一条用户信息
	public boolean delete(int id);

	// 修改一条用户信息
	public boolean update(User user);

	// 查询一条用户信息
	public User queryOne(int id);

	// 查询全部用户信息
	public List<User> queryAll();
}
