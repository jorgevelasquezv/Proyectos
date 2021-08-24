package calculadora.model.vo;

public class Division {
    // Atributos
    private Double valor;

    // Constructor
    public Division() {
        this.valor = 0.0;
    }

    // Metodos
    public String dividir(String valor1, String valor2) {
        return Double.toString(Double.parseDouble(valor1) / Double.parseDouble(valor2));
    }

    // Metodos Getters and Setters
    public String getValor() {
        return valor.toString();
    }

    public void clearDivision() {
        this.valor = 0.0;
    }

}
