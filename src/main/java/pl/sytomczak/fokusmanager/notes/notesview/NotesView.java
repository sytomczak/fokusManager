package pl.sytomczak.fokusmanager.notes.notesview;

import pl.sytomczak.fokusmanager.calender.CalenderView;
import pl.sytomczak.fokusmanager.dbutils.DBConnection;

import javax.swing.*;
import java.sql.Connection;

public class NotesView extends JFrame {
    private JTextArea notesArea;
    private JPanel notesJPanel;


    public NotesView() {

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Notes");
        setContentPane(notesJPanel);
        CalenderView calenderView = new CalenderView();
    }
//    public static void main(String[] args) {
////        NotesView notesView = new NotesView();
////        notesView.setVisible(true);
//
//        CalenderView calenderView = new CalenderView();
//
        //    Connection connection = DBConnection.getConnection();


}
