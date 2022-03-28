package JavaPractica;
import javax.swing.JOptionPane;

import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		ArrayList<String> palabras = new ArrayList<> ();
		
		JOptionPane.showMessageDialog(null,"Ingrese 10 palabras");
		for (int i=1;i<=10;i++) {
			palabras.add(ManejoNulos.pideNoVacio("Ingrese palabra numero "+i));
		};
		String palabraBuscada = ManejoNulos.pideNoVacio("Ingrese palabra a buscar");
		String resultado = palabras.contains(palabraBuscada)?palabraBuscada + " existe":palabraBuscada+" no existe";
		JOptionPane.showMessageDialog(null, resultado);
	}

}
