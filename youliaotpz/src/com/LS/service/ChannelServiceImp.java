package com.LS.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.LS.dao.ChannelDao;
import com.LS.domain.Channel;

@Service("channelService")
public class ChannelServiceImp implements ChannelService {
	
	@Resource
	private ChannelDao channelDao;
	

	@Override
	public void add(Channel channel) {
		channelDao.add(channel);
	}

	@Override
	public void delete(int id) {
		channelDao.delete(channelDao.findById(Channel.class, id));
	}

	@Override
	public void update(Channel channel) {
		channelDao.update(channel);
	}

	@Override
	public Channel findById(int id) {
		return channelDao.findById(Channel.class, id);
	}
	
	@Override
	public List<Channel> findByAll() {
		return channelDao.findByAll();
	}

	public ChannelDao getChannelDao() {
		return channelDao;
	}
	public void setChannelDao(ChannelDao channelDao) {
		this.channelDao = channelDao;
	}
}
