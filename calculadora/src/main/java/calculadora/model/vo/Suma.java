package calculadora.model.vo;

public class Suma {
    // Atributos
    private Double valor;

    // Constructor
    public Suma() {
        this.valor = 0.0;
    }

    // Metodos
    public String sumar(String valor1, String valor2) {   
        return Double.toString(Double.parseDouble(valor1) + Double.parseDouble(valor2));
    }

    // Metodos Getters and Setters
    public String getValor() {
        return valor.toString();
    }

    public void clearSuma() {
        this.valor = 0.0;
    }

    

    
}
