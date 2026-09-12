import javax.swing.*;

public class AddBookFrame extends JFrame {


    AddBookFrame(){

        setTitle("Add Book");
        setSize(350,300);
        setLayout(null);
        setLocationRelativeTo(null);


        JTextField id=new JTextField();
        JTextField name=new JTextField();
        JTextField author=new JTextField();


        id.setBounds(120,40,150,25);
        name.setBounds(120,80,150,25);
        author.setBounds(120,120,150,25);


        add(new JLabel("Book ID")).setBounds(30,40,80,25);
        add(new JLabel("Name")).setBounds(30,80,80,25);
        add(new JLabel("Author")).setBounds(30,120,80,25);


        add(id);
        add(name);
        add(author);


        JButton save=new JButton("Save");
        save.setBounds(120,170,100,30);
        add(save);


        save.addActionListener(e->{

            Library.books.add(
                    new Book(id.getText(),
                            name.getText(),
                            author.getText()));

            JOptionPane.showMessageDialog(null,
                    "Book Added");

        });


        setVisible(true);

    }

}