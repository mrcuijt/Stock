package com.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import com.dao.StoreRecodeDao;
import com.model.Record;
import com.utils.TimeUtils;


public class StoreRecordDaoFileImpl implements StoreRecodeDao {
	
	private Record data = Record.getRecode();
	public static final String filePath = "D:\\�ĵ�\\StoreData.txt";

			
	//���캯��
	public StoreRecordDaoFileImpl(String a1,String a2,String b1,String b2,
	String c1,String c2,String d1,String d2,String e1,String e2 )
	{
		if(a1!="")
		    {data.setaMIN(a1);}
		else{data.setaMIN("-��");}
		
		if(a2!="")
	    {data.setaMAX(a2);}
	    else{data.setaMAX("+��");}
		
		if(b1!="")
            {data.setbMIN(b1);}
		else{data.setbMIN("-��");}
		
		
		if(b2!="")
		{data.setbMAX(b2);}
		else{data.setbMAX("+��");}
		
		if(c1!="")
		{data.setcMIN(c1);}
		else{data.setcMIN("-��");}
		
		if(c2!="")
		{data.setcMAX(c2);}
		else{data.setcMAX("+��");}
		
		if(d1!="")
		{data.setdMIN(d1);}
		else{data.setdMIN("-��");}
		
		if(d2!="")
		{data.setdMAX(d2);}
		else{data.setdMAX("+��");}
		
		if(e1!="")
		{data.seteMIN(e1);}
		else{data.seteMIN("-��");}
		
		if(e2!="")
		{data.seteMAX(e2);}
		else{data.seteMAX("+��");}
	}
	
	
	
	//��Ҫ������10�����������ַ���
	public	String getData()  
	{
		String StrData=" �ǵ�����:"+data.getaMIN()+"~"+data.getaMAX()+"  �ּۣ�"+data.getbMIN()+"~"+
	                data.getbMAX()+"  ��ӯ�ʣ�"+data.getcMIN()+"~"+data.getcMAX()+"  Ԥ����ӯ��:"+data.getdMIN()+"~"+data.getdMAX()
	                +"  �о���:"+data.geteMIN()+"~"+data.geteMAX()+"\n";
		return StrData;
	}
	
	//���ַ������浽txt�ļ���
	public void printWriter(String st)
	{
		
		try
		{
		FileWriter objectName = 
		new FileWriter(new File(filePath), true);//�����ļ�
		PrintWriter pw = new PrintWriter(objectName);	
		pw.println(st);    //�������
		pw.close();
		}catch(IOException e){
		e.printStackTrace();
		}
	}
	
	//�ղؼ�¼(û�в����ͷ���ֵ��ֱ�ӵ��þͿ����ղؼ�¼��
	/* (non-Javadoc)
	 * @see com.dao.StoreRecodeDao#store()
	 */
	@Override
	public void store()
	{
		StoreRecordDaoFileImpl storeapp=new StoreRecordDaoFileImpl(data.getaMIN(), data.getaMAX(),
				data.getbMIN(), data.getbMAX(), data.getcMIN(), data.getcMAX(),data.getdMIN(), data.getdMAX(),data.geteMIN(), data.geteMAX());
		String st=TimeUtils.getCurrentTime()+storeapp.getData();		
		//����PrintWriter���������ַ������浽txt�ļ���
		storeapp.printWriter(st);
		
	}
	 
	 //����ղؼ�¼���������ղؼ�¼��գ����ղؼ�¼�ļ����ڣ�
	 /* (non-Javadoc)
	 * @see com.dao.StoreRecodeDao#clear()
	 */
	@Override
	public void clear()
	 {
		 try
			{
			FileWriter objectName = 
			new FileWriter(new File(filePath), false);//�����ļ�
			PrintWriter pw = new PrintWriter(objectName);	
			pw.println("");    //�������
			pw.close();
			}catch(IOException e){
			e.printStackTrace();
			}
	 }
	
}
