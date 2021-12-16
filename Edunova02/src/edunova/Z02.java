package edunova;

import javax.swing.JOptionPane;

public class Z02 {

	// Program unosi 3 cijela broja i ispisuje najmanji
	public static void main(String[] args) {
		int a, b, c;

		a = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		c = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));

		if (a < b && a < c) {
			System.out.println(a);
		} else if (a >= b) {
			System.out.println(b);
		} else if (a >= c) {
			System.out.println(c);
		}

	}

}
