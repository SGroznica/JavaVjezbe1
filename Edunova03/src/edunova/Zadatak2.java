package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Zadatak2 {

	// Program od korisnika traži unos dva cijela broja
	// S vrijednostima unesenih brojeva deklarirajte matricu

	// primjer: Čovjek unese 5 i 6, vi napravite matricu 5x6

	public static void main(String[] args) {

		int x, y;

		x = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Unesi cijeli broj"));

		int[][] matrica = new int[x][y];
		System.out.println(x);
		System.out.println(y);
		for (int i = 0; i < x; i++) {
				System.out.println(Arrays.toString(matrica[i]));
		
		}

	}

}
