package modelo;

public class Oficina {
	private int nOficina;
	private tipoOficina tipo;

	public int getNOficina() {
		return this.nOficina;
	}

	public void setNOficina(int nOficina) {
		this.nOficina = nOficina;
	}

	public tipoOficina getTipo(tipoOficina tipo) {
		throw new UnsupportedOperationException();
	}

	public Oficina(int nOficina) {
		throw new UnsupportedOperationException();
	}
}