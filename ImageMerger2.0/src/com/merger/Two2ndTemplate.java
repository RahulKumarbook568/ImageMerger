package com.merger;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class Two2ndTemplate extends Template {

	/**
	 * Create the panel.
	 */
	private JPanel panel;
	private static Two2ndTemplate instance = new Two2ndTemplate();
	private JLabel label;
	private JLabel label_2;
	
	private Two2ndTemplate() {		
		panel=new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setLayout(new MigLayout("insets 0 0 0 0", "[50%]2[50%]", "[grow]"));
		
				
		label = new JLabel();
		this.labelFormate(label);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				 label=(JLabel)arg0.getSource();
				label=getImageLabel(label);
				path1=path;	
				path=null;
				
			}
		});
		panel.add(label, "cell 0 0,grow");
		
		label_2 = new JLabel();
		this.labelFormate(label_2);
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			    label_2=(JLabel)arg0.getSource();
				label_2=getImageLabel(label_2);
				path2=path;	
				path=null;
				
			}
		});
		panel.add(label_2, "cell 1 0,grow");
	}	
	
	public static Two2ndTemplate getInstance(){
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
		String outputpath=new String(outFileChooser());
		
		if(!outputpath.equalsIgnoreCase("")) {
			
			    int indexx=outputpath.lastIndexOf("\\");
			    String name=new String(outputpath.substring(indexx+1,outputpath.length()));
			    outputpath=outputpath.substring(0,indexx+1);
			    
			    int width1=0;
			    int height1=0;
			    int width2=0;
			    int height2=0;		    
			    
			    File file1 = new File(path1);
			    BufferedImage image = null;
			    		    
			    File outputfile = null;
			    BufferedImage outputbuffer = null;
		        
		        try 
		        {	image = ImageIO.read(file1);	           	            
		            width1=image.getWidth();
		            height1= image.getHeight();
		            	            
		            BufferedImage ima = new BufferedImage(width1,height1, BufferedImage.TYPE_INT_ARGB);
		            Graphics2D g1 = ima.createGraphics();
		    		g1.drawImage(image, 0, 0, width1, height1, null);
		    		g1.dispose();
		    		 	    		
		    		String str=path2;
			    	int index=str.lastIndexOf("\\");
			    	    
			    	File file=new File(str.substring(0,index+1));
			    	File[] files = file.listFiles(new FilenameFilter() {
			    	@Override
			    	public boolean accept(File dir, String name) {
			    		if(name.toLowerCase().endsWith(".jpg")||name.toLowerCase().endsWith(".png")||name.toLowerCase().endsWith(".jpeg")){
			    	                return true;
			    	            } else {
			    	                return false;
			    	            }
			    	        }
			    	    });
			    	    
			    	 int nameEdit=1;   	    
		    	   	 int len=files.length;
			     	 int i=1;
			     	 BufferedImage image2 = null;
			     	 BufferedImage ima2=null;	     	     
			     	 for(File filesArr:files){
			     		 		image2 = ImageIO.read(filesArr);
			     		 		width2=image2.getWidth();
			    	            height2= image2.getHeight();
			    	            ima2 = new BufferedImage(width2,height2, BufferedImage.TYPE_INT_ARGB);
			  	    	    			  	    	    	
			  		    		Graphics2D g2 = ima2.createGraphics();
			  		    		g2.drawImage(image2, 0, 0, width2, height2, null);
			  		    		g2.dispose();
			  		    				  		    		
			  		    		if(height1>height2)
			  		    			outputbuffer = new BufferedImage(width1+width2,height1,image.getType());
			  		    		else
			  		    			outputbuffer = new BufferedImage(width1+width2,height2,image.getType());		  		    		
			  		    		
			  		    		Graphics2D g_out= outputbuffer.createGraphics();
			  		    		g_out.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
			  		    		g_out.setColor(Color.white);
			  		    	    g_out.fillRect(0, 0, outputbuffer.getWidth(), outputbuffer.getHeight());		  		    		
			  		    		g_out.drawImage(ima,0,0,null);
			  		    		g_out.drawImage(ima2,image.getWidth()+1,0, null);
			  		    		g_out.dispose();	
			  		    		
			  		    		outputfile = new File(outputpath+name+nameEdit+"."+extension);
			  		    	    ImageIO.write(outputbuffer,extension, outputfile);		  		    	    
			  		    	    nameEdit++;	 	  		             
			  		            i++;		  		            
			  		           }
			     	 ima=null;
			     	 image=null;
			     	 ima2=null;
			     	 image2=null;
			  	     extension=null;	            
		            
		        }catch(Exception e) {
		        	e.printStackTrace();
		        }
		}
	
	}
	
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		label_2.setIcon(null);
		label.setIcon(null);
		path=null;
		path1=null;
		path2=null;
	}
}
