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
		
		Persona.idPersona++;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dptoResidencia = dptoResidencia;
		this.cantHijos = cantHijos;
		this.listaVehiculo = listaVehiculo;
	
	}
		
	
	public static void setIdPersona(int idPersona) {
		Persona.idPersona = idPersona;
	}


	public int getIdPersona() {
		return idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDptoResidencia() {
		return dptoResidencia;
	}

	public void setDptoResidencia(String dptoResidencia) {
		this.dptoResidencia = dptoResidencia;
	}

	public byte getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(byte cantHijos) {
		this.cantHijos = cantHijos;
	}

	public LinkedList<Vehicles> getListaVehiculo() {
		return listaVehiculo;
	}

	public void setListaVehiculo(LinkedList<Vehicles> listaVehiculo) {
		this.listaVehiculo = listaVehiculo;
	}
}
