package com.comcast.crm.genericutility;

import java.io.FileInputStream;
import java.util.Properties;

public class properties {
	public String toReaddatafromPropertyFile(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream("./src\\test\\resources\\AdvanceConcept\\ninja1.properties.txt");
		Properties obj=new Properties();
		obj.load(fis);
		String value = obj.getProperty(key);
		return value;
	}
}
