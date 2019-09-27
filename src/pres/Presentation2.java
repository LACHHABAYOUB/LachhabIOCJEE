package pres;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.IDao;
import metier.IMetier;


public class Presentation2 {

	public static void main(String[] args) {

		/*
		 * istancaition dynamique
		 */
		
		try {
			Scanner scanner=new Scanner(new File("config.txt"));
			String daoClassName=scanner.nextLine();
			//System.out.println(daoClassName);
			Class cDao=Class.forName(daoClassName);
			IDao dao = (IDao) cDao.newInstance();
			
			String metierClassName=scanner.nextLine();
			Class cMetier=Class.forName(metierClassName);
			IMetier metier=(IMetier) cMetier.newInstance();
			Method m=cMetier.getMethod("setDao", IDao.class);
			m.invoke(metier, dao);
			double tab[]=metier.getTabDao();
			for(int i=0;i<tab.length;i++){
				System.out.println("tab["+i+"]:"+tab[i]+"\t");
			}
			System.out.println("la moyenne de tableau est :"+metier.calcul(tab));
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
