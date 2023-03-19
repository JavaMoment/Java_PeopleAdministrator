package main.com.java.entities;

import java.util.LinkedList;

public class Persona {
	private static byte idCount;
	private byte idPersona;
	private String nombre; 
	private String apellido;
	private String dptoResidencia;
	private byte cantHijos;
	private LinkedList<Vehicles> listaVehiculo;
	
	public Persona() {
		Persona.idCount++;
		this.idPersona = idCount;
	}
	
	public Persona (String nombre, String apellido, String dptoResidencia,
					byte cantHijos, LinkedList<Vehicles> listaVehiculo) {
		
		Persona.idCount++;
		this.idPersona = idCount;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dptoResidencia = dptoResidencia;
		this.cantHijos = cantHijos;
		this.listaVehiculo = listaVehiculo;
	
	}
	
	public int getIdPersona() {
		return this.idPersona;
	}
}
