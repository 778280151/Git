package com.atguigu.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface dayima_dao {
	public List<com.atguigu.mybatis.bean.dayima> selectall(@Param("id") int id);
}
