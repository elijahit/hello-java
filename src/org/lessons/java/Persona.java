package org.lessons.java;

public class Persona {
	String nome, cognome, professione;
	int eta;
	
	Persona(String nome, String cognome, String professione, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.professione = professione;
		this.eta = eta;
	}

	void get() {
		System.out.println(this.nome + " " +  this.cognome + " " + "| Professione: " + this.professione + " ha: " + this.eta + " anni");
		
	}
	
	void set(String nome, String cognome, String professione, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.professione = professione;
		this.eta = eta;
	}
	
	public String toString() {
		return this.nome + "\n" + this.cognome + "\n" + this.eta + "\n" + this.professione;
	}
}
