package com.LS.service;

import java.util.List;

import com.LS.domain.Channel;

public interface ChannelService {

	public void add(Channel channel);

	public void delete(int id);

	public void update(Channel channel);

	public Channel findById(int id);
	
	public List<Channel> findByAll();
	
}
