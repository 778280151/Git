package com.atguigu.mybatis.bean;

public class user {
	private int id;
  	private String st_loginName;
	private String st_password;
	private String st_name;
	private String st_idcard;
	private String st_phone;
	private int st_sex;
	private String st_address;
	private String st_email;
	private int state;
	private int delete;
	private int rol_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSt_loginName() {
		return st_loginName;
	}

	public void setSt_loginName(String st_loginName) {
		this.st_loginName = st_loginName;
	}

	public String getSt_password() {
		return st_password;
	}

	public void setSt_password(String st_password) {
		this.st_password = st_password;
	}

	public String getSt_name() {
		return st_name;
	}

	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}

	public String getSt_idcard() {
		return st_idcard;
	}

	public void setSt_idcard(String st_idcard) {
		this.st_idcard = st_idcard;
	}

	public String getSt_phone() {
		return st_phone;
	}

	public void setSt_phone(String st_phone) {
		this.st_phone = st_phone;
	}

	public int getSt_sex() {
		return st_sex;
	}

	public void setSt_sex(int st_sex) {
		this.st_sex = st_sex;
	}

	public String getSt_address() {
		return st_address;
	}

	public void setSt_address(String st_address) {
		this.st_address = st_address;
	}

	public String getSt_email() {
		return st_email;
	}

	public void setSt_email(String st_email) {
		this.st_email = st_email;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getDelete() {
		return delete;
	}

	public void setDelete(int delete) {
		this.delete = delete;
	}

	public int getRol_id() {
		return rol_id;
	}

	public void setRol_id(int rol_id) {
		this.rol_id = rol_id;
	}

	@Override
	public String toString() {
		return "user [id=" + id + ", st_loginName=" + st_loginName + ", st_password=" + st_password + ", st_name="
				+ st_name + ", st_idcard=" + st_idcard + ", st_phone=" + st_phone + ", st_sex=" + st_sex
				+ ", st_address=" + st_address + ", st_email=" + st_email + ", state=" + state + ", delete=" + delete
				+ ", rol_id=" + rol_id + "]";
	}

}
