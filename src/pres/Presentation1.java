package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Presentation1 {

	public static void main(String[] args) {
		
		/*
		 * istanciation statique
		 */
		DaoImpl dao=new DaoImpl();
		MetierImpl metier=new MetierImpl();
		
		metier.setDao(dao);
		double tab[]=metier.getTabDao();
		for(int i=0;i<tab.length;i++){
			System.out.println("tab["+i+"]:"+tab[i]+"\t");
		}
		
		System.out.println("la maoyenne est :"+metier.calcul(tab));

	}

}
