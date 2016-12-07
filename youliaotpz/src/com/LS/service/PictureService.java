package com.LS.service;

import com.LS.domain.Picture;

public interface PictureService {

	public void add(Picture picture);

	public void delete(int id);

	public void update(Picture picture);

	public Picture findById(int id);

}
