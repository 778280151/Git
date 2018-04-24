package com.atguigu.mybatis.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.atguigu.mybatis.bean.dayima;
import com.atguigu.mybatis.dao.EmployeeMapper;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;

	@Autowired
	private SqlSession sqlSession;

	@Cacheable(value = "cacheTest")
	public List<dayima> getEmps() {
		//
		// EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
		System.out.println("饿了跟将扽开工精干狂就");
		return employeeMapper.getEmps();
	}

	// public int insertfuck(int id, String name) {
	// return employeeMapper.insertfuck( id, name);
	// }

	public List<Object> jjjj() {
		return employeeMapper.jjjj();
	}

	public int insert(int id, String username) {
		return employeeMapper.insert(id, username);
	}
}
