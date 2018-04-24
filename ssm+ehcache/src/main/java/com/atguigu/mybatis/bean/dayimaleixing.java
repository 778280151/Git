package com.atguigu.mybatis.bean;

import java.io.Serializable;

public class dayimaleixing implements Serializable {
	private int id;
	private String leixing;

	@Override
	public String toString() {
		return "dayimaleixing [id=" + id + ", leixing=" + leixing + "]";
	}

	public dayimaleixing() {
		super();
		// TODO Auto-generated constructor stub
	}

	public dayimaleixing(int id, String leixing) {
		super();
		this.id = id;
		this.leixing = leixing;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLeixing() {
		return leixing;
	}

	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
}
