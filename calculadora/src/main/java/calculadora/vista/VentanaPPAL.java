package calculadora.vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import calculadora.controller.Controlador;

import javax.swing.SwingConstants;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import static java.awt.Font.BOLD;

public class VentanaPPAL extends JFrame{
    //Atributos
    private transient Controlador control;
    private FlowLayout miFlowLayout;
    private PanelBotones panelBotones; 
    private JButton btnResultado;
    private JLabel lblDisplay;
    private String acumulador;
    private String operacion;

    //Constructor
    public VentanaPPAL() {
        control = new Controlador();
        acumulador = "";

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

        panelBotones = new PanelBotones(this);
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
        btnResultado.addActionListener(new EventBotonesVentanaPPAL(this));
    }

    public void cargarDisplay(String text) {
        if (lblDisplay.getText().equals("0") || lblDisplay.getText().substring(lblDisplay.getText().length()- 1).equals("+") || lblDisplay.getText().substring(lblDisplay.getText().length()- 1).equals("-") || lblDisplay.getText().substring(lblDisplay.getText().length()- 1).equals("*") || lblDisplay.getText().substring(lblDisplay.getText().length()- 1).equals("/")) {
            lblDisplay.setText(text);    
        }else{
            lblDisplay.setText(lblDisplay.getText() + text);
        }
        
    }

    public void borrarDisplay() {
        lblDisplay.setText("0");
    }

    public void resultado() {
        if (operacion.equals("+")) {
            acumulador = control.sumar(acumulador, lblDisplay.getText());
            lblDisplay.setText(acumulador);
        }
         
        if (operacion.equals("-")) {
            
        }
        if (operacion.equals("*")) {
            
        }
        if (operacion.equals("/")) {
            
        }
    }

    public void suma() {
        operacion = "+";
        acumulador = lblDisplay.getText();
        cargarDisplay(operacion);
    }

    public void resta() {
        operacion = "-";
        acumulador = lblDisplay.getText();
        cargarDisplay(operacion);
    }

    public void division() {
        operacion = "/";
        acumulador = lblDisplay.getText();
        cargarDisplay(operacion);
    }

    public void multiplicacion() {
        operacion = "*";
        acumulador = lblDisplay.getText();
        cargarDisplay(operacion);
    }



    // Metodos Getters and Setters 
    public Controlador getControl() {
        return control;
    }

    public void setControl(Controlador control) {
        this.control = control;
    }

    public PanelBotones getPanelBotones() {
        return panelBotones;
    }

    public void setPanelBotones(PanelBotones panelBotones) {
        this.panelBotones = panelBotones;
    }

    public JButton getBtnResultado() {
        return btnResultado;
    }

    public void setBtnResultado(JButton btnResultado) {
        this.btnResultado = btnResultado;
    }

    public JLabel getLblDisplay() {
        return lblDisplay;
    }

    public void setLblDisplay(JLabel lblDisplay) {
        this.lblDisplay = lblDisplay;
    }

    
}
