package main.com.java.entities;

import java.util.LinkedList;

public class Persona {
	private static byte idCount; // This will be our id auto increment
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
		
<<<<<<< HEAD
		Persona.idCount++;
		this.idPersona = idCount;
=======
		Persona.idPersona++;
>>>>>>> cde3db7e157d8bbe5a25ef723f62d75834e15856
		this.nombre = nombre;
		this.apellido = apellido;
		this.dptoResidencia = dptoResidencia;
		this.cantHijos = cantHijos;
		this.listaVehiculo = listaVehiculo;
	
	}
		
	
<<<<<<< HEAD
=======
	public static void setIdPersona(int idPersona) {
		Persona.idPersona = idPersona;
	}


>>>>>>> cde3db7e157d8bbe5a25ef723f62d75834e15856
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
