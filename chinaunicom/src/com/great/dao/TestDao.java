package com.great.dao;

import java.util.List;

import com.great.entity.Consumrecord;
import com.great.entity.Emp;

public interface TestDao {

	public int addConsumrecord (Consumrecord con);//增加消费记录  cyl
	
	public int deleteLastInfo(int consum_id);  //根据id删除
	
	public int updateInfo(Consumrecord con);//根据id更新 对象的信息 传进来的是对象
	
	public List<Consumrecord> findAll();//查询所有消费记录
}
