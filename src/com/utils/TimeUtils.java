package com.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {

	// //��ȡ��ǰϵͳʱ�䣬�������ֲ�ͬ���ղؼ�¼
		public	static String getCurrentTime()      
		{
			Date now = new Date(); 
			SimpleDateFormat dateFormat = 
			new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//���Է�����޸����ڸ�ʽ 


			String nowtime = dateFormat.format( now ); 
			 
			return nowtime;
		}

}
