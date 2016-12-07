package com.LS.tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//import org.springframework.stereotype.Component;
//
//@Component("storageTools")
public class Storagelocal implements StorageTools {

	@Override
	public void storagep(File file,String storageName) {
		// try {
		// FileUtils.copyFile(file, new File("F:/upload/" + fileName));
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		FileOutputStream fos = null;
		FileInputStream fis = null;
		try {
			fos = new FileOutputStream("F:/upload/" + storageName);
			fis = new FileInputStream(file);
			byte[] buffer = new byte[1024];
			int len = 0;
			while ((len = fis.read(buffer)) > 0) {
				fos.write(buffer, 0, len);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
