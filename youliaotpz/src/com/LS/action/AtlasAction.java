package com.LS.action;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import com.LS.domain.Atlas;
import com.LS.domain.Channel;
import com.LS.domain.Picture;
import com.LS.service.AtlasService;
import com.LS.service.ChannelService;
import com.LS.tools.StorageJae;

public class AtlasAction {

	private int id;
	private Atlas atlas;
	private String[] uri;
	private List<Channel> ChannelList;

	@Resource
	private AtlasService atlasService;
	@Resource
	private ChannelService channelService;

	public String get() {
		ChannelList = channelService.findByAll();
		atlas = atlasService.findById(id);
		Iterator<Picture> it = atlas.getPictures().iterator();
		uri = new String[atlas.getPictures().size()];
		int i = 0;
		while (it.hasNext()) {
			Picture picture = it.next();
			uri[i] = StorageJae.getUri(picture.getStorageName());
			i++;
		}
		return "chenggong";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Atlas getAtlas() {
		return atlas;
	}

	public void setAtlas(Atlas atlas) {
		this.atlas = atlas;
	}

	public String[] getUri() {
		return uri;
	}

	public void setUri(String[] uri) {
		this.uri = uri;
	}

	public List<Channel> getChannelList() {
		return ChannelList;
	}

	public void setChannelList(List<Channel> channelList) {
		ChannelList = channelList;
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
