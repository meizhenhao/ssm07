package com.ssm.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.pojo.User;
import com.ssm.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	// 顯示页面
	@RequestMapping("/showIndex")
	public String showIndex() {

		return "index";
	}
	

	// 添加页面
	@RequestMapping("/addView")
	public String addView(Map<String, Object> map) {
		map.put("user", new User());
		return "addUser";
	}

	// 保存操作
	@RequestMapping("/addUser")
	public String addUser(User user) {
		if (userService.add(user)) {
			return "success";
		} else {
			return "redirect:/queryAll";
		}
	}

	// 删除操作
	@RequestMapping("/delete")
	public String delete(int id) {
		if (userService.delete(id)) {
			System.out.println("删除成功");
		} else {
			System.out.println("删除失败");
		}
		return "redirect:/queryAll";
	}

	// 查询一个操作
	@RequestMapping("/queryOne")
	public String queryOne(int id, Map<String, Object> map) {
		map.put("user", userService.queryOne(id));
		return "update";
	}

	// 修改操作
	@RequestMapping("/update")
	public String update(User user, Map<String, Object> map) {
		if (userService.update(user)) {
			System.out.println("修改成功");
			return "redirect:/queryAll";
		} else {
			System.out.println("修改失败");
			map.put("user", userService.queryOne(user.getId()));
			return "update";
		}
	}

	// 查询全部操作
	@RequestMapping("/queryAll")
	public String queryAll(Map<String, Object> map) {
		map.put("users", userService.queryAll());
		return "queryAll";
	}
}