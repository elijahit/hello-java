package org.lessons.java;

import java.util.ArrayList;
import java.util.random.*;


public class StampaLotto {
	public static void main(String[] args) {
		/*
		 * Ho fatto alcune prove e ho creato un generatore casuale di numeri del lotto
		 * Ovviamente devo ancora ben capire il package util.random, però fin ora questo è un buon risultato!
		 * Vorrei far in modo di far giocare un utente dei numeri e poi fare l'estrazione, ma lo farò in futuro
		 * in altri test.
		 */
		showLotto();
	}
	
	static void showLotto () {
		ArrayList<ArrayList<Integer>> numberLotto = GenerateLotto();
		String[] cityName = {"Bari", "Cagliari", "Firenze", "Genova", "Milano", "Napoli", 
				"Palermo", "Roma", "Torino", "Venezia", "Nazionale"};
		
		for(int i = 0; i < numberLotto.size(); i++) {
			System.out.println(cityName[i]+ " " + numberLotto.get(i));
		}
	}
	
	static ArrayList<Integer> randomNumberChecker (RandomGenerator randomNum) {
		ArrayList<Integer> rowNumber = new ArrayList<Integer>();
		for (int i = 0; i < 5;) {
			int randomNumber = randomNum.nextInt(89)+1;
			if(rowNumber.size() > 0) {
				boolean checker = false;
				for (Integer num: rowNumber) {
					if(num == randomNumber) {
						checker = true;
					}
				}
				if(checker == true) {
					continue;
				} else {					
					rowNumber.add(randomNumber);
					i++;
				}
			} else {
				rowNumber.add(randomNumber);
				i++;
			}
			
		}
		return rowNumber;
	}
	
	static ArrayList<ArrayList<Integer>> GenerateLotto() {
		RandomGenerator randomNum = RandomGenerator.of("L32X64MixRandom");
		ArrayList<ArrayList <Integer>> numeriLotto = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < 11; i++) {
			numeriLotto.add(randomNumberChecker(randomNum));
		}
		return numeriLotto;
	}
}
