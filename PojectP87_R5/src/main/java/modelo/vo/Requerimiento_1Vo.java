package modelo.vo;

public class Requerimiento_1Vo {
    // Su código
    //Argumentos
    private Integer id_lider;
    private String nombre;
    private String primer_apellido;
    private Integer salario;
    
    //Constructores
    public Requerimiento_1Vo() {
        //Vacio
    }

    public Requerimiento_1Vo(Integer id_lider, String nombre, String primer_apellido, Integer salario) {
        this.id_lider = id_lider;
        this.nombre = nombre;
        this.primer_apellido = primer_apellido;
        this.salario = salario;
    }
  
    //Metodos
   
    public Integer getId_lider() {
        return id_lider;
    }

    public void setId_lider(Integer id_lider) {
        this.id_lider = id_lider;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }
 
}
