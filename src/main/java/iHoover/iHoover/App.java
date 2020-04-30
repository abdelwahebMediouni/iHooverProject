package iHoover.iHoover;

import java.util.ArrayList;
import java.util.List;

import iHoover.iHoover.enums.Commandes;
import iHoover.iHoover.enums.Orientation;
import iHoover.iHoover.models.Aspirateur;
import iHoover.iHoover.models.Grille;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		/** Test 1 **/

		Aspirateur aspirateur = new Aspirateur(5, 5, Orientation.N, new Grille(10, 10));
		
		List   <Commandes>	commandes = new ArrayList<Commandes>();
		commandes.add(Commandes.D);
		commandes.add(Commandes.A);
		commandes.add(Commandes.D);
		commandes.add(Commandes.A);
		commandes.add(Commandes.D);
		commandes.add(Commandes.A);
		commandes.add(Commandes.D);
		commandes.add(Commandes.A);
		commandes.add(Commandes.A);

		aspirateur.move(commandes);

		System.out.println(aspirateur);

	}
}
