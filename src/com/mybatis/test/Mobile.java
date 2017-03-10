package com.mybatis.test;

public class Mobile {

	
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", mobile_eq_no=" + mobile_eq_no + ", org_id=" + org_id + ", dev_ver=" + dev_ver
				+ ", update_time=" + update_time + ", toString()=" + super.toString() + "]";
	}
	private int id;
	
	private String sim;
    public String getSim() {
		return sim;
	}
	public void setSim(String sim) {
		this.sim = sim;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String mobile_eq_no;
    private String org_id;
    private String dev_ver;
    private String update_time;
	public String getMobile_eq_no() {
		return mobile_eq_no;
	}
	public void setMobile_eq_no(String mobile_eq_no) {
		this.mobile_eq_no = mobile_eq_no;
	}
	public String getOrg_id() {
		return org_id;
	}
	public void setOrg_id(String org_id) {
		this.org_id = org_id;
	}
	public String getDev_ver() {
		return dev_ver;
	}
	public void setDev_ver(String dev_ver) {
		this.dev_ver = dev_ver;
	}
	public String getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}
}
