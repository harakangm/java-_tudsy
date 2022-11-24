package test.ch11.System;

import java.util.Properties;
import java.util.Set;

public class GetProperty메소드 {

	public static void main(String[] args) {
		
		//getProperty(특별한키값)
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
//===================================================
		Properties props = System.getProperties();
		Set keys = props.keySet();
		
		for(Object objeky : keys) {
			String key = (String)objeky;
			System.out.println(key);
			System.out.println(System.getProperty(key));
		}

	}

}
