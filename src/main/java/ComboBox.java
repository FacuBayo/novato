
import java.awt.event.*;
import javax.swing.*;

public class ComboBox extends JFrame implements ItemListener {

    private JComboBox box1;

    public ComboBox() {
        setLayout(null);
        this.box1 = new JComboBox();
        this.box1.setBounds(10, 10, 80, 20);
        this.box1.addItem("Rojo");
        this.box1.addItem("Azul");
        this.box1.addItem("Amarillo");
        this.box1.addItem("Negro");
        this.box1.addItemListener(this);
        add(box1);
    }
    
    public void itemStateChanged(ItemEvent e){
        if(e.getSource() == this.box1){
            
            //Selecciona la palabra que se haya elegido en el combo box y //la guarda en la variable "color".
            String color = this.box1.getSelectedItem().toString(); 
            setTitle(color);
        }                                                          
    }
    
    public static void main(String[] args) {
        ComboBox box1 = new ComboBox();
        box1.setVisible(true);
        box1.setBounds(0, 0, 300, 400);
        box1.setResizable(false);
        box1.setLocationRelativeTo(null);
    }
}
