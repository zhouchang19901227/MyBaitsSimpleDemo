package com.mybatis.zc;

import java.util.List;

import com.mybatis.test.Article;

public class OrgContacts implements java.io.Serializable {


	private String linkMan;
	private String phone;

	public OrgGoods goods;

	public OrgGoods getGoods() {
		return goods;
	}
	public void setGoods(OrgGoods goods) {
		this.goods = goods;
	}
	public OrgContacts() {
	}

	private int id;
	private String title;
	private List<Article> articles;
	
	public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    public List<Article> getArticles() {
        return articles;
    }
    public void setArticles(List<Article> articles) {
        this.articles = articles;
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
