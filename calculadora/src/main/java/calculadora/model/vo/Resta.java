package calculadora.model.vo;

public class Resta {
    // Atributos
    private Double valor = null;

    // Constructor
    public Resta() {
        this.valor = 0.0;      
    }

    // Metodos
    public void restar(String valor) {
        this.valor = this.valor - Double.parseDouble(valor);
    }

    // Metodos Getters and Setters
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
