package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventBotonesCRUD implements ActionListener{
    // Atributos
    private VentanaCRUD ventanaCRUD ;
    private PanelTable tabla;

    //Constructores
    public EventBotonesCRUD(VentanaCRUD ventanaCRUD, PanelTable tabla) {
       
        this.ventanaCRUD = ventanaCRUD;
        this.tabla = tabla;
    }

    // Metodos
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == ventanaCRUD.getBotonLideres()) {
            String [] nombres = {"ID Lider", "Nombre", "Apellido", "Salario"};
            Object [][] campos;
            tabla.borrarTabla();

            try {
                // Su código
                var rqm1 = ventanaCRUD.getControl().consultarRequerimiento1();

                campos = new Object [rqm1.size()][4];

                for (int i = 0; i < rqm1.size(); i++) {
                    campos[i][0] = rqm1.get(i).getId_lider();
                    campos[i][1] = rqm1.get(i).getNombre();
                    campos[i][2] = rqm1.get(i).getPrimer_apellido();
                    campos[i][3] = rqm1.get(i).getSalario();
                }

                tabla.cargarTabla(nombres, campos);
            } catch (Exception e2) {
                System.out.println("Se ha producido el siguiente error:" + e2.getMessage());
                e2.printStackTrace();
            }    
        }
        
       if (e.getSource() == ventanaCRUD.getBotonMateriales()) {
            String [] nombres = {"ID Proyecto", "Material"};
            Object [][] campos;
            tabla.borrarTabla();

            try {
                // Su código
                var rqm2 = ventanaCRUD.getControl().consultarRequerimiento2();

                campos = new Object [rqm2.size()][2];

                for (int i = 0; i < rqm2.size(); i++) {
                    campos[i][0] = rqm2.get(i).getId_proyecto();
                    campos[i][1] = rqm2.get(i).getNombre_material();
                }

                tabla.cargarTabla(nombres, campos);
            } catch (Exception e2) {
                System.out.println("Se ha producido el siguiente error:" + e2.getMessage());
                e2.printStackTrace();
            }
       }

       if (e.getSource() == ventanaCRUD.getBotonInsertar()) {
           ventanaCRUD.getControl().mostarPanelInsertar(ventanaCRUD);
        }
    }
}
