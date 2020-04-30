package iHoover.iHoover.models;

import java.util.List;

import iHoover.iHoover.enums.Commandes;
import iHoover.iHoover.enums.Orientation;

public class Aspirateur {

	private Grille grille;
	private int x;
	private int y;
	private Orientation orientation;

	public Aspirateur() {
		super();
	}

	public Aspirateur(int x, int y, Orientation orientation, Grille grille) {
		super();
		this.x = x;
		this.y = y;
		this.orientation = orientation;
		this.grille = grille;
	}

	@Override
	public String toString() {
		return "Aspirateur [grille=" + grille + ", x=" + x + ", y=" + y + ", orientation=" + orientation + "]";
	}

	public void move(List<Commandes> commandes) {

		commandes.forEach(commande -> {

			switch (commande) {
			case D: {
				/** Pivoter l’aspirateur de 90° à droite **/
				System.out.println("Pivoter l’aspirateur de 90° à droite");
				calculerNouvelleOrientationDroite();
				break;
			}
			case G: {
				/** Pivoter l’aspirateur de 90° à gauche **/
				System.out.println("Pivoter l’aspirateur de 90° à gauche");
				calculerNouvelleOrientationGauche();
				break;
			}
			case A: {
				/** Avancer le rebot selon l'orientation **/
				avancerSelonOrientation();
				break;
			}

			}

		});
		
		

	}

	private void calculerNouvelleOrientationDroite() {
		switch (this.orientation) {
		case N: {
			/** Pivoter l’aspirateur de 90° vers L'est **/
			System.out.println("Pivoter l’aspirateur de 90° vers L'est");
			this.orientation = Orientation.E;
			break;
		}
		case W: {
			/** Pivoter l’aspirateur de 90° vers le nord **/
			System.out.println("Pivoter l’aspirateur de 90° vers le nord");
			this.orientation = Orientation.N;
			break;
		}

		case E: {
			/** Pivoter l’aspirateur de 90° vers le sud **/
			System.out.println("Pivoter l’aspirateur de 90° vers le  sud");
			this.orientation = Orientation.S;
			break;
		}

		case S: {
			/** Pivoter l’aspirateur de 90° vers L'ouest **/
			System.out.println("Pivoter l’aspirateur de 90° vers L'ouest");
			this.orientation = Orientation.W;
			break;

		}

		}
	}

	private void calculerNouvelleOrientationGauche() {
		switch (this.orientation) {
		case N: {

			System.out.println("Pivoter l’aspirateur de 90° vers L'ouest");
			this.orientation = Orientation.W;
			break;
		}
		case W: {
			System.out.println("Pivoter l’aspirateur de 90° vers le sud");
			this.orientation = Orientation.S;
			break;
		}

		case E: {
			System.out.println("Pivoter l’aspirateur de 90° vers le  nord");
			this.orientation = Orientation.N;
			break;
		}

		case S: {

			System.out.println("Pivoter l’aspirateur de 90° vers L'est");
			this.orientation = Orientation.E;
			break;

		}

		}
	}

	private void avancerSelonOrientation() {

		switch (this.orientation) {
		case N: {
			/** avancement vers le nord doit pas dépacer la grille definie **/
			if (this.grille.getDimensionY() > y) {
				System.out.println("Avancer vers le nord");
				this.y = this.y + 1;
			}

			break;
		}

		case S: {
			/** avancement vers le sud doit pas dépacer la grille definie **/
			if (this.y > 0) {
				System.out.println("Avancer vers le sud");
				this.y = this.y - 1;
			}
			break;
		}
		case E: {
			/** avancement vers l'est doit pas dépacer la grille definie **/
			if (this.grille.getDimensionX() > x) {
				System.out.println("Avancer vers l'est");
				this.x = this.x + 1;
			}
			break;
		}
		case W: {
			/** avancement vers l'ouest doit pas dépacer la grille definie **/
			if (this.x > 0) {
				System.out.println("Avancer vers l'ouest");
				this.x = this.x - 1;
			}
			break;
		}
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Orientation getOrientation() {
		return orientation;
	}

	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

}
