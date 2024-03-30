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

	public boolean departamentoExiste(Departamento departamento) {
		for (Departamento d : this.departamentos) {
			if (departamento.getCodDepto() == d.getCodDepto()) {
				return true;
			}
		}
		return false;

	}

	//Método que agrega un departamento
	public void agregarDepartamento(Departamento departamento) {
		if (!departamentoExiste(departamento)) {
			this.departamentos.add(departamento);
		}
	}

	//Método que elimina un departamento
	public void eliminarDepartamento(Departamento departamento) {
		if (departamentoExiste(departamento)) {
			this.departamentos.remove(departamento);
		}
	}

	//Método que busca un departamento por su código
	public void buscarDepartamento(int codDepto) {
		for (Departamento d : this.departamentos) {
			if (codDepto == d.getCodDepto()) {
				System.out.println("Departamento encontrado: " + d.getEspecialidad());
			}
		}
	}

}