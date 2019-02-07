package com.merger;

import javax.swing.JPanel;
import javax.swing.UIManager;
import java.awt.Color;

public class ComponentContainer extends JPanel {

	/**
	 * Create the panel.
	 */
	public ComponentContainer() {
		
		setBorder(null);
		setBackground(UIManager.getColor("Button.background"));
		setBounds(0,0, 950, 621);
		setLayout(null);
		
		add(new GenratorAndStatusContainer());
		add(new TemplateContainer().template_container_panel);
		add(new TemplateButtons());
		
		
		
		

	}

}
