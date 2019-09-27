package pres;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import metier.IMetier;
import metier.MetierImpl;

@WebServlet(name="cs" ,urlPatterns={"/Controleur","*.php"})
public class ControleurServlet extends HttpServlet{
	
	private IMetier metier;
	ApplicationContext context=new AnnotationConfigApplicationContext("dao","metier");
		@Override
		public void init() throws ServletException {
			metier=context.getBean(IMetier.class);
		}
		
		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
		
			double tab[]=metier.getTabDao();
			ModelMoyen model=new ModelMoyen();
			model.setTab(tab);
			
			double moyenne=metier.calcul(tab);
			model.setMoyenne(moyenne);
			request.setAttribute("model", model);
			request.getRequestDispatcher("VueMoyen.jsp").forward(request, response);
		}
		
		
}
