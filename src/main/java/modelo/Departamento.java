package modelo;

import java.util.ArrayList;

public class Departamento {
	private String especialidad;
	private int codDepto;
	private Empleado administrador;
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();

	public String getEspecialidad() {
		return this.especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public int getCodDepto() {
		return this.codDepto;
	}

	public void setCodDepto(int codDepto) {
		this.codDepto = codDepto;
	}

	public Departamento(String especialidad, int codDepto) {
		throw new UnsupportedOperationException();
	}
}