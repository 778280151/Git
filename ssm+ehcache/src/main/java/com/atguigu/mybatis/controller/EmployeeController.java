package com.atguigu.mybatis.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.atguigu.mybatis.bean.dayima;
import com.atguigu.mybatis.service.EmployeeService;
import com.atguigu.mybatis.service.dayima_service;
import com.atguigu.mybatis.service.nimabi;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	@Autowired
	nimabi nimabi;
	@Autowired
	dayima_service dayima;

	@RequestMapping("/getemps")
	public String emps(Map<String, Object> map) {
		List<dayima> emps = employeeService.getEmps();
		System.out.println("王静龙对方森看");
		map.put("allEmps", emps);
		return "list";
	}

	@RequestMapping(value = "/fuck")
	public ModelAndView fuck() {
		ModelAndView m = new ModelAndView("fuck");
		return m;
	}

	@RequestMapping(value = "/submit")
	public void sbumitjj(@RequestParam("uid") int id, @RequestParam("uname") String name) {
		int insertfuck = employeeService.insert(id, name);
		System.out.println("sdfsdsdfsdfsdfsdf" + insertfuck);
	}
	// @RequestMapping("/jjjj")
	// public void jj() {
	// System.out.println(employeeService.jjjj());
	// }

	@RequestMapping("/rrr")
	public void rrr() {
		// System.out.println(nimabi.fuck(2));
		// System.out.println(nimabi.all("d", 2).get(0).toString());
		System.out.println(dayima.selectall(1));
	}
}
