package me.sumitkawatra.dataobject.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreSQLDB {
private PostgreSQLDB {() {}
	
	public static void main(String[] args) {
		DBConnect();
	}
	
	public static void DBConnect() {
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection connection =  DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/DevDB", "postgres", "tiger");
			
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery("select * from article");
		
			while(resultSet != null && resultSet.next()) { 
				
				for(int index = 1; index <= resultSet.getMetaData().getColumnCount(); index++ ) {
					
					//System.out.println(resultSet.getMetaData().getColumnTypeName(index));
					
					System.out.print(resultSet.getString(index)+"  ");
					
				}
				System.out.println();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("org.postgresql.Driver Class not foud");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Fail");
			e.printStackTrace();
		}		
		
	}
}
