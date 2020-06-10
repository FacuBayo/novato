

import javax.swing.*;

public class InterfazGrafica extends JFrame {

    private JLabel label1;
    private JLabel label2;

    public InterfazGrafica() {
        setLayout(null); //Sirve para coloar las coordenadas de los elemnetos que agregemos
        label1 = new JLabel("Interfaces gráficas");
        label1.setBounds(10, 20, 200, 300);
        add(label1);
        label2 = new JLabel("Ver 1.0");
        label2.setBounds(1, 400, 100, 100);
        add(label2);
        
    }
    
    public static void main(String[] args) {
        InterfazGrafica formulario1 = new InterfazGrafica();
        formulario1.setBounds(0, 0, 500, 500);      //Establece coordenadas y tamaño
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);    //Centra la ventana al medio de la pantalla
        formulario1.setResizable(true);            //Restrige cambiar el tamaño de la ventana
    }

}
