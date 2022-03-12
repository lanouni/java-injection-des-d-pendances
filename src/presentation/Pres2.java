package presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.lang.reflect.Method ;

import metier.IMetier;
import seance1.IDao;

public class Pres2 {
	public static void main(String[] args) throws Exception	 {
		Scanner scanner = new Scanner(new File("config.txt"));
		String daoClassName = scanner.nextLine();
		Class cDao = Class.forName(daoClassName);
		IDao dao = (IDao)cDao.getDeclaredConstructor().newInstance();
		System.out.println(dao.getData());
		
		String metierClassName = scanner.nextLine();
		Class cMetier = Class.forName(metierClassName);
		IMetier metier = (IMetier) cMetier.getDeclaredConstructor().newInstance();
		
		Method method = cMetier.getMethod("setDao",  IDao.class);
		method.invoke(metier, dao);
		System.out.println("resultat = > "+metier.calcul());
	}
}
 