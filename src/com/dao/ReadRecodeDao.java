package com.dao;

public interface ReadRecodeDao {

	//��ȡ�ղؼ�¼
	//���ض�ȡ���ļ�¼�ַ��������Ҫ������display������ʾ����
	public abstract String readData();

	//����ĳһ����ղؼ�¼���������ڵĸ�ʽΪ��xxxx/yy/zz��
	//���ط������ڵļ�¼�ַ��������Ҫ������display������ʾ����
	public abstract String Search(String Date);

}