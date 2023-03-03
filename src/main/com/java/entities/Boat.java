package main.com.java.entities;

public class Boat extends Vehicles {

	private double lenght;
	private double beam;
	
	
	public double getLenght() {
		return lenght;
	}
	public void setLenght(double lenght) {
		this.lenght = lenght;
	}


	public double getBeam() {
		return beam;
	}
	public void setBeam(double beam) {
		this.beam = beam;
	}

	public Boat(int id, String nombre, String color, int passengers, double lenght, double beam) {
		super(id, nombre, color, passengers);
		this.lenght = lenght;
		this.beam = beam;
	}
	
	
	@Override
	public String toString() {
		return "Boat [lenght=" + lenght + ", beam=" + beam + "]";
	}
	
	
	
}
