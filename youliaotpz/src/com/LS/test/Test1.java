package com.LS.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.LS.domain.Channel;
import com.LS.service.ChannelService;

public class Test1 {

	private static ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChannelService channelService=(ChannelService) ac.getBean("channelService");
		
		Channel channel=new Channel();
		
		channel.setName("曹远方");
		channel.setContent("ppp");
		channelService.add(channel);
		
	}

}
