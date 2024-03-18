package re.moutanin.luc;

import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {

		Scanner monScanner = new Scanner(System.in);

		String[] tableauChaine;
		tableauChaine = new String[6]; // instanciation du tableau (taille 5)
		for (int i = 0; i < tableauChaine.length; i++) {
			//Affiche Entre votre (chiffre) mot :
			System.out.print("Entrez votre " + (i + 1) + " mots : ");
			String saisie = monScanner.nextLine();

			tableauChaine[i] = saisie;
		}

		for (int i = 0; i < tableauChaine.length; i++) {
			//Affiche   tous ce qu'il y a dans le tableau 
			System.out.println("Le mots " + (i + 1) + " est " + tableauChaine[i]);

		}

		monScanner.close();

	}
}
