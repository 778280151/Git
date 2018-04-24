package com.atguigu.mybatis.bean;

public class caonima {
	private String name;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public caonima(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public caonima() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "caonima [name=" + name + ", id=" + id + "]";
	}

}
