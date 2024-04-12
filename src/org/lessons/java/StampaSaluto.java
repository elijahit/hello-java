package org.lessons.java;

import java.util.Scanner;

public class StampaSaluto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ciao! Benvenuto nel mio StampaSaluto, sviluppato da Gabriele Mario Tosto.");
		System.out.println("");
		System.out.println("");
		System.out.println("Come ti chiami?");
		String name = scanner.nextLine();
		System.out.println("Ciao " + name);
		System.out.println("Ti va di giocare con me? Rispondi semplicemente SI o NO.");
		System.out.println("Qualsiasi risposta differente dal SI verrà interpretata come NO.");
		String responseQuestion = scanner.nextLine();

		if(responseQuestion.equalsIgnoreCase("si")) {
			// Pulisco il terminale
			for(int i = 0; i < 10; i++) {
				System.out.println("");
			}
			
			System.out.println("Bene, hai deciso di giocare con me!");
			System.out.println("Peccato che ancora non so come creare delle funzioni se cosi si possono chiamare"
					+ " per farti giocare con me! :(");
			System.out.println("Appena Giuseppe mi istruirà al riguardo ti prometto che giocheremo insieme!");
		} else {
			System.out.println("E' un peccato che tu non voglia giocare con me, sarà per la prossima!");
		}
		
		scanner.close();
		
		
	}
}
