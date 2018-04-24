package com.atguigu.mybatis.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.mybatis.bean.caonima;
import com.atguigu.mybatis.dao.fuck;

@Service
public class nimabi {
	@Autowired
	private fuck fuck;
	@Autowired
	private SqlSession session;

	public List<Integer> fuck(int id) {
		return fuck.fuck(id);
	}

	public List<caonima> all(String name, int id) {
		return fuck.all(name, id);
	}
}
