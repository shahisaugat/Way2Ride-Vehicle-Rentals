package app.vehicle.authentication;

import java.awt.Cursor;
import app.vehicle.main.Application;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import javax.swing.JOptionPane;
import raven.toast.Notifications;

public class RegisterCustomer extends javax.swing.JPanel {
    
    private final Cursor handCursor;
    
    public RegisterCustomer() {
        initComponents();
        handCursor = new Cursor(Cursor.HAND_CURSOR);
        continueRegisterBtn.setCursor(handCursor);
        OpnLoginButton.setCursor(handCursor);
    }

    public String getFullNameTextField() {
        String fullName = fullNameTextField.getText();
        return fullName;
    }
    
    public String getEmailTextField() {
        String emailAddress = emailTextField.getText();
        return emailAddress;
    }
    
    public String getCountryTextField() {
        String countryName = countryTextField.getText();
        return countryName;
    }
    
    private boolean isValidPhoneNumber(String phoneNo) {
        return phoneNo.length() == 10 && phoneNo.matches("\\d+");
    }
    
    public String getContactTextField() {
        String phoneNo = contactTextField.getText();
        return phoneNo;
    }
    
    public String getAddressTextField() {
        String homeAddress = addressTextField.getText();
        return homeAddress;
    }
    
    
    
    private boolean isStrongPassword(String password) {
    return password.length() >= 7 && 
           password.matches(".*[A-Z].*") &&
           password.matches(".*\\d.*") &&
           password.matches(".*[!@#$%].*");
    }
    
    public String getPwdTextField() {
            String hashedPassword = hashPassword(pwdTextField.getText());
        return hashedPassword;
    }
    
    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());
            return bytesToHex(hash);
        } catch (NoSuchAlgorithmException e) {
            System.out.print(e);
            return null;
        }
    }
    
    private String bytesToHex(byte[] bytes) {
        Formatter formatter = new Formatter();
        for (byte b : bytes) {
            formatter.format("%02x", b);
        }
        return formatter.toString();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pictureBox2 = new app.vehicle.design.PictureBox();
        registerText = new javax.swing.JLabel();
        countryLabel = new javax.swing.JLabel();
        contactTextField = new javax.swing.JTextField();
        contactLabel = new javax.swing.JLabel();
        countryTextField = new javax.swing.JTextField();
        pwdLabel = new javax.swing.JLabel();
        pwdTextField = new javax.swing.JTextField();
        fullNameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        fullNameTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        continueRegisterBtn = new javax.swing.JButton();
        policyCheckBox = new javax.swing.JCheckBox();
        IconSignup = new javax.swing.JLabel();
        OpnLoginText = new javax.swing.JLabel();
        OpnLoginButton = new javax.swing.JLabel();

        pictureBox2.setImage(new javax.swing.ImageIcon(getClass().getResource("/app/vehicle/logo/SignupBackground.png"))); // NOI18N

        registerText.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        registerText.setForeground(new java.awt.Color(255, 92, 0));
        registerText.setText("Create a new user account!");
        pictureBox2.add(registerText);
        registerText.setBounds(810, 60, 300, 40);

        countryLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        countryLabel.setText("Country");
        pictureBox2.add(countryLabel);
        countryLabel.setBounds(990, 240, 80, 22);

        contactTextField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pictureBox2.add(contactTextField);
        contactTextField.setBounds(660, 490, 270, 36);

        contactLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        contactLabel.setText("Contact Number");
        pictureBox2.add(contactLabel);
        contactLabel.setBounds(660, 460, 120, 22);

        countryTextField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pictureBox2.add(countryTextField);
        countryTextField.setBounds(990, 270, 270, 36);

        pwdLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pwdLabel.setText("Create a Password");
        pictureBox2.add(pwdLabel);
        pwdLabel.setBounds(990, 460, 130, 22);

        pwdTextField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pictureBox2.add(pwdTextField);
        pwdTextField.setBounds(990, 490, 270, 36);

        fullNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fullNameLabel.setText("Full Name");
        pictureBox2.add(fullNameLabel);
        fullNameLabel.setBounds(660, 240, 80, 22);

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        emailLabel.setText("Email Address");
        pictureBox2.add(emailLabel);
        emailLabel.setBounds(660, 350, 110, 22);

        fullNameTextField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pictureBox2.add(fullNameTextField);
        fullNameTextField.setBounds(660, 270, 270, 36);

        emailTextField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pictureBox2.add(emailTextField);
        emailTextField.setBounds(660, 380, 270, 36);

        addressTextField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pictureBox2.add(addressTextField);
        addressTextField.setBounds(990, 380, 270, 36);

        addressLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        addressLabel.setText("Home Address");
        pictureBox2.add(addressLabel);
        addressLabel.setBounds(990, 350, 110, 22);

        continueRegisterBtn.setBackground(new java.awt.Color(255, 92, 0));
        continueRegisterBtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        continueRegisterBtn.setForeground(new java.awt.Color(255, 255, 255));
        continueRegisterBtn.setText("CONTINUE");
        continueRegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueRegisterBtnActionPerformed(evt);
            }
        });
        pictureBox2.add(continueRegisterBtn);
        continueRegisterBtn.setBounds(660, 630, 602, 40);

        policyCheckBox.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        policyCheckBox.setText("By clicking Continue, you agree to Way2Ride's User Agreement & Privacy Policy.");
        policyCheckBox.setIconTextGap(10);
        policyCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                policyCheckBoxActionPerformed(evt);
            }
        });
        pictureBox2.add(policyCheckBox);
        policyCheckBox.setBounds(660, 560, 570, 25);

        IconSignup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vehicle/logo/UserIcon.png"))); // NOI18N
        pictureBox2.add(IconSignup);
        IconSignup.setBounds(924, 130, 50, 50);

        OpnLoginText.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        OpnLoginText.setText("Already have an account?");
        pictureBox2.add(OpnLoginText);
        OpnLoginText.setBounds(840, 700, 190, 22);

        OpnLoginButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        OpnLoginButton.setText("Login");
        OpnLoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpnLoginButtonMouseClicked(evt);
            }
        });
        pictureBox2.add(OpnLoginButton);
        OpnLoginButton.setBounds(1030, 696, 50, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pictureBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 1366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pictureBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void policyCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_policyCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_policyCheckBoxActionPerformed

    private void continueRegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueRegisterBtnActionPerformed
        if (getContactTextField().isEmpty() || getCountryTextField().isEmpty() || getEmailTextField().isEmpty() || getAddressTextField().isEmpty() || getFullNameTextField().isEmpty() || getPwdTextField().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all the credentials and proceed!");
            return;
        } else if (!isValidPhoneNumber(contactTextField.getText())) {
            JOptionPane.showMessageDialog(this, "Phone Number must be 10 digits long.");
            return;
        } else if (!isStrongPassword(pwdTextField.getText())) {
            JOptionPane.showMessageDialog(this, "Password must be strong");
            return;
        } else {
            SecurityQsnForm.registerCustomer = this;
            Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.TOP_CENTER, "User details saved successfully. Proceed to the next step");
            Application.openCustomerDocsForm();
        }
    }//GEN-LAST:event_continueRegisterBtnActionPerformed

    private void OpnLoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpnLoginButtonMouseClicked
        Application.openLoginForm();
    }//GEN-LAST:event_OpnLoginButtonMouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconSignup;
    private javax.swing.JLabel OpnLoginButton;
    private javax.swing.JLabel OpnLoginText;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JTextField contactTextField;
    private javax.swing.JButton continueRegisterBtn;
    private javax.swing.JLabel countryLabel;
    private javax.swing.JTextField countryTextField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel fullNameLabel;
    private javax.swing.JTextField fullNameTextField;
    private app.vehicle.design.PictureBox pictureBox2;
    private javax.swing.JCheckBox policyCheckBox;
    private javax.swing.JLabel pwdLabel;
    private javax.swing.JTextField pwdTextField;
    private javax.swing.JLabel registerText;
    // End of variables declaration//GEN-END:variables
}
