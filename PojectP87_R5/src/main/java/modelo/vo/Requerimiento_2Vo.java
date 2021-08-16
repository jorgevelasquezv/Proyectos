package modelo.vo;

public class Requerimiento_2Vo {
    // Su código
    // Atributos
    private Integer id_proyecto;
    private String nombre_material;

    //Constructor
    public Requerimiento_2Vo() {
        //Vacio
    }

    public Requerimiento_2Vo(Integer id_proyecto, String nombre_material) {
        this.id_proyecto = id_proyecto;
        this.nombre_material = nombre_material;
    }

    //Metodos
    public Integer getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(Integer id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getNombre_material() {
        return nombre_material;
    }

    public void setNombre_material(String nombre_material) {
        this.nombre_material = nombre_material;
    }
    
}
