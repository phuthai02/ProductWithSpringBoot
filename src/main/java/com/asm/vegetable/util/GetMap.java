package com.asm.vegetable.util;

import java.util.HashMap;

public class GetMap {
	public static HashMap<String, Object> getData(String status,Object value){
		HashMap<String, Object> map=new HashMap<>();
		map.put("statusCode", status);
		map.put("data", value);
		return map;
	}
}