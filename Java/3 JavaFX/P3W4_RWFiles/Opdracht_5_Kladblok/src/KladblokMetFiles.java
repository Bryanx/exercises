import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class KladblokMetFiles extends JFrame {
    public static void main(String[] args) {
        new KladblokMetFiles();
    }

    private JTextArea textArea;
    private JMenuBar menuBar;
    private JMenu menuBestand;
    private JMenuItem itemExit;
    private JMenuItem itemOpen;
    private JMenuItem itemNew;
    private JMenuItem itemSave;

    public KladblokMetFiles() throws HeadlessException {
        super("Mijn eigen kladblok");
        initialiseerComponenten();
        layoutComponenten();
        voegListenerToe();
        toonFrame();
    }

    private void initialiseerComponenten() {
        textArea = new JTextArea(20, 50);
        menuBar = new JMenuBar();
        menuBestand = new JMenu("Bestand");
        itemOpen = new JMenuItem("Open", 'O');
        itemNew = new JMenuItem("New", 'N');
        itemSave = new JMenuItem("Save as", 's');
        itemExit = new JMenuItem("Exit", 'x');
        itemExit.setAccelerator(KeyStroke.getKeyStroke
                (KeyEvent.VK_X, InputEvent.CTRL_MASK, true));
    }

    private void layoutComponenten() {
        JScrollPane sp = new JScrollPane(textArea);
        this.add(sp, BorderLayout.CENTER);
        this.setJMenuBar(menuBar);
        menuBar.add(menuBestand);
        menuBestand.add(itemOpen);
        menuBestand.add(itemNew);
        menuBestand.addSeparator();
        menuBestand.add(itemSave);
        menuBestand.addSeparator();
        menuBestand.add(itemExit);
    }

    public void voegListenerToe() {
        itemNew.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textArea.setText("");
            }
        });
        itemExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });
    }

    private void toonFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(this);
        setVisible(true);
    }
}