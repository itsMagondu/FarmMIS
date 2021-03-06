/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EggSale.java
 *
 * Created on Jul 9, 2010, 9:14:40 PM
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
public class EggSale extends javax.swing.JFrame {
private Vector<Vector> tableData;
    /** Creates new form EggSale */
    public EggSale() {
        initComponents();
        setLocationRelativeTo(null);
        Date();
        TryStatements();
       tableData = new Vector<Vector>();
       ImageIcon goImage =  new ImageIcon("go.gif");
       OK.setIcon(goImage);
       ImageIcon backImage =  new ImageIcon("back.gif");
       Back.setIcon(backImage);
   }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        SearchTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        SearchButton = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        ClientIDSearch = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ClientID = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        OK = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Quantity = new javax.swing.JTextField();
        Amount = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Date = new javax.swing.JFormattedTextField(createFormatter("##-##-####"));
        DisplayDate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        SearchTable1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        Back1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        SearchButton1 = new javax.swing.JButton();
        SearchParameters = new javax.swing.JComboBox();
        Search = new javax.swing.JTextField();

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

        jLabel12.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14));
        jLabel12.setText("Search records here by Client ID:");

        
        ClientIDSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----" }));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel11.setText("Back");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel6.setText("Client ID:");

        ClientID.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----" }));

        jLabel1.setText("Date:");

        jLabel2.setText("Quantity(Trays):");

        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 153, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel7.setForeground(new java.awt.Color(51, 255, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("EGG SALE RECORDS");
        jLabel7.setOpaque(true);

        jLabel10.setBackground(new java.awt.Color(51, 255, 255));
        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jLabel10.setForeground(new java.awt.Color(51, 255, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("MARINA LIVESTOCK FARM");
        jLabel10.setOpaque(true);

        jLabel5.setText("Amount:");

        DisplayDate.setEditable(false);

        jLabel8.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14));
        jLabel8.setText("Records your data here:");

        SearchTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", ""
            }
        ));
        jScrollPane2.setViewportView(SearchTable1);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel13.setText("Back");

        jLabel14.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14));
        jLabel14.setText("Search records here by:");


        SearchParameters.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "","EggsaleID","ClientID","Quantity","Amount","Date" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SearchButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel13))
                            .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Date)
                            .addComponent(ClientID, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Quantity, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(Amount))))
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(DisplayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchParameters, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(DisplayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ClientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(21, 21, 21)
                .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(SearchParameters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    
     public void TryStatements()
    {
         try{
         Class.forName("com.mysql.jdbc.Driver");
  Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/integratedfarmsystemnnew", "root", "");
  Statement stmt = conect.createStatement(ResultSet.TYPE_FORWARD_ONLY,
                              ResultSet.CONCUR_READ_ONLY);
ResultSet srs = stmt.executeQuery(

 "SELECT ClientID FROM clientrecords");

while (srs.next())

{
     String clientid  = srs.getString("ClientID");
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
     private void Date()
{ Calendar now = Calendar.getInstance();
            int y = now.get(Calendar.YEAR);
            int m = (now.get(Calendar.MONTH))+1;
            int d = now.get(Calendar.DATE);
           DisplayDate.setText("Today's date is " + d + " / " + m + " / " + y);
           DisplayDate.setVisible(true);

}

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
        int yesNoOption =  JOptionPane.YES_NO_OPTION ;
        int option = JOptionPane.showConfirmDialog(null,"Are you sure you want to save this information?","",yesNoOption);
        if (option == JOptionPane.YES_OPTION){
            try{
                String date = Date.getText();
                String quantity = Quantity.getText();
                String amount = Amount.getText();
                String buyer = (String) ClientID.getSelectedItem();


                Class.forName("com.mysql.jdbc.Driver");
                Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/integratedfarmsystemnnew", "root", "");
                PreparedStatement pstmt = conect.prepareStatement(
                        "INSERT into Eggsalerecords(clientID,quantity,Date,amount)  values(?,?,?,?)");
                pstmt.setString(1,buyer);
                pstmt.setString(2,quantity);
                pstmt.setString(3,date);
                pstmt.setString(4,amount);
                pstmt.executeUpdate();
JOptionPane.showMessageDialog(null, "Your Data has been saved");
            }


            catch(SQLException e) {
                System.out.println("2 Error : "+e);
            } catch(Exception ex) {
                System.out.println("Error 1:"+ex);
            }} else{JOptionPane.showMessageDialog(null, "You have not saved your data!!");}
}//GEN-LAST:event_OKActionPerformed

        
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed
        
        SelectionWindow win = new SelectionWindow();
        win.setVisible(true);
        this.dispose();
}//GEN-LAST:event_Back1ActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButton1ActionPerformed
      
        String search = Search.getText();
        String parameter = (String) SearchParameters.getSelectedItem();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/integratedfarmsystemnnew", "root", "");
            Statement stmt = conect.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            ResultSet srs = stmt.executeQuery(
                    "SELECT * FROM eggsalerecords where "+parameter+" =\"" +search+"\"");
            while (srs.next()) {
                String saleID = srs.getString("EggsaleID");
                String date = srs.getString("date");
                String amount = srs.getString("amount");
                String buyer = srs.getString("clientID");
                String quantity = srs.getString("Quantity");
             
                
                tableData.add(toVector(date,saleID , amount, buyer, quantity));
                
            }
            Vector columns = new Vector();
            columns.add("Date");
            columns.add("saleID");
            columns.add("Amount");
            columns.add("ClientID");
            columns.add("Quantity");
            
            SearchTable1.setModel(new DefaultTableModel(tableData, columns));
        }
        
        
        
        catch(SQLException e) {
            System.out.println("2 Error : "+e);
        } catch(Exception ex) {
            System.out.println("Error 1:"+ex);
        }   
        
    }//GEN-LAST:event_SearchButton1ActionPerformed
 private Vector toVector(String date, String saleID, String amount, String buyer, String quantity){
        Vector vector = new Vector();
        vector.add(date);
        vector.add(saleID);
        vector.add(amount);
        vector.add(buyer);
        vector.add(quantity);

        return vector;
      }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EggSale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Amount;
    private javax.swing.JButton Back;
    private javax.swing.JButton Back1;
    private javax.swing.JComboBox ClientID;
    private javax.swing.JComboBox ClientIDSearch;
    private javax.swing.JFormattedTextField Date;
    private javax.swing.JTextField DisplayDate;
    private javax.swing.JButton OK;
    private javax.swing.JTextField Quantity;
    private javax.swing.JTextField Search;
    private javax.swing.JButton SearchButton;
    private javax.swing.JButton SearchButton1;
    private javax.swing.JComboBox SearchParameters;
    private javax.swing.JTable SearchTable;
    private javax.swing.JTable SearchTable1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

}
