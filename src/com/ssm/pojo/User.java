package com.ssm.pojo;

import org.springframework.stereotype.Component;

/**
 * 定义实体类：如果实体类的属性名和数据表中的字段名不一致，则需要在 映射文件中配置 resultMap
 * 
 * @author FuchangZhang
 *
 */
@Component
public class User {

	private Integer id;
	private String userName;
	private String userSex;
	private Integer userAge;

	public User() {
		super();
	}

	public User(String userName, String userSex, Integer userAge) {
		super();
		this.userName = userName;
		this.userSex = userSex;
		this.userAge = userAge;
	}

	public User(Integer id, String userName, String userSex, Integer userAge) {
		super();
		this.id = id;
		this.userName = userName;
		this.userSex = userSex;
		this.userAge = userAge;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public Integer getUserAge() {
		return userAge;
	}

	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userSex=" + userSex + ", userAge=" + userAge + "]";
	}

}
