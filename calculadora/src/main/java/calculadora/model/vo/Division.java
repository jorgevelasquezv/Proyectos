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
        if (this.valor == null) {
            this.valor = Double.parseDouble(valor);
        }else{
            // Pendiente error de division por zero
            this.valor = this.valor / Double.parseDouble(valor);
        }
    }

    // Metodos Getters and Setters
    public String getValor() {
        return valor.toString();
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
