package com.LS.action;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.LS.domain.Atlas;
import com.LS.domain.Channel;
import com.LS.domain.Picture;
import com.LS.service.AtlasService;
import com.LS.service.ChannelService;
import com.LS.service.PictureService;
import com.LS.tools.DateToName;
import com.LS.tools.StorageTools;

@Controller
public class ManageAtAction {

	private Atlas atlas = new Atlas();
	private Channel channel = new Channel();
	private List<Channel> channelList = new ArrayList<Channel>();
	private File[] pictures;
	private String[] picturesFileName;
	private String[] expain;
	private String[] picturesContentType;

	@Resource
	private AtlasService atlasService;
	@Resource
	private PictureService pictureService;
	@Resource
	private ChannelService channelService;
	@Resource
	private StorageTools storageTools;

	public String add() {
		atlasService.add(atlas, channel);
		if (pictures != null) {
			for (int i = 0; i < pictures.length; i++) {
				String storageName = DateToName.getName()+picturesFileName[i];
				Picture picture = new Picture();
				picture.setAtlases(new HashSet<Atlas>());
				picture.getAtlases().add(atlas);
				picture.setName(picturesFileName[i]);
				picture.setExpain(expain[i]);
				picture.setStorageName(storageName);
				pictureService.add(picture);
				storageTools.storagep(pictures[i], storageName);
			}
		}
		return "chenggong";
	}

	public String addinput() {
		channelList = channelService.findByAll();
		return "addinput";
	}
	
	
	
	//-------------------------------get set

	public Atlas getAtlas() {
		return atlas;
	}

	public void setAtlas(Atlas atlas) {
		this.atlas = atlas;
	}
	

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public List<Channel> getChannelList() {
		return channelList;
	}

	public void setChannelList(List<Channel> channelList) {
		this.channelList = channelList;
	}

	public File[] getPictures() {
		return pictures;
	}

	public void setPictures(File[] pictures) {
		this.pictures = pictures;
	}

	public String[] getPicturesFileName() {
		return picturesFileName;
	}

	public void setPicturesFileName(String[] picturesFileName) {
		this.picturesFileName = picturesFileName;
	}
	

	public String[] getExpain() {
		return expain;
	}

	public void setExpain(String[] expain) {
		this.expain = expain;
	}

	public String[] getPicturesContentType() {
		return picturesContentType;
	}

	public void setPicturesContentType(String[] picturesContentType) {
		this.picturesContentType = picturesContentType;
	}

	// -----------------------------service get set
	public AtlasService getAtlasService() {
		return atlasService;
	}

	public void setAtlasService(AtlasService atlasService) {
		this.atlasService = atlasService;
	}

	public PictureService getPictureService() {
		return pictureService;
	}

	public void setPictureService(PictureService pictureService) {
		this.pictureService = pictureService;
	}

	public ChannelService getChannelService() {
		return channelService;
	}

	public void setChannelService(ChannelService channelService) {
		this.channelService = channelService;
	}

	public StorageTools getStorageTools() {
		return storageTools;
	}

	public void setStorageTools(StorageTools storageTools) {
		this.storageTools = storageTools;
	}

}
