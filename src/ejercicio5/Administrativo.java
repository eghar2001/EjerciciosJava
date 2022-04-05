package ejercicio5;



public final class Administrativo extends Empleado{
	//Atributos Administrativo
	private int hsExtra;
	private int hsMes;
	

	
	
	
	public Administrativo(int dni,  String nombre, String apellido, String email,float sueldoBase,int hsExtra, int hsMes) {
		super(dni,  nombre, apellido, email,sueldoBase);
		this.setHsExtra(hsExtra);
		this.setHsMes(hsMes);
	}
	/*
	 * Metodo get sueldo
	 * Metodo encargado de calcular el sueldo de un empleado administrativo
	 */
	public double getSueldo() {
		return Math.round((super.getSueldo()*((this.getHsExtra()*1.5)+this.getHsMes())/this.getHsMes())*100)/100;
	}
	//getters y setters
	public int getHsExtra() {
		return hsExtra;
	}
	public void setHsExtra(int hsExtra) {
		this.hsExtra = hsExtra;
	}
	public int getHsMes() {
		return hsMes;
	}
	public void setHsMes(int hsMes) {
		this.hsMes = hsMes;
	}
	
	
	
}
