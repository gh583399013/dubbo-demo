package com.ft.dubbo.consumer.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ft.dubbo.provider.service.SimpleRemoteService;

public class TestMain {
	public void sayHello() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		System.out.println("###1");
		context.start();
		System.out.println("###2");
		SimpleRemoteService providerSimpleRemoteService = (SimpleRemoteService) context.getBean("simpleRemoteServiceImpl");
		System.out.println("###3");
		System.out.println("###" + providerSimpleRemoteService.getSimpleStr("asd"));
	}
	public static void main(String[] args) {
		System.out.println("111");
		TestMain main = new TestMain();
		main.sayHello();
		System.out.println("222");
	}
}
