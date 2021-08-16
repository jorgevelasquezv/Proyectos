package vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelInsertar extends JPanel{
    //Atributos
    private JLabel id, nombre, pApellido, sApellido, salario, ciudad, cargo, fecha, clasificacion;
    private JTextField textId, textNombre, textPApellido, textSApellido, textSalario, textCiudad, textCargo, textFecha, textClasificacion;
    private JButton botonGuardar, botonLimpiar, botonCancelar;
    private VentanaCRUD ventanaCRUD;

    // Constructor
    public PanelInsertar(VentanaCRUD ventanaCRUD) {
        this.ventanaCRUD = ventanaCRUD;
        
        setLayout(null);
        setSize( 780, 550);

        // Campos de datos de Lider
        id = new JLabel("Identificacion");
        id.setBounds(20, 80, 130, 25);
        add(id);
        textId = new JTextField();
        textId.setBounds(160, 80, 130, 25);
        add(textId);

        nombre = new JLabel("Nombre");
        nombre.setBounds(20, 120, 130, 25);
        add(nombre);
        textNombre = new JTextField();
        textNombre.setBounds(160, 120, 190, 25);
        add(textNombre);

        sApellido = new JLabel("Segundo Apellido");
        sApellido.setBounds(20, 160, 130, 25);
        add(sApellido);
        textSApellido = new JTextField();
        textSApellido.setBounds(160, 160, 190, 25);
        add(textSApellido);

        ciudad = new JLabel("Ciudad Residencia");
        ciudad.setBounds(20, 200, 130, 25);
        add(ciudad);
        textCiudad = new JTextField();
        textCiudad.setBounds(160, 200, 190, 25);
        add(textCiudad);

        pApellido = new JLabel("Primer Apellido");
        pApellido.setBounds(360, 120, 130, 25);
        add(pApellido);
        textPApellido = new JTextField();
        textPApellido.setBounds(500, 120, 190, 25);
        add(textPApellido);

        salario = new JLabel("Salario");
        salario.setBounds(360, 160, 130, 25);
        add(salario);
        textSalario = new JTextField();
        textSalario.setBounds(500, 160, 190, 25);
        add(textSalario);

        cargo = new JLabel("Cargo");
        cargo.setBounds(360, 200, 130, 25);
        add(cargo);
        textCargo = new JTextField();
        textCargo.setBounds(500, 200, 190, 25);
        add(textCargo);

        clasificacion = new JLabel("Clasificacion");
        clasificacion.setBounds(20, 240, 130, 25);
        add(clasificacion);
        textClasificacion = new JTextField();
        textClasificacion.setBounds(160, 240, 190, 25);
        add(textClasificacion);

        fecha = new JLabel("Fecha Nacimiento");
        fecha.setBounds(360, 240, 240, 25);
        add(fecha);
        textFecha = new JTextField();
        textFecha.setBounds(500, 240, 190, 25);
        add(textFecha);

        // Botones CRUD 
        botonGuardar = new JButton("Guardar");
        botonGuardar.setBounds(70, 450, 200, 25); //50, 350, 120, 25
        add(botonGuardar);
        botonGuardar.addActionListener(new EventBotonesPanelInsertar(this));

        botonCancelar = new JButton("Cancelar");
        botonCancelar.setBounds(290, 450, 200, 25);//190, 350, 120, 25
        add(botonCancelar);
        botonCancelar.addActionListener(new EventBotonesPanelInsertar(this));

        botonLimpiar = new JButton("Limpiar");
        botonLimpiar.setBounds(510, 450, 200, 25);//330, 350, 120, 25
        add(botonLimpiar);
        botonLimpiar.addActionListener(new EventBotonesPanelInsertar(this));
    }

    // Metodos

    public void limpiar() {
        textId.setText("");
        textNombre.setText("");
        textPApellido.setText("");
        textSApellido.setText("");
        textSalario.setText("");
        textCargo.setText("");
        textCiudad.setText("");
        textClasificacion.setText("");
        textFecha.setText("");
    }
    
    public JTextField getTextId() {
        return textId;
    }

    public void setTextId(JTextField textId) {
        this.textId = textId;
    }

    public JTextField getTextNombre() {
        return textNombre;
    }

    public void setTextNombre(JTextField textNombre) {
        this.textNombre = textNombre;
    }

    public JTextField getTextPApellido() {
        return textPApellido;
    }

    public void setTextPApellido(JTextField textPApellido) {
        this.textPApellido = textPApellido;
    }

    public JTextField getTextSApellido() {
        return textSApellido;
    }

    public void setTextSApellido(JTextField textSApellido) {
        this.textSApellido = textSApellido;
    }

    public JTextField getTextSalario() {
        return textSalario;
    }

    public void setTextSalario(JTextField textSalario) {
        this.textSalario = textSalario;
    }

    public JTextField getTextCiudad() {
        return textCiudad;
    }

    public void setTextCiudad(JTextField textCiudad) {
        this.textCiudad = textCiudad;
    }

    public JTextField getTextCargo() {
        return textCargo;
    }

    public void setTextCargo(JTextField textCargo) {
        this.textCargo = textCargo;
    }

    public JTextField getTextFecha() {
        return textFecha;
    }

    public void setTextFecha(JTextField textFecha) {
        this.textFecha = textFecha;
    }

    public JTextField getTextClasificacion() {
        return textClasificacion;
    }

    public void setTextClasificacion(JTextField textClasificacion) {
        this.textClasificacion = textClasificacion;
    }

    public JButton getBotonGuardar() {
        return botonGuardar;
    }

    public void setBotonGuardar(JButton botonGuardar) {
        this.botonGuardar = botonGuardar;
    }

    public JButton getBotonLimpiar() {
        return botonLimpiar;
    }

    public void setBotonLimpiar(JButton botonLimpiar) {
        this.botonLimpiar = botonLimpiar;
    }

    public JButton getBotonCancelar() {
        return botonCancelar;
    }

    public void setBotonCancelar(JButton botonCancelar) {
        this.botonCancelar = botonCancelar;
    }

    public VentanaCRUD getVentanaCRUD() {
        return ventanaCRUD;
    }

    public void setVentanaCRUD(VentanaCRUD ventanaCRUD) {
        this.ventanaCRUD = ventanaCRUD;
    }
    
}
