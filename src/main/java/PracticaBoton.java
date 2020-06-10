
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PracticaBoton extends JFrame implements ActionListener {

    private JButton boton1, boton2, boton3, botonClose;
    private JLabel label1;

    public PracticaBoton() {
        setLayout(null);

        label1 = new JLabel("En espera...");
        label1.setBounds(0, 0, 150, 50);
        add(label1);

        boton1 = new JButton("1");
        boton1.setBounds(10, 50, 100, 30);
        boton1.addActionListener(this);
        add(boton1);

        boton2 = new JButton("2");
        boton2.setBounds(115, 50, 100, 30);
        boton2.addActionListener(this);
        add(boton2);

        boton3 = new JButton("3");
        boton3.setBounds(220, 50, 100, 30);
        boton3.addActionListener(this);
        add(boton3);

        botonClose = new JButton("cerrar");
        botonClose.setBounds(115, 150, 100, 30);
        botonClose.addActionListener(this);
        add(botonClose);

    }

    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == boton1) {
            this.label1.setText("Presionó el boton 1");
        } else if (a.getSource() == boton2) {
            this.label1.setText("Presionó el boton 2");
        } else if (a.getSource() == boton3) {
            this.label1.setText("Presionó el boton 3");
        } else if (a.getSource() == botonClose) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        PracticaBoton formulario1 = new PracticaBoton();
        formulario1.setVisible(true);
        formulario1.setBounds(0, 0, 350, 250);
        formulario1.setLocationRelativeTo(null);
        formulario1.setResizable(true);

    }

}
