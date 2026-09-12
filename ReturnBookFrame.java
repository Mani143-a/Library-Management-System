import javax.swing.*;

public class ReturnBookFrame extends JFrame {

    ReturnBookFrame() {

        setTitle("Return Book");
        setSize(300,220);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel l = new JLabel("Book ID");
        l.setBounds(30,50,80,25);
        add(l);

        JTextField id = new JTextField();
        id.setBounds(100,50,120,25);
        add(id);

        JButton btn = new JButton("Return");
        btn.setBounds(90,120,100,30);
        add(btn);

        btn.addActionListener(e -> {

            JOptionPane.showMessageDialog(null,
                    "Book Returned Successfully");

        });

        setVisible(true);
    }
}