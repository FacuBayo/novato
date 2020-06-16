
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TextAreaYButton extends JFrame implements ActionListener {

    private JTextArea area;
    private JButton boton, botonCerrar;
    private JTextField field;
    private JScrollPane scroll;
    private String texto = "";

    public TextAreaYButton() {
        //Scroll + textArea
        setLayout(null);
        this.area = new JTextArea();
        this.scroll = new JScrollPane(this.area);
        this.scroll.setBounds(10, 50, 300, 300);
        add(scroll);

        this.field = new JTextField();
        this.field.setBounds(10, 10, 200, 30);
        add(field);

        this.boton = new JButton("Add");
        this.boton.setBounds(220, 10, 100, 30);
        this.boton.addActionListener(this);
        add(boton);
        
        this.botonCerrar = new JButton("Close");
        this.botonCerrar.setBounds(310, 320, 70, 30);
        this.botonCerrar.addActionListener(this);
        add(botonCerrar);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.boton){
            this.texto += this.field.getText() + "\n";
            this.area.setText(texto);
            this.field.setText("");
        }
        
        else if(e.getSource() == this.botonCerrar){
            System.exit(0);
        }
            
    }

    public static void main(String[] args) {
        TextAreaYButton test = new TextAreaYButton();
        test.setVisible(true);
        test.setBounds(0, 0, 400, 500);
        test.setLocationRelativeTo(null);
    }
}
