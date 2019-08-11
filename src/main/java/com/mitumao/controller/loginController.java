package com.mitumao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mitumao.pojo.MtmAdmin;
import com.mitumao.service.AdminService;

@Controller
@RequestMapping("login")
public class loginController {
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/login.do")
	public String login(ModelMap map,String username,String password) {
		try {
			MtmAdmin adminInfo = adminService.selectAdminInfoByUserName(username);
			if(adminInfo != null) {
				String pwd = adminInfo.getPassword();
				if(password.equals(pwd)) {
					map.addAttribute("msg","登录成功");
					return "thymeleaf/msg";
				}else {
					map.addAttribute("msg","登录失败,密码错误");
					return "thymeleaf/welcome";
				}
			}
			map.addAttribute("msg","登录失败");
			return "thymeleaf/welcome";
		} catch (Exception e) {
			map.addAttribute("msg","登录失败");
			return "thymeleaf/welcome";
		}
	}
}
