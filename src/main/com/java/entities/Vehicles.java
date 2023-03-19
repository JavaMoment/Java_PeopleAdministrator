package main.com.java.entities;

public class Vehicles {
	
	private static byte idCount;
	private byte idVehicle;
	private String name;
	private String color;

	public byte getId() {
		return idVehicle;
	}
	public void setId(byte id) {
		this.idVehicle = id;
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
	
	public Vehicles(String nombre, String color) {
		Vehicles.idCount++;
		this.idVehicle = idCount;
		this.name = nombre;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Vehicles [id=" + idVehicle + ", name=" + name + ", color=" + color + "]";
	}
	
}
