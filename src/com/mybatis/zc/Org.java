package com.mybatis.zc;



// Generated 2016-5-10 16:16:09 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.List;

import com.mybatis.test.Article;




public class Org implements java.io.Serializable {
	private List<OrgContacts> orgContacts;
	public List<OrgContacts> getOrgContacts() {
		return orgContacts;
	}

	public void setOrgContacts(List<OrgContacts> orgContacts) {
		this.orgContacts = orgContacts;
	}

	private String address;
	private String name;
	public Org() {
		
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	private String linkMan;
	private String phone;

	public final String getAddress() {
		return this.address;
	}

	public final void setAddress(String address) {
		this.address = address;
	}
	private int id;
	private String title;


    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
	public final String getLinkMan() {
		return this.linkMan;
	}

	public final void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}


	public final String getPhone() {
		return this.phone;
	}

	public final void setPhone(String phone) {
		this.phone = phone;
	}



}
