package qbo.com.model;

import java.util.UUID;

public class Participante {

	private UUID id;
	private String nombres;
	private String apellidos;
	private String especialidad;

	public Participante(UUID id, String nombres, String apellidos, String especialidad) {
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.especialidad = especialidad;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

}
