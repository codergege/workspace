package cn.codergege.packagename.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.codergege.packagename.model.User;
import cn.codergege.packagename.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	final Logger log = LoggerFactory.getLogger(UserController.class);

	@Resource
	private UserService userService;
	
	@RequestMapping("/hello")
	public String hello() {
		log.info("Hello in UserController.hello() ");
		
		User user = userService.getUser(1);
		log.info("user:" + user);

		return "forward:/WEB-INF/user/user.jsp";
	}
	
	

}
