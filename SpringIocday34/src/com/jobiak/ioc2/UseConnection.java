package com.jobiak.ioc2;
import com.jobiak.ioc.*; 
public class UseConnection {
	public UseConnection()
	{
		Connection con = new Connection();
		con.getConnection();
		System.out.println("Connection obtained");
		
	}

}
