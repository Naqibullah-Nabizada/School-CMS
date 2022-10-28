package School;

import java.sql.DriverManager;
import java.sql.*;

public class updateAttendance extends javax.swing.JFrame {

    DAL d = new DAL();
    
    private String connect = "jdbc:mysql://localhost/school";
    private String username = "root";
    private String password = null;
    
    public updateAttendance() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        backArrow = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmbClassId = new javax.swing.JComboBox<>();
        txtPresent = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbStudentId = new javax.swing.JComboBox<>();
        cmbMonth = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exitIcon = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ican/icons8_back_arrow_48px.png"))); // NOI18N
        backArrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backArrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backArrowMouseClicked(evt);
            }
        });
        jPanel2.add(backArrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 350, 50, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("صنف:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 120, 60, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("نام:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 160, 60, 20));

        btnUpdate.setBackground(new java.awt.Color(255, 153, 0));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setText("ویرایش");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        btnUpdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnUpdateKeyPressed(evt);
            }
        });
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 250, 90, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img (3).jpeg"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 400));

        cmbClassId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbClassId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClassIdActionPerformed(evt);
            }
        });
        cmbClassId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbClassIdKeyPressed(evt);
            }
        });
        jPanel2.add(cmbClassId, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 150, -1));

        txtPresent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPresent.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPresent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPresentKeyPressed(evt);
            }
        });
        jPanel2.add(txtPresent, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, 190, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("حاضر:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 200, 70, 20));

        cmbStudentId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbStudentId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbStudentIdKeyPressed(evt);
            }
        });
        jPanel2.add(cmbStudentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 150, -1));

        cmbMonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "حمل", "ثور", "جوزا", "سرطان", "اسد", "سنبله", "میزان", "عقرب", "قوس", "جدی", "دلو", "حوت" }));
        cmbMonth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmbMonthKeyPressed(evt);
            }
        });
        jPanel2.add(cmbMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 150, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("ماه:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 80, 60, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 1000, 400));

        jPanel1.setBackground(new java.awt.Color(0, 181, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("لیسه عالی خصوصی بروت");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 510, -1));

        exitIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ican/icons8_cancel_48px.png"))); // NOI18N
        exitIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitIconMouseClicked(evt);
            }
        });
        jPanel1.add(exitIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 50, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Borot private high school");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img (15).jpeg"))); // NOI18N
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 180));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backArrowMouseClicked
        // TODO add your handling code here:
        new allAttendance().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backArrowMouseClicked

    private void txtPresentKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPresentKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPresentKeyPressed

    private void exitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIconMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitIconMouseClicked

    private void btnUpdateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnUpdateKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == 8){
            new Attendance().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnUpdateKeyPressed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String month = cmbMonth.getSelectedItem().toString();
        int class_id = Integer.parseInt(cmbClassId.getSelectedItem().toString().split("- ")[0]);
        int student_id = Integer.parseInt(cmbStudentId.getSelectedItem().toString().split("- ")[0]);
        int present = Integer.parseInt(txtPresent.getText());

        try {

            d.connect();
            d.update("UPDATE attendance SET month='" + month + "', class_id=" + class_id + ", student_id=" + student_id + ", present=" + present + " WHERE atten_id="+allAttendance.aid);
            this.setVisible(false);
            new allAttendance().setVisible(true);
            
        } catch (Exception e) {
            d.showMsg("دوباره امتحان کنید");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(connect, username, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT month, a.class_id, class_grade, a.student_id, s.fullname, present FROM attendance a JOIN class USING(class_id) JOIN student s USING(student_id) WHERE atten_id="+allAttendance.aid);
            rs.next();
                    
            cmbMonth.setSelectedItem(rs.getString("month"));
            cmbClassId.addItem(rs.getString("class_id")+"- "+rs.getString("class_grade"));
            cmbStudentId.addItem(rs.getString("student_id")+"- "+rs.getString("fullname"));
            txtPresent.setText(rs.getString("present"));
            
        }catch(Exception e){
            d.showMsg("wrong");
        }
    }//GEN-LAST:event_formWindowOpened

    private void cmbStudentIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbStudentIdKeyPressed

    }//GEN-LAST:event_cmbStudentIdKeyPressed

    private void cmbClassIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbClassIdKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbClassIdKeyPressed

    private void cmbClassIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClassIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbClassIdActionPerformed

    private void cmbMonthKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbMonthKeyPressed

    }//GEN-LAST:event_cmbMonthKeyPressed

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
            java.util.logging.Logger.getLogger(updateAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateAttendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backArrow;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbClassId;
    private javax.swing.JComboBox<String> cmbMonth;
    private javax.swing.JComboBox<String> cmbStudentId;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtPresent;
    // End of variables declaration//GEN-END:variables
}
