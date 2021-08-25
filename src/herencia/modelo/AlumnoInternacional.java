package herencia.modelo;

public class AlumnoInternacional extends Alumno {
	private String pais;
	private double notaIdiomas;

	public AlumnoInternacional() {
		System.out.println("Se esta inicializando el  constructor de AlumnoInternacional");
	}

	public AlumnoInternacional(String nombre, String apellido, String instituci�n, String carreraAcursar, String pais) {
		super(nombre, apellido, instituci�n, carreraAcursar);
		this.pais = pais;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public double getNotaIdiomas() {
		return notaIdiomas;
	}

	public void setNotaIdiomas(double notaIdiomas) {
		this.notaIdiomas = notaIdiomas;
	}

	@Override
	public String saludar() {
		String saludar = super.saludar();
		return saludar + "soy extrajero, vengo del pais " + getPais();
	}
	
	
}
