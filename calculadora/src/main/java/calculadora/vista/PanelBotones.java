package calculadora.vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Color;
import static java.awt.Font.BOLD;


public class PanelBotones extends JPanel {
    // Atributos
    private VentanaPPAL ventanaPPAL;
    private GridLayout miGridLayout;
    private JButton [] arrayBotones;
    private String [] textoBotones = new String[] {"7", "8", "9", "C", "4", "5", "6", "+", "1", "2", "3", "-", "0", ".", "/", "*"};

    //Constructor
    public PanelBotones(VentanaPPAL ventanaPPAL) {
        this.ventanaPPAL = ventanaPPAL;
        miGridLayout = new GridLayout(4, 4, 10, 10);
        setLayout(miGridLayout);
        setBackground(Color.BLACK);
        arrayBotones = new JButton [16];

        for (int i = 0; i < 16; i++) {
            arrayBotones[i] = new JButton(textoBotones[i]);
            arrayBotones[i].setPreferredSize(new Dimension(50, 50));
            arrayBotones[i].setFont(new Font("MONOSPACED", BOLD, 24));
            arrayBotones[i].setBackground(Color.DARK_GRAY);
            arrayBotones[i].setBorder(new LineBorder(Color.DARK_GRAY));
            arrayBotones[i].setForeground(Color.WHITE);
            arrayBotones[i].addActionListener(new EventPanelBotones(arrayBotones, this));
            arrayBotones[i].setActionCommand(textoBotones[i]);
            add(arrayBotones[i]);
        }
    }

    public void cargarDisplay(String text) {
        ventanaPPAL.cargarDisplay(text);
    }

    public void borrarDisplay() {
        ventanaPPAL.borrarDisplay();
    }

    public void suma() {
        ventanaPPAL.suma();
    }

    public void resta() {
        ventanaPPAL.resta();
    }

    public void division() {
        ventanaPPAL.division();
    }

    public void multiplicacion() {
        ventanaPPAL.multiplicacion();
    }
}
