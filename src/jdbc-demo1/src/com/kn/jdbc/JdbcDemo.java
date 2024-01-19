package com.kn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
         String url="jdbc:mysql://localhost:3306/JDBC";
         String username="root";
         String password="Root@12";
         String InsertUser="INSERT INTO USER VALUES(1,'Mahendra212@')";
         String InsertUser2="INSERT INTO USER VALUES(2,'Rama212@')";
         String InsertUser3="INSERT INTO USER VALUES(3,'Krishna@12')";
         String InsertUser4="INSERT INTO USER VALUES(1,'ABCD212@')";



         Connection con=null;
         try {
        	 //1.Load and register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Register Succesfully");
			//Establish the conneaction using DriverManger
			con=DriverManager.getConnection(url, username, password);
			System.out.println("Conneaction Establised= "+con);
			//3.create Statement Object
			Statement stmt=con.createStatement();
			//4.Send and Excute Qurey
			int Count=stmt.executeUpdate(InsertUser);
			System.out.println(Count+"*******Record Inserted");

			int Count2=stmt.executeUpdate(InsertUser2);
			System.out.println(Count2+"*******Record Inserted");

			int Count3=stmt.executeUpdate(InsertUser3);
			System.out.println(Count3+"*******Record Inserted");

			int Count4=stmt.executeUpdate(InsertUser4);
			System.out.println(Count4+"*******Record Inserted");

			System.out.println("*****User table Created");
		  } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         finally {
        	 try {
				con.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         }
	}

}
