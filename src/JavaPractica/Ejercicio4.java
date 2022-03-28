package JavaPractica;
import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		int numeroInic = Integer.parseInt(ManejoNulos.pideNoVacio("Ingrese numero inicial"));
		int numeros[]=new int[20];
	
		String resultado = "";
		JOptionPane.showMessageDialog(null,"Ingrese 20 numeros");
		for(int i = 0; i<numeros.length;i++) {			
			int num = Integer.parseInt(ManejoNulos.pideNoVacio("Ingrese numero "+(i+1)));
			numeros[i]=num;
			if (num>numeroInic) {
				resultado += num + "\n";
			};
		};
		JOptionPane.showMessageDialog(null,"Numeros mayores a "+numeroInic+"\n"+resultado);
		
		
			
		
	}

}
