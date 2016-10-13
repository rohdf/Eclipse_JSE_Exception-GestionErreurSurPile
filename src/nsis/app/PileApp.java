/**
 * Auteur Rohdri FRIMAT
 * Date 08/09/2016
 * 
 *  Créer un programme Java qui manipule une pile d'entiers avec la 
 * capture de l'exception PileException
 * - Corriger les bugs (utiliser le débogueur d'Eclipse si nécessaire)
 * - Ajouter les classes PileVideException et PilePleineException. 
 * Ces deux classes devront hériter de la classe PileException
 */

package nsis.app;

import nsis.metier.Pile;
import nsis.metier.exception.PilePleineException;
import nsis.metier.exception.PileVideException;

public class PileApp {

	public static void main(String[] args) {
		/*Création d'une pile*/
		int nbPile = 2;
 		Pile p = new Pile(nbPile);
		
		/*empilage puis dépilage de valeur dans la pile*/
 		/*Ajouter +1 à 'nbPile' dans la boucle 'for' pour observer l'action des Exceptions*/
		try {
			for(int i=0; i<nbPile; i++){
				System.out.println("J'empile la valeur "+i);
				p.empiler(i);
			}
			
			System.out.println("fin empilage !!!");

			for(int i=0; i<nbPile; i++){
				System.out.println("Je dépile la valeur "+p.depiler());
			}


		} catch (PilePleineException e) {
			e.printStackTrace();
		}catch (PileVideException e) {
			e.printStackTrace();
		}
		

	}
}
