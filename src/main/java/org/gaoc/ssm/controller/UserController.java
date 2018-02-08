package org.gaoc.ssm.controller;

import org.gaoc.ssm.entity.User;
import org.gaoc.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping("/userList.controller")
	public String stuList(HttpServletRequest request) {
		//获得学生表数据信息
		List<User> users = userService.getUserList();

		request.setAttribute("user", users);
		return "gpList";
	}
	

}
