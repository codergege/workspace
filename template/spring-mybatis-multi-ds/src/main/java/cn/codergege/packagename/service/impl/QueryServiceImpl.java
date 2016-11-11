package cn.codergege.packagename.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.codergege.packagename.dao.BmGxdwTwoMapper;
import cn.codergege.packagename.dao.UserMapper;
import cn.codergege.packagename.service.QueryService;
import cn.codergege.packagename.util.DataSourceContextHolder;

@Service("queryService")
public class QueryServiceImpl implements QueryService {
	
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private BmGxdwTwoMapper bmGxdwTwoMapper;

	@Override
	public void print() {
		DataSourceContextHolder.setDataSourceType(DataSourceContextHolder.DATASOURCE_ONE);
		System.out.println(userMapper.selectByPrimaryKey(1));
		DataSourceContextHolder.setDataSourceType(DataSourceContextHolder.DATASOURCE_TWO);
		System.out.println(bmGxdwTwoMapper.selectByPrimaryKey("33078211"));
	}

}
