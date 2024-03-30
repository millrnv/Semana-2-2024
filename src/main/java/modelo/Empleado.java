package modelo;

public class Empleado {
	private String nombreEmpleado;
	private int rut;
	private Departamento departamento;

	public String getNombreEmpleado() {
		return this.nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public int getRut() {
		return this.rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public Empleado(String nombreEmpleado, int rut) {
		throw new UnsupportedOperationException();
	}
}