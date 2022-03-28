package Ejercicio5a;
import JavaPractica.ManejoNulos;
public abstract class Empleado {
	//atributos
	private int dni;
	private float sueldoBase;
	private String nombre;
	private String apellido;
	private String email;
	

public void cargaDatos(int numEmpleado) {
	this.pideDni(numEmpleado).
	pideSueldoBase(numEmpleado).
	pideNombre(numEmpleado).
	pideApellido(numEmpleado).
	pideEmail(numEmpleado);
}
	public Empleado pideDni(int numEmpleado) {
		
		return this.setDni(ManejoNulos.pideIntNoVacio("Ingrese DNI empleado:"+numEmpleado));
	}
	public Empleado pideSueldoBase(int numEmpleado) {
		return setSueldoBase(ManejoNulos.pideFloatNoVacio("Ingrese Sueldo Base empleado:"+numEmpleado));
	}
	public Empleado pideNombre(int numEmpleado) {
		return  setNombre(ManejoNulos.pideNoVacio("Ingrese Nombre empleado:"+numEmpleado));
	}
	public Empleado pideApellido(int numEmpleado) {
		return  setApellido(ManejoNulos.pideNoVacio("Ingrese Apellido empleado:"+numEmpleado));
	}
	public Empleado pideEmail(int numEmpleado) {
		return  setEmail(ManejoNulos.pideNoVacio("Ingrese Email empleado:"+numEmpleado));
	}
	
	
	//Funcion para calcular el sueldo de empleado base
	public double getSueldo() {
		return this.getSueldoBase();
	}
	
	//Getters y setters de todos los atributos
	public int getDni() {
		return dni;
	}

	public Empleado setDni(int dni) {
		this.dni = dni;
		return this;
	}

	public float getSueldoBase() {
		return sueldoBase;
	}

	public Empleado setSueldoBase(float sueldoBase) {
		this.sueldoBase = sueldoBase;
		return this;
	}

	public String getNombre() {
		return nombre;
	}

	public Empleado setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	public String getApellido() {
		return apellido;
	}

	public Empleado setApellido(String apellido) {
		this.apellido = apellido;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public Empleado setEmail(String email) {
		this.email = email;
		return this;
	}

	
	
}
