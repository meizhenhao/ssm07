package com.ssm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssm.pojo.User;

/**
 * 定义接口：方法名得和相应的 mapper.xml 中的 id 保持一致
 * 
 * @author FuchangZhang
 *
 */
@Repository
public interface UserMapper {

	// 添加一条用户信息
	public int save(User user);

	// 删除一条用户信息
	public int delete(int id);

	// 修改一条用户信息
	public int update(User user);

	// 查询一条用户信息
	public User getUser(int id);

	// 查询全部用户信息
	public List<User> getUsers();

}
