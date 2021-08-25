package herencia.modelo;

public class Alumno extends Persona {
	private String instituci�n;
	private String carreraCursar;
	private double notasCalculo;
	private double notasProgramacion1;
	private double notasBDD;
	private int carneEstudiante;

	public Alumno() {
		System.out.println("Se esta inicializando el  constructor de Alumno:");
	}

	public Alumno(String nombre, String apellido, String instituci�n) {
		super(nombre, apellido);
		this.instituci�n = instituci�n;
	}

	public Alumno(String nombre, String apellido, String instituci�n, String carreraCursar) {
		super(nombre, apellido);
		this.instituci�n = instituci�n;
		this.carreraCursar = carreraCursar;
	}

	public String getInstituci�n() {
		return instituci�n;
	}

	public void setInstituci�n(String instituci�n) {
		this.instituci�n = instituci�n;
	}

	public String getCarreraCursar() {
		return carreraCursar;
	}

	public void setCarreraCursar(String carreraCursar) {
		this.carreraCursar = carreraCursar;
	}

	public double getNotasCalculo() {
		return notasCalculo;
	}

	public void setNotasCalculo(double notasCalculo) {
		this.notasCalculo = notasCalculo;
	}

	public double getNotasProgramacion1() {
		return notasProgramacion1;
	}

	public void setNotasProgramacion1(double notasProgramacion1) {
		this.notasProgramacion1 = notasProgramacion1;
	}

	public double getNotasBDD() {
		return notasBDD;
	}

	public void setNotasBDD(double notasBDD) {
		this.notasBDD = notasBDD;
	}

	public int getCarneEstudiante() {
		return carneEstudiante;
	}

	public void setCarneEstudiante(int carneEstudiante) {
		this.carneEstudiante = carneEstudiante;
	}

	@Override
	public String saludar() {
		
		String saludar = super.saludar();
		return saludar + " mi nombre es " + getNombre() + " " + getApellido() ;
	}

	
	
	
}
