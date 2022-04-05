package ejercicio5;

public final class Vendedor extends Empleado {
	//atributos del vendedor
	private int porcenComision;
	private float totalVtas;
	
	
	public Vendedor(int dni, String nombre, String apellido, String email, float sueldoBase,int porcenComision, float totalVtas) {
		super(dni,  nombre, apellido, email,sueldoBase);
		this.setPorcenComision(porcenComision);
		this.setTotalVtas(totalVtas);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Metodo get sueldo
	 * Metodo encargado de calcular el sueldo de un empleado vendedor
	 */
	public double getSueldo() {
		return Math.round((super.getSueldo()* (this.getPorcenComision()*this.getTotalVtas()/100))*100)/100;			
	}
	//getters y setters
	public int getPorcenComision() {
		return porcenComision;
	}
	public void setPorcenComision(int porcenComision) {
		this.porcenComision = porcenComision;
	}
	public float getTotalVtas() {
		return totalVtas;
	}
	public void setTotalVtas(float totalVtas) {
		this.totalVtas = totalVtas;
	}
	
	
	
}
