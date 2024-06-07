import config.DbConnect;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.Timer;


public class Booking extends JFrame {
 ResultSet rs=null; 
long ph = 0;
     Statement statement=null;
       DbConnect con=null;
       PreparedStatement pstmt=null;
   int emp=0,flag;
   Timer t1,t2,t3,t4,t5,t6,t7,t8;
   String date = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
   private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JRadioButton jRadioButton3;
    private JRadioButton jRadioButton4;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JTextField jTextField5;
    private JTextField jTextField6;
    private JTextField jTextField7;
    public Booking() throws SQLException {
                        initComponents();
                        jTextField5.setEditable(false);

                         jTextField6.setText(date);
                          jTextField6.setEditable(false);

                        con=new DbConnect();
                        statement=con.getConnection().createStatement();
                       emp=0;
                       t1 = new Timer(3000, new ActionListener() {

                            
                            public void actionPerformed(ActionEvent e) {
                                jLabel10.setText(null);
                                jLabel11.setText(null);
                               
                            }
                        });
                         t2 = new Timer(3000, new ActionListener() {

                            
                            public void actionPerformed(ActionEvent e) {
                                jTextField1.setText(null);
                                 jTextField1.setBackground(Color.white);
                                      jTextField1.setForeground(Color.BLACK);
                            }
                        });
                         t3 = new Timer(3000, new ActionListener() {

                            
                            public void actionPerformed(ActionEvent e) {
                                jTextField2.setText(null);
                                    jTextField2.setBackground(Color.white);
                                      jTextField2.setForeground(Color.BLACK);
                            }
                        });
                         t4 = new Timer(3000, new ActionListener() {

                            
                            public void actionPerformed(ActionEvent e) {
                                jTextField3.setText(null);
                                    jTextField3.setBackground(Color.white);
                                      jTextField3.setForeground(Color.BLACK);
                            }
                        });
                         t5 = new Timer(3000, new ActionListener() {

                            
                            public void actionPerformed(ActionEvent e) {
                                jTextField4.setText(null);
                                    jTextField4.setBackground(Color.white);
                                      jTextField4.setForeground(Color.BLACK);
                            }
                        });
                         t6= new Timer(3000, new ActionListener() {

                            
                            public void actionPerformed(ActionEvent e) {
                                jTextField5.setText(null);
                                    jTextField5.setBackground(Color.white);
                                      jTextField5.setForeground(Color.BLACK);
                            }
                        }); 
                          t7 = new Timer(3000, new ActionListener() {

                            
                            public void actionPerformed(ActionEvent e) {
                                jTextField6.setText(null);
                                    jTextField6.setBackground(Color.white);
                                      jTextField6.setForeground(Color.BLACK);
                            }
                        });
                           t8 = new Timer(3000, new ActionListener() {

                            
                            public void actionPerformed(ActionEvent e) {
                                jTextField7.setText(null);
                                    jTextField7.setBackground(Color.white);
                                      jTextField7.setForeground(Color.BLACK);
                            }
                        });
    }

    private void initComponents() {

        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jLabel5 = new JLabel();
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jLabel6 = new JLabel();
        jRadioButton3 = new JRadioButton();
        jRadioButton4 = new JRadioButton();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jTextField4 = new JTextField();
        jTextField5 = new JTextField();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jTextField6 = new JTextField();
        jButton3 = new JButton();
        jLabel9 = new JLabel();
        jTextField7 = new JTextField();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BOOKING INI");

        jLabel1.setFont(new Font("Tahoma", 2, 12));
        jLabel1.setText("Nama");

        jLabel2.setFont(new Font("Tahoma", 2, 12));
        jLabel2.setText("Alamat");

        jLabel3.setFont(new Font("Tahoma", 2, 12));
        jLabel3.setText("Telepon");

        jLabel4.setFont(new Font("Tahoma", 2, 12));
        jLabel4.setText("Masuk");

        jTextField1.setFont(new Font("Tahoma", 2, 14));

        jTextField2.setFont(new Font("Tahoma", 2, 14));

        jTextField3.setFont(new Font("Tahoma", 2, 14));

        jLabel5.setFont(new Font("Tahoma", 2, 12));
        jLabel5.setText("Tipe Kamar");

        jRadioButton1.setFont(new Font("Tahoma", 0, 12));
        jRadioButton1.setText("AC");
        jRadioButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new Font("Tahoma", 0, 12));
        jRadioButton2.setText("NON-AC");
        jRadioButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new Font("Tahoma", 2, 12));
        jLabel6.setText("Ranjang");

        jRadioButton3.setFont(new Font("Tahoma", 0, 12));
        jRadioButton3.setText("Single");
        jRadioButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setFont(new Font("Tahoma", 0, 12));
        jRadioButton4.setText("Double");
        jRadioButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new Font("Tahoma", 2, 12));
        jLabel7.setText("id customer ");

        jLabel8.setFont(new Font("Tahoma", 2, 12));
        jLabel8.setText("Kamar");

        jTextField4.setFont(new Font("Tahoma", 2, 14));

        jTextField5.setFont(new Font("Tahoma", 2, 14));

        jButton1.setBackground(new Color(0, 0, 0));
        jButton1.setFont(new Font("Tahoma", 0, 13));
        jButton1.setForeground(new Color(0, 204, 204));
        jButton1.setText("BOOKING");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new Color(0, 0, 0));
        jButton2.setFont(new Font("Tahoma", 0, 13));
        jButton2.setForeground(new Color(0, 204, 204));
        jButton2.setText("BATAL");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField6.setFont(new Font("Tahoma", 2, 14));
        jTextField6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new Color(0, 0, 0));
        jButton3.setFont(new Font("Tahoma", 0, 13));
        jButton3.setForeground(new Color(0, 204, 204));
        jButton3.setText("<< cek");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new Font("Tahoma", 2, 12));
        jLabel9.setText("Uang Muka");

        jTextField7.setFont(new Font("Tahoma", 2, 14));

        jLabel10.setFont(new Font("Dialog", 1, 14));
        jLabel10.setForeground(new Color(255, 0, 0));
        jLabel10.setHorizontalAlignment(SwingConstants.RIGHT);

        jLabel11.setFont(new Font("Dialog", 1, 14));
        jLabel11.setForeground(new Color(255, 0, 0));
        jLabel11.setHorizontalAlignment(SwingConstants.RIGHT);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3, GroupLayout.Alignment.TRAILING)
                            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jRadioButton1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton3, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton4))
                            .addComponent(jTextField6, GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField4, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addComponent(jTextField5)
                                .addComponent(jTextField7)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23)))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jTextField7)))
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
home o=new home();
                    o.setVisible(true);
                   o.setLocation(this.getX(),this.getY());
                   this.dispose();          
    }

    private void jRadioButton1ActionPerformed(ActionEvent evt) {
       jRadioButton2.setSelected(false);
    }

    private void jRadioButton2ActionPerformed(ActionEvent evt) {
  jRadioButton1.setSelected(false);        
    }

    private void jRadioButton3ActionPerformed(ActionEvent evt) {
  jRadioButton4.setSelected(false);        
    }

    private void jRadioButton4ActionPerformed(ActionEvent evt) {
  jRadioButton3.setSelected(false);   
    }
    String roomtype()
{
    if(jRadioButton1.isSelected())
        return "AC";
    else
        return "NON-AC";
}
 String bedno()
{
    if(jRadioButton3.isSelected())
        return "1";
    else
        return "2";
}
 void isAnyFieldEmpty(int sf)
 {
     emp=0;
     int x=0,y=0,z=0,x1=0,y1=0,z1=0;
     String s="harus diisi";
     if(jTextField1.getText().length()==0 || jTextField1.getText().equals(s)){
         if(sf==0){
         jTextField1.setText("harus diisi");
         jTextField1.setBackground(Color.LIGHT_GRAY);
        jTextField1.setForeground(Color.RED);
          t2.setRepeats(false);
                         t2.start();
         }
        emp=1;
     }
        if(jTextField2.getText().length()==0 || jTextField2.getText().equals(s)){
            if(sf==0){
         jTextField2.setText("harus diisi");
         jTextField2.setBackground(Color.LIGHT_GRAY);
        jTextField2.setForeground(Color.RED);
          t3.setRepeats(false);
                         t3.start();
            }
        emp=1;
        }
        if(jTextField3.getText().length()==0 || jTextField3.getText().equals(s)){
            if(sf==0){
         jTextField3.setText("harus diisi");
         jTextField3.setBackground(Color.LIGHT_GRAY);
        jTextField3.setForeground(Color.RED);
           JOptionPane.showMessageDialog(null,"Telepon Invalid: harus diisi");
          t4.setRepeats(false);
                         t4.start();
            }
       emp=1;
       x1=1;
        }
        if(jTextField4.getText().length()==0 || jTextField4.getText().equals(s)){
            if(sf==0){
         jTextField4.setText("harus diisi");
             jTextField4.setBackground(Color.LIGHT_GRAY);
        jTextField4.setForeground(Color.RED);
          JOptionPane.showMessageDialog(null,"Customer ID: harus diisi");
          t5.setRepeats(false);
                         t5.start();
            }
       emp=1;
       y1=1;
        }
        if(jTextField7.getText().length()==0){
            z1=1;
        }
          if(sf==0){
        if(jTextField5.getText().length()==0 || jTextField5.getText().equals(s)){
          
         jTextField5.setText("harus diisi");
         jTextField5.setBackground(Color.LIGHT_GRAY);
        jTextField5.setForeground(Color.RED);
           t6.setRepeats(false);
                         t6.start();
        emp=1;
    }
          }
        if(jRadioButton1.isSelected()==false && jRadioButton2.isSelected()==false){
            if(sf==0){
            jLabel10.setText("pilih >>");
            t1.setRepeats(false);
                         t1.start();
            }
           emp=1;  
        }
          if(jRadioButton3.isSelected()==false && jRadioButton4.isSelected()==false){
              if(sf==0){
            jLabel11.setText("pilih >>");
            t1.setRepeats(false);
                         t1.start();
              }
           emp=1;  
        }
          if(sf==0){
          try{
              if(x1==0){
                ph=Long.parseLong(jTextField3.getText());}
                }
                catch (NumberFormatException e){
                     x=1;
                     emp=1;
                    }

           try{
               if(y1==0){
               int cust=Integer.parseInt(jTextField4.getText());}
                }
                catch (NumberFormatException e){
                  y=1;
                  emp=1;
                }
           
           try{
               if(z1==0){
               int ad=Integer.parseInt(jTextField7.getText());}
                }
                catch (NumberFormatException e){
                      z=1;
                      emp=1;
                }
          }
          if(x==1 && y==1 && z==1){
                JOptionPane.showMessageDialog(null,"Telepon \nID\nUang muka\nHANYA BISA DIISI ANGKA");
             t4.setRepeats(false);
                         t4.start();
                          t5.setRepeats(false);
                        t5.start();
                         t8.setRepeats(false);
                         t8.start();    
          }
        else  if(x==1 && y==1 ){
                JOptionPane.showMessageDialog(null,"Telepon \nID\nHANYA BISA DIISI ANGKA");
           t4.setRepeats(false);
                         t4.start();
                          t5.setRepeats(false);
                        t5.start();           
        }
         else  if(y==1 && z==1 ){
                JOptionPane.showMessageDialog(null,"ID\nUang muka\nHANYA BISA DIISI ANGKA");
           
                          t5.setRepeats(false);
                        t5.start();
                         t8.setRepeats(false);
                         t8.start();      
        }
          else  if(x==1 && z==1 ){
                JOptionPane.showMessageDialog(null,"Telepon\nUang muka\nHANYA BISA DIISI ANGKA");
         t4.setRepeats(false);
                         t4.start();
                         
                         t8.setRepeats(false);
                         t8.start();      
        }
        else  if(x==1 ){
                JOptionPane.showMessageDialog(null,"Telepon Salah");
                 t4.setRepeats(false);
                         t4.start();
                      
          }
       else   if(y==1){
                JOptionPane.showMessageDialog(null," ID HANYA BISA DIISI ANGKA");
                 
                          t5.setRepeats(false);
                        t5.start();
                      
          }
       else if( z==1){
                JOptionPane.showMessageDialog(null," UANG MUKA TIDAK VALID");
                
                         t8.setRepeats(false);
                         t8.start();
          }
          
            }
        
        


    private void jButton1ActionPerformed(ActionEvent evt) {
        isAnyFieldEmpty(0);
        
        if(emp==0)
  {
        try{  
        int exp=0;
String q="SELECT room_no FROM room WHERE room_type='"+roomtype()+"' AND no_of_bed="+bedno()+" AND room_status='available';";
String q1 = "INSERT INTO cust_details(cust_id,name,address,phone,check_in,room_no) VALUES(?,?,?,?,?,?);";
String q2 = "INSERT INTO adv_payment(cust_id,paid) VALUES(?,?);";

    rs=statement.executeQuery(q); 
PreparedStatement preparedStatement = con.getConnection().prepareStatement(q1);
PreparedStatement preparedStatement1 = con.getConnection().prepareStatement(q2);
if(rs.next())  
            { 
         
              preparedStatement.clearParameters();
              
                preparedStatement.setString(1, jTextField4.getText());
                preparedStatement.setString(2, jTextField1.getText());
                preparedStatement.setString(3, jTextField2.getText());
                
                 preparedStatement.setLong(4, ph);
                preparedStatement.setString(5,jTextField6.getText());
                 preparedStatement.setInt(6, rs.getInt(1));
                 
                flag=0;
                 if(jTextField7.getText().length()>0) 
                 {
                 preparedStatement1.setString(1, jTextField4.getText());     
                 preparedStatement1.setInt(2, Integer.parseInt(jTextField7.getText()));    
                  flag=1;
                 }
                
                try {
                    preparedStatement.executeUpdate();
                    if(flag==1){
                    preparedStatement1.executeUpdate();
                    }
                     } 
               
                catch (SQLException e) {  
                   
                        JOptionPane.showMessageDialog(null, e.getMessage());
                     jTextField4.setBackground(Color.LIGHT_GRAY);
                    jTextField4.setForeground(Color.red);
                     t5.setRepeats(false);
                         t5.start();
                    exp=1;
                }
            }
            if(exp==0){
            statement.executeUpdate("UPDATE room SET room_status='unavailable' WHERE room_no="+jTextField5.getText()+";");
            JOptionPane.showMessageDialog(null, "Reservasi Sukses!");
           home o=new home();
                    o.setVisible(true);
                   o.setLocation(this.getX(),this.getY());
                   this.dispose();
    }
   con.getConnection().close();
 
    }                                  
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
    }
  }
    }

    private void jTextField6ActionPerformed(ActionEvent evt) {
      
    }

    private void jButton3ActionPerformed(ActionEvent evt) {

        try{  
            isAnyFieldEmpty(1);
    if(emp==0)
    {
        
String q="SELECT room_no FROM room WHERE room_type='"+roomtype()+"' AND no_of_bed="+bedno()+" AND room_status='available';";
ResultSet rs1=statement.executeQuery(q);     
if(rs1.next()){
             jTextField5.setText(rs1.getString(1));
jRadioButton1.setEnabled(false);
jRadioButton2.setEnabled(false);
jRadioButton3.setEnabled(false);
jRadioButton4.setEnabled(false);
        
        }

else{
                    jTextField6.setText("Tidak ada kamar yang tersedia");
                    jTextField6.setBackground(Color.LIGHT_GRAY);
                    jTextField6.setForeground(Color.red);
}
   con.getConnection().close();
    }
    else{
         JOptionPane.showMessageDialog(null,"Isi semua data terlebih dahulu!");
    }
    }
catch(Exception e)
    {
        e.printStackTrace();
         JOptionPane.showMessageDialog(null,e);
    }

    }

    
   
    public static void main(String args[]) {
        
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Booking().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    
}
