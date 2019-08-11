package com.mitumao.service;
import com.mitumao.pojo.MtmAdmin;

public interface AdminService {
	public void saveAdminInfo(MtmAdmin params);
	MtmAdmin selectAdminInfoByUserName(String username);
}
