package dao;

import org.springframework.stereotype.Component;

@Component
public class DaoImpl implements IDao{

	@Override
	public double[] getValeuAleatoire() {
		// TODO Auto-generated method stub
		double Tab[]=new double[10];
		for(int i=0;i<Tab.length; i++){
			Tab[i]=(double)(Math.random()*1000);
		}
		
		return Tab;
	}

}
