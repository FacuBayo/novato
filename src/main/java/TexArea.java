//Practica de un JTextArea con barra de  Scroll
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TexArea extends JFrame implements ActionListener{
    
    private JTextField field1;
    private JTextArea area1;
    private JScrollPane scroll1;
    
    
    public TexArea(){
        setLayout(null);
        this.field1 = new JTextField();
        this.field1.setBounds(10, 10, 200, 30);
        add(field1);
        
        this.area1 = new JTextArea();
         
        this.scroll1 = new JScrollPane(this.area1);
        this.scroll1.setBounds(10, 50, 490, 490);
        add(scroll1);
        
        
    }
    
    
    
    
    public static void main(String[] args) {
        TexArea ventana = new TexArea();
        ventana.setVisible(true);
        ventana.setBounds(0, 0, 500, 500);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
