package com.LS.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.LS.domain.Channel;

@Repository("channelDao")
public class ChannelDaoImp extends BaseDaoImp<Channel> implements ChannelDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Channel> findByAll() {
		List<Channel> list = new ArrayList<Channel>();
		String hql = "from Channel";
		Query q = super.getSession().createQuery(hql);
		list = q.list();
		return list;
	}

	
}
