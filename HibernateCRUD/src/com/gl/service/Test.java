package com.gl.service;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main (String[]args) {
		System.out.println("Connecting to database");
		Configuration factory = new Configuration()
				.configure("hebernate.cfg.xml");
		System.out.println("created");
	
	}
}
