package calculadora.model.vo;

public class Multiplicacion {
    // Atributos
    private Double valor;

    // Constructor
    public Multiplicacion() {
        this.valor = 0.0;
    }

    // Metodos
    public void multiplicar(String valor) {
        this.valor = this.valor * Double.parseDouble(valor);
    }

    // Metodos Getters and Setters
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
