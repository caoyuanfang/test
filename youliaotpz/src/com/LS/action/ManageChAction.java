package com.LS.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.LS.domain.Channel;
import com.LS.service.ChannelService;

@Controller
public class ManageChAction {

	private Channel channel = new Channel();

	@Resource
	private ChannelService channelService;

	public String add() {
		System.out.println(channel.getName());
		channelService.add(channel);
		return "chenggong";
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public ChannelService getChannelService() {
		return channelService;
	}

	public void setChannelService(ChannelService channelService) {
		this.channelService = channelService;
	}

}
