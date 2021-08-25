package herencia.modelo;

public class Profesor extends Persona {
	private String asignatura;
	private int carnetProfesor;

	public Profesor() {
		System.out.println("Se esta inicializando el  constructor de Profesor");
	}

	public Profesor(String nombre, String apellido, String asignatura) {
		super(nombre, apellido);
		this.asignatura = asignatura;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public int getCarnetProfesor() {
		return carnetProfesor;
	}

	public void setCarnetProfesor(int carnetProfesor) {
		this.carnetProfesor = carnetProfesor;
	}

	@Override
	public String saludar() {
		String saludar = super.saludar();
		return "Hola mucho gusto, soy el profesor de " + getAsignatura() + " mi nombre es " + "" + getNombre() + " " + getApellido();
	}
	

}
