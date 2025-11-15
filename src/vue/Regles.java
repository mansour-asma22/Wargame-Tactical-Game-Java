
package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpringLayout;

/**
 * Regles est une classe qui affiche les rÃ¨gles du jeu.
 * @author Solenn
 *
 */
public class Regles {

    /**
     * FenÃªtre des rÃ¨gles.
     */
    private JFrame frame;
    /**
     * String pour reprÃ©senter le sÃ©parateur de fichier que ce soit sur Linux ou
     * Windows.
     */
    private String separateur = System.getProperty("file.separator");

    /**
     * CrÃ©e l'application.
     */
    public Regles() {
        initialize();

    }
    
    /**
     * Initialise le contenu de la fenÃªtre.
     */
    private void initialize() {

        Dimension size = new Dimension(1080, 900);
        frame = new JFrame("Wargame");
        frame.setBounds(250, 10, 1080, 900);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(size);
        frame.setMaximumSize(size);
        frame.setMinimumSize(size);
       

       
        Image imagefond = null;
        try {
            imagefond = ImageIO.read(new File("images" + separateur + "help.png"));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }

      
        CustomPanel panel = new CustomPanel(imagefond);

       
        SpringLayout sl_panel = new SpringLayout();
    
      

       panel.setPreferredSize(new Dimension(1080, 900));
        panel.setBounds(0, 1000 , 1200, 1608);
        panel.setLayout(sl_panel);
        panel.setAlignmentY(Component.CENTER_ALIGNMENT);
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);
       // Color color = new Color(189,32,44);
        //frame.setBackground(color);


       /* Dimension size = new Dimension(1300, 700);
        frame = new JFrame("Wargame");
        frame.setBounds(100, 30 , 1300, 700);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(size);
        frame.setMaximumSize(size);
        frame.setMinimumSize(size);
        frame.getContentPane().setBackground(Color.BLACK);

        Image imagefond = null;
        try {
            imagefond = ImageIO.read(new File("images" + separateur + "war.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
        CustomPanel panel = new CustomPanel(imagefond);
        SpringLayout sl_panel = new SpringLayout();
        panel.setLayout(sl_panel);
      */

        JScrollPane sp = new JScrollPane();

       
       sp.setViewportView(panel);
        sp.setPreferredSize(new Dimension(1080, 1800));

        frame.add(sp); // add scrollpane to frame
       
        frame.pack();
        frame.setVisible(true);
    }

}



