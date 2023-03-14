package main.com.java.entities;

public class Vehicles {
	private int id;
	private String name;
	private String color;
	private int passengers;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return name;
	}
	public void setNombre(String nombre) {
		this.name = nombre;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getPassengers(int passengers) {
		return passengers;
	}
	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	
	public Vehicles(int id, String nombre, String color, int passengers) {
		this.id = id;
		this.name = nombre;
		this.color = color;
		this.passengers = passengers;
	}
	
	@Override
	public String toString() {
		return "Vehicles [id=" + id + ", name=" + name + ", color=" + color + " pasajeros=" + passengers + "]";
	}
	
}
