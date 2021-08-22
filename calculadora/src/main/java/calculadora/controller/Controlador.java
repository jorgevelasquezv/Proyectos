package calculadora.controller;

import calculadora.model.vo.Division;
import calculadora.model.vo.Multiplicacion;
import calculadora.model.vo.Resta;
import calculadora.model.vo.Suma;
import calculadora.vista.VentanaPPAL;

public class Controlador {
    //Atributos 
    private Suma suma;
    private Resta resta;
    private Multiplicacion multiplicacion;
    private Division division;

    //Constructor 
    public Controlador() {
        suma = new Suma();
        resta = new Resta();
        multiplicacion = new Multiplicacion();
        division = new Division();
    }

    public void mostrarCalculadora() {
        VentanaPPAL ventanaPPAL = new VentanaPPAL();
        ventanaPPAL.setVisible(true);
    }

    public String sumar(String valor) {
        suma.sumar(valor); 
        return suma.getValor();   
    }

    public String restar(String valor) {
        resta.restar(valor); 
        return resta.getValor();  
    }

    public String multiplicar(String valor) {
        multiplicacion.multiplicar(valor);
        return multiplicacion.getValor(); 
    }

    public String dividir(String valor) {
        division.dividir(valor);
        return division.getValor();
    }

    public void borrarSuma() {
        suma.setValor(0.0);
    }

}
