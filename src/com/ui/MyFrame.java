package com.ui;

import java.awt.BorderLayout; 
import java.awt.Color;
import java.awt.Container; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.Box; 
import javax.swing.BoxLayout; 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPanel;
import javax.swing.JTextField; 

public class MyFrame extends JFrame { 
	private JFrame frame;
	private JTextField[] MintextField = new JTextField[5];
	private JTextField[] MaxtextFied = new JTextField[5];
	private JLabel[] JMin = new JLabel[5];
	//private JLabel[] JMax = new JLabel[5];
	private JButton resetBtn,searchBtn;
	private JLabel lstocknum;
	String[][] stockData = new String[3000][9];
	int total;
	
public MyFrame() { 
	frame = new JFrame();
	frame.setBounds(100, 100, 880, 628);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
	 Container content = getContentPane(); 
	    Box vbox = new Box(BoxLayout.Y_AXIS); 
	    content.add(vbox, BorderLayout.CENTER); 
	     
	    JMin[0] = new JLabel("�ǵ�����"); 
	    JMin[0].setName("TextLabel1"); 
	    vbox.add(JMin[0]); 
	    
	    final JTextField input = new JTextField(); 
	    input.setName("input"); 
	    vbox.add(input); 
	    
	    JMin[1] = new JLabel("�ּ�"); 
	    JMin[1].setName("TextLabel2"); 
	    vbox.add(JMin[1]); 
	    
	    final JTextField input1 = new JTextField(); 
	    input1.setName("input1"); 
	    vbox.add(input1); 
	    
	    JMin[2] = new JLabel("��ӯ��"); 
	    JMin[2].setName("TextLabel3"); 
	    vbox.add(JMin[2]); 
	    
	    final JTextField input2 = new JTextField(); 
	    input1.setName("input2"); 
	    vbox.add(input2); 
	    
	    JMin[3] = new JLabel("Ԥ����ӯ��"); 
	    JMin[3].setName("TextLabel4"); 
	    vbox.add(JMin[3]); 
	    
	    final JTextField input3 = new JTextField(); 
	    input1.setName("input3"); 
	    vbox.add(input3); 
	    
	    JMin[4] = new JLabel("�о���"); 
	    JMin[4].setName("TextLabel5"); 
	    vbox.add(JMin[4]); 
	    
	    final JTextField input4 = new JTextField(); 
	    input1.setName("input4"); 
	    vbox.add(input4); 
	    
	    JButton button = new JButton("����");
	    button.setName("resetBtn"); 
	    button.addActionListener(new ActionListener() { 

	      @Override 
	      public void actionPerformed(ActionEvent e) { 
	        input.setText(""); 
	      } 
	        
	    }); 
	    vbox.add(button); 
	  } 
 } 
