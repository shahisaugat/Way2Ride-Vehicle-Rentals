package app.vehicle.form;

import app.vehicle.authentication.LoginForm;
import app.vehicle.authentication.RegisterDocument;
import app.vehicle.dao.ProfileChangeDAO;
import app.vehicle.model.FetchDataModel;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import raven.toast.Notifications;


public class Settings extends javax.swing.JPanel {
    private ChangePassword changePassword;
    private JDialog changePasswordDialog;
    private PasswordStrength checkPasswordStrength;
    private JDialog checkPasswordStrengthDialog;
    
    private File selectedFile;
    private byte[] imageData;

    public Settings() {
        initComponents();
        populateFields();
        changePassword = new ChangePassword();

        changePasswordDialog = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), "Payment Details", true);
        changePasswordDialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        changePasswordDialog.getContentPane().add(changePassword);
        changePasswordDialog.pack();
        
        checkPasswordStrength = new PasswordStrength();

        checkPasswordStrengthDialog = new JDialog((JFrame) SwingUtilities.getWindowAncestor(this), "Payment Details", true);
        checkPasswordStrengthDialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        checkPasswordStrengthDialog.getContentPane().add(checkPasswordStrength);
        checkPasswordStrengthDialog.pack();
        
    }
    
    String storedEmail = LoginForm.getStoredUserEmail();
    
    ProfileChangeDAO profileDAO = new ProfileChangeDAO();
    FetchDataModel fetchData = profileDAO.fetchCustomerData(storedEmail);
    
    private void populateFields() {
    if (fetchData != null) {
        fullNameField.setText(fetchData.getFullName());
        contactField.setText(fetchData.getContactNo());
        homeAddressField.setText(fetchData.getHomeAddress());
        licenseNumberField.setText(fetchData.getLicenseNumber());
        issueDateField.setText(fetchData.getIssuedDate());
        expiryDateField.setText(fetchData.getExpiryDate());
        byte[] profilePicture = fetchData.getProfileImage();
        
        
       if (profilePicture != null) {
           ImageIcon img = new ImageIcon(profilePicture);
           imageAvatar1.setImage(img);
       }
    }
    }
    
    private void saveChanges() {
        
        String fullName = fullNameField.getText();
        String contactNo = contactField.getText();
        String homeAddress = homeAddressField.getText();
        String licenseNumber = licenseNumberField.getText();
        String issuedDate = issueDateField.getText();
        String expiryDate = expiryDateField.getText();

        fetchData.setFullName(fullName);
        fetchData.setContactNo(contactNo);
        fetchData.setHomeAddress(homeAddress);
        fetchData.setLicenseNumber(licenseNumber);
        fetchData.setIssuedDate(issuedDate);
        fetchData.setExpiryDate(expiryDate);
        fetchData.setEmailAddress(storedEmail);

        
        boolean success = profileDAO.updateCustomerData(fetchData);

        if (success) {
            Notifications.getInstance().show(Notifications.Type.SUCCESS, "Changes Saved Successfully!");
        } else {
            Notifications.getInstance().show(Notifications.Type.ERROR, "Error occured");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        panelShadow1 = new app.admin.design.PanelShadow();
        jLabel1 = new javax.swing.JLabel();
        fullNameField = new javax.swing.JTextField();
        contactField = new javax.swing.JTextField();
        imageAvatar1 = new app.vehicle.design.ImageAvatar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        shippingAddressField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        postalCodeField = new javax.swing.JTextField();
        homeAddressField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        licenseNumberField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        issueDateField = new javax.swing.JTextField();
        expiryDateField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        changePasswordButton = new javax.swing.JButton();
        checkPasswordStrengthButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jTextField4.setText("jTextField1");

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 92, 0));
        jLabel1.setText("Password & Settings");

        fullNameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        contactField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        imageAvatar1.setBorderSize(4);
        imageAvatar1.setGradientColor1(new java.awt.Color(255, 255, 0));
        imageAvatar1.setGradientColor2(new java.awt.Color(255, 153, 0));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Profile Management");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Full Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Contact Number");

        shippingAddressField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Shipping Address");

        postalCodeField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        homeAddressField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Postal Code");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Home Address");

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Document Management");

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/vehicle/component/Vector (7).png"))); // NOI18N
        jLabel5.setText("Change");
        jLabel5.setIconTextGap(8);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        licenseNumberField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("License Number");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Issued Date");

        issueDateField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        expiryDateField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Expiry Date");

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("Password & Security");

        changePasswordButton.setText("Change your password");
        changePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordButtonActionPerformed(evt);
            }
        });

        checkPasswordStrengthButton.setText("Check your password's strength");
        checkPasswordStrengthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPasswordStrengthButtonActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 92, 0));
        jButton3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Save Changes");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel15)
                            .addGroup(panelShadow1Layout.createSequentialGroup()
                                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelShadow1Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(imageAvatar1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(56, 56, 56)
                                        .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(postalCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9)
                                            .addComponent(fullNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3)))
                                    .addComponent(changePasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(homeAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelShadow1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(172, 172, 172)
                                        .addComponent(jLabel8))
                                    .addGroup(panelShadow1Layout.createSequentialGroup()
                                        .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(shippingAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(checkPasswordStrengthButton, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(panelShadow1Layout.createSequentialGroup()
                                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(181, 181, 181))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShadow1Layout.createSequentialGroup()
                                        .addComponent(licenseNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)))
                                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(issueDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(49, 49, 49)
                                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(expiryDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14)))))
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fullNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shippingAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postalCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(homeAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkPasswordStrengthButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changePasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(licenseNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expiryDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(issueDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        saveChanges();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        JFileChooser fileChooser = new JFileChooser();
        
        FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image files", "png", "jpeg", "jpg", "gif");
        fileChooser.setFileFilter(imageFilter);
        
        int result = fileChooser.showOpenDialog(this);
        
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
            String imageName = selectedFile.getName();
            if (imageFilter.accept(selectedFile)) {
                displayImage(selectedFile);
                if (imageName != null) {
                    try {
                       imageData = Files.readAllBytes(selectedFile.toPath());
                    } catch (IOException ex) {
                        Logger.getLogger(RegisterDocument.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Invalid Image Format!");
                } 
            }
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void changePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordButtonActionPerformed
        changePasswordDialog();
    }//GEN-LAST:event_changePasswordButtonActionPerformed

    private void checkPasswordStrengthButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPasswordStrengthButtonActionPerformed
        checkPasswordStrengthDialog();
    }//GEN-LAST:event_checkPasswordStrengthButtonActionPerformed

    public File getSelectedFile() {
        return selectedFile;
    }
    
    public byte[] getImageData() {
        return imageData;
    }
    
    public void displayImage(File selectedFile) {
        try {
            BufferedImage img = ImageIO.read(selectedFile);
            ImageIcon icon = new ImageIcon(img);
            imageAvatar1.setImage(icon);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    private void changePasswordDialog() {
       int centerX = (int) (this.getTopLevelAncestor().getLocationOnScreen().getX() + this.getTopLevelAncestor().getSize().getWidth() / 2 - changePasswordDialog.getWidth() / 2);
        int centerY = (int) (this.getTopLevelAncestor().getLocationOnScreen().getY() + this.getTopLevelAncestor().getSize().getHeight() / 2 - changePasswordDialog.getHeight() / 2);

        // Set the location of the dialog
        changePasswordDialog.setLocation(centerX, centerY);

        // Make the dialog visible
        changePasswordDialog.setVisible(true);
    }
    private void checkPasswordStrengthDialog() {
       int centerX = (int) (this.getTopLevelAncestor().getLocationOnScreen().getX() + this.getTopLevelAncestor().getSize().getWidth() / 2 - checkPasswordStrengthDialog.getWidth() / 2);
        int centerY = (int) (this.getTopLevelAncestor().getLocationOnScreen().getY() + this.getTopLevelAncestor().getSize().getHeight() / 2 - checkPasswordStrengthDialog.getHeight() / 2);

        // Set the location of the dialog
        checkPasswordStrengthDialog.setLocation(centerX, centerY);

        // Make the dialog visible
        checkPasswordStrengthDialog.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changePasswordButton;
    private javax.swing.JButton checkPasswordStrengthButton;
    private javax.swing.JTextField contactField;
    private javax.swing.JTextField expiryDateField;
    private javax.swing.JTextField fullNameField;
    private javax.swing.JTextField homeAddressField;
    private app.vehicle.design.ImageAvatar imageAvatar1;
    private javax.swing.JTextField issueDateField;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField licenseNumberField;
    private app.admin.design.PanelShadow panelShadow1;
    private javax.swing.JTextField postalCodeField;
    private javax.swing.JTextField shippingAddressField;
    // End of variables declaration//GEN-END:variables
}
