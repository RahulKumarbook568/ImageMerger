package com.merger;

import javax.swing.JPanel;

public class FactoryTemplate {
	
	
	private static int select_templte;

	public static int getSelect_templte() {
		return select_templte=21;
	}

	public static void setSelect_templte(int select_templte) {
		FactoryTemplate.select_templte = select_templte;
	}
	
	public static void callGenrate() {
		if(select_templte==21)
			Two1stTemplate.getInstance().createImages();
		else if(select_templte==22)
			Two2ndTemplate.getInstance().createImages();
	}
	
	public static void setClear() {
		if(select_templte==21)
			Two1stTemplate.getInstance().clear();
		else if(select_templte==22)
			Two2ndTemplate.getInstance().clear();
	}
	
}
