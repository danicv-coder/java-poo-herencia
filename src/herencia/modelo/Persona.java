package herencia.modelo;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private String sexo;
	private String correo;

	public Persona() {
		System.out.println("Se esta inicializando  el constructor de persona:");
	}

	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Persona(String nombre, String apellido, int edad) {
		this(nombre, apellido);
		this.edad = edad;
	}

	public Persona(String nombre, String apellido, int edad, String sexo) {
		this(nombre, apellido, edad);
		this.sexo = sexo;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String saludar() {
		return "Hola que tal!";

	}

}
