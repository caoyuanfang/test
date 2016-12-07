package com.LS.test;

import com.LS.tools.StorageJae;
import com.jcloud.jss.http.Method;


public class TestJss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StorageJae.getJss().bucket("youliao").object("2014-09-07_03-49-42_4200.jpg").generatePresignedUrl(3600, Method.GET));
	}
}
