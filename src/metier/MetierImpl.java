package metier;

import seance1.IDao;

public class MetierImpl implements IMetier {

	private IDao dao;
	@Override
	public double calcul() {
		double temp = dao.getData();
		double res = temp*3.14;
		return res;
	}
	public void setDao(IDao dao) {
		this.dao = dao;
	}
	
}
