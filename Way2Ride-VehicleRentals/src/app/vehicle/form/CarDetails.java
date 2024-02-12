
package app.vehicle.form;

import app.vehicle.component.CarDesc;
import app.vehicle.modelItem.ModelDesc;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;

/**
 *
 * @author basne
 */
public class CarDetails extends javax.swing.JPanel {
     private CarDesc carDesc;

    public CarDetails() {
        initComponents();
//         try {
//             dashboard = new Dashboard();
//         } catch (FontFormatException ex) {
//             Logger.getLogger(CarDetails.class.getName()).log(Level.SEVERE, null, ex);
//         }
//         ModelItem[][] modelItems = dashboard.getModelItems();

//// Assuming there is at least one element in the first dimension
//if (modelItems.length >= 1) {
//    // Access the carBrand from the first row and second column
//    String carBrand = dashboard.getFirstRowThirdColumnValue(); // Replace with the actual getter method for brand
//
//    // Use carBrand to conditionally add a ModelDesc
//    if ("Bugatti".equals(carBrand)) {
//        addDesc(new ModelDesc(
//            modelItems[0][0].getCarType(),        // Replace with the actual getter method
//            modelItems[0][0].getCarFeatures(),    // Replace with the actual getter method
//            modelItems[0][0].getCarMilage(),       // Replace with the actual getter method
//            modelItems[0][0].getCarPrice(), // Replace with the actual getter method
//            new JTextArea("this is Text1"), 
//            new JTextArea("This is Text2"), 
//            new JTextArea("This is text 3"),
//            new JTextArea("Text4"), 
//            modelItems[0][0].getImage1()));  // Replace with the actual getter method for ImageIcon
//    }
//}
//
////        if(dashboard.getModelItems())
//        addDesc(new ModelDesc("Luxury", "Features", "Bugatti", "Non-Electric",
//        new JTextArea("this is Text1"), new JTextArea("This is Text2"), new JTextArea("This is text 3"),
//        new JTextArea("Text4"), new ImageIcon(ModelDesc.class.getResource("/app/dashboard/png/img1bg.png"))));
//
//        
    }
     public void addDesc(ModelDesc data1){
        CarDesc carDesc = new CarDesc();
        carDesc.setData1(data1);
        panelItem1.add(carDesc);
        panelItem1.repaint();
        panelItem1.revalidate();
     }
    

     public void updateDetails(ModelDesc modelDesc) {
        carDesc.setData1(modelDesc);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelItem1 = new app.vehicle.design.PanelItem();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelItem1, javax.swing.GroupLayout.DEFAULT_SIZE, 984, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelItem1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.vehicle.design.PanelItem panelItem1;
    // End of variables declaration//GEN-END:variables
}
