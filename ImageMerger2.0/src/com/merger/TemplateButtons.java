package com.merger;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;

import net.miginfocom.swing.MigLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Font;

public class TemplateButtons extends JPanel {

	/**
	 * Create the panel.
	 * 
	 * 
	 */
	
	private BufferedImage master=null;
	private FactoryTemplate factorytamplate=new FactoryTemplate();
	
	public TemplateButtons() {		
		
		setBorder(null);
		setBackground(UIManager.getColor("Button.background"));
		setBounds(735, 0, 209, 621);
		setLayout(new MigLayout("", "0[]0", "0[]0"));
		///////////////////////////////////////////////	
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		add(scrollPane, "cell 0 0,growx,growy");
		///////////////////////////////////////////////	
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new MigLayout(" ", "12[][][][][][][][][][][][][][][][][][]", "[]"));
		
		////////////////////////////////////////////////
		
		JLabel firstLable = new JLabel("Two Image Templates");
		firstLable.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 14));
		panel.add(firstLable, "cell 0 0,growx,aligny center");
		///////////////////////////////////////////////	
		
		JButton two1st = new JButton();
		two1st.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				FactoryTemplate.setSelect_templte(21);
				FactoryTemplate.setClear();				
				TemplateContainer.getCl().show(TemplateContainer.getTemplate_container_panel(), "21");				
			}
		});
		try {
			master= ImageIO.read(getClass().getResource("/images/two1st.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		two1st=btnEdit(two1st,master);
		panel.add(two1st, "cell 0 1,growx,width 165px,height 165px");
		
		///////////////////////////////////////////////	
		JButton two2nd =new JButton();
		two2nd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FactoryTemplate.setSelect_templte(22);
				TemplateContainer.getCl().show(TemplateContainer.getTemplate_container_panel(), "22");				
			}
		});
		try {
			master= ImageIO.read(getClass().getResource("/images/two2nd.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		two2nd=btnEdit(two2nd,master);
		panel.add(two2nd, "cell 0 2,growx,width 165px,height 165px");
		
		
		///////////////////////////////////////////////////////////////
	/*	JLabel threeLable = new JLabel("Three Image Templates");
		threeLable.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 14));
		panel.add(threeLable, "cell 0 3,growx,aligny center");
		///////////////////////////////////////////////	
		JButton three1st = new JButton();
		try {
			master= ImageIO.read(getClass().getResource("/images/third1st.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		three1st=btnEdit(three1st,master);
		panel.add(three1st, "cell 0 4,growx,width 165px,height 165px");
		three1st.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TemplateContainer.getCl().show(TemplateContainer.getTemplate_container_panel(), "31");				
			}
		});
		///////////////////////////////////////////////	
		JButton three2nd = new JButton();
		try {
			master= ImageIO.read(getClass().getResource("/images/third2nd.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		three2nd=btnEdit(three2nd,master);
		panel.add(three2nd, "cell 0 5,growx,width 165px,height 165px");
		three2nd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TemplateContainer.getCl().show(TemplateContainer.getTemplate_container_panel(), "32");				
			}
		});
		///////////////////////////////////////////////	
		JButton three3rd =new JButton();
		try {
			master= ImageIO.read(getClass().getResource("/images/third3rd.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		three3rd=btnEdit(three3rd,master);
		panel.add(three3rd, "cell 0 6,growx,width 165px,height 165px");
		///////////////////////////////////////////////	
		JButton three4th = new JButton();
		try {
			master= ImageIO.read(getClass().getResource("/images/third4th.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		three4th=btnEdit(three4th,master);
		panel.add(three4th, "cell 0 7,growx,width 165px,height 165px");
		
		/////////////////////////////////////////////////////////////////
		
		JLabel fourLable = new JLabel("Four Image Templates");
		fourLable.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 14));
		panel.add(fourLable, "cell 0 8,growx");
		///////////////////////////////////////////////		
		JButton four1st = new JButton();
		try {
			master= ImageIO.read(getClass().getResource("/images/fourth1st.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		four1st=btnEdit(four1st,master);
		panel.add(four1st, "cell 0 9,growx,width 165px,height 165px");
		///////////////////////////////////////////////		
		JButton four2nd =new JButton();
		try {
			master= ImageIO.read(getClass().getResource("/images/fourth2nd.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		four2nd=btnEdit(four2nd,master);
		panel.add(four2nd, "cell 0 10,growx,width 165px,height 165px");
		///////////////////////////////////////////////		
		JButton four3rd = new JButton();
		try {
			master= ImageIO.read(getClass().getResource("/images/fourth3rd.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		four3rd=btnEdit(four3rd,master);
		panel.add(four3rd, "cell 0 11,growx,width 165px,height 165px");
		///////////////////////////////////////////////		
		JButton four4th = new JButton();
		try {
			master= ImageIO.read(getClass().getResource("/images/fourth4th.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		four4th=btnEdit(four4th,master);
		panel.add(four4th, "cell 0 12,growx,width 165px,height 165px");
		
		///////////////////////////////////////////////////////////////////
		
		
		JLabel fiveLable = new JLabel("Five Image Templates");
		fiveLable.setFont(new Font("Arial Narrow", Font.BOLD | Font.ITALIC, 14));
		panel.add(fiveLable, "cell 0 13,growx");
		///////////////////////////////////////////////	
		JButton five1st = new JButton();
		try {
			master= ImageIO.read(getClass().getResource("/images/fifth1st.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		five1st=btnEdit(five1st,master);
		panel.add(five1st, "cell 0 14,growx,width 165px,height 165px");
		///////////////////////////////////////////////	
		JButton five2nd = new JButton();
		try {
			master= ImageIO.read(getClass().getResource("/images/fifth2nd.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		five2nd=btnEdit(five2nd,master);
		panel.add(five2nd, "cell 0 15,growx,width 165px,height 165px");
		///////////////////////////////////////////////	
		JButton five3rd =new JButton();
		try {
			master= ImageIO.read(getClass().getResource("/images/fifth3rd.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		five3rd=btnEdit(five3rd,master);
		panel.add(five3rd, "cell 0 16,growx,width 165px,height 165px");
		
		///////////////////////////////////////////////
		
		JButton five4th =new JButton();
		try {
			master= ImageIO.read(getClass().getResource("/images/fifth4th.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		five4th=btnEdit(five4th,master);
		panel.add(five4th, "cell 0 17,growx,width 165px,height 165px");*/
			
	}
	
///////////////////////////////////////////////
//////////////////////////////////////////////
/////////////////////////////////////////////
	public JButton btnEdit(JButton btn,BufferedImage master){
		
        Image scaled = master.getScaledInstance(130, 130, java.awt.Image.SCALE_SMOOTH);
        btn.setIcon(new ImageIcon(scaled));
		return btn;
}	

}
