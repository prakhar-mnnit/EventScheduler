package eventscheduler;

import javax.swing.*;

public class LoginScreen extends javax.swing.JFrame {
    private String username, password;
    private String hostName, portNum;
    
    public LoginScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginInfoPnl = new javax.swing.JPanel();
        usernameTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        usernameLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        loginAsLbl = new javax.swing.JLabel();
        hostNameTxt = new javax.swing.JTextField();
        portNumTxt = new javax.swing.JTextField();
        hostNameLbl = new javax.swing.JLabel();
        portNumLbl = new javax.swing.JLabel();
        connectToLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        loginInfoPnl.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        loginBtn.setText("log in");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        usernameLbl.setText("Username");
        usernameLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        passwordLbl.setText("Password");
        passwordLbl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        loginAsLbl.setText("Log in as");

        javax.swing.GroupLayout loginInfoPnlLayout = new javax.swing.GroupLayout(loginInfoPnl);
        loginInfoPnl.setLayout(loginInfoPnlLayout);
        loginInfoPnlLayout.setHorizontalGroup(
            loginInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginInfoPnlLayout.createSequentialGroup()
                .addGroup(loginInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(loginInfoPnlLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(loginInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(passwordLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginAsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(loginInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(usernameTxt)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(loginInfoPnlLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)))
                .addGap(23, 23, 23))
        );

        loginInfoPnlLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {passwordTxt, usernameTxt});

        loginInfoPnlLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {loginAsLbl, passwordLbl, usernameLbl});

        loginInfoPnlLayout.setVerticalGroup(
            loginInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginInfoPnlLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(loginInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginAsLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginBtn)
                .addContainerGap())
        );

        loginInfoPnlLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {loginAsLbl, passwordLbl, passwordTxt, usernameLbl, usernameTxt});

        hostNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostNameTxtActionPerformed(evt);
            }
        });

        portNumTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portNumTxtActionPerformed(evt);
            }
        });

        hostNameLbl.setText("Host name");

        portNumLbl.setText("Port number");

        connectToLbl.setText("Connect to Server");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(loginInfoPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hostNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(portNumLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hostNameTxt)
                            .addComponent(portNumTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                        .addGap(38, 38, 38))))
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(connectToLbl)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {connectToLbl, hostNameLbl});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(connectToLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hostNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hostNameLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(portNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(portNumLbl))
                .addGap(21, 21, 21)
                .addComponent(loginInfoPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {connectToLbl, hostNameLbl, hostNameTxt, portNumLbl, portNumTxt});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("UseSpecificCatch")
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        username = usernameTxt.getText();
        username.trim();
        password = new String(passwordTxt.getPassword());
        password.trim();
        hostName = hostNameTxt.getText();
        portNum = portNumTxt.getText();    
        if("".equals(username) || "".equals(password) || "".equals(hostName) || "".equals(portNum)){
            JOptionPane.showMessageDialog(this, "One or more input is missing!", 
                    "input warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            try{
                Client newClient = new Client(username, password, hostName, Integer.parseInt(portNum));
                newClient.connectToServer();
                if(!newClient.login()){                    
                    JOptionPane.showMessageDialog(this, "Username and Password do not match", 
                            "conn error", JOptionPane.ERROR_MESSAGE);
                    
                }
                else{
                    ClientScreen mainScreen = new ClientScreen(newClient, true);
                    mainScreen.setVisible(true);
                    this.dispose();
                }
            }
            catch (Exception e){
                System.out.println("Error : " + e);
               JOptionPane.showMessageDialog(this, "Error in connection", 
                       "conn error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void hostNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostNameTxtActionPerformed
        
    }//GEN-LAST:event_hostNameTxtActionPerformed

    private void portNumTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portNumTxtActionPerformed
        
    }//GEN-LAST:event_portNumTxtActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel connectToLbl;
    private javax.swing.JLabel hostNameLbl;
    private javax.swing.JTextField hostNameTxt;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel loginAsLbl;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel loginInfoPnl;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JLabel portNumLbl;
    private javax.swing.JTextField portNumTxt;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
