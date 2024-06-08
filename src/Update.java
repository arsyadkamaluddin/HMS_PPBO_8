
import config.DbConnect;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.proteanit.sql.DbUtils;
import javax.swing.*;

public class Update extends javax.swing.JFrame {

  ResultSet rs=null; 
     Statement statement=null;
        DbConnect con=null;
        PreparedStatement pstmt=null;
        Timer t1,t2=null;
        int flag1=0,flag2=0,flag3,count=1;
        private JButton jButton1;
        private JButton jButton2;
        private JButton jButton3;
        private JButton jButton4;
        private JLabel jLabel1;
        private JLabel jLabel2;
        private JLabel jLabel3;
        private JLabel jLabel4;
        private JLabel jLabel5;
        private JLabel jLabel6;
        private JLabel jLabel7;
        private JLabel jLabel8;
        private JLabel jLabel9;
        private JPanel jPanel1;
        private JPanel jPanel2;
        private JRadioButton jRadioButton1;
        private JRadioButton jRadioButton2;
        private JRadioButton jRadioButton3;
        private JRadioButton jRadioButton4;
        private JScrollPane jScrollPane1;
        private JTextField jTextField1;
        private JTextField jTextField2;
        private JTextField jTextField3;
        private JTextField jTextField4;
        private JTextField jTextField5;
        private JTable tb1;
    public Update() throws SQLException {
        initComponents();
        
        con=new DbConnect();
        statement=con.getConnection().createStatement();
        jTextField5.setEditable(false);
        t1= new Timer(3000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel1.setText(null);
                jLabel9.setText(null);
                
            }
        });
         t2= new Timer(3000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               jTextField1.setText(null);
                
            }
        });
           update_table();
    }
    void update_table() throws SQLException
    {
    rs=statement.executeQuery("SELECT * FROM CUST_DETAILS");   
    tb1.setModel(DbUtils.resultSetToTableModel(rs));
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perbarui Detail Pelanggan");

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton2.setForeground(new java.awt.Color(0, 204, 204));
        jButton2.setText("KELUAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton3.setForeground(new java.awt.Color(0, 204, 204));
        jButton3.setText("BATAL / KEMBALI");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)), "Ubah Kamar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 14), new java.awt.Color(255, 255, 255)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); 
        jLabel7.setText("Jumlah tempat tidur");

        jTextField5.setFont(new java.awt.Font("Dialog", 1, 18)); 

        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 13));
        jRadioButton3.setText("Single");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 13));
        jRadioButton2.setText("NON-AC");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 13));
        jRadioButton1.setText("AC");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 13));
        jRadioButton4.setText("Double");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13));
        jLabel6.setText("Tipe Kamar");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 13));
        jLabel8.setText("Kamar Baru yang Dialokasikan:");

        jButton4.setFont(new java.awt.Font("Dialog", 1, 14));
        jButton4.setForeground(new java.awt.Color(51, 153, 255));
        jButton4.setText("Ubah");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 3, 14));
        jLabel9.setForeground(new java.awt.Color(51, 102, 205));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jRadioButton4))
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addComponent(jRadioButton1)
                                .addGap(53, 53, 53)
                                .addComponent(jRadioButton2)))
                        .addGap(0, 127, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton3)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 102)), "personal details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 14), new java.awt.Color(255, 255, 255)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13));
        jLabel5.setText("Alamat");

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14));
        jButton1.setForeground(new java.awt.Color(51, 153, 255));
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13));
        jLabel4.setText("TELEPON");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13));
        jLabel3.setText("NAMA");

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 14));
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13));

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CUST ID", "NAMA", "TELEPON", "ALAMAT", "CHECK-IN", "NO. KAMAR"
            }
        ));
        tb1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tb1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
jRadioButton2.setSelected(false);
    }

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
     jRadioButton1.setSelected(false);
    }

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {
     jRadioButton4.setSelected(false);
    }

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {
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
int getRoom()
{
 try{  
String q="select room_no from room where room_type='"+roomtype()+"' AND NO_OF_BED="+bedno()+" AND ROOM_STATUS='AVAILABLE';";
ResultSet rs1=statement.executeQuery(q);     
if(rs1.next())
            return rs1.getInt(1);
else
              
                 return 0;
    }                                        
catch(Exception e)
    {
         JOptionPane.showMessageDialog(null,e);
    }
      return 0;
    }
void isCustidPresent()
{
    flag3=0;
    if(jTextField1.getText().length()==0)
        flag3=1;
}
void checkEmpty1()
{
      flag1=0;
     
        if(jTextField2.getText().length()==0 && jTextField3.getText().length()==0 && jTextField4.getText().length()==0) {
            flag1=1;
        }
      
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
                String q1="SELECT CUST_ID FROM CUST_DETAILS WHERE CUST_ID='"+jTextField1.getText()+"'";
                String q2="UPDATE CUST_DETAILS SET NAME='"+jTextField2.getText()+"' WHERE CUST_ID='"+jTextField1.getText()+"'";
                String q3="UPDATE CUST_DETAILS SET PHONE='"+jTextField3.getText()+"' WHERE CUST_ID='"+jTextField1.getText()+"'";
                String q4="UPDATE CUST_DETAILS SET ADDRESS='"+jTextField4.getText()+"' WHERE CUST_ID='"+jTextField1.getText()+"'";
   isCustidPresent();             
   checkEmpty1();             
   try{
       if(flag3==0)
       {
       
                                                rs=statement.executeQuery(q1);     
                                                if(rs.next())
                                                {
                                                    if(flag1==0)
                                                    {
                                                       

                                                                                                                       if(jTextField2.getText().length()>0)
                                                                                                                       {
                                                                                                                               statement.executeUpdate(q2);
                                                                                                                               jLabel1.setText("update successful !");
                                                                                                                                try {
                                                                                                                    update_table();
                                                                                                                } catch (SQLException ex) {
                                                                                                                    Logger.getLogger(oldCustDetails.class.getName()).log(Level.SEVERE, null, ex);
                                                                                                                }
                                                                                                                               t1.setRepeats(false);
                                                                                                                                t1.start();
                                                                                                                       }      
                                                                                                                       if(jTextField3.getText().length()>0)
                                                                                                                       {
                                                                                                                           int f=1;
                                                                                                                           try{
                                                                                                                               statement.executeUpdate(q3);
                                                                                                                           } catch(Exception e){
                                                                                                                                   JOptionPane.showMessageDialog(null,"HARAP MASUKKAN NOMOR TELEPON YANG VALID.");
                                                                                                                                   f=0;
                                                                                                                           }
                                                                                                                           if(f==1)
                                                                                                                                 jLabel1.setText("update successful !");
                                                                                                                                  try {
                                                                                                                    update_table();
                                                                                                                } catch (SQLException ex) {
                                                                                                                    Logger.getLogger(oldCustDetails.class.getName()).log(Level.SEVERE, null, ex);
                                                                                                                }
                                                                                                                                 t1.setRepeats(false);
                                                                                                                                t1.start();
                                                                                                                       } 
                                                                                                                       if(jTextField4.getText().length()>0)
                                                                                                                       {
                                                                                                                               statement.executeUpdate(q4);
                                                                                                                                 jLabel1.setText("update successful !");
                                                                                                                               try {
                                                                                                                    update_table();
                                                                                                                } catch (SQLException ex) {
                                                                                                                    Logger.getLogger(oldCustDetails.class.getName()).log(Level.SEVERE, null, ex);
                                                                                                                }

                                                                                                                                 t1.setRepeats(false);
                                                                                                                                t1.start();
                                                                                                                       } 
                                                }         
                                                     else {
             jLabel1.setText("Tidak ada yang diperbarui. Masukkan sesuatu untuk diperbarui!");
                          t1.setRepeats(false);
                         t1.start();

       }
                                                }
                                                else
                                                {
                                                    jTextField1.setText("Cust-Id tidak ada !");
                                                    jTextField1.setBackground(Color.LIGHT_GRAY);
                                                               jTextField1.setForeground(Color.RED);
                                                                   t2.setRepeats(false);
                                                                   t2.start();     
                                                          jTextField1.setBackground(Color.WHITE);   
                                                           jTextField1.setForeground(Color.BLACK);
                                                }
             
      
    }
       else{
             JOptionPane.showMessageDialog(null,"HARAP MASUKKAN CUSTOMER-ID.");
       }
   }
    catch(Exception e){
        e.printStackTrace();
    System.out.print(e);
}

    }
    
void checkempty2()
{
    flag2=0;
    if(jRadioButton1.isSelected()==false && jRadioButton2.isSelected()==false && jRadioButton3.isSelected()==false && jRadioButton4.isSelected()==false){
flag2=1;        
    }
     if(jRadioButton1.isSelected()==false && jRadioButton2.isSelected()==false ){
         flag2=1;
}
     if(jRadioButton3.isSelected()==false && jRadioButton4.isSelected()==false ){
         flag2=1;
}
} 
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {


String q0="SELECT CUST_ID FROM CUST_DETAILS WHERE CUST_ID='"+jTextField1.getText()+"'";
String q1="SELECT ROOM_NO FROM ROOM WHERE ROOM_TYPE='"+roomtype()+"' AND NO_OF_BED="+bedno()+" AND ROOM_STATUS='AVAILABLE';";
String q2="SELECT ROOM_NO FROM CUST_DETAILS WHERE CUST_ID='"+jTextField1.getText()+"'";
String q3="UPDATE ROOM SET ROOM_STATUS='AVAILABLE' WHERE ROOM_NO IN ("+q2+");";
 isCustidPresent();    
checkempty2();
  try{ 
      if(count<=2)
      {
      if(flag3==0){
      if(flag2==0)
      {
        rs=statement.executeQuery(q0);     
             if(rs.next())
             {
ResultSet rs1=statement.executeQuery(q1);     
if(rs1.next()){
                int r=rs1.getInt(1);
              statement.executeUpdate(q3);
               statement.executeUpdate("UPDATE CUST_DETAILS SET ROOM_NO="+r+" WHERE CUST_ID='"+jTextField1.getText()+"';");
               statement.executeUpdate("(\"UPDATE ROOM SET ROOM_STATUS='unavailable' WHERE ROOM_NO="+r+";");
      
             jTextField5.setText(String.valueOf(r));
            jLabel9.setText("Kamar berhasil diubah!");
           
            count++;  
               try {
             update_table();
         } catch (SQLException ex) {
             Logger.getLogger(oldCustDetails.class.getName()).log(Level.SEVERE, null, ex);
         }
            t1.setRepeats(false);
                         t1.start();
             jTextField5.setForeground(java.awt.Color.RED);
             
             
}      
else{
 jTextField5.setText("Tidak ada Kamar yang Tersedia.");
  jTextField5.setBackground(java.awt.Color.GRAY);
jTextField5.setForeground(java.awt.Color.red);

}
             }
              else
             {
                 jTextField1.setText("Cust-Id tidak ada !");
                 jTextField1.setBackground(Color.LIGHT_GRAY);
                            jTextField1.setForeground(Color.RED);
                                t2.setRepeats(false);
                                t2.start();     
                                  jTextField1.setBackground(Color.WHITE);   
                        jTextField1.setForeground(Color.BLACK);
             }
      }
      else{
          jLabel9.setText("Harap pilih semua opsi.!");
                          t1.setRepeats(false);
                         t1.start();
      }
    }  
  else{
             JOptionPane.showMessageDialog(null,"HARAP MASUKKAN CUSTOMER-ID.");
       }
  }
      else{
          JOptionPane.showMessageDialog(null,"TIDAK BISA MENGUBAH KAMAR LEBIH DARI DUA KALI.");
      }
  }    
catch(Exception e)
    {
         JOptionPane.showMessageDialog(null,e);
    }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
      home o=new  home();
        o.setVisible(true);
        o.setLocation(this.getX(),this.getY());
        this.dispose();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
     System.exit(0);
    }
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Update().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }   
}