package com.merger;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;


public abstract class Template{
	
	protected String path,path1,path2,path3,path4,path5;	
	protected JFileChooser fch;
	protected File sFile;
	protected static String extension=null;
	
	
	protected abstract JPanel viewTemplate();
	
	
	
	
	protected void labelFormate(JLabel lbl) {
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setBackground(Color.LIGHT_GRAY);
		lbl.setOpaque(true);
	};
	
	
	
	
	
	
	public JLabel getImageLabel(JLabel lbl){
		JLabel lbl2=new JLabel();
		lbl2=lbl;
		 fch=new JFileChooser();
			fch.setCurrentDirectory(new File(System.getProperty("user.home")));
			FileNameExtensionFilter filter=new FileNameExtensionFilter("*.IMAGE","jpg","gif","png","jpeg");
			fch.addChoosableFileFilter(filter);
			int result=fch.showSaveDialog(null);
			if(result==JFileChooser.APPROVE_OPTION){
				sFile=fch.getSelectedFile();
				 this.path=sFile.getAbsolutePath();
			        ImageIcon icon=new ImageIcon(path);
		   		 Image img=icon.getImage();
		   		 Image newimg=img.getScaledInstance(lbl2.getWidth(),lbl2.getHeight(),Image.SCALE_SMOOTH);
				ImageIcon image=new ImageIcon(newimg);
				lbl2.setIcon(image);
			}
			else if(result==JFileChooser.CANCEL_OPTION){
				System.out.println("no data");
				}
		return lbl2;
		
	}
	
	
	
	
	
	public abstract  void createImages();
	
	
////////////////////////////////////////////////////////
	public  String outFileChooser(){
		String path=null;
		   JFileChooser fch=new JFileChooser();
			fch.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
			fch.setCurrentDirectory(new File(System.getProperty("user.home")));
		    fch.setFileFilter(new FileNameExtensionFilter("JPG", "jpg"));
			fch.setFileFilter(new FileNameExtensionFilter("PNG", "png"));
			fch.setFileFilter(new FileNameExtensionFilter("JPEG", "jpeg"));
		    int result=fch.showSaveDialog(null);
			if(result==JFileChooser.APPROVE_OPTION){
				File sFile=fch.getSelectedFile();
				path=sFile.getAbsolutePath();
			
				if(fch.getFileFilter().getDescription().equals("JPG")){
					extension="jpg";
				}
				else if(fch.getFileFilter().getDescription().equals("PNG")){
					extension="png";
				}
				else if(fch.getFileFilter().getDescription().equals("JPEG")){
					extension="jpeg";
				}
			}
			else if(result==JFileChooser.CANCEL_OPTION){
				return "";
			}
			return path;
	}
////////////////////////////////////////////////////////	
	
	public abstract void clear();
}
