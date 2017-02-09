package com.ft.dubbo.provider.service.impl;

import org.springframework.stereotype.Service;

import com.ft.dubbo.provider.service.SimpleRemoteService;
@Service
public class SimpleRemoteServiceImpl implements SimpleRemoteService {

	public String getSimpleStr(String uuid) {
		return "这是来自服务的字符串" + uuid;
	}

}
