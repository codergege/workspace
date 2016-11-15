package cn.codergege.packagename.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.codergege.packagename.dao.UserMapper;
import cn.codergege.packagename.model.User;
import cn.codergege.packagename.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired
	private UserMapper userMapper;

	@Override
	public User getUser(int id) {
		User user = userMapper.selectByPrimaryKey(id);
		log.info("get a user: " + user);
		return user;
	}

}
