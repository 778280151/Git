package com.atguigu.mybatis.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class dayima implements Serializable{

	@Override
	public String toString() {
		return "dayima [painleixing=" + painleixing + ", id=" + id + ", date=" + date + ", dymlx=" + dymlx + "]";
	}

	private String painleixing;
	private int id;
	private String date;
	private List<dayimaleixing> dymlx;

	public String getPainleixing() {
		return painleixing;
	}

	public void setPainleixing(String painleixing) {
		this.painleixing = painleixing;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<dayimaleixing> getDymlx() {
		return dymlx;
	}

	public void setDymlx(List<dayimaleixing> dymlx) {
		this.dymlx = dymlx;
	}

	public dayima(String painleixing, int id, String date, List<dayimaleixing> dymlx) {
		super();
		this.painleixing = painleixing;
		this.id = id;
		this.date = date;
		this.dymlx = dymlx;
	}

	public dayima() {
		super();
		// TODO Auto-generated constructor stub
	}

}
