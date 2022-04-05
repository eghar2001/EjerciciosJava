package Ejercicio5b;
import JavaPractica.ManejoNulos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import ejercicio5.Empleado;
import ejercicio5.Administrativo;
import ejercicio5.Vendedor;
public class Principal {

	public static void main(String[] args) {
		ArrayList<Empleado> empleados = new ArrayList<>();
		String resultado = "";
		int seguir ;
		
		JOptionPane.showMessageDialog(null,"A continuacion carge los 20 empleados");
		do {
			
			int tipo = 0;
			do {
				tipo = ManejoNulos.pideIntNoVacio("Ingrese tipo del empleado \n1-Administrativo   2-Vendedor");
				
			}while (tipo<1 && tipo>2);
			
			Empleado empleado;
			int dni = ManejoNulos.pideIntNoVacio("DNI empleado ");
			String nombre = ManejoNulos.pideNoVacio("Nombre empleado ");
			String apellido = ManejoNulos.pideNoVacio("Apellido empleado ");
			String email = ManejoNulos.pideNoVacio("Email empleado ");
			float sueldoBase = ManejoNulos.pideFloatNoVacio("Ingrese sueldo base empleado ");
			if (tipo == 1 ) {
				int hsExtra = ManejoNulos.pideIntNoVacio("Ingrese horas extra empleado ");
				int hsMes = ManejoNulos.pideIntNoVacio("Ingrese horas del mes empleado ");
				empleado = new Administrativo(dni,nombre,apellido,email,sueldoBase,hsExtra,hsMes);					
			}
			else {
				int porcenComision = ManejoNulos.pideIntNoVacio("Ingrese Porcentaje Comision empleado ");
				float totalVtas = ManejoNulos.pideIntNoVacio("Ingrese Total Ventas empleado ");
				empleado = new Vendedor(dni,nombre,apellido,email,sueldoBase,porcenComision,totalVtas);
							
			}

			empleados.add(empleados.size(),empleado);
			
			seguir = JOptionPane.showConfirmDialog(null, "Desea ingresar otro?");
		}while (JOptionPane.YES_OPTION == seguir && empleados.size()<20);
		
		for(Empleado empleado:empleados) {
			
			
			resultado += empleado.getDni()+"   "+empleado.getNombre()+"   "+empleado.getApellido()+"   "+empleado.getSueldo()+"\n";
		}
		JOptionPane.showMessageDialog(null, "Listado empleados\n"+resultado);

	}

}
