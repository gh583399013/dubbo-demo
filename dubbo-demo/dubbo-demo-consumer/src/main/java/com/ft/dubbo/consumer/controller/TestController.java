package com.ft.dubbo.consumer.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ft.dubbo.provider.service.SimpleRemoteService;

@Controller
@RequestMapping("/test")
public class TestController {
	@Autowired
	private SimpleRemoteService simpleRemoteService;
	
//	@RequestMapping("/getServerResp")
//	@ResponseBody
//	public String getServerResp(HttpServletRequest request, HttpServletResponse response){
//		System.out.println("执行到客户端这里");
//		String resultJson = simpleRemoteService.getSimpleStr(UUID.randomUUID().toString());
//		System.out.println("服务器返回" + resultJson);
//		resultJson = resultJson + "(来自服务器)";
//		return resultJson;
//	}
	
	@ResponseBody
	@RequestMapping("/getServerResp")
	public Object getServerResp(HttpServletRequest request, HttpServletResponse response){
		System.out.println("执行到客户端这里");
		String resultJson = simpleRemoteService.getSimpleStr(UUID.randomUUID().toString());
		System.out.println("服务器返回" + resultJson);
		resultJson = resultJson + "(来自服务器)";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("resultJson", resultJson);
		return map;
	}
}
