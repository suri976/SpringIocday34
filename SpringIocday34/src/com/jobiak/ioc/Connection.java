package com.jobiak.ioc;
import java.net.*;
public class Connection {

	public Connection getConnection()
	{
		System.out.println("providing the connection....");
		return new Connection();
		
	}
	
	
}
