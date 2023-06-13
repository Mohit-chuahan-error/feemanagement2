package com.javatpoint.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class delee {
public static void main(String[] args) throws SQLException, ClassNotFoundException {

	
	System.out.println("starting");
	//Class.forName(" com.mysql.jdbc.Driver");
	//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fee","root","Errormysql");
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mohit","root","Errormysql");
	
	PreparedStatement ps=con.prepareStatement("INSERT INTO `mohit`.`mohitc` (`id`, `name`) VALUES ('99', 'abdul')");
	ps.setInt(1,1222);
	ps.setString(2, "mohit chauhan");
	System.out.println("inserted completed");
}

}
