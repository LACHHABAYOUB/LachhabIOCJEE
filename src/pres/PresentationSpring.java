package pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.IDao;
import metier.IMetier;

public class PresentationSpring {

	public static void main(String[] args) {
		
		ApplicationContext context=
				new ClassPathXmlApplicationContext("config.xml");
		IMetier metier=(IMetier) context.getBean("metier");
		double tab[]=metier.getTabDao();
		for(int i=0;i<tab.length;i++){
		System.out.println("tab["+i+"]:"+tab[i]+"\t");
		}
		System.out.println(metier.calcul(tab));
	}

}
