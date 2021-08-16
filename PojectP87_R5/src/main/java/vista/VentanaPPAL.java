package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import controlador.Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPPAL extends JFrame implements ActionListener {
    private transient Control controlador = null;
    private JTextArea areaIntroduccion;
    private JLabel  labelTitulo;
    private JButton botonAceptar;
    private String textoIntroduccion = "";

    
    public VentanaPPAL() {
        //Instancia de controlador
        controlador = new Control();

        // Configuración de la Interfaz Gráfica GUI

		// Configuración de la ventana (JFrame)
		setSize(480, 350);
		setTitle("Reto 5 Mision TIC 2022");
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Label de titulo
		labelTitulo = new JLabel("RETO 5 CON MODELO VISTA CONTROLADOR");
		labelTitulo.setBounds(40, 40, 380, 30);
		labelTitulo.setFont(new java.awt.Font("Verdana", 1, 15));
		add(labelTitulo);

		// Texte Area Informativo
		textoIntroduccion = "Reto 5 Con MVC- Misión TIC 2022 \nSolucion a Reto 5 de Mision Tic Grupo 87 \nJorge Luis Velasquez ";
		areaIntroduccion = new JTextArea();
		areaIntroduccion.setBounds(40, 90, 380, 140);
		areaIntroduccion.setEditable(false);
		areaIntroduccion.setFont(new java.awt.Font("Verdana", 0, 14));
		areaIntroduccion.setLineWrap(true);
		areaIntroduccion.setText(textoIntroduccion);
		areaIntroduccion.setWrapStyleWord(true);
		add(areaIntroduccion);

		// Boton Acpetar
		botonAceptar = new JButton("Aceptar");
		botonAceptar.setBounds(170, 280, 120, 25);
		add(botonAceptar);
		botonAceptar.addActionListener(this);

		
    }

	public JButton getBotonAceptar() {
		return botonAceptar;
	}

	public void setBotonAceptar(JButton botonAceptar) {
		this.botonAceptar = botonAceptar;
	}

	public Control getControlador() {
		return controlador;
	}

	public void setControlador(Control controlador) {
		this.controlador = controlador;
	}

	@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonAceptar) {
            controlador.mostrarVentanaCRUD(this);
        }
        
    }
}
