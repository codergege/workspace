package cn.codergege.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.codergege.dao.UserDao;
import cn.codergege.domain.User;
import cn.codergege.util.DbcpUtils;

public class UserDaoImpl implements UserDao {

	@Override
	public List<User> getAllUsers() {
		List<User> results = new ArrayList<User>();
		String sql = "select id, name, gender, birthday from user";
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conn = DbcpUtils.getGsConnection();
			// 没有 where 条件, 所以 stmt 不用 prepare.
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setGender(rs.getInt("gender"));
				user.setBirthday(rs.getDate("birthday"));
				results.add(user);
			}
			
		} catch(Exception e) {
		} finally {
			DbcpUtils.release(rs, stmt, conn);
		}
		
		return results;
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
