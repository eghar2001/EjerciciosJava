package Ejercicio5a;
import JavaPractica.ManejoNulos;
import ejercicio5.Empleado;
import ejercicio5.Administrativo;
import ejercicio5.Vendedor;
import javax.swing.JOptionPane;;
public class Principal {

	public static void main(String[] args) {
		Empleado[] empleados = new Empleado[20];
		String resultado = "";
		int seguir ;
		int i=0;
		JOptionPane.showMessageDialog(null,"A continuacion carge los 20 empleados");
		do {
			int nroEmpleado = i+1;
			int tipo = 0;
			do {
				tipo = ManejoNulos.pideIntNoVacio("Ingrese tipo del "+nroEmpleado+" ° empleado \n1-Administrativo   2-Vendedor");
				
			}while (tipo<1 && tipo>2);
			
			Empleado empleado;
			int dni = ManejoNulos.pideIntNoVacio("DNI empleado "+nroEmpleado);
			String nombre = ManejoNulos.pideNoVacio("Nombre empleado "+nroEmpleado);
			String apellido = ManejoNulos.pideNoVacio("Apellido empleado "+nroEmpleado);
			String email = ManejoNulos.pideNoVacio("Email empleado "+nroEmpleado);
			float sueldoBase = ManejoNulos.pideFloatNoVacio("Ingrese sueldo base empleado "+nroEmpleado);
			if (tipo == 1 ) {
				int hsExtra = ManejoNulos.pideIntNoVacio("Ingrese horas extra empleado "+nroEmpleado);
				int hsMes = ManejoNulos.pideIntNoVacio("Ingrese horas del mes empleado "+nroEmpleado);
				empleado = new Administrativo(dni,nombre,apellido,email,sueldoBase,hsExtra,hsMes);					
			}
			else {
				int porcenComision = ManejoNulos.pideIntNoVacio("Ingrese Porcentaje Comision empleado "+nroEmpleado);
				float totalVtas = ManejoNulos.pideIntNoVacio("Ingrese Total Ventas empleado "+nroEmpleado);
				empleado = new Vendedor(dni,nombre,apellido,email,sueldoBase,porcenComision,totalVtas);
							
			}

			empleados[i]=empleado;
			i++;
			seguir = JOptionPane.showConfirmDialog(null, "Desea ingresar otro?");
		}while (JOptionPane.YES_OPTION == seguir && i<empleados.length);
		
		for(int j = 0;j<i;j++) {
			Empleado empleado = empleados[j];
			
			resultado += (j+1)+empleado.getDni()+"   "+empleado.getNombre()+"   "+empleado.getApellido()+"   "+empleado.getSueldo()+"\n";
		}
		JOptionPane.showMessageDialog(null, "Listado empleados\n"+resultado);

	}

}
