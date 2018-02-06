package com.demo.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ssm.pojo.TestBean;
import com.demo.ssm.service.ITestService;

@RestController
@RequestMapping(value="test")
public class TestController {

	@Autowired
	private ITestService testService;
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@RequestMapping(value="/showAllTestInfo")
	public String showAllTestInfo(Model model, HttpServletRequest request){
		List<TestBean> testInfos = testService.showAllTestInfo();
		
		String name = null;
		
		//List<TestBean> findAll = mongoTemplate.findAll(TestBean.class);
		
		Query query = new Query(Criteria.where("name").is("hahaha"));
		
		List<TestBean> find = mongoTemplate.find(query, TestBean.class, "testBean");
		
		if(find.size()!=0){
			name = find.get(0).getName();
		}else{
			TestBean ttBean = new TestBean();
			ttBean.setName("hahaha");
			ttBean.setPassword("hahahaha");
			mongoTemplate.insert(ttBean, "testBean");
		}
		
		return name; 
	}
	
	@RequestMapping(value="/cleanCache")
	public String cleanCache(Model model, HttpServletRequest request){
		Query query = new Query(Criteria.where("name").is("hahaha"));
		
		List<TestBean> findAllAndRemove = mongoTemplate.findAllAndRemove(query, TestBean.class, "testBean");
		
		Query query2 = new Query(Criteria.where("name").is("hahaha"));
		
		List<TestBean> find = mongoTemplate.find(query2, TestBean.class, "testBean");
		
		
		return find.size()+""; 
	}
}
