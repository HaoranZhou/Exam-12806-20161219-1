package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcFactory {
	public Statement getStatement(){
		Connection connection=null;
		Statement Statement=null;
		   // 驱动程序名        
        String driver = "com.mysql.jdbc.Driver";  
               // URL指向要访问的数据库名world        
        String url = "jdbc:mysql://127.0.0.1:3306/sakila";  
               // MySQL配置时的用户名           
        String user = "root";           
        // MySQL配置时的密码          
        String password = "123456";  
        String name;  
        
        try {
			Class.forName(driver);
			connection=DriverManager.getConnection(url, user, password);
			if(!connection.isClosed()){
				System.out.println("Succeeded connecting to the Database!");
				Statement=connection.createStatement();
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return Statement;
	}
	public Connection getPS(){
		Connection connection=null;
		Statement Statement=null;
		   // 驱动程序名        
        String driver = "com.mysql.jdbc.Driver";  
               // URL指向要访问的数据库名world        
        String url = "jdbc:mysql://127.0.0.1:3306/sakila";  
               // MySQL配置时的用户名           
        String user = "root";           
        // MySQL配置时的密码          
        String password = "123456";  
        String name;  
        try {
			Class.forName(driver);
			connection=DriverManager.getConnection(url, user, password);
			connection.setAutoCommit(true);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return connection;
	}
}
