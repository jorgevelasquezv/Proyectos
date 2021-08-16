package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class EventBotonesPanelInsertar implements ActionListener {
    // Atrubutos
    private PanelInsertar panelInsertar;

    // Constructor
    public EventBotonesPanelInsertar(PanelInsertar panelInsertar) {
        this.panelInsertar = panelInsertar;
    }

    //Metodos
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelInsertar.getBotonLimpiar()) {
            panelInsertar.limpiar();
        }

        if (e.getSource() == panelInsertar.getBotonCancelar()) {
            panelInsertar.getVentanaCRUD().getControl().mostrarPanelTabla(panelInsertar.getVentanaCRUD());
        }
          
        if (e.getSource() == panelInsertar.getBotonGuardar()) {

            Object [] datos = new Object [9];

            try {

                datos[0] = panelInsertar.getTextNombre().getText();
                datos[1] = panelInsertar.getTextPApellido().getText();
                datos[2] = panelInsertar.getTextSApellido().getText();
                datos[3] = Integer.parseInt(panelInsertar.getTextSalario().getText());
                datos[4] = panelInsertar.getTextCiudad().getText();
                datos[5] = panelInsertar.getTextCargo().getText();
                datos[6] = Integer.parseInt(panelInsertar.getTextClasificacion().getText());
                datos[7] = panelInsertar.getTextId().getText();
                datos[8] = panelInsertar.getTextFecha().getText(); 

                try {
                    Integer  rows = panelInsertar.getVentanaCRUD().getControl().insertarRequerimiento3(datos);
                    if (rows == 1) {
                        JOptionPane.showMessageDialog(null, "Lider ingresado correctamente", "Ingreso De Lideres", JOptionPane.INFORMATION_MESSAGE);
                        panelInsertar.getVentanaCRUD().getControl().mostrarPanelTabla(panelInsertar.getVentanaCRUD());
                    } else {
                        JOptionPane.showMessageDialog(null, "No se ingreso lider", "Ingreso De Lideres", JOptionPane.ERROR_MESSAGE);
                        panelInsertar.getVentanaCRUD().getControl().mostrarPanelTabla(panelInsertar.getVentanaCRUD());
                    }
                } catch (SQLException e1) {
                    JOptionPane.showMessageDialog(null, "No se admiten campos vacios", "Ingreso De Lideres", JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception e2) {
                JOptionPane.showMessageDialog(null, "No se admiten caracteres ni campos vacios en \ncampo salario y/o campo clasificacion ", "Ingreso De Lideres", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }

    
}
