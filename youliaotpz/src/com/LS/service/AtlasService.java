package com.LS.service;

import java.util.List;

import com.LS.domain.Atlas;
import com.LS.domain.Channel;

public interface AtlasService {

	public void add(Atlas atlas, Channel channel);

	public void delete(int id);

	public void update(Atlas atlas);

	public Atlas findById(int id);

	public List<Atlas> findListByAll();

	public List<Atlas> findListById(int id);

	public List<Atlas> findListByAll(int pageNow);

	public List<Atlas> findListById(int id, int pageNows);
}
