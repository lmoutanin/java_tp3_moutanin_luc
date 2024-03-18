package re.moutanin.luc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercice4 {

	// Déclaration de la liste pour stocker les valeurs
	static List<String> valeurs;

	public static void main(String[] args) {
		// Appeler la méthode tbt() pour saisir les mots dans le tableau
		tbt();

		// Afficher le mot le plus long
		System.out.println("le mot le plus long est : " + longMot());

		// Afficher le mot le plus long avec la lettre 'e' et le nombre d'occurrences de
		// e
		System.out.println("le mot le plus long avec la lettre 'e' est : " + lePlusLongMotEnE() + " il y a *"
				+ (lePlusLongMotEnE().split("e|E", -1).length - 1) + " la lettre e");
	}

	// Méthode pour saisir les mots dans la liste
	public static List<String> tbt() {
		Scanner monScanner = new Scanner(System.in);
		System.out.println("Veuillez saisir 6 mots :");
		valeurs = new ArrayList<String>(); // instanciation de la liste
		int compteur = 1;
		while (compteur <= 6) {
			System.out.println("Entre le mots " + compteur + " :");
			String saisie = monScanner.nextLine();
			valeurs.add(saisie);
			compteur++; // Instruction déplacée après la précédente
		}

		monScanner.close();
		return valeurs;
	}

	// Méthode pour trouver le mot le plus long dans la liste
	public static String longMot() {
		String mots = valeurs.get(0);

		// Utilisation de foreach pour parcourir la liste
		for (String valeur : valeurs) {
			if (valeur.length() > mots.length()) {
				mots = valeur;
			}
		}

		return mots;
	}

	// Méthode pour trouver le mot avec le plus grand nombre de 'e' dans la liste
	public static String lePlusLongMotEnE() {
		String mots = valeurs.get(0);

		// Utilisation de foreach pour parcourir la liste
		for (String valeur : valeurs) {
			// Comparer le nombre d'occurrences de 'e' dans chaque mot
			if (valeur.split("e|E", -1).length - 1 > mots.split("e|E", -1).length - 1) {
				mots = valeur;
			}
		}

		return mots;
	}
}