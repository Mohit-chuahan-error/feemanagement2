package com.javatpoint.dao;
import java.sql.*;
public class DB {
public static Connection getCon(){
	Connection con=null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fee","root","Errormysql");
	}catch(Exception ex){System.out.println(ex+"Eror");}
	return con;
}
}
