import javax.swing.*;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.File;

public class App extends JFrame implements ActionListener {

    public App() {

        // NOTE: DEFAULT PARAMETER
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setTitle("Information Etudiant");
        this.setLocationRelativeTo(null);
        this.setLocationRelativeTo(getParent());
        Dimension d = this.getSize();
        int x = (int) ((Toolkit.getDefaultToolkit().getScreenSize().width - d.width) / 2);
        int y = (int) ((Toolkit.getDefaultToolkit().getScreenSize().height - d.height) / 2);
        this.setLocation(x, y);

        // NOTE: MAIN MENU
        JMenuBar menuBar = new JMenuBar();

        // NOTE: MENU FICHIER
        JMenu menuFichier = new JMenu("Fichier");
        JMenu menuNouveau = new JMenu("Nouveau");
        JMenu menuOuvrir = new JMenu("Ouvrir");
        JMenu menuEnregistrer = new JMenu("Enregistrer");
        JMenu menuImprimer = new JMenu("Imprimer");

        menuFichier.add(menuNouveau);
        menuFichier.add(menuOuvrir);
        menuFichier.add(menuEnregistrer);
        menuFichier.add(menuImprimer);

        // NOTE: MENU ACCEUIL
        JMenu menuAcceuil = new JMenu("Acceuil");
        JMenu menuPolice = new JMenu("Police");
        JMenu menuParagraphe = new JMenu("Paragraphe");
        JMenu menuStyle = new JMenu("Style");

        menuAcceuil.add(menuPolice);
        menuAcceuil.add(menuParagraphe);
        menuAcceuil.add(menuStyle);

        // NOTE: MENU INSERTION
        JMenu menuInsertion = new JMenu("Insertion");
        JMenu menuPages = new JMenu("Pages");
        JMenu menuTables = new JMenu("Tableaux");
        JMenu menuComplements = new JMenu("Complements");

        menuInsertion.add(menuPages);
        menuInsertion.add(menuTables);
        menuInsertion.add(menuComplements);

        // NOTE: OTHERS MENUS
        JMenu menuOther1 = new JMenu("Creation");
        JMenu menuOther2 = new JMenu("Naviguer");

        this.setJMenuBar(menuBar);
        menuBar.add(menuFichier);
        menuBar.add(menuAcceuil);
        menuBar.add(menuInsertion);
        menuBar.add(menuOther1);
        menuBar.add(menuOther2);

        JToolBar toolBar = new JToolBar("Outils", JToolBar.HORIZONTAL);
        toolBar.setFloatable(false);
        toolBar.setRollover(true);
        String path = System.getProperty("user.dir");
        System.out.println(path);
        URL url;
        Icon icon;
        try {
            url = new URL("file:" + new File(App.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getPath().toString().replace("\\", "/") + "/icons/paper.png");
            icon = new ImageIcon(url);
            JButton boutonPapier = new JButton(icon);
            toolBar.add(boutonPapier);
            url = new URL("file:" + new File(App.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getPath().toString().replace("\\", "/") + "/icons/save.png");
            icon = new ImageIcon(url);
            JButton boutonFeuille = new JButton(icon);
            toolBar.add(boutonFeuille);
            url = new URL("file:" + new File(App.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getPath().toString().replace("\\", "/") + "/icons/duplicate.png");
            icon = new ImageIcon(url);
            JButton boutonImprimer = new JButton(icon);
            toolBar.add(boutonImprimer);
            url = new URL("file:" + new File(App.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getPath().toString().replace("\\", "/") + "/icons/cut.png");
            icon = new ImageIcon(url);
            JButton boutonCut = new JButton(icon);
            toolBar.add(boutonCut);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.add(toolBar, BorderLayout.NORTH); // correct error: cannot resolve symbol: variable NORTH
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                App app = new App();
                app.setVisible(true);
            }
        });
    }
}
