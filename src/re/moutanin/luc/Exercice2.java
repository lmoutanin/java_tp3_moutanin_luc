package re.moutanin.luc;

import java.util.Scanner;

public class Exercice2 {

	static String[] tableauChaine;

	public static void main(String[] args) {
		// Appeler la méthode tbt() pour saisir les mots dans le tableau
		tbt();

		// Afficher le mot le plus long
		System.out.println("le mot le plus est : " + longMot());

		// Afficher le mot le plus long avec la lettre 'e' et le nombre d'occurrences de e
	
		System.out.println("le mot le plus long avec la lettre e est : " + lePlusLongMotEnE() + " il y a *"
				+ (lePlusLongMotEnE().split("e|E", -1).length - 1) + " la lettre e");
	}

	// Méthode pour saisir les mots dans le tableau
	public static String[] tbt() {
		Scanner monScanner = new Scanner(System.in);

		tableauChaine = new String[6]; // instanciation du tableau (taille 6)
		for (int i = 0; i < tableauChaine.length; i++) {
			System.out.print("Entrez votre " + (i + 1) + " mot : ");
			String saisie = monScanner.nextLine();

			tableauChaine[i] = saisie;
		}

		monScanner.close();
		return tableauChaine;
	}

	// Méthode pour trouver le mot le plus long dans le tableau
	public static String longMot() {
		String mots = tableauChaine[0];

		for (int i = 1; i < tableauChaine.length; i++) {
			if (tableauChaine[i].length() > mots.length()) {
				mots = tableauChaine[i];
			}
		}

		return mots;
	}

	// Méthode pour trouver le mot avec le plus grand nombre de 'e' dans le tableau
	public static String lePlusLongMotEnE() {
		String mots = tableauChaine[0];

		for (int i = 1; i < tableauChaine.length; i++) {
			// Comparer le nombre d'occurrences de 'e' dans chaque mot
			if (tableauChaine[i].split("e|E", -1).length - 1 > mots.split("e|E", -1).length - 1) {
				mots = tableauChaine[i];
			}
		}

		return mots;
	}
}