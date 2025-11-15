package modele;

import controleur.Jeu;

/**
 * Rivi�re est la classe repr�sentant un type d'Hexagone. Ses caract�ristiques sont :
 * <ul>
 * <li>Points de d�placement : 0</li>
 * <li>Bonus de d�fense : 10 %</li>
 * </ul>
 * @author Solenn
 * @see Hexagone
 *
 */
public class Riviere extends Hexagone {
    /**
     * Valeur des points de déplacement de la Rivière.
     */
    private static final int POINTDEPLACEMENT = 0;
    /**
     * Valeur du bonus de défense de la Rivière.
     */
    private static final double BONUSDEFENSE = 0.1;

    /**
     * Conctructeur Rivière.
     * @param x
     *      Numéro de ligne sur le plateau.
     * @param y
     *      Numéro de colonne sur le plateau.
     */
    public Riviere(final int x, final int y) {
        super(Jeu.RIVIERE, BONUSDEFENSE, POINTDEPLACEMENT, x, y);
    }

}
