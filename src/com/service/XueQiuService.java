package com.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.json.JSONArray;


public abstract class XueQiuService {
	protected static DefaultHttpClient httpClient;
	
	
	public XueQiuService(){
		
		createHttpClient();
		
	}


	abstract public void multiThread();
	abstract public JSONArray getDataArray();
	
	abstract public void execute();
	public abstract void update();
	
	abstract public String getTableName();
	abstract public String getSourceName();
	abstract public void setSourceName(String sourceName);

	private void createHttpClient() {
		if(httpClient != null){
			return ;
		}
		HttpParams params = new BasicHttpParams();
		/* �����ӳ���ȡ���ӵĳ�ʱʱ�� */
		ConnManagerParams.setTimeout(params, 1000);
		/* ���ӳ�ʱ */
		HttpConnectionParams.setConnectionTimeout(params, 2000);
		/* ����ʱ */
		HttpConnectionParams.setSoTimeout(params, 4000);
		SchemeRegistry schemeRegistry = new SchemeRegistry();
		schemeRegistry.register(new Scheme("http", 80, PlainSocketFactory
				.getSocketFactory()));

		PoolingClientConnectionManager cm = new PoolingClientConnectionManager(
				schemeRegistry);
		cm.setMaxTotal(20);
		httpClient = new DefaultHttpClient(cm, params);
	}
	

    public static String InputStream2String(HttpEntity entity,String charset) throws IOException{
		if (entity == null) {
			return null;
		}
		InputStream htmlConten = entity.getContent();
    	BufferedReader buff = new BufferedReader(
    			new InputStreamReader(htmlConten, charset));
        StringBuilder res = new StringBuilder();
        String line = "";
        while((line = buff.readLine()) != null){
            res.append(line);
        }
        return res.toString();
    }
    

	public static DefaultHttpClient getHttpClient() {
		return httpClient;
	}


}
