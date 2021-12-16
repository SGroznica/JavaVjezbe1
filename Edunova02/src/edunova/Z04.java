package edunova;

import javax.swing.JOptionPane;

public class Z04 {

	// Napišite program koji za danu širinu i dužinu igrališta ispisuje
	// koji se sportovi na tom igralištu mogu igrati
	// Sportovi se igraju na sljedećim površinama igrališta
	// Nogomet 6500 – 7000 m2
	// Rukomet 800 m2
	// Ragbi 7000 m2

	public static void main(String[] args) {
		int sirina, duzina;

		sirina = Integer.parseInt(JOptionPane.showInputDialog("Unesi šiniru"));
		duzina = Integer.parseInt(JOptionPane.showInputDialog("Unesi dužinu"));

		int kvadratura = (duzina * sirina);

		if (kvadratura >= 7000) {
			System.out.println("Ragbi, nogomet i rukomet");
		} else if (kvadratura >= 6500) {
			System.out.println("Nogomet i rukomet");
		} else if (kvadratura == 800) {
			System.out.println("Rukomet");
		} else {
			System.out.println("Nijedan");
		}

	}

}
