
import java.awt.event.*;
import javax.swing.*;

public class JTextFieldTest extends JFrame implements ActionListener {

    private JTextField text1, text2;
    private JButton boton1, boton2;
    private JLabel label1, label2;

    public JTextFieldTest() {
        setLayout(null);

        //User
        text1 = new JTextField();
        text1.setBounds(120, 17, 150, 20);
        add(text1);

        //Password
        text2 = new JTextField();
        text2.setBounds(120, 47, 150, 20);
        add(text2);

        //Log in button
        boton1 = new JButton("Log in");
        boton1.setBounds(10, 80, 100, 30);
        boton1.addActionListener(this);
        add(boton1);

        //Close button
        boton2 = new JButton("Close");
        boton2.setBounds(150, 80, 100, 30);
        boton2.addActionListener(this);
        add(boton2);

        //User indicatoracceso exitoso
        label1 = new JLabel("User");
        label1.setBounds(10, 10, 100, 30);
        add(label1);

        //Password indicator
        label2 = new JLabel("Password");
        label2.setBounds(10, 47, 100, 30);
        add(label2);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            if(text1.getText().equals("admin") && text2.getText().equals("admin")){
                setTitle("Successful login");
            } else {
                setTitle("Access denied");
            }
        } else if (e.getSource() == boton2) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        JTextFieldTest test1 = new JTextFieldTest();
        test1.setVisible(true);
        test1.setBounds(0, 0, 300, 150);
        test1.setLocationRelativeTo(null);
        test1.setResizable(false);

    }

}
