package com.merger;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;


public class TemplateContainer  {

	/**
	 * Create the panel.
	 */
	private  static CardLayout cl=new CardLayout();
	static JPanel template_container_panel;
	
	////////////////////////////////////////////
	public TemplateContainer() {
		template_container_panel=new JPanel();
		template_container_panel.setBorder(null);
		template_container_panel.setBackground(UIManager.getColor("Button.background"));
		template_container_panel.setBounds(152, 0, 583, 621);
		template_container_panel.setLayout(cl);		
		
		
		template_container_panel.add(Two1stTemplate.getInstance().getPanel(), "21");		
		template_container_panel.add(Two2ndTemplate.getInstance().getPanel(), "22");	
	//	template_container_panel.add(Three1stTemplate.getInstance().getPanel(), "31");
	//	template_container_panel.add(Three2ndTemplate.getInstance().getPanel(), "32");
		
	   // cl.show(this.template_container_panel, "0");
	    
	}
	
	public static CardLayout getCl() {
		return cl;
	}

	public void setCl(CardLayout cl) {
		this.cl = cl;
	}
			
	public static JPanel getTemplate_container_panel() {
		return template_container_panel;
	}

	public void setTemplate_container_panel(JPanel template_container_panel) {
		this.template_container_panel = template_container_panel;
	}

	public TemplateContainer getInstance() {
		return this;
	}
}
