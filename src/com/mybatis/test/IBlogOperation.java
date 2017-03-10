package com.mybatis.test;

import com.mybatis.zc.Org;

public interface IBlogOperation {
	
	Blog getBlogByID(int id);
	
	Org getOrgData(int id);
	
}
