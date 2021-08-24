package calculadora.controller;

import java.util.ArrayList;

import calculadora.model.dao.OperacionDAO;
import calculadora.vista.VentanaPPAL;

public class Controlador {
    //Atributos 
    private OperacionDAO operaciones;

    //Constructor 
    public Controlador() {
        operaciones = new OperacionDAO();
    }

    public void mostrarCalculadora() {
        VentanaPPAL ventanaPPAL = new VentanaPPAL();
        ventanaPPAL.setVisible(true);
    }

    public String ejecutarOperaciones(ArrayList <String> listaOperaciones) {
        return operaciones.ejecutarOperaciones(listaOperaciones);
    }
}
