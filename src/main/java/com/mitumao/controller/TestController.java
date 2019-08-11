package com.mitumao.controller;

import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitumao.pojo.MtmAdmin;
import com.mitumao.service.AdminService;

@RestController
@RequestMapping("test")
public class TestController {
	@Autowired
	private Sid sid;
	
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/saveAdminInfo")
	public void saveAdminInfo() {
		MtmAdmin admin = new MtmAdmin();
		String uuid = sid.nextShort();
		admin.setUuid(uuid);
		admin.setUsername("superadmin");
		admin.setPassword("123123");
		admin.setAuthority("1");
		admin.setFailedLogins("");
		admin.setPwdExpiryDate("");
		admin.setDescription("超级管理员，拥有最高权限");
		admin.setContactWay("13063419587");
		admin.setAddress("安徽安庆");
		adminService.saveAdminInfo(admin);
		System.out.println("保存成功");
	}
}
