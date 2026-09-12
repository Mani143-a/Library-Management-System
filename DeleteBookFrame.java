import javax.swing.*;

public class DeleteBookFrame extends JFrame{


    DeleteBookFrame(){

        setTitle("Delete Book");
        setSize(300,200);
        setLayout(null);


        JTextField id=new JTextField();
        id.setBounds(100,40,120,25);
        add(id);


        JButton btn=new JButton("Delete");
        btn.setBounds(100,90,100,30);
        add(btn);


        btn.addActionListener(e->{

            Library.books.removeIf(
                    b->b.id.equals(id.getText()));

            JOptionPane.showMessageDialog(null,
                    "Book Deleted");

        });


        setVisible(true);

    }

}