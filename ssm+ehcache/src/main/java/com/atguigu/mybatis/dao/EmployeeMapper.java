package com.atguigu.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.atguigu.mybatis.bean.dayima;

public interface EmployeeMapper {

	public List<dayima> getEmps();

	// public int insertfuck( int id, String name);
	public List<Object> jjjj();
	
	public int insert(@Param("id")int id,@Param("username")String name);
}
