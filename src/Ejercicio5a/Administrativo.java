package Ejercicio5a;

import JavaPractica.ManejoNulos;

public final class Administrativo extends Empleado{
	//Atributos Administrativo
	private int hsExtra;
	private int hsMes;
	

	public void cargaDatos(int numEmpleado) {
		super.cargaDatos(numEmpleado);
		this.pideHsMes(numEmpleado).pideHsExtra(numEmpleado);	
		
		
	}
	
	public Administrativo pideHsExtra(int numEmpleado) {
		return 	this.setHsExtra(ManejoNulos.pideIntNoVacio("Ingrese Hs extra empleado:"+numEmpleado));
	}
	public Administrativo pideHsMes(int numEmpleado) {
		return this.setHsMes(ManejoNulos.pideIntNoVacio("Ingrese Hs Mes empleado:"+numEmpleado));
	}
	/*
	 * Metodo get sueldo
	 * Metodo encargado de calcular el sueldo de un empleado administrativo
	 */
	public double getSueldo() {
		return super.getSueldo()*((this.getHsExtra()*1.5)+this.getHsMes())/this.getHsMes();
	}
	//getters y setters
	public int getHsExtra() {
		return hsExtra;
	}
	public Administrativo setHsExtra(int hsExtra) {
		this.hsExtra = hsExtra;
		return this;
	}
	public int getHsMes() {
		return hsMes;
	}
	public Administrativo setHsMes(int hsMes) {
		this.hsMes = hsMes;
		return this;
	}
	
	
	
}
