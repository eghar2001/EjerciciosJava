package JavaPractica;
import java.util.Objects;

import javax.swing.JOptionPane;
public class Ejercicio2 {
//no me deja importar javax.swing
	public static void main(String[] args) {
		String palabras[] = new String[10];
		String resultado = "";
		JOptionPane.showMessageDialog(null,"Ingrese 10 palabras");
		for (int i = 0; i< palabras.length;i++) {
			String palabra;
			do {
				palabra = JOptionPane.showInputDialog("Ingrese palabra numero "+(i+1));
			}while (palabra.equals(""));
			palabras[i] = palabra;
		}
		for (int j= palabras.length-1;j>=0;j--) {
			resultado += palabras[j]+"\n";
		};
		JOptionPane.showMessageDialog(null,"Array en reversa:\n"+resultado);
	}

}
