
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MenuBar extends JFrame implements ActionListener {

    private JMenuBar barra1;
    private JMenu menu1, menu2;
    private JMenuItem rojo, verde, azul;

    public MenuBar() {
        setLayout(null);

        this.barra1 = new JMenuBar();
        setJMenuBar(barra1);

        this.menu1 = new JMenu("Opciones");
        barra1.add(menu1);
        
        this.menu2 = new JMenu("Tamaño");
        barra1.add(menu2);

        this.rojo = new JMenuItem("Rojo");
        this.menu1.add(rojo);
        this.rojo.addActionListener(this);

        this.verde = new JMenuItem("Verde");
        this.menu1.add(verde);
        this.verde.addActionListener(this);

        this.azul = new JMenuItem("Azul");
        this.menu1.add(azul);
        this.azul.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Container fondo = this.getContentPane();
        if (e.getSource() == this.rojo) {
            fondo.setBackground(Color.red);
        }
        if (e.getSource() == this.verde) {
            fondo.setBackground(Color.green);
        }

        if (e.getSource() == this.azul) {
            fondo.setBackground(Color.blue);
            
        }
    }

    public static void main(String[] args) {
        MenuBar m1 = new MenuBar();
        m1.setVisible(true);
        m1.setBounds(0, 0, 400, 300);
        m1.setLocationRelativeTo(null);
    }
}
