package com.ui;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.table.*;

class ModifyTable extends JPanel 
{
	
  private String[] columnNames={"��Ʊ����","��Ʊ���","�ǵ���","�ּ�","��ӯ��","Ԥ����ӯ��","�о���"};
  Object[][] rowData=
	  {
	  };
  DefaultTableModel tableModel = new DefaultTableModel(rowData,columnNames){  
      @Override  
      public boolean isCellEditable(int row,int column){  
          return false;  
      }  
  }; 
  
  JTable jTable1 = new JTable(tableModel);
 
  public  ModifyTable(String[][] sresult,int total) 
  {
	  for(int i=0;i<total;i++)
	  {
		  String[] row={sresult[i][0],sresult[i][1],sresult[i][2],sresult[i][3],sresult[i][4],sresult[i][5],sresult[i][6]};
		//  System.out.println(row[0]+" "+row[1]+" "+row[2]+" "+row[3]+" "+row[4]+" "+row[5]);
		  tableModel.addRow(row);	
		//  System.out.println(tableModel.getRowCount());

	  }
	  //TableColumn OpColumn = jTable1.getColumn("����");  
	  //DefaultTableCellRenderer fontColor = new DefaultTableCellRenderer();
	  //fontColor.setForeground(Color.blue); 
	  //OpColumn.setCellRenderer(fontColor);
	  this.setLayout(new BorderLayout());
	  add(new JScrollPane(jTable1),
      BorderLayout.CENTER);
	  jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
  }
  
}