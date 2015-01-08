package assochistorica;

import java.util.ArrayList;

public class Empleat {
	private String nom;
	private Sou souActual;
	private ArrayList<Sou> historicSous;

	public Empleat(String nom) {
		this.nom = nom;
		historicSous = new ArrayList<Sou>();
	}

	public Sou getSou() {
		return souActual;
	}

	public void afegirNouSou(Sou sou) {
		this.souActual = sou;
		historicSous.add(sou);
	}

	public void printLlistatHistoric() {
		for (Sou s : historicSous) {
			System.out.println(s);
		}
	}

	public String toString() {
		return this.nom;
	}
}
