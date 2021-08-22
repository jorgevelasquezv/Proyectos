package calculadora.model.vo;

public class Suma {
    // Atributos
    private Double valor;

    // Constructor
    public Suma() {
        this.valor = 0.0;
    }

    // Metodos
    public void sumar(String valor , String valor2) {
        this.valor = Double.parseDouble(valor) + Double.parseDouble(valor2);
    }

    // Metodos Getters and Setters
    public String getValor() {
        return valor.toString();
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    

    
}
