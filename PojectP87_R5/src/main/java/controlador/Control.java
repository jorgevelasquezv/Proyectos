package controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import modelo.dao.Requerimiento_1Dao;
import modelo.dao.Requerimiento_2Dao;
import modelo.dao.Requerimiento_3Dao;
import modelo.vo.Requerimiento_1Vo;
import modelo.vo.Requerimiento_2Vo;
import vista.VentanaCRUD;
import vista.VentanaPPAL;

public class Control {
    // Su código

    public ArrayList<Requerimiento_1Vo> consultarRequerimiento1() throws SQLException {
        // Su código
        return new Requerimiento_1Dao().requerimiento1();

    }

    public ArrayList<Requerimiento_2Vo> consultarRequerimiento2() throws SQLException {
        // Su código
        return new Requerimiento_2Dao().requerimiento2();
    }

    public Integer insertarRequerimiento3(Object [] datos) throws SQLException {
        
        return new Requerimiento_3Dao().requerimiento3(datos);
    }

    public void mostrarVentanaPPAL() {
        VentanaPPAL vPrincipal = new VentanaPPAL();
        vPrincipal.setVisible(true);
    }

    public void mostrarVentanaCRUD(VentanaPPAL ventanaPPAL) {
        VentanaCRUD formulario = new VentanaCRUD(); 
        formulario.setVisible(true);
        ventanaPPAL.dispose();
        
    }

    public void mostarPanelInsertar(VentanaCRUD ventanaCRUD) {
        ventanaCRUD.verPanelInsertar();
    }

    public void mostrarPanelTabla(VentanaCRUD ventanaCRUD) {
        ventanaCRUD.verPanelTabla();  
    }


}
