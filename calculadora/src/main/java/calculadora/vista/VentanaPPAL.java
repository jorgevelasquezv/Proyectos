package calculadora.vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import static java.awt.Font.BOLD;

public class VentanaPPAL extends JFrame{
    //Atributos
    private FlowLayout miFlowLayout;
    private PanelBotones panelBotones; 
    private JButton btnResultado;
    private JLabel lblDisplay;

    //Constructor
    public VentanaPPAL() {
        setTitle("Calculadora");
        miFlowLayout = new FlowLayout (FlowLayout.CENTER, 10, 10);
        setLayout(miFlowLayout);
        setTitle("Calculadora");
        setMinimumSize(new Dimension(255, 425));
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        display();

        panelBotones = new PanelBotones();
        panelBotones.setVisible(true);
        add(panelBotones);

        botonResultado();
    }

    public void display() {
        lblDisplay = new JLabel("0");
        lblDisplay.setPreferredSize(new Dimension(230, 60));
        lblDisplay.setBackground(Color.BLACK);
        lblDisplay.setForeground(Color.GREEN);
        lblDisplay.setBorder(new LineBorder(Color.WHITE));
        lblDisplay.setFont(new Font("MONOSPACED", BOLD, 24));
        lblDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
        add(lblDisplay);
    }

    public void botonResultado() {
        btnResultado = new JButton("Resultado");
        btnResultado.setPreferredSize(new Dimension(230, 60));
        btnResultado.setBackground(Color.DARK_GRAY);
        btnResultado.setForeground(Color.WHITE);
        btnResultado.setBorder(new LineBorder(Color.DARK_GRAY));
        btnResultado.setFont(new Font("MONOSPACED", BOLD, 24));
        add(btnResultado);
    }
}
