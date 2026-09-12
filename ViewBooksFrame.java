import javax.swing.*;

public class ViewBooksFrame extends JFrame {


    ViewBooksFrame(){

        setTitle("All Books");
        setSize(400,300);
        setLocationRelativeTo(null);


        JTextArea area=new JTextArea();

        for(Book b:Library.books)
        {
            area.append(
                    b.id+"  "+
                            b.name+"  "+
                            b.author+"\n");
        }


        add(new JScrollPane(area));

        setVisible(true);

    }

}