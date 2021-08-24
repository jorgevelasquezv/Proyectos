package calculadora.model.vo;

public class Multiplicacion {
    // Atributos
    private Double valor;

    // Constructor
    public Multiplicacion() {
        this.valor = 0.0;
    }

    // Metodos
    public String multiplicar(String valor1, String valor2) {
        return Double.toString(Double.parseDouble(valor1) * Double.parseDouble(valor2));
    }

    // Metodos Getters and Setters
    public String getValor() {
        return valor.toString();
    }

    public void clearMultiplicacion() {
        this.valor = 0.0;
    }

}
