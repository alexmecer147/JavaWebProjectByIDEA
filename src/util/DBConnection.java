package util;

import java.sql.*;

public class DBConnection {
	private static final String driverName = "com.mysql.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/testdb?useUnicode=true&characterEncoding=utf8";
	private static final String user = "root";
	private static final String password = "root";

	public DBConnection() {
		// TODO Auto-generated constructor stub
	}
	
	static{
		try{
			Class.forName(driverName);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url,user,password);
	}

	public static void close(ResultSet rs,Statement st,Connection conn){//一层一层关闭
		try{
			if(rs != null){
				rs.close();
			}
		}catch (SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if(st != null){
					st.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				if(conn != null){
					try{
						conn.close();
					}catch(SQLException e){
						e.printStackTrace();
					}
				}
			}
		}
	}
}
