package com.demo.ssm.service;

import java.util.List;

import com.demo.ssm.pojo.TestBean;

public interface ITestService {

	/**
	 * 显示所有测试信息
	 * @return 所有测试信息
	 */
	public List<TestBean> showAllTestInfo(); 
}
