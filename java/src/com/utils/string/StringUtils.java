package com.utils.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

	/**
	 * �ַ����ǲ�������
	 */
	public static boolean isNum(String weight){
		boolean fg=true;
		try{
			Float.parseFloat(weight);
		}catch(Exception e){
			fg=false;
		}
		return fg;
	}
	
	/**
     * ip��ַ�Ƿ�Ϸ�
     */
    public static boolean isIP( String str){
    	Pattern pattern = Pattern.compile("\\b((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\b");
    	Matcher matcher = pattern.matcher(str); 
    	return matcher.matches();
    }
    
    /**
     * �Ƿ���ַ���
     * @param str
     * @return str -- null||"" : true
     */
    public static boolean isNullOrEmpty(String str) {
    	boolean returnStr = true;
    	if(str != null && !"".equals(str)) {
    		returnStr = false;
    	}
    	return returnStr;
    }
    
    /**
	 * ȥ��html��ǩ
	 * @param htmlStr
	 * @return
	 */
	public static String getTextFromHtml(String htmlStr) {
		if(!isNullOrEmpty(htmlStr)) {
			return "";
		}
		String regEx_script = "<script[^>]*?>[\\s\\S]*?<\\/script>"; // ����script��������ʽ  
	    String regEx_style = "<style[^>]*?>[\\s\\S]*?<\\/style>"; // ����style��������ʽ  
		String regEx_html = "<[^>]+>"; // ����HTML��ǩ��������ʽ  
	    String regEx_space = "\\s*|\t|\r|\n";//����ո�س����з� 
	    Pattern p_script = Pattern.compile(regEx_script, Pattern.CASE_INSENSITIVE);  
        Matcher m_script = p_script.matcher(htmlStr);  
        htmlStr = m_script.replaceAll(""); // ����script��ǩ  
  
        Pattern p_style = Pattern.compile(regEx_style, Pattern.CASE_INSENSITIVE);  
        Matcher m_style = p_style.matcher(htmlStr);  
        htmlStr = m_style.replaceAll(""); // ����style��ǩ  
        
	    Pattern p_html = Pattern.compile(regEx_html, Pattern.CASE_INSENSITIVE);  
        Matcher m_html = p_html.matcher(htmlStr);  
        htmlStr = m_html.replaceAll(""); // ����html��ǩ  
        
        Pattern p_space = Pattern.compile(regEx_space, Pattern.CASE_INSENSITIVE);  
        Matcher m_space = p_space.matcher(htmlStr);  
        htmlStr = m_space.replaceAll(""); // ���˿ո�س���ǩ  
        return htmlStr.trim(); // �����ı��ַ���  
	}
    
    
}
