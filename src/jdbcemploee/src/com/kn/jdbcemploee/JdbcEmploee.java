package com.kn.jdbcemploee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEmploee {


       private static final String URL="jdbc:mysql://localhost:3306/JDBC";
       private static final String USER_NAME="root";
       private static final String PASSWORD="Root@12";
       private static final String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
       private static final String CREATE_EMPLOYEE="CREATE TABLE EMPLOYEE(ID INT,NAME VARCHAR(30),SALARY INT);";
       private static final String INSERT_EMPLOYEE="INSERT INTO EMPLOYEE VALUES(01,'ABC',1000),(02,'DBC',1001),(03,'CBC',1002),(04,'BBC',1003),(05,'ABCD',1005);";
       private static final String UPDATE_EMPLOYEE="UPDATE EMPLOYEE SET SALARY=1004 WHERE ID=05;";
       private static final String DELETE_ROW="DELETE FROM EMPLOYEE WHERE ID=05;";
       private static final String SELECT_EMPLOYEE="SELECT * FROM EMPLOYEE;";
        
   	public static void main(String[] args) {
   	//01. load and register
   		Connection con=null;
   		try {
   		//02.Establis the Connection
			Class.forName(DRIVER_NAME);
			con=DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("********Conneaction Establised"+con);
		//03.create the statment object
			Statement stmt=con.createStatement();
	    //04.Send and Excute the Query
			//boolean flag=stmt.execute(DRIVER_NAME);
		    //int count=0;
		    //count=stmt.executeUpdate(DELETE_ROW);
		    //System.out.println(count+" record affected");
		  ResultSet rs=stmt.executeQuery(SELECT_EMPLOYEE);
		 //05.process the resultentset to get data
		  while(rs.next()) {
			  System.out.println("ID= "+rs.getInt(1)+", Name= "+rs.getString(2)+", SALARY= "+rs.getInt(3));
		  }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		//06.close the connection
		}finally {
			try {
				if(con!=null) {
				con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
