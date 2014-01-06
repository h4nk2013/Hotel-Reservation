package com.struts2.learning;

import java.sql.*;
public class BaseDAO{
	Connection con;
	public Connection getConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HotelManagement","root","");
		}
		catch(Exception e){
			System.out.println(e);
		}
		return con;
	}
	public void closeConnection(){
		try{
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
