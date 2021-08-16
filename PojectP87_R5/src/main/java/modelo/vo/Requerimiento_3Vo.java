package modelo.vo;

public class Requerimiento_3Vo {
    // Su código
    // Atributos
    private Integer id_proyecto;
    private String ciudad;
    private String nombre_lider;

    // Constructores
    public Requerimiento_3Vo() {
        //Vacio
    }

    public Requerimiento_3Vo(Integer id_proyecto, String ciudad, String nombre_lider) {
        this.id_proyecto = id_proyecto;
        this.ciudad = ciudad;
        this.nombre_lider = nombre_lider;
    }

    //Metodos
    public Integer getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(Integer id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombre_lider() {
        return nombre_lider;
    }

    public void setNombre_lider(String nombre_lider) {
        this.nombre_lider = nombre_lider;
    }
}
