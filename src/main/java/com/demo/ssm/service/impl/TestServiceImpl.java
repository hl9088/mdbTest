package com.demo.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ssm.dao.ITestDao;
import com.demo.ssm.pojo.TestBean;
import com.demo.ssm.service.ITestService;

@Service(value="testService")
public class TestServiceImpl implements ITestService {

	@Autowired
	private ITestDao testDao;

	@Override
	public List<TestBean> showAllTestInfo() {
		
		return testDao.showAllTestInfo();
	}
}
