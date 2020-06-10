
import java.awt.event.*;
import javax.swing.*;

public class Boton extends JFrame implements ActionListener{
   
    JButton boton1;
    
    public Boton(){
        setLayout(null);
        boton1 = new JButton("Close");
        boton1.setBounds(100, 20, 100, 30);
        add(boton1);
        boton1.addActionListener(this); //Nos permite capturar la accion que hagamos en el boton
        
    }
    
    public void actionPerformed(ActionEvent a){ //Metodo sobreescrito que nos permite asignarle una accion al boton
        if(a.getSource() == boton1){
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        Boton prueba1 = new Boton();
        prueba1.setBounds(0, 0, 300, 300);
        prueba1.setVisible(true);
        prueba1.setLocationRelativeTo(null);
        prueba1.setResizable(true);
    }
    
}
