package com.ui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.table.*;

public class createTable extends JPanel {

	private String[] colName={"��Ʊ����", "��Ʊ���", "�ǵ���", "�ּ�","��ӯ��","Ԥ����ӯ��","�о���"};
	
	Object[][] row={};
	 DefaultTableModel tableM = new DefaultTableModel(row,colName){  
	      @Override  
	      public boolean isCellEditable(int row,int column){  
	          return false;  
	      }  
	  }; 
	JTable jtable= new JTable(tableM);
	
	public createTable(int total,String[][] stockData)
	{
		for(int i=0;i<total;i++)
		{
			String[] newRow={stockData[i][0],stockData[i][1],stockData[i][2],stockData[i][3],stockData[i][4],stockData[i][5],stockData[i][6]};
			tableM.addRow(newRow);
		}
		this.setLayout(new BorderLayout());
		add(new JScrollPane(jtable),
	    BorderLayout.CENTER);
		jtable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
	}
}
