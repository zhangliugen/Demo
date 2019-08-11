package com.mitumao.mapper;



import com.mitumao.pojo.MtmAdmin;
import com.mitumao.util.MyMapper;

public interface MtmAdminMapper extends MyMapper<MtmAdmin> {
	void saveAdminInfo(MtmAdmin map);
	MtmAdmin selectAdminInfoByUserName(String username);
}