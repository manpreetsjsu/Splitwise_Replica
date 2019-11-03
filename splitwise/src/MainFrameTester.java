/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manpr
 */
public class MainFrameTester extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public MainFrameTester() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        groupPanel = new javax.swing.JPanel();
        groupInputLabel = new javax.swing.JLabel();
        groupNameInput = new javax.swing.JTextField();
        groupListLabel = new javax.swing.JLabel();
        groupListScrollPane = new javax.swing.JScrollPane();
        groupList = new javax.swing.JList<>();
        createGroupBtn = new javax.swing.JButton();
        deleteGroupBtn = new javax.swing.JButton();
        addMemberPanel = new javax.swing.JPanel();
        addMemberLabel = new javax.swing.JLabel();
        memberNameInput = new javax.swing.JTextField();
        memberListLabel = new javax.swing.JLabel();
        memberListScrollPane = new javax.swing.JScrollPane();
        memberList = new javax.swing.JList<>();
        deleteMemberBtn = new javax.swing.JButton();
        createMemberBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        groupPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 135, 245)));

        groupInputLabel.setText("Enter Group");

        groupNameInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 135, 245)));
        groupNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //groupNameInputActionPerformed(evt);
            }
        });

        groupListLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        groupListLabel.setText("Group List");

        groupList.setBackground(new java.awt.Color(255, 255, 204));
        groupList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        groupListScrollPane.setViewportView(groupList);

        createGroupBtn.setText("Create Group");
        createGroupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createGroupBtnActionPerformed(evt);
            }
        });

        deleteGroupBtn.setBackground(new java.awt.Color(245, 66, 66));
        deleteGroupBtn.setText("Delete Group");
        deleteGroupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteGroupBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout groupPanelLayout = new javax.swing.GroupLayout(groupPanel);
        groupPanel.setLayout(groupPanelLayout);
        groupPanelLayout.setHorizontalGroup(
            groupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(groupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(groupListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(groupListLabel)
                    .addGroup(groupPanelLayout.createSequentialGroup()
                        .addComponent(groupInputLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(groupNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, groupPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(groupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteGroupBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(createGroupBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        groupPanelLayout.setVerticalGroup(
            groupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(groupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(groupInputLabel)
                    .addComponent(groupNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createGroupBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(groupListLabel)
                .addGap(18, 18, 18)
                .addComponent(groupListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteGroupBtn)
                .addGap(17, 17, 17))
        );

        addMemberPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 135, 245)));

        addMemberLabel.setText("Enter Member");

        memberNameInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 135, 245)));
        memberNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberNameInputActionPerformed(evt);
            }
        });

        memberListLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        memberListLabel.setText("Member List");

        memberList.setBackground(new java.awt.Color(255, 255, 204));
        memberList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        memberListScrollPane.setViewportView(memberList);

        deleteMemberBtn.setBackground(new java.awt.Color(245, 66, 66));
        deleteMemberBtn.setText("Delete Member");

        createMemberBtn.setText("Add Member");

        javax.swing.GroupLayout addMemberPanelLayout = new javax.swing.GroupLayout(addMemberPanel);
        addMemberPanel.setLayout(addMemberPanelLayout);
        addMemberPanelLayout.setHorizontalGroup(
            addMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMemberPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(addMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(memberListLabel)
                    .addGroup(addMemberPanelLayout.createSequentialGroup()
                        .addComponent(addMemberLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(memberNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(memberListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addMemberPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createMemberBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteMemberBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        addMemberPanelLayout.setVerticalGroup(
            addMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addMemberPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(addMemberPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMemberLabel)
                    .addComponent(memberNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createMemberBtn)
                .addGap(18, 18, 18)
                .addComponent(memberListLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(memberListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteMemberBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addMemberPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(groupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(726, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(groupPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(addMemberPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void memberNameInputActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void createGroupBtnActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void deleteGroupBtnActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrameTester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrameTester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrameTester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrameTester.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrameTester().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel addMemberLabel;
    private javax.swing.JPanel addMemberPanel;
    private javax.swing.JButton createGroupBtn;
    private javax.swing.JButton createMemberBtn;
    private javax.swing.JButton deleteGroupBtn;
    private javax.swing.JButton deleteMemberBtn;
    private javax.swing.JLabel groupInputLabel;
    private javax.swing.JList<String> groupList;
    private javax.swing.JLabel groupListLabel;
    private javax.swing.JScrollPane groupListScrollPane;
    private javax.swing.JTextField groupNameInput;
    private javax.swing.JPanel groupPanel;
    private javax.swing.JList<String> memberList;
    private javax.swing.JLabel memberListLabel;
    private javax.swing.JScrollPane memberListScrollPane;
    private javax.swing.JTextField memberNameInput;
    // End of variables declaration                   
}
