package com.service.impl;

import com.dao.ReadRecodeDao;
import com.dao.impl.ReadRecodeDaoFileImpl;
import com.service.ReadService;

public class ReadRecodeServiceImpl implements ReadService {

	private ReadRecodeDao dao;
	
	
	public ReadRecodeServiceImpl() {

		dao = new ReadRecodeDaoFileImpl();
	}

	//��ȡ�ղؼ�¼
	//���ض�ȡ���ļ�¼�ַ��������Ҫ������display������ʾ����
	/* (non-Javadoc)
	 * @see com.service.ReadService#read()
	 */
	@Override
	public String read() {
		return dao.readData();
	}

	/* (non-Javadoc)
	 * @see com.service.ReadService#Search(java.lang.String)
	 */
	@Override
	public String Search(String Date) {
		return dao.Search(Date);
	}
}
