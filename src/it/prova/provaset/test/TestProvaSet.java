package it.prova.provaset.test;

import java.util.HashSet;
import java.util.Set;

public class TestProvaSet {
	public static void main(String[] args) {
		Set<String> elencoAuto = new HashSet<String>();
		elencoAuto.add("Lamborghini");
		elencoAuto.add("Ferrari");
		elencoAuto.add("Toyota");
		elencoAuto.add("Fiat");
		elencoAuto.add("Ferrari");

		System.out.println(elencoAuto);

		elencoAuto.remove("Fiat");
		System.out.println(elencoAuto);

		elencoAuto.removeAll(elencoAuto);
		System.out.println(elencoAuto);

		if (elencoAuto.isEmpty()) {
			System.out.println("E' vuoto!");
		} else {
			System.out.println("Non e' vuoto!");
		}
	}
}
