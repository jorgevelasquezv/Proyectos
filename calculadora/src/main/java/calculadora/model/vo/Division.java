package calculadora.model.vo;

public class Division {
    // Atributos
    private Double valor;

    // Constructor
    public Division() {
        this.valor = 0.0;
    }

    // Metodos
    public void dividir(String valor) {
        this.valor = this.valor / Double.parseDouble(valor);
    }

    // Metodos Getters and Setters
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
