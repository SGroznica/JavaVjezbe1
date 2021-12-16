package edunova;

import javax.swing.JOptionPane;

public class Z03 {

	// Program unosi dvije logičke vrijednosti
	// u slučaju da su obje istinite ispisuje DA
	public static void main(String[] args) {

		boolean a, b;
		a = Boolean.parseBoolean(JOptionPane.showInputDialog("Unesi logičku vrijednost"));
		b = Boolean.parseBoolean(JOptionPane.showInputDialog("Unesi logičku vrijednost"));
		
		if (a=b) {
			System.out.println("DA");
		}else {
			System.out.println("NE");
		}
	}

}
