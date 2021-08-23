package calculadora.model.vo;

public class Division {
    // Atributos
    private Double valor;
    private int contador;

    // Constructor
    public Division() {
        this.valor = 0.0;
    }

    // Metodos
    public void dividir(String valor) {
        if (this.contador == 0) {
            this.valor = Double.parseDouble(valor);
            this.contador ++;
        }else{
            // Pendiente error de division por zero
            this.valor = this.valor / Double.parseDouble(valor);
        }
    }

    // Metodos Getters and Setters
    public String getValor() {
        return valor.toString();
    }

    public void clearDivision() {
        this.valor = 0.0;
        this.contador = 0;
    }

}
