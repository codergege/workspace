package cn.codergege.dao;

import java.util.List;

import cn.codergege.domain.User;

public interface UserDao {
	List<User> getAllUsers();
	User getUserById(int id);
	int insert(User user);
	int deleteById(int id);
	int delete(User user);
	int update(User user);
}
