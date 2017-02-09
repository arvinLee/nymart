package com.asait.nymart.web.util;

public class ConnectionUtil {
	public static Connection getConnection(){
		System.out.println("create connection!!!");
		return new Connection();
	}
}

class Connection{
}
