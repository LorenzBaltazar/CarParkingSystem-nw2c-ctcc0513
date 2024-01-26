
package ParkLAB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;



public class SignUp extends javax.swing.JFrame {

 
    public SignUp() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        emailAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        SignUpBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");
        setPreferredSize(new java.awt.Dimension(840, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fname.setBackground(java.awt.SystemColor.control);
        fname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fname.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 290, 40));

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel5.setText("Full name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        emailAddress.setBackground(java.awt.SystemColor.control);
        emailAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailAddress.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(emailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 290, 40));

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel6.setText("Email");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        pass.setBackground(java.awt.SystemColor.control);
        pass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pass.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 290, 40));

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel7.setText("Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        SignUpBtn.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        SignUpBtn.setForeground(new java.awt.Color(51, 51, 51));
        SignUpBtn.setText("Sign Up");
        SignUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SignUpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 91, 37));

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel8.setForeground(java.awt.SystemColor.textHighlight);
        jLabel8.setText("I have an account");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, -1, -1));

        jButton2.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 84, 31));

        jLabel9.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/SignUp.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SignUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpBtnActionPerformed
        // System.out.println("Sign up btn clicked");
        String fullName, email, Password, query;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:mysql://localhost:3306/java_user_database";
        SUser = "root";
        SPass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            if("".equals(fname.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Full Name is require", "Error",
                    JOptionPane.ERROR_MESSAGE);
            }else if("".equals(emailAddress.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Email Address is require", "Error",
                    JOptionPane.ERROR_MESSAGE);
            }else if("".equals(pass.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Password is require", "Error",
                    JOptionPane.ERROR_MESSAGE);
            }else {
                fullName = fname.getText();
                email    = emailAddress.getText();
                Password = pass.getText();
                System.out.println(Password);

                query = "INSERT INTO user(full_name, email, password)"+
                "VALUES('"+fullName+"', '"+email+"' , '"+Password+"')";

                st.execute(query);
                fname.setText("");
                emailAddress.setText("");
                pass.setText("");
                showMessageDialog(null, "New account has been created successfully!");
            }
        }catch(Exception e){
            System.out.println("Error!" + e.getMessage());
        }

    }//GEN-LAST:event_SignUpBtnActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignUpBtn;
    private javax.swing.JTextField emailAddress;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables
}
