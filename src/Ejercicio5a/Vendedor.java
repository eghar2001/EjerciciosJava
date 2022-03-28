package Ejercicio5a;
import JavaPractica.ManejoNulos;
public final class Vendedor extends Empleado {
	//atributos del vendedor
	private int porcenComision;
	private float totalVtas;
	
	public void cargaDatos(int numeroEmpleado) {
		super.cargaDatos(numeroEmpleado);
		this.pidePorcenComision(numeroEmpleado).pideTotalVtas(numeroEmpleado);
		
	}
	public Vendedor pidePorcenComision(int numeroEmpleado) {
		return this.setPorcenComision(ManejoNulos.pideIntNoVacio("Ingrese porcentaje comision empleado: "+numeroEmpleado));
	}
	public Vendedor pideTotalVtas(int numeroEmpleado) {
		return this.setTotalVtas(ManejoNulos.pideFloatNoVacio("Ingrese Total Ventas  empleado: "+numeroEmpleado));
	}
	/*
	 * Metodo get sueldo
	 * Metodo encargado de calcular el sueldo de un empleado vendedor
	 */
	public double getSueldo() {
		return super.getSueldo()* (this.getPorcenComision()*this.getTotalVtas()/100);
	}
	//getters y setters
	public int getPorcenComision() {
		return porcenComision;
	}
	public Vendedor setPorcenComision(int porcenComision) {
		this.porcenComision = porcenComision;
		return this;
	}
	public float getTotalVtas() {
		return totalVtas;
	}
	public Vendedor setTotalVtas(float totalVtas) {
		this.totalVtas = totalVtas;
		return this;
	}
	
	
}
