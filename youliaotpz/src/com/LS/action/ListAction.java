package com.LS.action;

import java.util.List;

import javax.annotation.Resource;

import com.LS.domain.Atlas;
import com.LS.domain.Channel;
import com.LS.service.AtlasService;
import com.LS.service.ChannelService;
import com.LS.tools.StorageJae;

public class ListAction {

	public int id;
	public List<Atlas> atlasList;
	private List<Channel> ChannelList;
	private String[] uri;

	@Resource
	private AtlasService atlasService;
	@Resource
	private ChannelService channelService;

	public String getAllList() {
		ChannelList = channelService.findByAll();
		atlasList = atlasService.findListByAll(1);
		uri = new String[atlasList.size()];
		for (int i = 0; i < atlasList.size(); i++) {
			uri[i] = StorageJae.getUri(atlasList.get(i).getPictures()
					.iterator().next().getStorageName());
		}
		return "chenggong";
	}

	public String getListById() {
		ChannelList = channelService.findByAll();
		atlasList = atlasService.findListById(id, 1);
		uri = new String[atlasList.size()];
		for (int i = 0; i < atlasList.size(); i++) {
			uri[i] = StorageJae.getUri(atlasList.get(i).getPictures()
					.iterator().next().getStorageName());
		}
		return "chenggong";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Atlas> getAtlasList() {
		return atlasList;
	}

	public void setAtlasList(List<Atlas> atlasList) {
		this.atlasList = atlasList;
	}

	public List<Channel> getChannelList() {
		return ChannelList;
	}

	public void setChannelList(List<Channel> channelList) {
		ChannelList = channelList;
	}

	public String[] getUri() {
		return uri;
	}

	public void setUri(String[] uri) {
		this.uri = uri;
	}

	// -----------------service-----------------------------------
	public AtlasService getAtlasService() {
		return atlasService;
	}

	public void setAtlasService(AtlasService atlasService) {
		this.atlasService = atlasService;
	}

	public ChannelService getChannelService() {
		return channelService;
	}

	public void setChannelService(ChannelService channelService) {
		this.channelService = channelService;
	}

}
