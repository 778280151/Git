package com.atguigu.mybatis.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.mybatis.dao.dayima_dao;
@Service
public class dayima_service {
	@Autowired
	dayima_dao dayima;
	@Autowired
	SqlSession SqlSession;

	public List<com.atguigu.mybatis.bean.dayima> selectall(int id) {
     return  dayima.selectall(id);
	}
}
