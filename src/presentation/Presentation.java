package presentation;

import metier.MetierImpl;
import seance1.DaoImpl;

public class Presentation {

	public static void main(String[] args) {
		DaoImpl dao = new DaoImpl();
		MetierImpl metier = new MetierImpl();
		metier.setDao(dao);
		System.out.println("resultat"+metier.calcul());
	}

}


//instanciation des dependance par instansiation statique