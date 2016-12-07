package com.LS.tools;

import java.io.File;
import com.jcloud.jss.JingdongStorageService;
import com.jcloud.jss.http.Method;



import org.springframework.stereotype.Component;

@Component("storageTools")
public class StorageJae implements StorageTools {
	static String accessKey = "f9520fe90cae416ca177067daf7ed735";
	static String sercretKey = "63b2dcebb4824e32a2f6232ac7720cbebrgDUPVr";
	static JingdongStorageService jss;

	static {
		if (jss == null) {
			jss = new JingdongStorageService(accessKey, sercretKey);
		}
	}

	public static JingdongStorageService getJss() {
		return jss;
	}

	public static String getUri(String storageName) {
		return jss.bucket("youliao").object(storageName)
				.generatePresignedUrl(3600, Method.GET).toString();
	}

	@Override
	public void storagep(File file, String storageName) {
		jss.bucket("youliao").object(storageName).entity(file).put();
	}

}
