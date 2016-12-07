package com.LS.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.LS.dao.AtlasDao;
import com.LS.domain.Atlas;
import com.LS.domain.Channel;
import com.LS.service.AtlasService;

@Service("atlasService")
public class AtlasServiceImp implements AtlasService {

	@Resource
	private AtlasDao atlasDao;

	@Override
	public void add(Atlas atlas, Channel channel) {
		atlas.setChannel(channel);
		atlasDao.add(atlas);
	}

	@Override
	public void delete(int id) {
		atlasDao.delete(atlasDao.findById(Atlas.class, id));
	}

	@Override
	public void update(Atlas atlas) {
		atlasDao.update(atlas);
	}

	@Override
	public Atlas findById(int id) {
		return atlasDao.findById(Atlas.class, id);
	}

	@Override
	public List<Atlas> findListByAll() {
		String hql = "from Atlas";
		return atlasDao.executeQuery(hql, null);
	}

	@Override
	public List<Atlas> findListById(int id) {
		String hql = "from Atlas where channel.id=?";
		return atlasDao.executeQuery(hql, new String[] { id + "" });
	}

	@Override
	public List<Atlas> findListByAll(int pageNow) {
		int pageSize = 7;
		String hql = "from Atlas";
		return atlasDao.executeQueryByPage(hql, null, pageSize, pageNow);
	}

	@Override
	public List<Atlas> findListById(int id, int pageNow) {
		int pageSize = 7;
		String hql = "from Atlas where channel.id=?";
		return atlasDao.executeQueryByPage(hql, new String[] { id + "" }, pageSize, pageNow);
	}

	public AtlasDao getAtlasDao() {
		return atlasDao;
	}

	public void setAtlasDao(AtlasDao atlasDao) {
		this.atlasDao = atlasDao;
	}

}
