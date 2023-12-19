package com.acc.lkm.first.giveMaven;

import java.util.Map;
import java.util.TreeMap;

public class TreeDemo {
	public static void main(String[] args){
		TreeMap<String, String> MyMap = new TreeMap< String,String>();
		
		MyMap.put("Java", "Wheather preditction");
		MyMap.put("Python", "Voter Validation");
		MyMap.put("C", "PinBall Game");
	for(Map.Entry m1:MyMap.entrySet())
	{
		System.out.println("Technology :"+m1.getKey()+"  Project :"+m1.getValue());
	}

	}
	{
		
	}

}
