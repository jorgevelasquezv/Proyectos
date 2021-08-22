package calculadora.model.vo;

public class Resta {
    // Atributos
    private Double valor;

    // Constructor
    public Resta() {
        this.valor = null;      
    }

    // Metodos
    public void restar(String valor) {
        if (this.valor == null) {
            this.valor = Double.parseDouble(valor);
        }else{
            this.valor = this.valor - Double.parseDouble(valor);
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
