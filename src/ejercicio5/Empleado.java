package ejercicio5;

public abstract class Empleado {
	//atributos
	private int dni;
	private String nombre;
	private String apellido;
	private String email;
	private float sueldoBase;
	

	
	
	public Empleado(int dni, String nombre, String apellido, String email, float sueldoBase) {
		this.setDni(dni);
		this.setSueldoBase(sueldoBase);
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setEmail(email);
	}

	//Funcion para calcular el sueldo de empleado base
	public double getSueldo() {
		return this.getSueldoBase();
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public float getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(float sueldoBase) {
		this.sueldoBase = sueldoBase;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//Getters y setters de todos los atributos
	

	
	
}
