package com.LS.tools;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateToName {

	public static String getName(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss_");//时间转化为字符
		return df.format(new Date());
	} 
}
