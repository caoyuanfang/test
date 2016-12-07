package com.LS.dao;

import java.util.List;

import com.LS.domain.Channel;

public interface ChannelDao extends BaseDao<Channel> {

	public List<Channel> findByAll();
}
