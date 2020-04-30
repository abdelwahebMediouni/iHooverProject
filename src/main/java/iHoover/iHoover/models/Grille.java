package iHoover.iHoover.models;

public class Grille {
	
	private int dimensionX;
	private int dimensionY;
	public Grille() {
		super();
	}
	public Grille(int dimesionX, int dimensionY) {
		super();
		this.dimensionX = dimesionX;
		this.dimensionY = dimensionY;
	}
	public int getDimensionX() {
		return dimensionX;
	}
	public void setDimensionX(int dimesionX) {
		this.dimensionX = dimesionX;
	}
	public int getDimensionY() {
		return dimensionY;
	}
	public void setDimensionY(int dimensionY) {
		this.dimensionY = dimensionY;
	}
	
	
	

}
