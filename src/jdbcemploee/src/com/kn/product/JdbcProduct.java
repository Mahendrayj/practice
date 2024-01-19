package com.kn.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcProduct {
	private static final String URL="jdbc:mysql://localhost:3306/JDBC";
    private static final String USER_NAME="root";
    private static final String PASSWORD="Root@12";
    private static final String DRIVER_NAME="com.mysql.cj.jdbc.Driver";
    private static final String CREATE_PRODUCT="CREATE TABLE PRODUCT(ID INT,NAME VARCHAR(30),COST INT);";
    private static final String INSERT_PRODUCT="INSERT INTO PRODUCT VALUES(01,'ABC',2000),(02,'DBC',3000),(03,'ABD',500),(04,'ADC',700),(05,'FBC',200);";
    private static final String SELECT_PRODUCT="SELECT * FROM PRODUCT;";
     
    private static final String UPDATE_PRODUCT="UPDATE PRODUCT SET COST=1000 WHERE ID=05;";
    private static final String DELETE_RECORD="DELETE FROM PRODUCT WHERE ID=05;";

public static void main(String[] args) {
       Connection con=null;
      try {
		Class.forName(DRIVER_NAME);
		con=DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		System.out.println("************Connaction Established"+con);
	    Statement stmt=con.createStatement();
	  int count=0;
	  count=stmt.executeUpdate(DELETE_RECORD);
	  System.out.println(count+" record affected");
	  ResultSet rs=stmt.executeQuery(SELECT_PRODUCT);
	  while(rs.next()) {
		System.out.println("ID= "+rs.getInt(1)+", Name= "+rs.getString(2)+", SALARY= "+rs.getInt(3));
	  }
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
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
