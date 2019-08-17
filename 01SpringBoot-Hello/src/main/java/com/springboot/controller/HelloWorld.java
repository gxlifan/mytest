package com.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloWorld {
	
	@RequestMapping("/hello")
	@ResponseBody
	public Map<String,Object> sayHello(){
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("msg","hello");
		return map;
		
	}
	
}
