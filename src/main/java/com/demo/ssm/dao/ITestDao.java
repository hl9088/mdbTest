package com.demo.ssm.dao;

import java.util.List;

import com.demo.ssm.pojo.TestBean;

public interface ITestDao {
	
	/**
	 * 显示所有测试信息
	 * @return 所有测试信息
	 */
	public List<TestBean> showAllTestInfo(); 
}
