package eventscheduler;

import java.io.IOException;
import javax.swing.event.ChangeListener;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.table.DefaultTableModel;

public class ClientScreen extends javax.swing.JFrame {
    DefaultTableModel model;
    private boolean isAdmin;
    Client newClient;
    int index;
    public ClientScreen( boolean isAdmin) {
       // this.newClient = newClient;
        this.isAdmin = isAdmin;
        initComponents();
        model=(DefaultTableModel)eventstable.getModel();
        checkadmin();     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JLabel();
        mainpanel = new javax.swing.JTabbedPane();
        addEventPnl = new javax.swing.JPanel();
        startingtimeLbl = new javax.swing.JLabel();
        endingTimeLbl = new javax.swing.JLabel();
        venueLbl = new javax.swing.JLabel();
        startTimeCbox = new javax.swing.JComboBox();
        endTimeCbox = new javax.swing.JComboBox();
        venueCbox = new javax.swing.JComboBox();
        descriptionLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTxtArea = new javax.swing.JTextArea();
        addEventBtn = new javax.swing.JButton();
        dateLbl = new javax.swing.JLabel();
        eventNameTxt = new javax.swing.JTextField();
        startingtimeLbl1 = new javax.swing.JLabel();
        vieweventpnl = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        eventstable = new javax.swing.JTable();
        deleteeventpanel = new javax.swing.JPanel();
        deleteeventbtn = new javax.swing.JButton();
        addvenuepanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        newvenuetxt = new javax.swing.JTextField();
        addvenuebtn = new javax.swing.JButton();
        addtimeslotpanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        addtimeslotbtn = new javax.swing.JButton();
        addnewuserpanel = new javax.swing.JPanel();
        userNameLbl = new javax.swing.JLabel();
        passwdLbl = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();
        passwdTxt = new javax.swing.JPasswordField();
        groupNameLbl = new javax.swing.JLabel();
        groupNameTxt = new javax.swing.JTextField();
        emailIdLbl = new javax.swing.JLabel();
        emailIdTxt = new javax.swing.JTextField();
        addnewuserbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Header.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header.setText("MNNIT EVENT SCHEDULER");

        mainpanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(240, 240, 240), null, null));
        mainpanel.setToolTipText("");
        mainpanel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        mainpanel.addChangeListener(changeListener);

        addEventPnl.setToolTipText("click here to add a new event");

        startingtimeLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        startingtimeLbl.setText(" STARTING TIME");

        endingTimeLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        endingTimeLbl.setText(" ENDING TIME");

        venueLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        venueLbl.setText(" VENUE");

        startTimeCbox.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        startTimeCbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00" }));
        startTimeCbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startTimeCboxActionPerformed(evt);
            }
        });

        endTimeCbox.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        endTimeCbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00" }));

        venueCbox.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        venueCbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GS-3", "GS-4", "GS-5", "GS-6", "GS-7", "GS-8", "NLH-1", "NLH-2" }));

        descriptionLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        descriptionLbl.setText(" DESCRIPTION");

        descriptionTxtArea.setColumns(20);
        descriptionTxtArea.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        descriptionTxtArea.setRows(5);
        jScrollPane1.setViewportView(descriptionTxtArea);

        addEventBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        addEventBtn.setText("ADD EVENT");
        addEventBtn.setToolTipText("click to add the event");
        addEventBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEventBtnActionPerformed(evt);
            }
        });

        dateLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        dateLbl.setText(" DATE");

        startingtimeLbl1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        startingtimeLbl1.setText(" EVENT NAME");

        javax.swing.GroupLayout addEventPnlLayout = new javax.swing.GroupLayout(addEventPnl);
        addEventPnl.setLayout(addEventPnlLayout);
        addEventPnlLayout.setHorizontalGroup(
            addEventPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEventPnlLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(addEventPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(endingTimeLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(startingtimeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                    .addComponent(dateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(addEventPnlLayout.createSequentialGroup()
                        .addComponent(addEventBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(startingtimeLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(venueLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(descriptionLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addEventPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(venueCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startTimeCbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(endTimeCbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eventNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(203, 203, 203))
        );

        addEventPnlLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addEventBtn, endTimeCbox, startTimeCbox, venueCbox});

        addEventPnlLayout.setVerticalGroup(
            addEventPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEventPnlLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(addEventPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startingtimeLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(addEventPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addEventPnlLayout.createSequentialGroup()
                        .addComponent(startingtimeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(addEventPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(endingTimeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endTimeCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(startTimeCbox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(addEventPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(venueLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(venueCbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(dateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(addEventPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addEventPnlLayout.createSequentialGroup()
                        .addComponent(descriptionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addEventBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(207, Short.MAX_VALUE))
        );

        addEventPnlLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dateLbl, descriptionLbl, endTimeCbox, endingTimeLbl, eventNameTxt, startTimeCbox, startingtimeLbl, venueCbox, venueLbl});

        mainpanel.addTab("  ADD EVENT ", addEventPnl);

        eventstable.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        eventstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(eventstable);

        javax.swing.GroupLayout vieweventpnlLayout = new javax.swing.GroupLayout(vieweventpnl);
        vieweventpnl.setLayout(vieweventpnlLayout);
        vieweventpnlLayout.setHorizontalGroup(
            vieweventpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vieweventpnlLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 914, Short.MAX_VALUE)
                .addContainerGap())
        );
        vieweventpnlLayout.setVerticalGroup(
            vieweventpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vieweventpnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );

        mainpanel.addTab("VIEW EVENT", vieweventpnl);

        deleteeventpanel.setToolTipText("click here to delete an existing event");

        deleteeventbtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        deleteeventbtn.setText("DELETE");

        javax.swing.GroupLayout deleteeventpanelLayout = new javax.swing.GroupLayout(deleteeventpanel);
        deleteeventpanel.setLayout(deleteeventpanelLayout);
        deleteeventpanelLayout.setHorizontalGroup(
            deleteeventpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteeventpanelLayout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addComponent(deleteeventbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        deleteeventpanelLayout.setVerticalGroup(
            deleteeventpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteeventpanelLayout.createSequentialGroup()
                .addContainerGap(337, Short.MAX_VALUE)
                .addComponent(deleteeventbtn)
                .addGap(268, 268, 268))
        );

        mainpanel.addTab("  DELETE EVENT  ", deleteeventpanel);

        addvenuepanel.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("ENTER NEW VENUE");

        newvenuetxt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        newvenuetxt.setText("dfbaeffbvrwv");
        newvenuetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newvenuetxtActionPerformed(evt);
            }
        });
        if(index==3)
        newvenuetxt.setText("");

        addvenuebtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        addvenuebtn.setText("ADD");
        addvenuebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addvenuebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addvenuepanelLayout = new javax.swing.GroupLayout(addvenuepanel);
        addvenuepanel.setLayout(addvenuepanelLayout);
        addvenuepanelLayout.setHorizontalGroup(
            addvenuepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addvenuepanelLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel2)
                .addGap(53, 53, 53)
                .addGroup(addvenuepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addvenuebtn)
                    .addComponent(newvenuetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addvenuepanelLayout.setVerticalGroup(
            addvenuepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addvenuepanelLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(addvenuepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newvenuetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(addvenuebtn)
                .addContainerGap(386, Short.MAX_VALUE))
        );

        addvenuepanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, newvenuetxt});

        mainpanel.addTab("ADD VENUE", addvenuepanel);

        addtimeslotpanel.setToolTipText("click here to add a new time slot");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("ENTER STARTING TIME");

        jTextField2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("ENTER ENDING TIME");

        jTextField3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        addtimeslotbtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        addtimeslotbtn.setText("ADD");

        javax.swing.GroupLayout addtimeslotpanelLayout = new javax.swing.GroupLayout(addtimeslotpanel);
        addtimeslotpanel.setLayout(addtimeslotpanelLayout);
        addtimeslotpanelLayout.setHorizontalGroup(
            addtimeslotpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addtimeslotpanelLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addGroup(addtimeslotpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(33, 33, 33)
                .addGroup(addtimeslotpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addtimeslotbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addtimeslotpanelLayout.setVerticalGroup(
            addtimeslotpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addtimeslotpanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(addtimeslotpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(addtimeslotpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(addtimeslotbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(332, Short.MAX_VALUE))
        );

        mainpanel.addTab("ADD TIME SLOT", addtimeslotpanel);

        addnewuserpanel.setToolTipText("click here to add a new user");

        userNameLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        userNameLbl.setText(" USER NAME");

        passwdLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        passwdLbl.setText(" PASSWORD");

        userNameTxt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        passwdTxt.setText("jPasswordField1");

        groupNameLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        groupNameLbl.setText(" GROUP NAME");

        groupNameTxt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        emailIdLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        emailIdLbl.setText(" E-MAIL ID");

        emailIdTxt.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        addnewuserbtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        addnewuserbtn.setText("ADD USER");
        addnewuserbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnewuserbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addnewuserpanelLayout = new javax.swing.GroupLayout(addnewuserpanel);
        addnewuserpanel.setLayout(addnewuserpanelLayout);
        addnewuserpanelLayout.setHorizontalGroup(
            addnewuserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addnewuserpanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(addnewuserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addnewuserbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addnewuserpanelLayout.createSequentialGroup()
                        .addGroup(addnewuserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(userNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                            .addComponent(groupNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                            .addComponent(emailIdLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                            .addComponent(passwdLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(addnewuserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(groupNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(226, Short.MAX_VALUE))
        );

        addnewuserpanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {emailIdTxt, groupNameTxt, passwdTxt, userNameTxt});

        addnewuserpanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {emailIdLbl, groupNameLbl, userNameLbl});

        addnewuserpanelLayout.setVerticalGroup(
            addnewuserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addnewuserpanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(addnewuserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addnewuserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(groupNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addnewuserpanelLayout.createSequentialGroup()
                        .addComponent(groupNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(20, 20, 20)
                .addGroup(addnewuserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(addnewuserpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwdTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(passwdLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(addnewuserbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(304, 304, 304))
        );

        addnewuserpanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {userNameLbl, userNameTxt});

        addnewuserpanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {emailIdLbl, emailIdTxt, groupNameLbl, groupNameTxt});

        mainpanel.addTab("ADD USER", addnewuserpanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainpanel))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkadmin(){
        if(!isAdmin){
            mainpanel.remove(4);            
            mainpanel.remove(3);
            mainpanel.remove(2);
        }
        else{
             mainpanel.addTab("ADD VENUE", addvenuepanel);
             mainpanel.addTab("ADD TIME SLOT", addtimeslotpanel);
             mainpanel.addTab("ADD USER", addnewuserpanel);
            
        }
    }
    private void startTimeCboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startTimeCboxActionPerformed
        
    }//GEN-LAST:event_startTimeCboxActionPerformed

    private void addEventBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEventBtnActionPerformed
        String startT, endT, venue, date, description;
        String eventName = eventNameTxt.getText();
        startT = (String) startTimeCbox.getSelectedItem();
        endT = (String) endTimeCbox.getSelectedItem();
        venue = (String) venueCbox.getSelectedItem();
        date =  dateChooser.getDate().toString();
        System.out.println(date);
        description = descriptionTxtArea.getText(); 
        //if("".equals(eventName) || "".equals(description) ){
          //  JOptionPane.showMessageDialog(this, "One or more input is missing!", 
            //        "input warning", JOptionPane.WARNING_MESSAGE);
        //Event newEvent;
        /*try {
            newEvent = new Event(newClient.clientSocket);
            newEvent.createEvent(eventName, startT, endT, date, venue, newClient.id, description);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }*/
    }//GEN-LAST:event_addEventBtnActionPerformed

    private void addnewuserbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnewuserbtnActionPerformed
        
    }//GEN-LAST:event_addnewuserbtnActionPerformed

    private void newvenuetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newvenuetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newvenuetxtActionPerformed

    private void addvenuebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addvenuebtnActionPerformed
    }//GEN-LAST:event_addvenuebtnActionPerformed

     
    ChangeListener changeListener = new ChangeListener() {
      @Override
      public void stateChanged(ChangeEvent changeEvent) {
        JTabbedPane sourceTabbedPane = (JTabbedPane) changeEvent.getSource();
        index = sourceTabbedPane.getSelectedIndex();
       
       /* if(index%2==0)
        System.out.println(index);
        System.out.println("Tab changed to: " + sourceTabbedPane.getTitleAt(index));
      */}
    };
    
    /**
     *
     * @param args
     */
    public static void main(String args[])
    {
        new ClientScreen(true).setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Header;
    private javax.swing.JButton addEventBtn;
    private javax.swing.JPanel addEventPnl;
    private javax.swing.JButton addnewuserbtn;
    private javax.swing.JPanel addnewuserpanel;
    private javax.swing.JButton addtimeslotbtn;
    private javax.swing.JPanel addtimeslotpanel;
    private javax.swing.JButton addvenuebtn;
    private javax.swing.JPanel addvenuepanel;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JButton deleteeventbtn;
    private javax.swing.JPanel deleteeventpanel;
    private javax.swing.JLabel descriptionLbl;
    private javax.swing.JTextArea descriptionTxtArea;
    private javax.swing.JLabel emailIdLbl;
    private javax.swing.JTextField emailIdTxt;
    private javax.swing.JComboBox endTimeCbox;
    private javax.swing.JLabel endingTimeLbl;
    private javax.swing.JTextField eventNameTxt;
    private javax.swing.JTable eventstable;
    private javax.swing.JLabel groupNameLbl;
    private javax.swing.JTextField groupNameTxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTabbedPane mainpanel;
    private javax.swing.JTextField newvenuetxt;
    private javax.swing.JLabel passwdLbl;
    private javax.swing.JPasswordField passwdTxt;
    private javax.swing.JComboBox startTimeCbox;
    private javax.swing.JLabel startingtimeLbl;
    private javax.swing.JLabel startingtimeLbl1;
    private javax.swing.JLabel userNameLbl;
    private javax.swing.JTextField userNameTxt;
    private javax.swing.JComboBox venueCbox;
    private javax.swing.JLabel venueLbl;
    private javax.swing.JPanel vieweventpnl;
    // End of variables declaration//GEN-END:variables
}
