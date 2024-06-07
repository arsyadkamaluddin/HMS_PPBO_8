
import config.DbConnect;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public final class roomDetails extends JFrame {
    ResultSet rs=null; 
    Statement statement=null;
    DbConnect con=null;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JScrollPane jScrollPane1;
    private JButton jb1;
    private JTable tb1;
    private JTextField tf1;


    public roomDetails() throws SQLException  {
        initComponents();
        
        con=new DbConnect();
        statement=con.getConnection().createStatement();
        
    update_table();
    
    }
    void update_table() throws SQLException
    {
    
rs=statement.executeQuery("SELECT * FROM room");   
tb1.setModel(DbUtils.resultSetToTableModel(rs));
    }
    private void initComponents() {

        jScrollPane1 = new JScrollPane();
        tb1 = new JTable();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        tf1 = new JTextField();
        jb1 = new JButton();
        jButton3 = new JButton();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("ROOMS");
        setAlwaysOnTop(true);

        tb1.setModel(new DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kamar", "Tipe", "Ranjang", "Sewa", "Status"
            }
        ));
        jScrollPane1.setViewportView(tb1);

        jButton1.setBackground(new Color(0, 0, 0));
        jButton1.setFont(new Font("Tahoma", 0, 14));
        jButton1.setForeground(new Color(0, 204, 204));
        jButton1.setText("Kembali");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new Color(0, 0, 0));
        jButton2.setFont(new Font("Tahoma", 0, 14));
        jButton2.setForeground(new Color(0, 204, 204));
        jButton2.setText("keluar");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new Font("Arial", 1, 24));
        jLabel1.setText("DETAIL KAMAR");

        jLabel2.setFont(new Font("Tahoma", 1, 12));
        jLabel2.setForeground(new Color(0, 153, 153));
        jLabel2.setText("Masukkan nomor kamar");

        tf1.setFont(new Font("Tahoma", 0, 12));

        jb1.setBackground(new Color(0, 0, 0));
        jb1.setFont(new Font("Tahoma", 0, 14));
        jb1.setForeground(new Color(0, 204, 204));
        jb1.setText("Cari");
        jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new Color(0, 0, 0));
        jButton3.setFont(new Font("Tahoma", 0, 14));
        jButton3.setForeground(new Color(0, 204, 204));
        jButton3.setText("Semua");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf1, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jb1)
                        .addGap(34, 34, 34)
                        .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb1)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        pack();
    }

    private void jb1ActionPerformed(ActionEvent evt) {

        try{
String query="SELECT * FROM room WHERE room_no='"+ tf1.getText()+"'";
ResultSet rs=statement.executeQuery(query); 
DefaultTableModel model = (DefaultTableModel) tb1.getModel();
model.setRowCount(0);
while(rs.next())  
            { 
               model.addRow(new Object[]{rs.getString(1),rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5)});
            }
}
            catch(Exception e)
            {
                System.out.println(e);
            }  
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
System.exit(0);     
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
home o=new home();
                    o.setVisible(true);
                   o.setLocation(this.getX(),this.getY());
                   this.dispose();      
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
         try {     
             update_table();
         } catch (SQLException ex) {
             Logger.getLogger(roomDetails.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    
    public static void main(String args[])throws Exception 
    {

       
        try {
            
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(roomDetails.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(roomDetails.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(roomDetails.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(roomDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(() -> {
            try {
                new roomDetails().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(roomDetails.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    
}
