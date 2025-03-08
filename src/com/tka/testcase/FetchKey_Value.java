package com.tka.testcase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class FetchKey_Value {


	public static void main(String[] args) throws IOException {
		FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"/config.properties");
		Properties p=new Properties();
		p.load(fs);
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
	}


	}


