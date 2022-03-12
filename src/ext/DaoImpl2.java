package ext;

import seance1.IDao;

public class DaoImpl2 implements IDao {

	@Override
	public double getData() {
		// TODO Auto-generated method stub
		System.out.println("version capteurs");
		double temp = 80;
		return temp;
	}

}
