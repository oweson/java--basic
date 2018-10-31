package com.utils.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public  final static SimpleDateFormat PAPTime  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private final static SimpleDateFormat PAPDate = new SimpleDateFormat("yyyy-MM-dd");
	/**
	 * ��ʽ������
	 * ���ܣ�<br/>
	 * @author ������
	 * @version Mar 20, 2013 6:03:36 PM <br/>
	 */
	public static String date(Date d){
		return PAPTime.format(d);
	} 
}
