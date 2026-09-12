import javax.swing.*;

public class IssueBookFrame extends JFrame {

    IssueBookFrame() {

        setTitle("Issue Book");
        setSize(350,250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel l1 = new JLabel("Book ID");
        l1.setBounds(30,40,80,25);
        add(l1);

        JTextField id = new JTextField();
        id.setBounds(120,40,150,25);
        add(id);

        JLabel l2 = new JLabel("Student Name");
        l2.setBounds(30,90,100,25);
        add(l2);

        JTextField student = new JTextField();
        student.setBounds(120,90,150,25);
        add(student);

        JButton issue = new JButton("Issue");
        issue.setBounds(110,150,100,30);
        add(issue);

        issue.addActionListener(e -> {

            JOptionPane.showMessageDialog(null,
                    "Book Issued Successfully to "
                            + student.getText());

        });

        setVisible(true);
    }
}