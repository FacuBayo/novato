
import java.awt.event.*;
import javax.swing.*;

public class Suma extends JFrame implements ActionListener {

    private JLabel label1, label2, label3;
    private JTextField field1, field2;
    private JButton botonSumar;

    public Suma() {

        setLayout(null);

        this.label1 = new JLabel("Valor 1:");
        this.label1.setBounds(10, 5, 100, 30);
        add(label1);

        this.label2 = new JLabel("Valor 2:");
        this.label2.setBounds(10, 35, 100, 30);
        add(label2);

        this.label3 = new JLabel("Resultado:");
        this.label3.setBounds(120, 100, 100, 30);
        add(label3);
        
        this.field1 = new JTextField();
        this.field1.setBounds(70, 10, 100, 20);
        add(field1);
        
        this.field2 = new JTextField();
        this.field2.setBounds(70, 40, 100, 20);
        add(field2);
        
        this.botonSumar = new JButton("Sumar");
        this.botonSumar.setBounds(10, 100, 100, 30);
        this.botonSumar.addActionListener(this);
        add(botonSumar);

    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == this.botonSumar){
            int a = Integer.parseInt(this.field1.getText());
            int b = Integer.parseInt(this.field2.getText());
            int r = a + b;
            this.label3.setText("Resultado: " + r);
            this.field1.setText("");
            this.field2.setText("");
            
        }
    
    }
    
    public static void main(String[] args) {
        Suma suma1 = new Suma();
        suma1.setVisible(true);
        suma1.setBounds(0, 0, 300, 200);
        suma1.setResizable(false);
        suma1.setLocationRelativeTo(null);
    }
}
