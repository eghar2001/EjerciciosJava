package JavaPractica;
import javax.swing.JOptionPane;

import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		ArrayList<String> palabras = new ArrayList<> ();
		JOptionPane.showMessageDialog(null,"Ingrese 10 palabras");
		for (int i=1;i<=10;i++) {
			String palabra;
			do {
				palabra = JOptionPane.showInputDialog("Ingrese palabra numero "+(i+1));
			}while (palabra.equals(""));
			palabras.set(i, palabra);
		}
		

	}

}
