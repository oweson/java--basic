package basic.utils.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public  final static SimpleDateFormat PAPTime  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private final static SimpleDateFormat PAPDate = new SimpleDateFormat("yyyy-MM-dd");

	public static String date(Date d){
		return PAPTime.format(d);
	} 
}
