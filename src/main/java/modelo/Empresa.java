package modelo;

import java.util.ArrayList;

public class Empresa {
	private String nombreEmpresa;
	private String direccion;
	private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
	private ArrayList<Oficina> oficinas = new ArrayList<Oficina>();

	public String getNombreEmpresa() {
		return this.nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Empresa(String nombreEmpresa, String direccion) {
		throw new UnsupportedOperationException();
	}
}