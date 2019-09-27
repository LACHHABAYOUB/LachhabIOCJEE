package pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.IDao;
import metier.IMetier;
public class PresentationSpringAnnot {

	public static void main(String[] args) {
		
		
	ApplicationContext context=
		new AnnotationConfigApplicationContext("dao","metier");

	IMetier metier=context.getBean(IMetier.class);

	IDao dao= context.getBean(IDao.class);
	double tab[]=dao.getValeuAleatoire();
	for(int i=0;i<tab.length;i++){
	System.out.println("tab["+i+"]:"+tab[i]+"\t");
	}
	System.out.println(metier.calcul(tab));
	

	}

}
