package com.revature.util;


public class Driver {

	public static void main(String[] args) 
	{
		
		HibernateSessionFactory.getSession();
		System.out.println("Session retrieved");
	}

}
