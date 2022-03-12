package ext;

import seance1.IDao;

public class DaoImplVWS implements IDao {
	@Override
	public double getData() {
		// TODO Auto-generated method stub
		System.out.println("version web service ");
		return 90;
	}
}
