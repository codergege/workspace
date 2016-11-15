package cn.codergege.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DbcpUtils {
	final static Logger log = LoggerFactory.getLogger(DbcpUtils.class);
	private static BasicDataSource ds;
	
	static{
		InputStream in=DbcpUtils.class.getResourceAsStream("/dbcp.properties");
		Properties prop=new Properties(); 
        try { 
            prop.load(in);
			ds=(BasicDataSource) BasicDataSourceFactory.createDataSource(prop);
		} catch (Exception e) {
			throw new ExceptionInInitializerError("初始化数据库出错！");
		}
		 
		 
	}
	
	public static Connection getGsConnection() throws SQLException{
		return ds.getConnection();
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
		log.info("test log info");
		try {
			System.out.println(getGsConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
