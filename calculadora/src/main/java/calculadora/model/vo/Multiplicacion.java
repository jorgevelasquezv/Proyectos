package calculadora.model.vo;

public class Multiplicacion {
    // Atributos
    private Double valor;
    private int contador;

    // Constructor
    public Multiplicacion() {
        this.valor = 0.0;
        this.contador = 0;
    }

    // Metodos
    public void multiplicar(String valor) {
        if (this.contador == 0) {
            this.valor = Double.parseDouble(valor);
            this.contador ++;
        }else{
            this.valor = this.valor * Double.parseDouble(valor);
        }
    }

    // Metodos Getters and Setters
    public String getValor() {
        return valor.toString();
    }

    public void clearMultiplicacion() {
        this.valor = 0.0;
        this.contador = 0;
    }

}
