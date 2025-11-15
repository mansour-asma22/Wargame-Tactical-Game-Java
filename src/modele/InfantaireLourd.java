package modele;

import controleur.Jeu;

/**
 * InfantaireLourd est la classe représentant une unité de InfantaireLourd. Ses caractéristiques sont :
 * <ul>
 * <li>Attaque : 18</li>
 * <li>Défense : 10</li>
 * <li>PV : 46</li>
 * <li>Déplacement : 3</li>
 * <li>Vision : 2</li>
 * <li>Portée : 1</li>
 * </ul>
 * @author Solenn
 * @see Unite
 *
 */
public class InfantaireLourd extends Unite {
    /**
     * Valeur de l'attaque du InfantaireLourd.
     */
    private static final int ATTAQUE = 18;
    /**
     * Valeur de la défense du InfantaireLourd.
     */
    private static final int DEFENSE = 10;
    /**
     * Valeur des PV du InfantaireLourd.
     */
    private static final int PV = 46;
    /**
     * Valeur du déplacement du InfantaireLourd.
     */
    private static final int DEPLACEMENT = 3;
    /**
     * Valeur de la vision du InfantaireLourd.
     */
    private static final int VISION = 2;
    /**
     * Valeur de la portée du InfantaireLourd.
     */
    private static final int PORTEE = 1;

    /**
     * Constructeur InfantaireLourd avec ses constantes.
     * @param equipe
     *      Le numéro du joueur associé à cette unité.
     * @param x
     *      Le numéro de ligne de l'unité.
     * @param y
     *      Le numéro de colonne de l'unité.
     */
    public InfantaireLourd(final int equipe, final int x, final int y) {
        super(Jeu.infantaireLourd, ATTAQUE, DEFENSE, PV, DEPLACEMENT, VISION, PORTEE, x, y, equipe);
    }

}
