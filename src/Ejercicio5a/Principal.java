package Ejercicio5a;
import JavaPractica.ManejoNulos;
import javax.swing.JOptionPane;;
public class Principal {

	public static void main(String[] args) {
		Empleado empleados[] = new Empleado[20];
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
			if (tipo == 1 ) {
				empleado = new Administrativo();					
			}
			else {
				empleado = new Vendedor();				
			}
			empleado.cargaDatos(nroEmpleado);
			empleados[i]=empleado;
			i++;
			seguir = JOptionPane.showConfirmDialog(null, "Desea ingresar otro?");
		}while (JOptionPane.YES_OPTION == seguir && i<empleados.length);
		
		for(int j = 0;j<i;j++) {
			Empleado empleado = empleados[j];
			resultado += empleado.getDni()+"   "+empleado.getNombre()+"   "+empleado.getApellido()+"   "+empleado.getSueldo()+"\n";
		}
		JOptionPane.showMessageDialog(null, "Listado empleados\n"+resultado);

	}

}
