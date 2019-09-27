package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dao.IDao;
@Component
public class MetierImpl implements IMetier{
	@Autowired
	private IDao dao;
	@Override
	public double[] getTabDao() {
		
		double Value[] =dao.getValeuAleatoire();
		return Value;
	}

	@Override
	public double calcul(double[] tab) {
		double Value[] =dao.getValeuAleatoire();
		double Somme=0;
		for(int i=0;i<Value.length;i++){
			Somme+=Value[i];
		}
		
		return Somme/Value.length;
	}

	public IDao getDao() {
		return dao;
	}

	public void setDao(IDao dao) {
		this.dao = dao;
	}

}
