/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SelectionWindow.java
 *
 * Created on Jun 29, 2010, 11:20:52 PM
 */

package integartedfarmsystem;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.*;

/**
 *
 * @author Magondu
 */
public class SelectionWindow extends javax.swing.JFrame {

    /** Creates new form SelectionWindow */
    public SelectionWindow() {
        initComponents();
        ImageIcon chicken =  new ImageIcon("chicken.gif");
      jLabel1.setIcon(chicken);
      ImageIcon cow =  new ImageIcon("Cow.gif");
      jLabel4.setIcon(cow);
      ImageIcon store =  new ImageIcon("store.gif");
      jLabel16.setIcon(store);
      ImageIcon personnel=  new ImageIcon("personnel.gif");
      jLabel17.setIcon(personnel);
      ImageIcon farm=  new ImageIcon("farm.gif");
      jLabel18.setIcon(farm);

      setLocationRelativeTo(null);

     tree.addTreeSelectionListener(new TreeSelectionListener() {
         
         public void valueChanged(TreeSelectionEvent e) {
                DefaultMutableTreeNode node = (DefaultMutableTreeNode)
                       tree.getLastSelectedPathComponent();

                if (node == null){
                     //Nothing is selected.
                     return;
                }

              

                Object[] chickenProduction = new Object[]{"GENERAL GUIDE", "Poultry guide","Production"};

                Object[] path1 = node.getUserObjectPath();
                if(Arrays.equals(path1, chickenProduction)){
                    GuidePane.setText("Broilers are considered important because they serve as a source \n " +
                            "of animal protein by providing meat due to their fast growth rate.\n " +
                            " They are a reliable source of income to small scale farmers since the " +
                            "starting capital requirement is not very high and the return is faster (6-8 weeks.)");
                }

                Object[] chickenHousing = new Object[]{"GENERAL GUIDE", "Poultry guide","Housing"};

                Object[] path2 = node.getUserObjectPath();
                if(Arrays.equals(path2, chickenHousing)){
                    GuidePane.setText("A major requirement is the stocking density which is influenced by the " +
                            "size of the birds. Broilers can be raised in one house up to the market age or can be " +
                            "started in a separate brooder house. Stocking rates are set at 1 square foot per bird."+
                            "This house requires the feeding and watering strategically placed for easier access to" +
                            " food and water. For the first 5 weeks, 5cm linear feeding space should be available for" +
                            " one bird i.e 40 chicks per 1 m long trough at 5-8 weeks."+
                            "7.5cm linear space i.e 25 chicks per 1m long trough, 2 round drinkers and feeders are idea"+
                            "for 100 birds. The height of feeding and drinking equipment should be adjusted to the level " +
                            "of the bird back to avoid feed wastage and water leakage.");
          }
                Object[] chickenBeddings = new Object[]{"GENERAL GUIDE", "Poultry guide","Beddings"};

                Object[] path3 = node.getUserObjectPath();
                if(Arrays.equals(path3, chickenBeddings)){
                    GuidePane.setText("Litter is necessary to protect the birds from the cold floor and keep the house warm." +
                            " It also absorbs moisture from the faeces and respiration thus the need for a highly absorbent" +
                            " material, readily available, cheap and free of pests and pesticide residue, materials commonly " +
                            "used are wood shavings, rice husks straw chopped to 10 cm pieces."+
                            "It is placed at a depth of 4-6 inches. The litter should be stirred with a fork and then caked" +
                            " of the wet one should be removed adding fresh material up to the end of production.");
                }

            Object[] chickenBrooding = new Object[]{"GENERAL GUIDE", "Poultry guide", "Brooding"};

                Object[] path4 = node.getUserObjectPath();
                if(Arrays.equals(path4, chickenBrooding)){
                    GuidePane.setText("This means supply of heat to keep the chicks warm before the chicks arrive, the brooder should have everything ready and heaters tested. The room should be heated at least 6 hours before the arrival of chicks."+
"Brooder should be kept at a constant temperature of 950F/350C for the first week and reduced at 50C per week for the next 2 weeks. This should be judged by the behavior of the chicks. If the brooder is too warm, the chicks will huddle away from the" +
                            " heat source with their wings spread. If it is too cold, they will huddle the heat source in the brooder."
);
          }

      Object[] chickenFeeding = new Object[]{"GENERAL GUIDE", "Poultry guide","Feeding"};

                Object[] path5 = node.getUserObjectPath();
                if(Arrays.equals(path5, chickenFeeding)){
                    GuidePane.setText("Broilers require protein and essential amino acids for growth of tissues and body repair. They also need carbohydrates and fats to provide "+
"energy. Minerals are required for bone formation and other physiological process. Farm Feeds have been specially formulated to fulfill all those requirements."
                            );

                }}
        });
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void valueChanged(TreeSelectionEvent e) {
    
    
}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        FeedingRecords = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        MilkProductionRecords = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        TreatmentRecords = new javax.swing.JButton();
        CalvingRecords = new javax.swing.JButton();
        SaleRecords = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        HousingRecords = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ChickenProduction = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ChickenSale = new javax.swing.JButton();
        ChicksPurchase = new javax.swing.JButton();
        ChickenVaccination = new javax.swing.JButton();
        BroilerButton = new javax.swing.JRadioButton();
        LayerButton = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        ChickenFeeding = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        MilkSale = new javax.swing.JButton();
        EggRecords = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        StoreInput = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        Clients = new javax.swing.JButton();
        Suppliers = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        FarmRecords = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tree = new javax.swing.JTree();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        GuidePane = new javax.swing.JTextPane();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(153, 255, 255));
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(74, 108));

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        FeedingRecords.setText("OK");
        FeedingRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeedingRecordsActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel9.setText("Medical records:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel10.setText("Milk Production:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel11.setText("Cattle records:");

        MilkProductionRecords.setText("OK");
        MilkProductionRecords.setBorderPainted(false);
        MilkProductionRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MilkProductionRecordsActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel12.setText("Sale records:");

        TreatmentRecords.setText("OK");
        TreatmentRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TreatmentRecordsActionPerformed(evt);
            }
        });

        CalvingRecords.setText("OK");
        CalvingRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalvingRecordsActionPerformed(evt);
            }
        });

        SaleRecords.setText("OK");
        SaleRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaleRecordsActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel15.setText("Feeding records: ");

        HousingRecords.setText("OK");
        HousingRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HousingRecordsActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel21.setText("Barn records:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel15)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SaleRecords)
                    .addComponent(HousingRecords)
                    .addComponent(TreatmentRecords)
                    .addComponent(FeedingRecords)
                    .addComponent(MilkProductionRecords)
                    .addComponent(CalvingRecords))
                .addGap(181, 181, 181))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(CalvingRecords))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(MilkProductionRecords))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(FeedingRecords))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(TreatmentRecords))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(SaleRecords))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(HousingRecords)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CATTLE", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        jLabel6.setText("EGG PRODUCTION:");

        ChickenProduction.setText("Ok");
        ChickenProduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChickenProductionActionPerformed(evt);
            }
        });

        jLabel5.setText("CHICKEN TREATMENT:");

        jLabel3.setText("CHICKEN RECORDS:");

        ChickenSale.setText("Ok");
        ChickenSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChickenSaleActionPerformed(evt);
            }
        });

        ChicksPurchase.setText("Ok");
        ChicksPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChicksPurchaseActionPerformed(evt);
            }
        });

        ChickenVaccination.setText("Ok");
        ChickenVaccination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChickenVaccinationActionPerformed(evt);
            }
        });

        BroilerButton.setBackground(new java.awt.Color(153, 255, 255));
        buttonGroup1.add(BroilerButton);
        BroilerButton.setText("BROILERS");
        BroilerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BroilerButtonActionPerformed(evt);
            }
        });

        LayerButton.setBackground(new java.awt.Color(153, 255, 255));
        buttonGroup1.add(LayerButton);
        LayerButton.setText("LAYERS");
        LayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LayerButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("CHICKEN SALE:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Please select the type of the ");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel14.setText("chicken before proceeeding");

        jLabel22.setText("CHICKEN FEEDING:");

        ChickenFeeding.setText("Ok");
        ChickenFeeding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChickenFeedingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel22))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ChickenFeeding)
                                    .addComponent(ChickenSale)
                                    .addComponent(ChickenProduction)
                                    .addComponent(ChicksPurchase)
                                    .addComponent(ChickenVaccination))
                                .addGap(37, 37, 37))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LayerButton)
                                    .addComponent(BroilerButton))
                                .addGap(46, 46, 46))
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(jLabel2))
                        .addGap(187, 187, 187))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(8, 8, 8)
                .addComponent(BroilerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LayerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ChickenProduction))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ChicksPurchase))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChickenVaccination)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChickenSale)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChickenFeeding)
                    .addComponent(jLabel22))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("POULTRY", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel23.setText("Egg sale records:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel24.setText("Milk sale records:");

        MilkSale.setText("OK");
        MilkSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MilkSaleActionPerformed(evt);
            }
        });

        EggRecords.setText("OK");
        EggRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EggRecordsActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel25.setText("Store input records:");

        StoreInput.setText("OK");
        StoreInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StoreInputActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14));
        jLabel20.setText("STORE RECORDS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StoreInput)
                            .addComponent(MilkSale)
                            .addComponent(EggRecords))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(63, 63, 63))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(EggRecords))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(MilkSale))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(StoreInput))
                        .addGap(116, 116, 116))))
        );

        jTabbedPane1.addTab("STORE ", jPanel3);

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel31.setText("Client records:");

        Clients.setText("OK");
        Clients.setBorderPainted(false);
        Clients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientsActionPerformed(evt);
            }
        });

        Suppliers.setText("OK");
        Suppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuppliersActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel32.setText("Supplier records:");

        jLabel33.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14));
        jLabel33.setText("PERSONNEL RECORDS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel31))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Clients)
                            .addComponent(Suppliers))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(67, 67, 67))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel33)
                        .addGap(47, 47, 47)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(Suppliers))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(Clients))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PERSONNEL", jPanel4);

        jPanel5.setBackground(new java.awt.Color(153, 255, 255));

        FarmRecords.setText(">>");
        FarmRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FarmRecordsActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel34.setText("Farm records:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FarmRecords)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(FarmRecords))
                .addGap(31, 31, 31))
        );

        jTabbedPane1.addTab("FARM", jPanel5);

        jPanel6.setBackground(new java.awt.Color(0, 255, 255));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("GENERAL GUIDE");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Poultry guide");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Production");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Housing");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Beddings");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Brooding");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Feeding");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        tree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(tree);

        jLabel30.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel30.setForeground(new java.awt.Color(51, 255, 51));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("MARINA LIVESTOCK FARM");

        jScrollPane1.setViewportView(GuidePane);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("GUIDE", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChickenProductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChickenProductionActionPerformed

        ChickenProduction win = new ChickenProduction();
        win.setVisible(true);
        this.dispose();
}//GEN-LAST:event_ChickenProductionActionPerformed

    private void ChickenSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChickenSaleActionPerformed

        ChickenSale win = new ChickenSale();
        win.setVisible(true);
        this.dispose();
}//GEN-LAST:event_ChickenSaleActionPerformed

    private void ChicksPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChicksPurchaseActionPerformed
        ChickenRecords win = new ChickenRecords();
        win.setVisible(true);
        this.dispose();
}//GEN-LAST:event_ChicksPurchaseActionPerformed

    private void ChickenVaccinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChickenVaccinationActionPerformed

        ChickenTreatment win = new ChickenTreatment();
        win.setVisible(true);
        this.dispose();
}//GEN-LAST:event_ChickenVaccinationActionPerformed

    private void BroilerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BroilerButtonActionPerformed

        if(BroilerButton.isSelected()) {
            ChickenProduction.setVisible(false);
            jLabel6.setVisible(false);
        }
}//GEN-LAST:event_BroilerButtonActionPerformed

    private void LayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LayerButtonActionPerformed

        if(LayerButton.isSelected()) {
            ChickenProduction.setVisible(true);
            jLabel6.setVisible(true);
        }
}//GEN-LAST:event_LayerButtonActionPerformed

    private void FeedingRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeedingRecordsActionPerformed

        CattleFeeding win = new CattleFeeding();
        win.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
}//GEN-LAST:event_FeedingRecordsActionPerformed

    private void MilkProductionRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MilkProductionRecordsActionPerformed

        milkproduction win = new milkproduction();
        win.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
}//GEN-LAST:event_MilkProductionRecordsActionPerformed

    private void TreatmentRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TreatmentRecordsActionPerformed
        TreatmentRecords win = new TreatmentRecords();
        win.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
}//GEN-LAST:event_TreatmentRecordsActionPerformed

    private void CalvingRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalvingRecordsActionPerformed

        CattleRecords win = new CattleRecords();
        win.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
}//GEN-LAST:event_CalvingRecordsActionPerformed

    private void SaleRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaleRecordsActionPerformed

        SaleRecords win = new SaleRecords();
        win.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
}//GEN-LAST:event_SaleRecordsActionPerformed

    private void FarmRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FarmRecordsActionPerformed

        FarmRecords win = new FarmRecords();
        win.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_FarmRecordsActionPerformed

    private void HousingRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HousingRecordsActionPerformed
        
        HousingRecords win = new HousingRecords();
        win.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
}//GEN-LAST:event_HousingRecordsActionPerformed

    private void ChickenFeedingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChickenFeedingActionPerformed

        ChickenFeeding win = new ChickenFeeding();
        win.setVisible(true);
        this.dispose();
}//GEN-LAST:event_ChickenFeedingActionPerformed

    private void MilkSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MilkSaleActionPerformed
       MilkSale win = new MilkSale();
       win.setVisible(true);
       this.dispose();

    }//GEN-LAST:event_MilkSaleActionPerformed

    private void EggRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EggRecordsActionPerformed
       
        EggSale win = new EggSale();
        win.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EggRecordsActionPerformed

    private void StoreInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StoreInputActionPerformed

        storedetails win = new storedetails();
        win.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_StoreInputActionPerformed

    private void ClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientsActionPerformed
      ClientRecords win = new ClientRecords();
      win.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_ClientsActionPerformed

    private void SuppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuppliersActionPerformed
        SupplierRecords win = new  SupplierRecords();
        win.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SuppliersActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            Logger.getLogger(SelectionWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectionWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BroilerButton;
    private javax.swing.JButton CalvingRecords;
    private javax.swing.JButton ChickenFeeding;
    private javax.swing.JButton ChickenProduction;
    private javax.swing.JButton ChickenSale;
    private javax.swing.JButton ChickenVaccination;
    private javax.swing.JButton ChicksPurchase;
    private javax.swing.JButton Clients;
    private javax.swing.JButton EggRecords;
    private javax.swing.JButton FarmRecords;
    private javax.swing.JButton FeedingRecords;
    private javax.swing.JTextPane GuidePane;
    private javax.swing.JButton HousingRecords;
    private javax.swing.JRadioButton LayerButton;
    private javax.swing.JButton MilkProductionRecords;
    private javax.swing.JButton MilkSale;
    private javax.swing.JButton SaleRecords;
    private javax.swing.JButton StoreInput;
    private javax.swing.JButton Suppliers;
    private javax.swing.JButton TreatmentRecords;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTree tree;
    // End of variables declaration//GEN-END:variables

}
