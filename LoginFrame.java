import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {

    JTextField user;
    JPasswordField pass;

    LoginFrame() {

        setTitle("Library Management System - Login");
        setSize(400,300);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel title = new JLabel("Library Management System");
        title.setBounds(80,20,250,30);
        title.setFont(new Font("Arial",Font.BOLD,16));
        add(title);

        JLabel u = new JLabel("Username:");
        u.setBounds(50,80,100,25);
        add(u);

        user = new JTextField();
        user.setBounds(150,80,150,25);
        add(user);


        JLabel p = new JLabel("Password:");
        p.setBounds(50,120,100,25);
        add(p);

        pass = new JPasswordField();
        pass.setBounds(150,120,150,25);
        add(pass);


        JButton login = new JButton("Login");
        login.setBounds(130,170,100,30);
        add(login);


        login.addActionListener(e->{

            String username=user.getText();
            String password=String.valueOf(pass.getPassword());


            if(username.equals("admin") && password.equals("1234"))
            {
                new Dashboard();
                dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null,
                        "Invalid Login");
            }

        });


        setVisible(true);
    }
}