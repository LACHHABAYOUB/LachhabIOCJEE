package pres;

import org.springframework.stereotype.Component;

@Component
public class ModelMoyen {
	
	private double tab[];
	private double moyenne;
	
	public double[] getTab() {
		return tab;
	}

	public void setTab(double[] tab) {
		this.tab = tab;
	}

	public double getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}

	public ModelMoyen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModelMoyen(double[] tab, double moyenne) {
		super();
		this.tab = tab;
		this.moyenne = moyenne;
	}
	
	
}
