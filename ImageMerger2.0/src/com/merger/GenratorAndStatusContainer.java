package com.merger;

import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GenratorAndStatusContainer extends JPanel {

	/**
	 * Create the panel.
	 */
	
	public static JLabel label=null;
	public static JLabel label_1=null;
	public GenratorAndStatusContainer() {
		setBorder(null);
		setBackground(UIManager.getColor("Button.background"));
		setBounds(0, 0,152, 621);
		setLayout(null);
		
		JButton GenerateButton = new JButton("Generate");
		GenerateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FactoryTemplate.callGenrate();
			}
		});
		GenerateButton.setFont(new Font("Arial Black", Font.BOLD, 14));
		GenerateButton.setBounds(10, 11, 133, 66);
		add(GenerateButton);
		
		/* label = new JLabel("0");
		label.setFont(new Font("Arial Black", Font.BOLD, 12));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		label.setBounds(11, 99, 132, 25);
		add(label);
		
		JLabel lblNewLabel = new JLabel("_______");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 123, 133, 25);
		add(lblNewLabel);
		
		 label_1 = new JLabel("0");
		label_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(10, 158, 132, 25);
		add(label_1);*/
	}
}
