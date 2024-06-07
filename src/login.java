
import config.DbConnect;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.*;
import javax.swing.*;

public class login extends JFrame {
    ResultSet rs = null;
    Statement statement = null;
    DbConnect con = null;
    PreparedStatement pstmt = null;
    Timer t = null;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel l4;
    private JPasswordField p1;
    private JTextField t1;

    public login() throws SQLException {
        initComponents();
        t = new Timer(2000, new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                t1.setText(null);
                t1.setBackground(Color.WHITE);

                p1.setText(null);
                p1.setBackground(Color.WHITE);

                l4.setText(null);
                l4.setBackground(Color.WHITE);
            }
        });
        con = new DbConnect();
        statement = con.getConnection().createStatement();
    }

    private void initComponents() {

        jLabel1 = new JLabel();
        t1 = new JTextField();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jButton1 = new JButton();
        p1 = new JPasswordField();
        l4 = new JLabel();
        jButton2 = new JButton();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Autentikasi");
        setAlwaysOnTop(true);
        setFont(new Font("Agency FB", 0, 18));

        jLabel1.setFont(new Font("Times New Roman", 3, 31));
        jLabel1.setText("Sistem Management Hotel");

        t1.setFont(new Font("Tahoma", 1, 12));

        jLabel2.setFont(new Font("Tahoma", 2, 18));
        jLabel2.setForeground(new Color(0, 153, 204));
        jLabel2.setText("username:");

        jLabel3.setFont(new Font("Tahoma", 2, 18));
        jLabel3.setForeground(new Color(0, 153, 204));
        jLabel3.setText("Password:");

        jButton1.setBackground(new Color(0, 0, 0));
        jButton1.setFont(new Font("Tahoma", 1, 14));
        jButton1.setForeground(new Color(0, 204, 204));
        jButton1.setText("Login");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        p1.setFont(new Font("Tahoma", 1, 12));

        l4.setBackground(new Color(204, 255, 204));
        l4.setFont(new Font("Arial", 2, 18));
        l4.setForeground(new Color(255, 0, 0));

        jButton2.setBackground(new Color(0, 0, 0));
        jButton2.setFont(new Font("Tahoma", 1, 14));
        jButton2.setForeground(new Color(0, 204, 204));
        jButton2.setText("Exit");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(l4, GroupLayout.PREFERRED_SIZE, 389,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE,
                                                                119, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE,
                                                                88, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE,
                                                                133, GroupLayout.PREFERRED_SIZE))
                                                .addGap(77, 77, 77)
                                                .addGroup(layout
                                                        .createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(t1, GroupLayout.PREFERRED_SIZE, 179,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(p1, GroupLayout.PREFERRED_SIZE, 179,
                                                                GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE,
                                                                151, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 367,
                                                        GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(51, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 65,
                                        GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(l4, GroupLayout.PREFERRED_SIZE, 30,
                                        GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(t1, GroupLayout.PREFERRED_SIZE, 44,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 39,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(p1, GroupLayout.PREFERRED_SIZE, 43,
                                                GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 47,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 44,
                                                GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(66, Short.MAX_VALUE)));

        pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        try {
            String query = "SELECT * FROM login WHERE userid='" + t1.getText() + "'";
            ResultSet rs = statement.executeQuery(query);

            if (rs.next()) {
                if (rs.getString(2).equals(p1.getText())) {
                    l4.setText("Berhasil login!");
                    t.setRepeats(false);
                    t.start();
                    home o = new home();
                    o.setVisible(true);
                    o.setLocation(this.getX(), this.getY());
                    this.dispose();
                } else {
                    l4.setText("Username atau Password salah!");
                    t1.setBackground(Color.LIGHT_GRAY);
                    p1.setBackground(Color.LIGHT_GRAY);
                    t.setRepeats(false);
                    t.start();
                }

            } else {
                l4.setText("Username atau Password salah!");
                t1.setBackground(Color.LIGHT_GRAY);
                p1.setBackground(Color.LIGHT_GRAY);
                t.setRepeats(false);
                t.start();
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        System.exit(0);
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
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new login().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

}
