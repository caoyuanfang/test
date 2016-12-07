package com.LS.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.LS.domain.Channel;
import com.LS.service.ChannelService;

public class Test2 {

	private static ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChannelService channelService=(ChannelService) ac.getBean("channelService");
		
		List<Channel> channelList = new ArrayList<Channel>();
		channelList = channelService.findByAll();
		
		//System.out.println(channelList.size());
		
		System.out.println(channelList.get(1).getName());
		System.out.println(channelList.get(2).getName());
	}

}
