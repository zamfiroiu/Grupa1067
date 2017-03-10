package program;

import lazyinitialization.DirectorGeneral;

public class Program {

	public static void main(String[] args) {
		DirectorGeneral directorGeneral1 = DirectorGeneral.getInstance("Popescu", 3000);
		DirectorGeneral directorGeneral2 = DirectorGeneral.getInstance("Ionescu", 1000);
		
		System.out.println(directorGeneral1.toString());
		System.out.println(directorGeneral2.toString());
	}
}
