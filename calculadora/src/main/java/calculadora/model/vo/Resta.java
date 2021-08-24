package calculadora.model.vo;

public class Resta {
    // Atributos
    private Double valor;

    // Constructor
    public Resta() {
        this.valor = 0.0;      
    }

    // Metodos
    public String restar(String valor1, String valor2) {
        return Double.toString(Double.parseDouble(valor1) - Double.parseDouble(valor2));
    }

    // Metodos Getters and Setters
    public String getValor() {
        return valor.toString();
    }

    public void clearResta() {
        this.valor = 0.0;
    }

}
