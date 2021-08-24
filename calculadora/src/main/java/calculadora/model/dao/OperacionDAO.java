package calculadora.model.dao;

import calculadora.model.vo.Division;
import calculadora.model.vo.Multiplicacion;
import calculadora.model.vo.Resta;
import calculadora.model.vo.Suma;

import java.util.ArrayList;

public class OperacionDAO {
    // Atributos
    private Suma suma;
    private Resta resta;
    private Multiplicacion multiplicacion;
    private Division division;

    //Constructor
    public OperacionDAO() {
        suma = new Suma();
        resta = new Resta();
        multiplicacion = new Multiplicacion();
        division = new Division();
    }

    public String ejecutarOperaciones(ArrayList <String> listaOperaciones){
        String acumulador = "", auxiliar = "", operador = "";

        for (String valor : listaOperaciones) {
            if (valor.equals("+")) {
                operador = "+";
            }else if(valor.equals("-")){
                operador = "-";
            }else if(valor.equals("*")){
                operador = "*";
            }else if(valor.equals("/")){
                operador = "/";
            }else if(auxiliar.equals("")){
                auxiliar = valor;
            }else if(!auxiliar.equals("")){
                acumulador = valor;
                auxiliar = operacion(operador, auxiliar, acumulador);
            }
        }
        acumulador = auxiliar;
        clearOperaciones();
        return acumulador;
    }
    
    public String operacion(String operador, String auxiliar, String acumulador) {
        if (operador.equals("+")) {
            return suma.sumar(auxiliar, acumulador);
        } else if(operador.equals("-")){
            return resta.restar(auxiliar, acumulador);
        }else if(operador.equals("*")){
            return multiplicacion.multiplicar(auxiliar, acumulador);
        }else if(operador.equals("/")){
            return division.dividir(auxiliar, acumulador);
        }
        return "";
    }

    public void clearOperaciones() {
        suma.clearSuma();
        resta.clearResta();
        multiplicacion.clearMultiplicacion();
        division.clearDivision();
    }
}
