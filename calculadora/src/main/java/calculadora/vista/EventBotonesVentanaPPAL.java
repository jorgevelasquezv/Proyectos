package calculadora.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventBotonesVentanaPPAL implements ActionListener{
    // Atributos
    private VentanaPPAL ventanaPPAL;
    
    public EventBotonesVentanaPPAL(VentanaPPAL ventanaPPAL) {
        this.ventanaPPAL = ventanaPPAL;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ventanaPPAL.getBtnResultado()) {
            ventanaPPAL.resultado();
        }
        
    }
    

}
