package cn.codergege.persist;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;

public class OracleDbUtils {
	private static BasicDataSource gsDs;
	
	static{
		InputStream in=OracleDbUtils.class.getResourceAsStream("/gs.properties");
		 Properties prop=new Properties();
		 try {
			prop.load(in);
			gsDs=(BasicDataSource) BasicDataSourceFactory.createDataSource(prop);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ExceptionInInitializerError("初始化数据库出错！");
		}
		 
		 
	}
	
	public static Connection getGsConnection() throws SQLException{
		return gsDs.getConnection();
	}
	
	public static void release(ResultSet rs,Statement stmt,Connection conn){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				rs=null;
			}
		}
		
		if(stmt!=null){
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				stmt=null;
			}
		}
		
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				conn=null;
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(getGsConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}