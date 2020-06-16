
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rgb extends JFrame implements ActionListener {

    private JLabel label1, label2, label3;
    private JComboBox box1, box2, box3;
    private JButton boton;

    public Rgb() {
        setLayout(null);

        this.label1 = new JLabel("Rojo");
        this.label1.setBounds(10, 10, 100, 30);
        add(label1);

        this.label2 = new JLabel("Verde");
        this.label2.setBounds(10, 60, 100, 30);
        add(label2);

        this.label3 = new JLabel("Azul");
        this.label3.setBounds(10, 110, 100, 30);
        add(label3);

        this.box1 = new JComboBox();
        this.box1.setBounds(120, 10, 75, 30);
        for (int i = 0; i <= 255; i++) {
            this.box1.addItem(String.valueOf(i));
        }
        add(box1);

        this.box2 = new JComboBox();
        this.box2.setBounds(120, 60, 75, 30);
        for (int i = 0; i <= 255; i++) {
            this.box2.addItem(String.valueOf(i));
        }
        add(box2);

        this.box3 = new JComboBox();
        this.box3.setBounds(120, 110, 75, 30);
        for (int i = 0; i <= 255; i++) {
            this.box3.addItem(String.valueOf(i));
        }
        add(box3);
        
        this.boton = new JButton("Aplicar");
        this.boton.setBounds(30, 165, 100, 30);
        this.boton.addActionListener(this);
        add(boton);
    }
    
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == boton) {
            String box1 = this.box1.getSelectedItem().toString();
            String box2 = this.box2.getSelectedItem().toString();
            String box3 = this.box3.getSelectedItem().toString();
            
            int rojo = Integer.parseInt(box1);
            int verde = Integer.parseInt(box2);
            int azul = Integer.parseInt(box3);
            
            Color color1 = new Color(rojo, verde, azul);
            
            this.boton.setBackground(color1);
            
        }
    }

    public static void main(String[] args) {
        Rgb box1 = new Rgb();
        box1.setVisible(true);
        box1.setBounds(0, 0, 300, 250);
        box1.setResizable(false);
        box1.setLocationRelativeTo(null);
        
    }

    
}
