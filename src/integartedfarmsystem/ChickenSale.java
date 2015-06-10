/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ChickenSale.java
 *
 * Created on May 11, 2010, 5:18:44 PM
 */

package integartedfarmsystem;

import java.sql.*;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Magondu
 */
public class ChickenSale extends javax.swing.JFrame {
private Vector<Vector> tableData;
    /** Creates new form ChickenSale */
    public ChickenSale() {

        initComponents();
        Date();
        TryStatements();
       tableData = new Vector<Vector>();
       ImageIcon goImage =  new ImageIcon("go.gif");
       Save.setIcon(goImage);
       ImageIcon backImage =  new ImageIcon("back.gif");
       Back.setIcon(backImage);
        setLocationRelativeTo(null);

        

}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Save = new javax.swing.JButton();
        Amount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DateOfSale = new javax.swing.JFormattedTextField(createFormatter("##-##-####"));
        SearchButton = new javax.swing.JButton();
        Description = new javax.swing.JTextField();
        BatchID = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SearchTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DisplayDate = new javax.swing.JTextField();
        Search = new javax.swing.JTextField();
        SearchParameters = new javax.swing.JComboBox();
        ClientID = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        jLabel2.setText("Sold ChickenBatch:");

        jLabel1.setText("Date of Sale");

        jLabel6.setText("ClientID:");

        jLabel5.setText("Amount:");

        jLabel4.setText("Description:");

        SearchButton.setText(">>");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        BatchID.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----" }));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel11.setText("Back");

        Back.setBorder(null);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        SearchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", ""
            }
        ));
        jScrollPane1.setViewportView(SearchTable);

        jLabel10.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14));
        jLabel10.setText("Search records here by:");

        jLabel12.setBackground(new java.awt.Color(0, 153, 153));
        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jLabel12.setForeground(new java.awt.Color(51, 255, 51));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("MARINA LIVESTOCK FARM");
        jLabel12.setOpaque(true);

        jLabel7.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14));
        jLabel7.setText("Records your data here:");

        jLabel3.setBackground(new java.awt.Color(51, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel3.setForeground(new java.awt.Color(51, 255, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CHICKEN SALE RECORDS");
        jLabel3.setOpaque(true);

        DisplayDate.setEditable(false);

        SearchParameters.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "","SaleID","BatchID","Date","Description","Amount","ClientID" }));

        ClientID.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SearchButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel11))
                            .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(DisplayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(263, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(272, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ClientID, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DateOfSale)
                            .addComponent(Description)
                            .addComponent(BatchID, 0, 182, Short.MAX_VALUE)
                            .addComponent(Amount))))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchParameters, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DisplayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(DateOfSale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(BatchID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(Description, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ClientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(SearchParameters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchButton))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void TryStatements()
    {
         try{
         Class.forName("com.mysql.jdbc.Driver");
  Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/integratedfarmsystemnnew", "root", "");
  Statement stmt = conect.createStatement(ResultSet.TYPE_FORWARD_ONLY,
                              ResultSet.CONCUR_READ_ONLY);
ResultSet srs = stmt.executeQuery(

  "SELECT BatchID FROM chickenrecords");

while (srs.next())

{
     String batch  = srs.getString("batchID");
     BatchID.addItem(batch);
}
Statement stmt1 = conect.createStatement(ResultSet.TYPE_FORWARD_ONLY,
                              ResultSet.CONCUR_READ_ONLY);
ResultSet srs1 = stmt1.executeQuery(

 "SELECT ClientID FROM clientrecords");

while (srs1.next())

{
     String clientid  = srs1.getString("ClientID");
     ClientID.addItem(clientid);
}


        }

        catch(SQLException e)
			{
				System.out.println("2 Error : "+e);
			}
			catch(Exception ex)
			{
				System.out.println("Error 1:"+ex);
			}

    }

    public MaskFormatter createFormatter(String s) {
    MaskFormatter formatter = null;
    try {
        formatter = new MaskFormatter(s);
    } catch (java.text.ParseException exc) {
        System.err.println("formatter is bad: " + exc.getMessage());
        System.exit(-1);
    }
    return formatter;
    }


     private void Date()
{ Calendar now = Calendar.getInstance();
            int y = now.get(Calendar.YEAR);
            int m = (now.get(Calendar.MONTH))+1;
            int d = now.get(Calendar.DATE);
           DisplayDate.setText("Today's date is " + d + " / " + m + " / " + y);
           DisplayDate.setVisible(true);

}

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed

       int yesNoOption =  JOptionPane.YES_NO_OPTION ;
       int option = JOptionPane.showConfirmDialog(null,"Are you sure you want to save this information?","",yesNoOption);
        if (option == JOptionPane.YES_OPTION)
        {
             try{
            String Date = DateOfSale.getText();
            String Chickenbatch = (String) BatchID.getSelectedItem();
            String desc = Description.getText();
            String SaleAmount = Amount.getText();
            String buyer = (String) ClientID.getSelectedItem();
         
                
            Class.forName("com.mysql.jdbc.Driver");
            Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/integratedfarmsystemnnew", "root", "");
            PreparedStatement pstmt = conect.prepareStatement(
                    "INSERT into chickensale (batchID ,date, description ,amount, clientID) values(?,?,?,?,?)");
            pstmt.setString(1,Chickenbatch );
            pstmt.setString(2, Date);
            pstmt.setString(3, desc);
            pstmt.setString(4, SaleAmount);
            pstmt.setString(5, buyer);
            pstmt.executeUpdate();
            PreparedStatement pstmt1 = conect.prepareStatement(
               "DELETE FROM chickenRecords WHERE BatchID = \"" +Chickenbatch+"\"");
pstmt1.executeUpdate();
            JOptionPane.showMessageDialog(null, "Your records have been saved");

   
  }
   catch(SQLException e) {
            System.out.println("2 Error : "+e);
        } catch(Exception ex)
        {
            System.out.println("Error 1:"+ex);
        }

        }
    }//GEN-LAST:event_SaveActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
 
    String search = Search.getText();
    String parameter = (String) SearchParameters.getSelectedItem();
 try{
         Class.forName("com.mysql.jdbc.Driver");
  Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/integratedfarmsystemnnew", "root", "");
  Statement stmt = conect.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                     ResultSet.CONCUR_READ_ONLY);
ResultSet srs = stmt.executeQuery(
    "SELECT * FROM chickensale where "+parameter+" =\"" +search+"\"");
while (srs.next()) {
        String sold = srs.getString("batchID");
        String date = srs.getString("date");
        String amount = srs.getString("amount");
        String buyer = srs.getString("clientID");
        String saleID = srs.getString("saleID");
        String desc = srs.getString("description");
           
        tableData.add(toVector(date,sold ,desc , amount, buyer, saleID));

            }
            Vector columns = new Vector();
            columns.add("Date");
            columns.add("batchID");
            columns.add("Condition");
            columns.add("Amount");
            columns.add("Buyer");
            columns.add("SaleID");

            SearchTable.setModel(new DefaultTableModel(tableData, columns));
 }



         catch(SQLException e)
			{
				System.out.println("2 Error : "+e);
			}
			catch(Exception ex)
			{
				System.out.println("Error 1:"+ex);
			}

    }//GEN-LAST:event_SearchButtonActionPerformed


      private Vector toVector(String date,String batchID, String condition, String amount, String buyer, String saleID){
        Vector vector = new Vector();
        vector.add(date);
        vector.add(batchID);
        vector.add(condition);
        vector.add(amount);
        vector.add(buyer);
        vector.add(saleID);

        return vector;
      }

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed

        SelectionWindow win = new SelectionWindow();
        win.setVisible(true);
        this.dispose();
}//GEN-LAST:event_BackActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChickenSale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Amount;
    private javax.swing.JButton Back;
    private javax.swing.JComboBox BatchID;
    private javax.swing.JComboBox ClientID;
    private javax.swing.JFormattedTextField DateOfSale;
    private javax.swing.JTextField Description;
    private javax.swing.JTextField DisplayDate;
    private javax.swing.JButton Save;
    private javax.swing.JTextField Search;
    private javax.swing.JButton SearchButton;
    private javax.swing.JComboBox SearchParameters;
    private javax.swing.JTable SearchTable;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
