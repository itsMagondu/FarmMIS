/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ChicksPurchase.java
 *
 * Created on May 13, 2010, 10:30:19 PM
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
public class ChickenRecords extends javax.swing.JFrame {
private Vector<Vector> tableData;
    /** Creates new form ChicksPurchase */
    public ChickenRecords() {
        initComponents();
        Date();
        TryStatements();
       tableData = new Vector<Vector>();
       ImageIcon goImage =  new ImageIcon("go.gif");
       Save.setIcon(goImage);
       ImageIcon backImage =  new ImageIcon("back.gif");
       Back1.setIcon(backImage);
        setLocationRelativeTo(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PenNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ChicksTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Breed = new javax.swing.JTextField();
        Gender = new javax.swing.JComboBox();
        Save = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        Date = new javax.swing.JFormattedTextField(createFormatter("##-##-####"));
        Colour = new javax.swing.JLabel();
        FarmID = new javax.swing.JComboBox();
        Back1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        SearchTable1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        SearchField = new javax.swing.JFormattedTextField();
        SearchButton = new javax.swing.JButton();
        DisplayDate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        SearchParameters = new javax.swing.JComboBox();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Pen Name:");

        jLabel1.setText("Date:");

        jLabel4.setText("Number of chicks:");

        jLabel5.setText("Breed");

        jLabel6.setBackground(new java.awt.Color(0, 204, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel6.setForeground(new java.awt.Color(102, 255, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CHICKEN RECORDS");
        jLabel6.setOpaque(true);

        jLabel8.setText("Sex:");

        Gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "broilers", "layers"}));

        Save.setBorder(null);
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(51, 255, 255));
        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jLabel7.setForeground(new java.awt.Color(51, 255, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MARINA LIVESTOCK FARM");
        jLabel7.setOpaque(true);

        jLabel9.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12));
        jLabel9.setText("Batch ID:");

        ID.setBackground(new java.awt.Color(204, 204, 204));
        ID.setFont(new java.awt.Font("Tahoma", 0, 14));
        ID.setOpaque(true);

        Colour.setText("FarmID");

        FarmID.setModel(new javax.swing.DefaultComboBoxModel(new String[] {""}));

        Back1.setBorder(null);
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });

        SearchTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", "", "", ""
            }
        ));
        jScrollPane2.setViewportView(SearchTable1);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel13.setText("Back");

        jLabel14.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14));
        jLabel14.setText("Search records here by:");

        SearchButton.setText(">>");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        DisplayDate.setEditable(false);

        jLabel11.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14));
        jLabel11.setText("Records your data here:");

        SearchParameters.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "","BatchID","PenName","Breed","DoP","Sex","Number","FarmID" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                .addGap(1, 1, 1))
            .addGroup(layout.createSequentialGroup()
                .addComponent(DisplayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(455, 455, 455))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(577, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(Colour))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ChicksTotal)
                            .addComponent(Breed)
                            .addComponent(PenNumber)
                            .addComponent(Date, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FarmID, 0, 237, Short.MAX_VALUE))))
                .addGap(59, 59, 59)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchParameters, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(SearchField, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(SearchButton)
                                .addGap(198, 198, 198)))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DisplayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(PenNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ChicksTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Breed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FarmID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Colour))
                        .addGap(28, 28, 28)
                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(jLabel9))
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(SearchParameters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchButton))
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap())
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

 "SELECT BarnID FROM cattleshelter");

while (srs.next())

{
     String barnID  = srs.getString("BarnID");
     FarmID.addItem(barnID);
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
{
        Calendar now = Calendar.getInstance();
            int y = now.get(Calendar.YEAR);
            int m = (now.get(Calendar.MONTH))+1;
            int d = now.get(Calendar.DATE);
           DisplayDate.setText("Today's date is " + d + " / " + m + " / " + y);
           DisplayDate.setVisible(true);

}

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
int yesNo =JOptionPane.YES_NO_OPTION;
  int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to save this data?", "CONFIRMATION", yesNo);

if (option == JOptionPane.YES_OPTION)
{

            try{
                String date = Date.getText();
                String pen = PenNumber.getText();
                String breed= Breed.getText();
                Object sex = Gender.getSelectedItem();
                String number = ChicksTotal.getText();
                String farm = (String) FarmID.getSelectedItem();


                Class.forName("com.mysql.jdbc.Driver");
                Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/integratedfarmsystemnnew", "root", "");
                PreparedStatement pstmt = conect.prepareStatement(
                        "INSERT into chickenrecords(PenName,Breed,DoP,Sex,number,FarmID) values(?,?,?,?,?,?)");
                pstmt.setString(1, pen);
                pstmt.setString(2, breed);
                pstmt.setString(3, date);
                pstmt.setString(4, (String) sex);
                pstmt.setString(5 , number);
                pstmt.setString(6, farm);
                pstmt.executeUpdate();
                Statement stmt = conect.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);
                ResultSet srs = stmt.executeQuery(
                        "SELECT BatchID FROM chickenRecords where PenName = \""+pen+"\" and DoP =\"" +date+"\"");
                while (srs.next()) {
                    String id = srs.getString("BatchID");
                    ID.setText(id);
                }
JOptionPane.showMessageDialog(null, "Your records have been saved.\n Check on the window for the BatchID assigned ");
            }catch(SQLException e) {
                System.out.println("2 Error : "+e);
                JOptionPane.showMessageDialog(null, "There is something wrong with your data.\n Please revise your entries");
            } catch(Exception ex) {
                System.out.println("Error 1:"+ex);
                JOptionPane.showMessageDialog(null, "There is something wrong with your data.\n Please revise your entries");
            }


        }
        else
{
JOptionPane.showMessageDialog(null, "you have aborted the save operation");
}
}//GEN-LAST:event_SaveActionPerformed

    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed

        SelectionWindow win = new SelectionWindow();
        win.setVisible(true);
        this.dispose();
}//GEN-LAST:event_Back1ActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        String search = SearchField.getText();
        String parameter = (String) SearchParameters.getSelectedItem();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/integratedfarmsystemnnew", "root", "");
            Statement stmt = conect.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            ResultSet srs = stmt.executeQuery(
                    "SELECT * FROM Chickenrecords where "+parameter+" =\"" +search+"\"");
            while (srs.next()) {

                String batch = srs.getString("BatchID");
                String pen = srs.getString("penName");
                String breed = srs.getString("breed");
                String date = srs.getString("DoP");
                String sex = srs.getString("Sex");
                String number = srs.getString("Number");
                String farm = srs.getString("FarmID");

                tableData.add(toVector(batch,pen,breed,date,sex,number,farm));

            }
            Vector columns = new Vector();
            columns.add("Batch");
            columns.add("Pen");
            columns.add("Breed");
            columns.add("Date");
            columns.add("Sex");
            columns.add("Number");
            columns.add("Farm");
            SearchTable1.setModel(new DefaultTableModel(tableData, columns));
        }

        catch(SQLException e) {
            System.out.println("2 Error : "+e);
        } catch(Exception ex) {
            System.out.println("Error 1:"+ex);
        }
}//GEN-LAST:event_SearchButtonActionPerformed
 private Vector toVector(String batch, String pen,String breed,  String date, String sex, String number, String farm)
     {
        Vector vector = new Vector();
        vector.add(batch);
        vector.add(date);
        vector.add(pen);
        vector.add(breed);
        vector.add(sex);
        vector.add(number);
        vector.add(farm);
        return vector;
      }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChickenRecords().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back1;
    private javax.swing.JTextField Breed;
    private javax.swing.JTextField ChicksTotal;
    private javax.swing.JLabel Colour;
    private javax.swing.JFormattedTextField Date;
    private javax.swing.JTextField DisplayDate;
    private javax.swing.JComboBox FarmID;
    private javax.swing.JComboBox Gender;
    private javax.swing.JLabel ID;
    private javax.swing.JTextField PenNumber;
    private javax.swing.JButton Save;
    private javax.swing.JButton SearchButton;
    private javax.swing.JFormattedTextField SearchField;
    private javax.swing.JComboBox SearchParameters;
    private javax.swing.JTable SearchTable1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

}
