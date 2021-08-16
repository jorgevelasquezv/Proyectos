package vista;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class PanelTable extends JPanel{
    //Atributos
    private JTable tabla;
    private JScrollPane scroll; 
    private DefaultTableModel plantilla;
    
    
    public PanelTable() {

        plantilla = new DefaultTableModel();

        tabla = new JTable(plantilla);
        scroll = new JScrollPane(tabla);
        add(scroll);

    }

    public void cargarTabla(String [] nombres, Object [][] filas) {

        for (String nombre : nombres) {
            plantilla.addColumn(nombre);
        }

        for (Object[] fila : filas) {
            plantilla.addRow(fila);
        }
    }

    public void borrarTabla() {
        plantilla.setRowCount(0);
        plantilla.setColumnCount(0);
    }

}

