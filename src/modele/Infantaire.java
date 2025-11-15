package modele;

import controleur.Jeu;

/**
 * Infantaire est la classe représentant une unité de Infantaire. Ses caractéristiques sont :
 * <ul>
 * <li>Attaque : 20</li>
 * <li>Défense : 8</li>
 * <li>PV : 50</li>
 * <li>Déplacement : 6</li>
 * <li>Vision : 2</li>
 * <li>Portée : 1</li>
 * </ul>
 * @author Solenn
 * @see Unite
 *
 */
public class Infantaire extends Unite {
    /**
     * Valeur de l'attaque du Infantaire.
     */
    private static final int ATTAQUE = 20;
    /**
     * Valeur de la défense du Infantaire.
     */
    private static final int DEFENSE = 8;
    /**
     * Valeur des PV du Infantaire.
     */
    private static final int PV = 50;
    /**
     * Valeur du déplacement du Infantaire.
     */
    private static final int DEPLACEMENT = 6;
    /**
     * Valeur de la vision du Infantaire.
     */
    private static final int VISION = 2;
    /**
     * Valeur de la portée du Infantaire.
     */
    private static final int PORTEE = 1;

    /**
     * Constructeur Infantaire avec ses constantes.
     * @param equipe
     *      Le numéro du joueur associé à cette unité.
     * @param x
     *      Le numéro de ligne de l'unité.
     * @param y
     *      Le numéro de colonne de l'unité.
     */
    public Infantaire(final int equipe, final int x, final int y) {
        super(Jeu.infantaire, ATTAQUE, DEFENSE, PV, DEPLACEMENT, VISION, PORTEE, x, y, equipe);
    }

}
