package main.com.java.entities;

import java.util.LinkedList;

public class Persona {
	private static int idPersona;
	private String nombre; 
	private String apellido;
	private String dptoResidencia;
	private byte cantHijos;
	private LinkedList<Vehicles> listaVehiculo;
	
	public Persona (String nombre, String apellido, String dptoResidencia,
					byte cantHijos, LinkedList<Vehicles> listaVehiculo) {
		
		this.idPersona++;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dptoResidencia = dptoResidencia;
		this.cantHijos = cantHijos;
		this.listaVehiculo = listaVehiculo;
	
	}
	
	public void setIdPersona(int id) {
		this.idPersona = id;
	}
	
	public int getIdPersona() {
		return this.idPersona;
	}
}
