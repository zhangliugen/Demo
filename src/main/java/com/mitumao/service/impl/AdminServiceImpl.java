package com.mitumao.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mitumao.mapper.MtmAdminMapper;
import com.mitumao.pojo.MtmAdmin;
import com.mitumao.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private MtmAdminMapper adminMapper;
	
	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public void saveAdminInfo(MtmAdmin params) {
		adminMapper.saveAdminInfo(params);
	}

	@Override
	public MtmAdmin selectAdminInfoByUserName(String username) {
		
		MtmAdmin adminInfo = adminMapper.selectAdminInfoByUserName(username);
		return adminInfo;
	}

}
