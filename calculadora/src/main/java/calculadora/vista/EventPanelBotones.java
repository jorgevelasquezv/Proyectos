package calculadora.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class EventPanelBotones implements ActionListener{
    //Atributo 
    private JButton [] arrayBotones;
    private PanelBotones panelBotones;

    public EventPanelBotones(JButton [] arrayBotones, PanelBotones panelBotones) {
        this.arrayBotones = arrayBotones;
        this.panelBotones = panelBotones;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == arrayBotones[0] || e.getSource() == arrayBotones[1] || e.getSource() == arrayBotones[2] || e.getSource() == arrayBotones[4] ||e.getSource() == arrayBotones[5] || e.getSource() == arrayBotones[6] || e.getSource() == arrayBotones[8] || e.getSource() == arrayBotones[9] || e.getSource() == arrayBotones[10] || e.getSource() == arrayBotones[12]) {
            // 7 8 9 4 5 6 1 2 3 0          

            for (JButton jButton : arrayBotones) {
                if (e.getSource() == jButton) {
                    panelBotones.cargarDisplay(jButton.getText());
                }
            }
        }
        
        if (e.getSource() == arrayBotones[3]) {
            // C
            panelBotones.borrarDisplay();
        }

        if (e.getSource() == arrayBotones[7]) {
            // +
            panelBotones.suma();
        }

        if (e.getSource() == arrayBotones[11]) {
            // -
            panelBotones.resta();
        }

        if (e.getSource() == arrayBotones[13]) {
            // .
            
        }

        if (e.getSource() == arrayBotones[14]) {
            // /
            panelBotones.division();
        }

        if (e.getSource() == arrayBotones[15]) {
            // *
            panelBotones.multiplicacion();
        }
    }
    
}
