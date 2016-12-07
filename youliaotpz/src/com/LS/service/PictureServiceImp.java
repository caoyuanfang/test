package com.LS.service;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.LS.dao.PictureDao;
import com.LS.domain.Picture;

@Service("pictureService")
public class PictureServiceImp implements PictureService {
	
	@Resource
	private PictureDao pictureDao;

	@Override
	public void add(Picture picture) {
		pictureDao.add(picture);
	}

	@Override
	public void delete(int id) {
		pictureDao.delete(pictureDao.findById(Picture.class, id));
	}

	@Override
	public void update(Picture picture) {
		pictureDao.update(picture);
	}

	@Override
	public Picture findById(int id) {
		return pictureDao.findById(Picture.class, id);
	}

	public PictureDao getPictureDao() {
		return pictureDao;
	}

	public void setPictureDao(PictureDao pictureDao) {
		this.pictureDao = pictureDao;
	}

}
