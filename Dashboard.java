import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {

    Dashboard() {

        setTitle("Library Dashboard");
        setSize(600,400);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4,2,15,15));

        JButton add = new JButton("Add Book");
        JButton delete = new JButton("Delete Book");
        JButton issue = new JButton("Issue Book");
        JButton ret = new JButton("Return Book");
        JButton search = new JButton("Search Book");
        JButton view = new JButton("View Books");
        JButton logout = new JButton("Logout");

        add(add);
        add(delete);
        add(issue);
        add(ret);
        add(search);
        add(view);
        add(logout);

        add.addActionListener(e -> new AddBookFrame());
        delete.addActionListener(e -> new DeleteBookFrame());
        issue.addActionListener(e -> new IssueBookFrame());
        ret.addActionListener(e -> new ReturnBookFrame());
        search.addActionListener(e -> new SearchBookFrame());
        view.addActionListener(e -> new ViewBooksFrame());

        logout.addActionListener(e -> {

            dispose();
            new LoginFrame();

        });

        setVisible(true);

    }

}