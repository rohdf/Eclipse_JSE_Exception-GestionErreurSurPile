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

package nsis.metier;


import nsis.metier.exception.PilePleineException;
import nsis.metier.exception.PileVideException;

public class Pile {
	  private int pile[];
	  private int sommet = 0;
	  public static final int ERR_VIDE = -1;
	  public static final int ERR_PLEINE = -2;

	  public Pile(int taille) {
	    pile = new int[taille];
	  }

	  public void empiler(int val) throws PilePleineException {
	    if (sommet >= pile.length) {
	        throw new PilePleineException(ERR_PLEINE);
	    }

	    this.pile[sommet++]=val;

	  }
	  
	  public int depiler() throws PileVideException {
		  System.out.println("sommet: "+1);
	   if (sommet < 1) {
	        throw new PileVideException(ERR_VIDE);
	   }
	   return this.pile[--sommet];
	  }
}
