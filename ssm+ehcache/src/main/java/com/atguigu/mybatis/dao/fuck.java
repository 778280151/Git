package com.atguigu.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.atguigu.mybatis.bean.caonima;

public interface fuck {
  public List<Integer> fuck(@Param("id") int id);
  
  public List<caonima> all(@Param("name")String name,@Param("id")int id);
}
