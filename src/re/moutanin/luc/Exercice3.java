package re.moutanin.luc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {
		int compteur = 1;
		Scanner monScanner = new Scanner(System.in);
		System.out.println("veuillez saisir 5 nombre entiers");
		List<Integer> valeurs; // déclaration
		valeurs = new ArrayList<Integer>(); // instanciation
		while (compteur <= 5) {

			// Affiche Entre le le nombre (chiffre) :
			while (true) {
				System.out.println("Entre le nombre " + compteur + " :");
				try {
					int saisie = monScanner.nextInt();
					valeurs.add(saisie);
					break;
				} catch (Exception erreur) {
					// Instruction déplacée après la précédente

					// Capture et gestion d'une exception si l'utilisateur n'entre pas un nombre
					// entier
					System.out.println("Veuillez entre nombre entiers");
					monScanner.nextLine(); // Nettoie la ligne actuelle pour éviter une boucle infinie
				}
			}
			compteur++;
		}

		Double somme = (double) 0, moy;
		for (int i = 0; i < valeurs.size(); i++)
			somme += valeurs.get(i);

		// trouver la valeur moyenne
		moy = somme / valeurs.size();
		System.out.println("La moyenne est: " + moy);
		monScanner.close();
	}

}
