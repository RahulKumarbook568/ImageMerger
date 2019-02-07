package com.merger;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class Three1stTemplate extends Template{

	/**
	 * Create the panel.
	 */
	private JPanel panel;
	private static Three1stTemplate instance = new Three1stTemplate();
	private JLabel label;
	private JLabel label_2;
	private JLabel label_3;
	
	private Three1stTemplate() {		
		panel=new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setLayout(new MigLayout("insets 0 0 0 0", "[50%]2[50%]", "[50%]2[50%]"));
		
				
		label = new JLabel();
		this.labelFormate(label);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JLabel lbl=(JLabel)arg0.getSource();
				lbl=getImageLabel(lbl);
				System.out.println(path);
			}
		});
		panel.add(label, "cell 0 0 2 1,grow");
		
		label_2 = new JLabel();
		this.labelFormate(label_2);
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JLabel lbl=(JLabel)arg0.getSource();
				lbl=getImageLabel(lbl);
				System.out.println(path);
			}
		});
		panel.add(label_2, "cell 0 1,grow");
		
		label_3 = new JLabel();
		this.labelFormate(label_3);
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JLabel lbl=(JLabel)arg0.getSource();
				lbl=getImageLabel(lbl);
				System.out.println(path);
			}
		});
		panel.add(label_3, "cell 1 1,grow");
		
	}	
	
	public static Three1stTemplate getInstance(){
	      return instance;
	   }
	public JPanel getPanel() {
		return panel;
	}


	public void setPanel(JPanel panel) {
		this.panel = panel;
	}


	@Override
	protected JPanel viewTemplate() {
		// TODO Auto-generated method stub
		return null;
	}

	public void mouseClicked(MouseEvent e) 
    { 
			/*FUNCTION CALL*/
			JLabel lbl=(JLabel)e.getSource();
			lbl=getImageLabel(lbl);
			/*FUNCTION CALL END*/        
    }

	@Override
	public void createImages() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

}
