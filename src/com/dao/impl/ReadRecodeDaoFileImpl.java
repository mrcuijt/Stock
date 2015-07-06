package com.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.dao.ReadRecodeDao;
import com.model.Record;

public class ReadRecodeDaoFileImpl implements ReadRecodeDao {
	public Record data = Record.getRecode();

	 //��ȡ�ղؼ�¼
	//���ض�ȡ���ļ�¼�ַ��������Ҫ������display������ʾ����
	 /* (non-Javadoc)
	 * @see com.dao.ReadRecodeDao#readData()
	 */
	@Override
	public String readData() {
		 
	       String str=new String();
	        try {
	            FileReader read = 
	            new FileReader(StoreRecordDaoFileImpl.filePath);//��ȡ�ļ�λ��
	              BufferedReader br = new BufferedReader(read);
	            String row=new String();
	            
	            while ((row = br.readLine()) != null) 
	            {
	                 //�ղؼ�¼�����������ʱ�����򣬺����ǰ�棩
	                 str=row+"\n"+str;
	            
	             }
	            
	           
	         } catch (FileNotFoundException e) {
	             e.printStackTrace();
	        } catch (IOException e) {
	              e.printStackTrace();
	          }
	        return str;
	 } 
	 
	 //����ĳһ����ղؼ�¼���������ڵĸ�ʽΪ��xxxx/yy/zz��
	 //���ط������ڵļ�¼�ַ��������Ҫ������display������ʾ����
	 /* (non-Javadoc)
	 * @see com.dao.ReadRecodeDao#Search(java.lang.String)
	 */
	@Override
	public String Search(String Date)
	 {
		 
		 String str=new String();
		 try {
	            FileReader read = 
	            new FileReader(StoreRecordDaoFileImpl.filePath);//��ȡ�ļ�λ��
	              BufferedReader br = new BufferedReader(read);
	            String row=new String();
	           
	            while ((row = br.readLine()) != null) 
	            {	
	            	if(row.length()>=10&&Date.equals(row.substring(0,10)))
	            	{
	            		str = str+row+"\n";
	            	} 
	         
	             }
	                        
	         } catch (FileNotFoundException e) {
	             e.printStackTrace();
	        } catch (IOException e) {
	              e.printStackTrace();
	          }
		 return str;

	 }
}