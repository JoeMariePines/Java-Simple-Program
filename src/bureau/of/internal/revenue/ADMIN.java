/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bureau.of.internal.revenue;

import bureau.of.internal.revenue.ConnectionDB;
import bureau.of.internal.revenue.ConnectionDB;
import bureau.of.internal.revenue.PROFILE;
import bureau.of.internal.revenue.PROFILE;
import bureau.of.internal.revenue.RECEIVING;
import bureau.of.internal.revenue.RECEIVING;
import bureau.of.internal.revenue.REVIEWER;
import bureau.of.internal.revenue.REVIEWER;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sankyo
 */
public class ADMIN extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    /**
     * Creates new form ADMIN
     */
    String Usergets = null;
    int Userlvls = 0;

    public ADMIN() {
        initComponents();
        setColor(Home);
        SH.setOpaque(true);
        resetColor(new JPanel[]{Login, Log}, new JPanel[]{SL, SLG});  
         
    } 

    public void DtaBseSHow() {
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SideMenu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        UserLevel = new javax.swing.JLabel();
        Home = new javax.swing.JPanel();
        jLabelHome = new javax.swing.JLabel();
        SH = new javax.swing.JPanel();
        Log = new javax.swing.JPanel();
        jLabelLogs = new javax.swing.JLabel();
        SLG = new javax.swing.JPanel();
        Login = new javax.swing.JPanel();
        jLabelLogin = new javax.swing.JLabel();
        SL = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        HeaderPressed = new javax.swing.JPanel();
        PanelLayer = new javax.swing.JPanel();
        phome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        plogin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        username = new java.awt.TextField();
        password = new java.awt.TextField();
        jButton1 = new javax.swing.JButton();
        plogs = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setTitle("PanelMenu");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SideMenu.setBackground(new java.awt.Color(23, 33, 53));
        SideMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(23, 33, 53));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("________________________");

        UserLevel.setBackground(new java.awt.Color(255, 255, 255));
        UserLevel.setForeground(new java.awt.Color(255, 255, 255));
        UserLevel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserLevel.setText("GUEST");
        UserLevel.setPreferredSize(new java.awt.Dimension(35, 16));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 89, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(UserLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        SideMenu.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 150));

        Home.setBackground(new java.awt.Color(23, 33, 53));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HomeMousePressed(evt);
            }
        });

        jLabelHome.setBackground(new java.awt.Color(255, 255, 255));
        jLabelHome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHome.setText("Home");
        jLabelHome.setPreferredSize(new java.awt.Dimension(35, 16));

        SH.setBackground(new java.awt.Color(255, 255, 255));
        SH.setPreferredSize(new java.awt.Dimension(7, 0));

        javax.swing.GroupLayout SHLayout = new javax.swing.GroupLayout(SH);
        SH.setLayout(SHLayout);
        SHLayout.setHorizontalGroup(
            SHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        SHLayout.setVerticalGroup(
            SHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addComponent(SH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelHome, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(SH, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        SideMenu.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 170, 50));

        Log.setBackground(new java.awt.Color(23, 33, 53));
        Log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LogMousePressed(evt);
            }
        });

        jLabelLogs.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogs.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogs.setText("Logs");
        jLabelLogs.setPreferredSize(new java.awt.Dimension(35, 16));

        SLG.setBackground(new java.awt.Color(255, 255, 255));
        SLG.setPreferredSize(new java.awt.Dimension(7, 0));

        javax.swing.GroupLayout SLGLayout = new javax.swing.GroupLayout(SLG);
        SLG.setLayout(SLGLayout);
        SLGLayout.setHorizontalGroup(
            SLGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        SLGLayout.setVerticalGroup(
            SLGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout LogLayout = new javax.swing.GroupLayout(Log);
        Log.setLayout(LogLayout);
        LogLayout.setHorizontalGroup(
            LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelLogs, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LogLayout.createSequentialGroup()
                    .addComponent(SLG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 163, Short.MAX_VALUE)))
        );
        LogLayout.setVerticalGroup(
            LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLogs, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(LogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SLG, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
        );

        SideMenu.add(Log, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 170, 50));

        Login.setBackground(new java.awt.Color(23, 33, 53));
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LoginMousePressed(evt);
            }
        });

        jLabelLogin.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogin.setText("Login");
        jLabelLogin.setPreferredSize(new java.awt.Dimension(35, 16));

        SL.setBackground(new java.awt.Color(255, 255, 255));
        SL.setPreferredSize(new java.awt.Dimension(7, 0));

        javax.swing.GroupLayout SLLayout = new javax.swing.GroupLayout(SL);
        SL.setLayout(SLLayout);
        SLLayout.setHorizontalGroup(
            SLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        SLLayout.setVerticalGroup(
            SLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addComponent(SL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(SL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        SideMenu.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 170, 50));

        getContentPane().add(SideMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 520));

        Header.setBackground(new java.awt.Color(62, 101, 181));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 700, 50));

        HeaderPressed.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderPressedMouseDragged(evt);
            }
        });
        HeaderPressed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderPressedMousePressed(evt);
            }
        });

        javax.swing.GroupLayout HeaderPressedLayout = new javax.swing.GroupLayout(HeaderPressed);
        HeaderPressed.setLayout(HeaderPressedLayout);
        HeaderPressedLayout.setHorizontalGroup(
            HeaderPressedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        HeaderPressedLayout.setVerticalGroup(
            HeaderPressedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(HeaderPressed, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 50));

        PanelLayer.setBackground(new java.awt.Color(41, 57, 80));
        PanelLayer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HOME");

        javax.swing.GroupLayout phomeLayout = new javax.swing.GroupLayout(phome);
        phome.setLayout(phomeLayout);
        phomeLayout.setHorizontalGroup(
            phomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phomeLayout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );
        phomeLayout.setVerticalGroup(
            phomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phomeLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        PanelLayer.add(phome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 580, 330));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");

        username.setText("USERNAME");
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });

        password.setText("PASSWORD");
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });

        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ploginLayout = new javax.swing.GroupLayout(plogin);
        plogin.setLayout(ploginLayout);
        ploginLayout.setHorizontalGroup(
            ploginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ploginLayout.createSequentialGroup()
                .addGroup(ploginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ploginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ploginLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addGroup(ploginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(ploginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(224, Short.MAX_VALUE))
        );
        ploginLayout.setVerticalGroup(
            ploginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ploginLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        PanelLayer.add(plogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 580, 330));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Logs");

        javax.swing.GroupLayout plogsLayout = new javax.swing.GroupLayout(plogs);
        plogs.setLayout(plogsLayout);
        plogsLayout.setHorizontalGroup(
            plogsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plogsLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
        );
        plogsLayout.setVerticalGroup(
            plogsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plogsLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        PanelLayer.add(plogs, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 580, 330));

        getContentPane().add(PanelLayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 700, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HeaderPressedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderPressedMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_HeaderPressedMousePressed
    private void HeaderPressedMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderPressedMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_HeaderPressedMouseDragged
    private void HomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMousePressed
        // TODO add your handling code here:
        phome.setVisible(true);
        plogs.setVisible(false);
        plogin.setVisible(false);
        setColor(Home);
        SH.setOpaque(true);
        resetColor(new JPanel[]{Login, Log}, new JPanel[]{SL, SLG});
    }//GEN-LAST:event_HomeMousePressed
    private void LoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMousePressed
        // TODO add your handling code here:
        phome.setVisible(false);
        plogs.setVisible(false);
        plogin.setVisible(true);
        setColor(Login);
        SL.setOpaque(true);
        resetColor(new JPanel[]{Home, Log}, new JPanel[]{SH, SLG});
    }//GEN-LAST:event_LoginMousePressed
    private void LogMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogMousePressed
        // TODO add your handling code here:
        phome.setVisible(false);
        plogs.setVisible(true);
        plogin.setVisible(false);
        setColor(Log);
        SLG.setOpaque(true);
        resetColor(new JPanel[]{Home, Login}, new JPanel[]{SH, SL});
    }//GEN-LAST:event_LogMousePressed
    public void Profile() {
        PROFILE profile = new PROFILE();
        profile.UsersName(username.getText());
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // if (username.getText().length() >= 6){}
        String Dtases = ConnectionDB.GetsNameReturn();
        String DtaseN = ConnectionDB.GetDbName();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://" + Dtases + ":3306/" + DtaseN + "", "root", "");
            String SQL = "SELECT * FROM `accounts` WHERE `username` = '" + username.getText() + "' AND `password` = '" + password.getText() + "'";
            Statement PST = connection.createStatement();
            ResultSet resultSet = PST.executeQuery(SQL);
            if (resultSet.next()) {
                Login.setVisible(false);
                Userlvls = resultSet.getInt("user-level");
                JOptionPane.showMessageDialog(null, "Username and Password Matched '" + Userlvls + "'");
                switch (Userlvls) {
                    case 1:
                        UserLevel.setText("ADMIN");
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        Profile();
                        CA5 ca5 = new CA5();
                        ca5.setVisible(true);
                        break;
                    case 6:
                        Profile();
                        REVIEWER reviwer = new REVIEWER();
                        reviwer.setVisible(true);
                        break;
                    case 7:
                        Profile();
                        RECEIVING receiving = new RECEIVING();
                        receiving.setVisible(true);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Please Contact Admin ! ");
                        break;
                }
                try {
                    resultSet.close();
                    PST.close();
                    connection.close();
                    Usergets = username.getText();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Username and Password Not Matched");
                username.setText("USERNAME");
                password.setText("PASSWORD");
            }
//                while (resultSet.next()) {
//                    JOptionPane.showMessageDialog(null, "Username and Password Matched");
//                }
        } catch (SQLException | HeadlessException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Please Contact Administrator !\n'" + ex + "' ");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        // TODO add your handling code here:
        if (username.getText().equals("USERNAME")) {
            username.setText("");
        }
    }//GEN-LAST:event_usernameFocusGained
    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        // TODO add your handling code here:
        if (username.getText().equals("")) {
            username.setText("USERNAME");
        }
    }//GEN-LAST:event_usernameFocusLost
    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        // TODO add your handling code here:
        if (password.getText().equals("PASSWORD")) {
            password.setText("");
        }
    }//GEN-LAST:event_passwordFocusGained
    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        // TODO add your handling code here:
        if (password.getText().equals("")) {
            password.setText("PASSWORD");
        }
    }//GEN-LAST:event_passwordFocusLost
    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton1.doClick();
        }
    }//GEN-LAST:event_passwordKeyPressed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed
    int xx, yy;

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ADMIN().setVisible(true);
        });
    }

    private void setColor(JPanel pane) {
        pane.setBackground(new Color(41, 57, 80));
    }

    private void resetColor(JPanel[] pane, JPanel[] indicators) {
        for (JPanel pane1 : pane) {
            pane1.setBackground(new Color(23, 35, 51));
        }
        for (JPanel indicator : indicators) {
            indicator.setOpaque(false);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel HeaderPressed;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel Log;
    private javax.swing.JPanel Login;
    private javax.swing.JPanel PanelLayer;
    private javax.swing.JPanel SH;
    private javax.swing.JPanel SL;
    private javax.swing.JPanel SLG;
    private javax.swing.JPanel SideMenu;
    private javax.swing.JLabel UserLevel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelLogs;
    private javax.swing.JPanel jPanel1;
    private java.awt.TextField password;
    private javax.swing.JPanel phome;
    private javax.swing.JPanel plogin;
    private javax.swing.JPanel plogs;
    private java.awt.TextField username;
    // End of variables declaration//GEN-END:variables

}
