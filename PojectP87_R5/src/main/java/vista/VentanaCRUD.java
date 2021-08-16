package vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controlador.Control;

public class VentanaCRUD extends JFrame{
    private JButton botonLideres, botonMateriales, botonInsertar ;
    private JLabel labelTitulo;
    private PanelTable tabla;
    private PanelInsertar panelInsertar;
    private transient Control control; 

    public VentanaCRUD() {
        control = new Control();

		setTitle("Mision TIC 2022");
        setBounds(10, 10, 800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);

        // Label de titulo
        labelTitulo = new JLabel("CONSULTAS BASE DATOS CONTRUCTORAS");
		labelTitulo.setBounds(180, 10, 500, 30);
		labelTitulo.setFont(new java.awt.Font("Verdana", 1, 18));
		add(labelTitulo);

        // Panel Tabla 
        tabla = new PanelTable();
        tabla.setBounds(10, 50, 780, 450);
        add(tabla);

        // Panel Insertar
        panelInsertar = new PanelInsertar(this);
        panelInsertar.setBounds(10, 50, 780, 550);
        add(panelInsertar);
        panelInsertar.setVisible(false);

        // Botones CRUD Segunda Hilera
		botonLideres = new JButton("Listado Lideres");
		botonLideres.setBounds(70, 500, 200, 25);
		add(botonLideres);
		botonLideres.addActionListener(new EventBotonesCRUD(this, tabla));

		botonMateriales = new JButton("Listado Materiales");
		botonMateriales.setBounds(290, 500, 200, 25);
		add(botonMateriales);
		botonMateriales.addActionListener(new EventBotonesCRUD(this, tabla));

		botonInsertar = new JButton("Insertar");
		botonInsertar.setBounds(510, 500, 200, 25);
		add(botonInsertar);
		botonInsertar.addActionListener(new EventBotonesCRUD(this, tabla));
    }

    // Metodos

    public void verPanelTabla() {
        panelInsertar.setVisible(false);
        panelInsertar.limpiar();
        labelTitulo.setText("CONSULTAS BASE DATOS CONTRUCTORAS");
        labelTitulo.setBounds(180, 10, 500, 30);
        tabla.setVisible(true);
        botonLideres.setVisible(true);
        botonMateriales.setVisible(true);
        botonInsertar.setVisible(true);
    }

    public void verPanelInsertar() {
        panelInsertar.limpiar();
        tabla.setVisible(false);
        labelTitulo.setText("INGRESO DE LIDERES");
        labelTitulo.setBounds(270, 10, 500, 30);
        botonLideres.setVisible(false);
        botonMateriales.setVisible(false);
        botonInsertar.setVisible(false);
        panelInsertar.setVisible(true);
    }

    public JButton getBotonLideres() {
        return botonLideres;
    }

    public void setBotonLideres(JButton botonLideres) {
        this.botonLideres = botonLideres;
    }

    public JButton getBotonMateriales() {
        return botonMateriales;
    }

    public void setBotonMateriales(JButton botonMateriales) {
        this.botonMateriales = botonMateriales;
    }

    public JButton getBotonInsertar() {
        return botonInsertar;
    }

    public void setBotonInsertar(JButton botonInsertar) {
        this.botonInsertar = botonInsertar;
    }

    public PanelTable getTabla() {
        return tabla;
    }

    public void setTabla(PanelTable tabla) {
        this.tabla = tabla;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public JLabel getLabelTitulo() {
        return labelTitulo;
    }

    public void setLabelTitulo(JLabel labelTitulo) {
        this.labelTitulo = labelTitulo;
    }

    public PanelInsertar getPanelInsertar() {
        return panelInsertar;
    }

    public void setPanelInsertar(PanelInsertar panelInsertar) {
        this.panelInsertar = panelInsertar;
    }
    
    
}