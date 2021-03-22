import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

class StudentForm extends JFrame implements ActionListener
{
    JLabel titleLabel, titleLabel2, namelabel, idlabel, genderlabel, doblabel, emaillabel;
    JTextField nametf, idtf, emailtf;
    JRadioButton male, female;
    JComboBox day, month, year;
    JCheckBox terms;
    JButton submit, show;
    JLabel msg;
    JTextArea screen;
    JTable table;
    JScrollPane scroll;
    DefaultTableModel model;
    String[] columns = {"Name", "ID No", "Gender", "Date of Birth", "Email"};
    String[] rows = new String[5];

    StudentForm()
    {
        //form
        setTitle("Student Information");
        setSize(840, 730);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        titleLabel = new JLabel("Student Information Form");
        titleLabel.setBounds(110, 15, 250, 50);
        c.add(titleLabel);
        titleLabel2 = new JLabel("Student Data");
        titleLabel2.setBounds(350, 15, 250, 50);
        c.add(titleLabel2);

        //name
        namelabel = new JLabel("Name:");
        namelabel.setBounds(10, 80, 140, 30);
        c.add(namelabel);
        nametf = new JTextField();
        nametf.setBounds(100, 80, 200, 30);
        c.add(nametf);

        //id
        idlabel = new JLabel("ID No:");
        idlabel.setBounds(10, 130, 150, 30);
        c.add(idlabel);
        idtf = new JTextField();
        idtf.setBounds(100, 130, 200, 30);
        c.add(idtf);

        //gender
        genderlabel = new JLabel("Gender:");
        genderlabel.setBounds(10, 180, 160, 30);
        c.add(genderlabel);
        male = new JRadioButton("Male");
        c.add(male);
        male.setBounds(100, 182, 80, 20);
        female = new JRadioButton("Female");
        female.setBounds(210, 182, 80, 20);
        c.add(female);
        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);

        //date of birth
        doblabel = new JLabel("Date of Birth:");
        doblabel.setBounds(10, 230, 170, 30);
        c.add(doblabel);

        String[] days = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] years = {"2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1995", "1994", "1993", "1992", "1991", "1990"};

        day = new JComboBox(days);
        month = new JComboBox(months);
        year = new JComboBox(years);

        day.setBounds(100, 232, 50, 20);
        month.setBounds(160, 232, 50, 20);
        year.setBounds(220, 232, 60, 20);

        c.add(day);
        c.add(month);
        c.add(year);

        //email
        emaillabel = new JLabel("Email");
        emaillabel.setBounds(10, 280, 190, 30);
        c.add(emaillabel);
        emailtf = new JTextField();
        emailtf.setBounds(110, 280, 200, 30);
        c.add(emailtf);

        //submit(write in file)
        submit = new JButton("Submit");
        submit.setBounds(150, 360, 80, 20);
        c.add(submit);
        submit.addActionListener(this);

        //read from file
        show = new JButton("Read");
        show.setBounds(240, 360, 80, 20);
        c.add(show);
        show.addActionListener(this);

        //show contet read from file
        screen = new JTextArea();
        c.add(screen);
        scroll = new JScrollPane(screen);
        scroll.setBounds(350, 50, 300, 300);
        c.add(scroll);

        //action performed(write/read)
        msg = new JLabel("");
        msg.setBounds(20, 400, 250, 20);
        c.add(msg);
        setVisible(true);

        //table for showing content read from file
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        table.setSelectionBackground(Color.GREEN);
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        scroll = new JScrollPane(table);
        scroll.setBounds(10, 420, 740, 265);
        c.add(scroll);
        show.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getActionCommand() == "Submit")
        {
            String name = nametf.getText();
            String id = idtf.getText();
            String gender;
            if (male.isSelected()) {
                gender = "male";
            } else {
                gender = "female";
            }
            String dob = day.getSelectedItem() + " " + month.getSelectedItem() + ", " + year.getSelectedItem();
            String email = emailtf.getText();

            try {
                FileWriter fw = new FileWriter("Student_information.txt", true);
                PrintWriter output = new PrintWriter(fw);
                output.println("Name: " + name + "\n" + "ID NO: " + id + "\n"
                        + "Gender: " + gender + "\n" + "Date Of Birth: " + dob + "\n" + "Email: " + email + "\n");
                output.close();
            } catch (Exception e) {
                System.exit(1);
            }
            msg.setText("Information added Successfully!");
        }
        else if (ae.getActionCommand() == "Read")
        {
            try {
                FileReader reader = new FileReader("Student_information.txt");
                BufferedReader br = new BufferedReader(reader);
                screen.read(br, null);
                br.close();
                screen.requestFocus();
            } catch (Exception e) {
                System.out.println(e);
            }
            msg.setText("Shown information readed from the file");
        }
    }

    public static void main(String[] args)
    {

        StudentForm frame = new StudentForm();
        frame.setVisible(true);
    }
}
