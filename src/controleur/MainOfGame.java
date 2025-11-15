package controleur;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.SpringLayout;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JFileChooser;

import modele.Joueur;
import vue.CustomPanel;
import vue.Menu;

/**
 * Classe qui lance le main du programme.
 * @author Solenn
 *
 */
public class MainOfGame {
	
	/**
     * Séparateur de fichier que ce soit sur Linux ou Windows.
     */
    

    /**
     * Fonction main du programme.
     * @param args Arguments de lancement.
     */
    public static void main(final String[] args) {
    	boolean rejouer = true; // Variable pour vérifier si le joueur veut rejouer
        totality: do {
            Menu menu = new Menu();
            Joueur winner = null;
            do {
                do {
                    System.out.print("");
                } while (!Jeu.hasStarted());
                Jeu.affichageUnite();

                do {
                    ArrayList<Joueur> perdant = new ArrayList<Joueur>();
                    Joueur joueur = Jeu.getListeJoueurs().get(Jeu.getTurn() - 1); // tour des joueurs chacun leur tour
                    joueur.jouerTour();
                    if (!Jeu.hasStarted()) {
                        continue totality;
                    }
                    if (joueur.getListeUnite().size() == 0) { // mise en mémoire des perdants
                        perdant.add(joueur);
                    }
                    if (!perdant.isEmpty()) { //on enlève les perdants de la liste
                        Jeu.getListeJoueurs().removeAll(perdant);
                    }
                    Jeu.nextTurn();
                } while (Jeu.getListeJoueurs().size() > 1 && Jeu.hasStarted());
                Jeu.affichageUnite();
                winner = Jeu.getListeJoueurs().get(0);
               
            } while (winner == null);
            
            
           
            Jeu.kill();
            
            JFrame frame = new JFrame("Fin de la partie");
            frame.setBounds(330,5,1300, 700);
            
            

            // Spécifiez le chemin d'accès à votre image
           ImageIcon imageIcon = new ImageIcon("C:\\Users\\manso\\Downloads\\VERSION-FINAL\\Wargame-Isty-main\\images");
          
            JLabel label = new JLabel(imageIcon);

            frame.getContentPane().add(label);
            frame.setVisible(true);
            JOptionPane.showMessageDialog(null, "Fin de la partie.\n" + winner.getPseudo() + " a gagné.",
                   "Fin de la partie", JOptionPane.INFORMATION_MESSAGE);

         
         // Demander au joueur s'il veut rejouer
           int choix = JOptionPane.showConfirmDialog(null, "Voulez-vous rejouer ?", "Rejouer", JOptionPane.YES_NO_OPTION);
            if (choix == JOptionPane.NO_OPTION) {
                rejouer = false; // Le joueur ne veut pas rejouer
            }

        } while (rejouer);
        // Fermer le programme
            System.exit(0);
   
    }
   

    
}
