package basic.pond.usualapi.demo02.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest01 {
	/**
	 * 1 日期格式yyyy-MM-dd
	 */
	public static final String pattern_date = "yyyy-MM-dd";

	/**
	 * 2 日期时间格式yyyy-MM-dd HH:mm:ss
	 */
	public static final String pattern_time = "yyyy-MM-dd HH:mm:ss";

	/**
	 * 1 描述：日期格式化
	 * 
	 * @param date
	 *            日期
	 * @return 输出格式为 yyyy-MM-dd 的字串
	 */
	public static String formatDate(Date date) {
		return formatDate(date, pattern_time);
	}

	/**
	 * 2 描述：日期格式化
	 * 
	 * @param date
	 *            日期
	 * @param pattern
	 *            格式化类型
	 * @return
	 */
	public static String formatDate(Date date, String pattern) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		return dateFormat.format(date);
	}

	public static void main(String[] args) {
		String formatDate = formatDate(new Date());
		String formatDate2 = formatDate(new Date(), pattern_date);
		System.err.println(formatDate2);
		System.out.println(formatDate);

	}

}
