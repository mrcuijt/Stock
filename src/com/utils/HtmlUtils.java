package com.utils;




public class HtmlUtils {
	/** 
     * �����ҳ�Ƿ��������
     */  
    public static boolean getHtml(String path) {  
    	if(path.isEmpty()) {
    		return false;
    	}
    	String content = SpiderUtils.spider(path);
    	System.out.println(content);
        if(content == null) {
        	return false;
        } else {
        	return true;
        }
    }
}
