package com.service.impl;

import com.dao.impl.StoreRecordDaoFileImpl;
import com.service.StoreService;

//����ģʽ
public class StoreRecodeServiceImpl implements StoreService {

	private StoreRecordDaoFileImpl dao;

	public StoreRecodeServiceImpl(String a1,String a2,String b1,String b2,
			String c1,String c2,String d1,String d2,String e1,String e2 ) {
		this.dao = new StoreRecordDaoFileImpl(a1, a2, b1, b2, c1, c2, d1, d2, e1, e2);
	} 
	
	//��Ҫ������10�����������ַ���
	public	String getData() {
		return this.dao.getData();
	}
	
	//���ַ������浽txt�ļ���
	public void printWriter(String st) {
		this.dao.printWriter(st);
	}
	
	//�ղؼ�¼(û�в����ͷ���ֵ��ֱ�ӵ��þͿ����ղؼ�¼��
	/* (non-Javadoc)
	 * @see com.service.StoreService#store()
	 */
	@Override
	public void store() {
		this.dao.store();
	}
	 //����ղؼ�¼���������ղؼ�¼��գ����ղؼ�¼�ļ����ڣ�
	 /* (non-Javadoc)
	 * @see com.service.StoreService#clear()
	 */
	@Override
	public void clear() {
		 this.dao.clear();
	 }
}
