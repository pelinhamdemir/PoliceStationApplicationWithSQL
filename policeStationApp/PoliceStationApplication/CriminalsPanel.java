/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package deneme;

import java.awt.Color;
import java.awt.Cursor;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author efe
 */
public class CriminalsPanel extends javax.swing.JFrame {
    
     private void openMainScreen() {
        MainScreen mainScreen = new MainScreen();
        mainScreen.setVisible(true);
    }
     
       private void openImportScreenForCrminal() {
        ImportScreenForCriminal ImportScreenForCriminal = new ImportScreenForCriminal();
        ImportScreenForCriminal.setVisible(true);
    }
         private void openUpdateScreenForCriminal() {
        UpdateScreenForCriminal UpdateScreenForCriminal = new UpdateScreenForCriminal();
        UpdateScreenForCriminal.setVisible(true);
    }

    /**
     * 
     * 
     * 

     * Creates new form CriminalsPanel
     */
    public CriminalsPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Exit = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        txtDELETED1 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        txtSEARCH = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(22, 22, 22));

        jButton1.setBackground(new java.awt.Color(32, 32, 32));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Show");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit3.png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitMouseExited(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(32, 32, 32));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Order by Lname");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(32, 32, 32));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Order by Fname");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(32, 32, 32));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Order by Gender");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(32, 32, 32));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Insert");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(32, 32, 32));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Delete");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(32, 32, 32));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Update");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(32, 32, 32));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Search");

        txtSEARCH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSEARCHKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(Exit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDELETED1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton7)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSEARCH)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(20, 20, 20)
                .addComponent(jButton3)
                .addGap(20, 20, 20)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(txtDELETED1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(txtSEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Exit)
                .addGap(15, 15, 15))
        );

        jTable1.setBackground(new java.awt.Color(32, 32, 32));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Criminal ID", "Lname", "Fname", "SSN", "Birth Date", "Gender", "Blood Type"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(51, 102, 255));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cmpe","root","AHMETefe2003");
             DefaultTableModel tblModel  = (DefaultTableModel)jTable1.getModel();
                    tblModel.setRowCount(0);
            Statement st = con.createStatement();
            String sql = "select criminal_id,Fname,Lname,SSN,Birth_Data,Gender,Blood_Type from criminal order by criminal_id";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String criminal_id = String.valueOf(rs.getInt("criminal_id"));
                String Lname = String.valueOf(rs.getString("Lname"));
                String Fname = String.valueOf(rs.getString("Fname"));
                String SSN = String.valueOf(rs.getString("SSN"));
                String birthdata = String.valueOf(rs.getString("Birth_data"));
                String gender = String.valueOf(rs.getString("Gender"));
                String blood_Type = String.valueOf(rs.getString("Blood_Type"));



                String database[] = {
                    criminal_id,Lname,Fname,SSN,birthdata,gender,blood_Type  };
                 tblModel = (DefaultTableModel)jTable1.getModel();
                tblModel.addRow(database);

            }

            con.close();

        }catch(Exception e){
            System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
            dispose();
             openMainScreen();
    }//GEN-LAST:event_ExitMouseClicked

    private void ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseEntered
                setCursor(new Cursor(Cursor.HAND_CURSOR));

    }//GEN-LAST:event_ExitMouseEntered

    private void ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseExited
             setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_ExitMouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                                          

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cmpe","root","AHMETefe2003");
             DefaultTableModel tblModel  = (DefaultTableModel)jTable1.getModel();
                    tblModel.setRowCount(0);
            Statement st = con.createStatement();
            String sql = "select criminal_id,Fname,Lname,SSN,Birth_Data,Gender,Blood_Type from criminal order by Lname";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String criminal_id = String.valueOf(rs.getInt("criminal_id"));
                String Lname = String.valueOf(rs.getString("Lname"));
                String Fname = String.valueOf(rs.getString("Fname"));
                String SSN = String.valueOf(rs.getString("SSN"));
                String birthdata = String.valueOf(rs.getString("Birth_data"));
                String gender = String.valueOf(rs.getString("Gender"));
                String blood_Type = String.valueOf(rs.getString("Blood_Type"));



                String database[] = {
                    criminal_id,Lname,Fname,SSN,birthdata,gender,blood_Type  };
                 tblModel = (DefaultTableModel)jTable1.getModel();
                tblModel.addRow(database);

            }

            con.close();

        }catch(Exception e){
            System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                                              

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cmpe","root","AHMETefe2003");
             DefaultTableModel tblModel  = (DefaultTableModel)jTable1.getModel();
                    tblModel.setRowCount(0);
            Statement st = con.createStatement();
            String sql = "select criminal_id,Fname,Lname,SSN,Birth_Data,Gender,Blood_Type from criminal order by Fname";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String criminal_id = String.valueOf(rs.getInt("criminal_id"));
                String Lname = String.valueOf(rs.getString("Lname"));
                String Fname = String.valueOf(rs.getString("Fname"));
                String SSN = String.valueOf(rs.getString("SSN"));
                String birthdata = String.valueOf(rs.getString("Birth_data"));
                String gender = String.valueOf(rs.getString("Gender"));
                String blood_Type = String.valueOf(rs.getString("Blood_Type"));



                String database[] = {
                    criminal_id,Lname,Fname,SSN,birthdata,gender,blood_Type  };
                 tblModel = (DefaultTableModel)jTable1.getModel();
                tblModel.addRow(database);

            }

            con.close();

        }catch(Exception e){
            System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                                              

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cmpe","root","AHMETefe2003");
             DefaultTableModel tblModel  = (DefaultTableModel)jTable1.getModel();
                    tblModel.setRowCount(0);
            Statement st = con.createStatement();
            String sql = "select criminal_id,Fname,Lname,SSN,Birth_Data,Gender,Blood_Type from criminal order by gender";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String criminal_id = String.valueOf(rs.getInt("criminal_id"));
                String Lname = String.valueOf(rs.getString("Lname"));
                String Fname = String.valueOf(rs.getString("Fname"));
                String SSN = String.valueOf(rs.getString("SSN"));
                String birthdata = String.valueOf(rs.getString("Birth_data"));
                String gender = String.valueOf(rs.getString("Gender"));
                String blood_Type = String.valueOf(rs.getString("Blood_Type"));



                String database[] = {
                    criminal_id,Lname,Fname,SSN,birthdata,gender,blood_Type  };
                 tblModel = (DefaultTableModel)jTable1.getModel();
                tblModel.addRow(database);

            }

            con.close();

        }catch(Exception e){
            System.out.println(e.getMessage());

        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

    }//GEN-LAST:event_jButton4MouseExited

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
                      openImportScreenForCrminal();
                      

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
               setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
               setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cmpe","root","AHMETefe2003");
    Statement st = con.createStatement();
    int r = JOptionPane.showConfirmDialog(this,"Are you sure to delete this officer!!");
    if(r==0){
        st.execute("delete from criminal where criminal_id = '"+txtDELETED1.getText()+"' ");
         JOptionPane.showMessageDialog(this, "Deleted!!");
    }

    con.close();
    
}catch(Exception e){
             System.out.println(e.getMessage());
       
}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
                       setCursor(new Cursor(Cursor.HAND_CURSOR));

    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
                      setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

    }//GEN-LAST:event_jButton6MouseExited

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        openUpdateScreenForCriminal();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txtSEARCHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSEARCHKeyReleased
                                      
                                      
         
         try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cmpe","root","AHMETefe2003");
             Statement st = con.createStatement();
              DefaultTableModel tblModel  = (DefaultTableModel)jTable1.getModel();
                    tblModel.setRowCount(0);
             String sql = "select criminal_id,Lname,Fname,Birth_data,blood_Type,gender,SSN from criminal where Fname like '"+txtSEARCH.getText()+"%'" ;
             ResultSet rs = st.executeQuery(sql);
             while(rs.next()){
                 String id = String.valueOf(rs.getInt("criminal_id"));
                 String Lname = String.valueOf(rs.getString("Lname"));
                 String Fname = String.valueOf(rs.getString("Fname"));
                 String birth_data = String.valueOf(rs.getString("birth_data"));
                 String bloodtype = String.valueOf(rs.getString("blood_type"));
                 String gender = String.valueOf(rs.getString("gender"));
                 String ssn = String.valueOf(rs.getString("SSN"));

                 
                 String database[] = {
                     id,Lname,Fname,birth_data,bloodtype,gender,ssn};
               tblModel = (DefaultTableModel)jTable1.getModel();
                 tblModel.addRow(database);

             }  
             
                     
    con.close();
    
}catch(Exception e){
             System.out.println(e.getMessage());
       
}
    }//GEN-LAST:event_txtSEARCHKeyReleased

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
            java.util.logging.Logger.getLogger(CriminalsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriminalsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriminalsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriminalsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriminalsPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDELETED1;
    private javax.swing.JTextField txtSEARCH;
    // End of variables declaration//GEN-END:variables
}