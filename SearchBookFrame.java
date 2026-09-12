import javax.swing.*;

public class SearchBookFrame extends JFrame {

    SearchBookFrame() {

        setTitle("Search Book");
        setSize(350,250);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel l = new JLabel("Book Name");
        l.setBounds(20,40,100,25);
        add(l);

        JTextField name = new JTextField();
        name.setBounds(120,40,150,25);
        add(name);

        JTextArea result = new JTextArea();
        result.setBounds(20,90,280,80);
        add(result);

        JButton search = new JButton("Search");
        search.setBounds(100,180,100,30);
        add(search);

        search.addActionListener(e -> {

            result.setText("");

            for(Book b : Library.books){

                if(b.name.equalsIgnoreCase(name.getText())){

                    result.append("Book Found\n");
                    result.append("ID : "+b.id+"\n");
                    result.append("Author : "+b.author);

                    return;
                }

            }

            result.setText("Book Not Found");

        });

        setVisible(true);

    }

}