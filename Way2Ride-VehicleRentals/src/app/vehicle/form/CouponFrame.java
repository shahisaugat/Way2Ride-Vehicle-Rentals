package app.vehicle.form;

import app.vehicle.design.ModernScrollBarUI;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author shahi
 */
public class CouponFrame extends javax.swing.JPanel {

    public CouponFrame() {
        
        initComponents();
        
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setViewportBorder(null);
        JScrollBar sb = jScrollPane1.getVerticalScrollBar();
        sb.setOpaque(false);
        sb.setForeground(Color.decode("#FF5C00"));
        sb.setPreferredSize(new Dimension(4, 100));
        sb.setUI(new ModernScrollBarUI());
        
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setViewportBorder(null);
        jScrollPane1.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$CouponCodes.background;");
        
        jPanel1.setLayout(new MigLayout("inset 2, fillx, wrap", "[fill]"));
        
        loadCodes();
    }
    
    private void loadCodes() {
        jPanel1.add(new CouponCodes("CARNEWX", "Get 5% cashback"));
        jPanel1.add(new CouponCodes("BLACKFRIDAY", "Get 10% cashback"));
        jPanel1.add(new CouponCodes("DASHAIN", "Get NRs. 1000 cashback"));
        jPanel1.add(new CouponCodes("NEWYR2025", "Get 15% cashback"));
        jPanel1.add(new CouponCodes("CSIF3HD", "Get 20% discount"));
        jPanel1.add(new CouponCodes("XWADEJ7", "Get 5% cashback"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setFocusable(false);
        jScrollPane1.setOpaque(false);

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 223, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 92, 0));
        jLabel1.setText("Coupon Codes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
