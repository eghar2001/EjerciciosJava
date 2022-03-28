package JavaPractica;
import javax.swing.JOptionPane;
public class ManejoNulos {
	public static boolean esVacio(String str) {
		return str.equals("");
	}
	
	public static String pideNoVacio(String mensaje) {
		String str;
		do {
			str = JOptionPane.showInputDialog(mensaje);
		}while(ManejoNulos.esVacio(str));
		return str;
	}
	
	public static int pideIntNoVacio(String mensaje) {
		
		return Integer.parseInt(ManejoNulos.pideNoVacio(mensaje));
	}
	public static double pideDoubNoVacio(String mensaje) {
		
		return Double.parseDouble(ManejoNulos.pideNoVacio(mensaje));
	}
	public static float pideFloatNoVacio(String mensaje) {
		
		return Float.parseFloat(ManejoNulos.pideNoVacio(mensaje));
	}
}
