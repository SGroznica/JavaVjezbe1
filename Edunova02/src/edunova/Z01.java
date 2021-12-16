package edunova;

import javax.swing.JOptionPane;

public class Z01 {

	// Program unosi dva cijela broja
	// Ako je njihov zbroj paran broj ispisuje Osijek
	// inače ispisuje Zagreb
	public static void main(String[] args) {

		int a, b;

		a = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));

		int c = (a + b);
		
		if (c%2 == 0) {
			System.out.println("Osijek");
		}else {
			System.out.println("Zagreb");
		}
			

	}

}
