package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Player {

	public static void main(String[] args) {
		
		Connection connection = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/players";
			String userName="root";
			String password="Success@123";
			connection = DriverManager.getConnection(url, userName, password);
			
			Statement statement =connection.createStatement();
			String sql="select id,name,age,gender,city,sportsName,contact from player order by id desc";
			
			ResultSet resultSet=statement.executeQuery(sql);
			while(resultSet.next()) {
				System.out.print("Id : "+resultSet.getInt("id"));
				System.out.print(" Name : "+resultSet.getString("name"));
				System.out.print(" Gender : "+resultSet.getString("gender"));
				System.out.print(" City : "+resultSet.getString("city"));
				System.out.print(" Sports Name : "+resultSet.getString("sportsName"));
				System.out.print(" Age : "+resultSet.getInt("age"));
				System.out.println(" Contact : "+resultSet.getLong("contact"));
			}
		}catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		 catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			connection.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
}