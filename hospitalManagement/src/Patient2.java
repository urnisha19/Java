import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Patient2 extends JFrame implements ActionListener {
    private Container c;
    
    private JLabel id,firstName,lastName,age,gender,maritalStatus,address,phoneNo,city,patientType,bloodGroup,wardNo;
    private JTextField patient_id_tf,firstName_tf,lastName_tf,age_tf,address_tf,phoneNo_tf,city_tf,patientType_tf,wardNo_tf;
    private JComboBox gender_cb,maritalStatus_cb,bloodGroup_cb;
    private JButton submitButton,readButton,clearButton;
    private JTable table;
    private DefaultTableModel model;
    private JScrollPane scroll;
    private String [] person = {"Male","Female","Others"};
    private String [] marriage = {"Married","Unmarried"};
    private String[] blood = {"A+","O+","B+","AB+","A-","O-","B-","AB-"};
    private String []columns ={"Patient ID","First name","Last name","Age","Address","Gender",
       "Marital Status","Phone No","City","Patient Type","Blood Group","Ward No"};
    private String[]rows = new String[12];
    
    Patient2()
    {
        initComponents();
    }
    public void initComponents()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(50,20,1300,700);
        this.setTitle("Patient");
        
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.green);
        
        
        
        id = new JLabel("Patient ID");
        id.setBounds(50,30,100,100);
        c.add(id);
        
        patient_id_tf = new JTextField();
        patient_id_tf.setBounds(130,45,300,50);
        c.add(patient_id_tf);
        
        
        firstName = new JLabel("First name ");
        firstName.setBounds(40,80,100,100);
        c.add(firstName);
        
        firstName_tf = new JTextField();
        firstName_tf.setBounds(130,105,300,50);
        c.add(firstName_tf);
        
        
        lastName = new JLabel("Last name");
        lastName.setBounds(40,140,100,100);
        c.add(lastName);
        
        lastName_tf = new JTextField();
        lastName_tf.setBounds(130,165,300,50);
        c.add(lastName_tf);
        
        
        age = new JLabel("Age");
        age.setBounds(70,190,100,100);
        c.add(age);
        
        age_tf = new JTextField();
        age_tf.setBounds(130,220,300,50);
        c.add(age_tf);
        
        
        address = new JLabel("Address");
        address.setBounds(50,250,100,100);
        c.add(address);
        
        address_tf = new JTextField();
        address_tf.setBounds(130,275,300,50);
        c.add(address_tf);
        
       
        gender = new JLabel("Gender");
        gender.setBounds(50,330,100,100);
        c.add(gender);
        
        gender_cb = new JComboBox(person);
        gender_cb.setBounds(130,350,100,50);
        c.add(gender_cb);
        
        
        maritalStatus = new JLabel("Marital Status ");
        maritalStatus.setBounds(480,30,100,100);
        c.add(maritalStatus);
        
        maritalStatus_cb = new JComboBox(marriage);
        maritalStatus_cb.setBounds(600,60,180,40);
        c.add(maritalStatus_cb);
        
        
        phoneNo = new JLabel("Phone No");
        phoneNo.setBounds(497,90,100,100);
        c.add(phoneNo);
        
        phoneNo_tf = new JTextField();
        phoneNo_tf.setBounds(601,110,300,50);
        c.add(phoneNo_tf);
        
         
        city = new JLabel("City ");
        city.setBounds(520,140,100,100);
        c.add(city);
        
        city_tf = new JTextField();
        city_tf.setBounds(601,170,300,50);
        c.add(city_tf);
        
        
        patientType = new JLabel("Patient Type ");
        patientType.setBounds(480,200,100,100);
        c.add(patientType);
        
        patientType_tf = new JTextField();
        patientType_tf.setBounds(601,230,300,50);
        c.add(patientType_tf);
        
       
        bloodGroup = new JLabel("Blood Group ");
        bloodGroup.setBounds(480,260,100,100);
        c.add(bloodGroup);
        
        bloodGroup_cb = new JComboBox(blood);
        bloodGroup_cb.setBounds(601,290,300,50);
        c.add(bloodGroup_cb);
        
       
        wardNo = new JLabel("Ward No ");
        wardNo.setBounds(497,320,100,100);
        c.add(wardNo);
        
        wardNo_tf = new JTextField();
        wardNo_tf.setBounds(601,350,300,50);
        c.add(wardNo_tf);
        
        
        submitButton = new JButton("Submit");
        submitButton.setBounds(1000,45,100,50);
        submitButton.setBackground(Color.blue);
        submitButton.setForeground(Color.white);
        c.add(submitButton);
        
        
        readButton = new JButton("Read");
        readButton.setBounds(1000,145,100,50);
        readButton.setBackground(Color.blue);
        readButton.setForeground(Color.white);
        c.add(readButton);
        
        
        clearButton = new JButton("Clear");
        clearButton.setBounds(1000,245,100,50);
        clearButton.setBackground(Color.blue);
        clearButton.setForeground(Color.white);
        c.add(clearButton);
        
        
        clearButton.addActionListener(this);
        submitButton.addActionListener(this);
        readButton.addActionListener(this);
        
        
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        table.setSelectionBackground(Color.lightGray);
        table.setBackground(Color.white);
        table.setRowHeight(30);
        
        scroll = new JScrollPane(table);
        scroll.setBounds(20,450,1240,170);
        c.add(scroll);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
       
          if(ae.getSource()== clearButton)
        {
           patient_id_tf.setText("");
           firstName_tf.setText("");
           lastName_tf.setText("");
           age_tf.setText("");
           gender_cb.setSelectedItem("");
           maritalStatus_cb.setSelectedItem("");
           address_tf.setText("");
           phoneNo_tf.setText("");
           city_tf.setText("");
           patientType_tf.setText("");
           bloodGroup_cb.setSelectedItem("");
           wardNo_tf.setText("");
           
        }
          
         if(ae.getSource()== submitButton)
          {
         
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("patient.txt",true));
          
            bw.write("\n");
            bw.write(patient_id_tf.getText());
            bw.write(","+firstName_tf.getText());
            bw.write(","+lastName_tf.getText());
            bw.write(","+age_tf.getText());
            bw.write(","+address_tf.getText());
            bw.write(","+gender_cb.getSelectedItem());
            bw.write(","+ maritalStatus_cb.getSelectedItem());
            bw.write(","+phoneNo_tf.getText());
            bw.write(","+city_tf.getText());
            bw.write(","+patientType_tf.getText());
            bw.write(","+bloodGroup_cb.getSelectedItem());
            bw.write(","+wardNo_tf.getText());
            
            bw.close();
            
              }catch(Exception e){
                
                 e.printStackTrace();
              }
          }
         
         if(ae.getSource() == readButton)
         {
              try {
                  
                  BufferedReader br =  new BufferedReader(new FileReader("patient.txt"));
                  DefaultTableModel model = (DefaultTableModel)table.getModel();
                  Object[] tableLines = br.lines().toArray();
                  
                  for(int i=0; i< tableLines.length;i++){
                      String line = tableLines[i].toString().trim();
                      String[]dataRow = line.split(",");
                      table.getColumnModel().getColumn(0).setPreferredWidth(21);
                      table.getColumnModel().getColumn(1).setPreferredWidth(60);
                      table.getColumnModel().getColumn(2).setPreferredWidth(60);
                      table.getColumnModel().getColumn(3).setPreferredWidth(21);
                      table.getColumnModel().getColumn(4).setPreferredWidth(60);
                      table.getColumnModel().getColumn(5).setPreferredWidth(21);
                      table.getColumnModel().getColumn(6).setPreferredWidth(21);
                      table.getColumnModel().getColumn(7).setPreferredWidth(70);
                      table.getColumnModel().getColumn(8).setPreferredWidth(21);
                      table.getColumnModel().getColumn(9).setPreferredWidth(21);
                      table.getColumnModel().getColumn(10).setPreferredWidth(21);
                      table.getColumnModel().getColumn(11).setPreferredWidth(21);
                      model.addRow(dataRow);
                      
                  }
              } catch (FileNotFoundException ex) {
                
              } catch (IOException ex) {
                 
              }
            
         }
         
    }
    public static void main(String[] args) {
        Patient2 frame = new Patient2();
        frame.setVisible(true);
    }
  
}