package edunova;

import javax.swing.JOptionPane;

public class Zadatak1 {

	// Program učitava 3 broja u niz
	// Ispisuje najveći
	// Ne smijete koristiti niti jednu drugu varijablu osim deklariranog niza

	public static void main(String[] args) {

		int[] broj = new int[3];

		for (int i = 0; i < 3; i++) {
			broj[i] = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
			

		} 
		
		if(broj[0]>broj[1] && broj[0]>broj[2]) {
			System.out.println(broj[0]);
		} else if (broj[1]>=broj[0]) {
			System.out.println(broj[1]);
		}else if (broj[2]>=broj[0]) {
			System.out.println(broj[2]);
		}

	}

}
