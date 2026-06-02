package com.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestExDemo16 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("main method started ");

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

//	Loading the Driver 
//	Returns the Class object associated with the class or interface with the given string name.
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver class has been loaded successfully !");

		// Attempts to establish a connection to the given database URL.
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sbdata", "root", "root");
		System.out.println("Connection Established !");

		// Creates a Statement object for sending SQL statements to the database.
		st = con.createStatement();

		String sql = "select * from employee";
//	Executes the given SQL statement, which returns a single ResultSet object.
		rs = st.executeQuery(sql);

		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
			System.out.println("**************************");
		}

	}

}
