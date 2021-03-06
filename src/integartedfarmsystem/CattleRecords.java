/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CalvingRecords.java
 *
 * Created on Apr 30, 2010, 11:18:31 PM
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
public class CattleRecords extends javax.swing.JFrame {
private Vector<Vector> tableData;
    /** Creates new form CalvingRecords */
    public CattleRecords() {
        initComponents();
        TryStatements();
        Date();
         ImageIcon goImage =  new ImageIcon("go.gif");
       SaveButton.setIcon(goImage);
       ImageIcon backImage =  new ImageIcon("back.gif");
       Back1.setIcon(backImage);

        setLocationRelativeTo(null);
        tableData = new Vector<Vector>();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NumberAssigned = new javax.swing.JLabel();
        MotherIdentification = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        Breed = new javax.swing.JLabel();
        Colour = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Calf_breed = new javax.swing.JTextField();
        SaveButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Gender1 = new javax.swing.JComboBox();
        SearchButton = new javax.swing.JButton();
        Date = new javax.swing.JFormattedTextField(createFormatter("##-##-####"));
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        Back1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        SearchTable1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        DisplayDate = new javax.swing.JTextField();
        BarnID = new javax.swing.JComboBox();
        SearchParameters = new javax.swing.JComboBox();
        Mother = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NumberAssigned.setText("Name Assigned");

        MotherIdentification.setText("MotherIdentification");

        Gender.setText("Gender");

        Breed.setText("Breed");

        Colour.setText("Barn ID");

        SaveButton.setBorder(null);
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Date of birth:");

        Gender1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender","male", "female" }));

        SearchButton.setText(">>");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel13.setText("Back");

        Back1.setBorder(null);
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });

        SearchTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(SearchTable1);

        jLabel14.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14));
        jLabel14.setText("Search records here by:");

        jLabel12.setBackground(new java.awt.Color(0, 153, 153));
        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jLabel12.setForeground(new java.awt.Color(51, 255, 51));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("MARINA LIVESTOCK FARM");
        jLabel12.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(51, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel3.setForeground(new java.awt.Color(51, 255, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CATTLE RECORDS");
        jLabel3.setOpaque(true);

        jLabel8.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14));
        jLabel8.setText("Records your data here:");

        DisplayDate.setEditable(false);

        BarnID.setModel(new javax.swing.DefaultComboBoxModel(new String[] {""}));

        SearchParameters.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "","CowID","CowName","Breed","DoB","Sex","MotherID","BarnID" }));

        Mother.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Item", "not available"}));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DisplayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(295, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SearchButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SearchParameters, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(93, 93, 93)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(20, 20, 20))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Colour)
                            .addComponent(NumberAssigned)
                            .addComponent(jLabel1)
                            .addComponent(MotherIdentification)
                            .addComponent(Gender)
                            .addComponent(Breed))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Mother, 0, 177, Short.MAX_VALUE)
                            .addComponent(BarnID, 0, 177, Short.MAX_VALUE)
                            .addComponent(Date, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Name)
                                .addComponent(Calf_breed, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                .addComponent(Gender1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(120, 120, 120))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DisplayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumberAssigned)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MotherIdentification)
                    .addComponent(Mother, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gender1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Breed)
                    .addComponent(Calf_breed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Colour)
                    .addComponent(BarnID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(SearchParameters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  public void TryStatements()
    {
        String female = "female";
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
     BarnID.addItem(barnID);
}
ResultSet srs1 = stmt.executeQuery(

 "SELECT CowID FROM cattlerecords where sex = \""+female+"\"");

while (srs1.next())

{
     String mother  = srs1.getString("CowID");
     Mother.addItem(mother);
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
    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed

       int yesNoOption =  JOptionPane.YES_NO_OPTION ;
       int option = JOptionPane.showConfirmDialog(null,"Are you sure you want to save this information?","",yesNoOption);
        if (option == JOptionPane.YES_OPTION)
         {

        try{
      String date = Date.getText();
      String mother = (String) Mother.getSelectedItem();
      String calf_breed = Calf_breed.getText();
      Object calf_sex = Gender1.getSelectedItem();
      String barn = (String) BarnID.getSelectedItem();
      String name = Name.getText();
      
              Class.forName("com.mysql.jdbc.Driver");
 Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/integratedfarmsystemnnew", "root", "");
PreparedStatement pstmt = conect.prepareStatement(
    "INSERT into cattlerecords(cowName,Breed,DOB,Sex,MotherID,BarnId) values(?,?,?,?,?,?)");
pstmt.setString(1, name);
pstmt.setString(2, calf_breed);
pstmt.setString(3,date);
pstmt.setString(4, (String) calf_sex);
pstmt.setString(5 , mother);
pstmt.setString(6, barn);
pstmt.executeUpdate();
JOptionPane.showMessageDialog(null, "Your records have been saved");

}catch(SQLException e)
			{
				System.out.println("2 Error : "+e);
                               
			}
			catch(Exception ex)
			{
				System.out.println("Error 1:"+ex);
			}


      }
       else{JOptionPane.showMessageDialog(null, "You have not saved your data!!");}// TODO add your handling code here:
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        String search = Search.getText();
        String parameter = (String) SearchParameters.getSelectedItem();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/integratedfarmsystemnnew", "root", "");
            Statement stmt = conect.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            ResultSet srs = stmt.executeQuery(
                    "SELECT * FROM cattlerecords where "+parameter+" =\"" +search+"\"");
            while (srs.next()) {
                String mother = srs.getString("motherID");
                String calf = srs.getString("cowID");
                String breed = srs.getString("breed");
                String sex = srs.getString("sex");
                String barn = srs.getString("BarnID");
                String date = srs.getString("DOB");

            tableData.add(toVector(mother,calf,breed,sex,barn,date));

            }
            Vector columns = new Vector();
            columns.add("Mother");
            columns.add("CalfNumber");
            columns.add("Breed");
            columns.add("Sex");
            columns.add("BarnID");
            columns.add("Birthdate");
            SearchTable1.setModel(new DefaultTableModel(tableData, columns));
        }



             catch(SQLException e) {
                System.out.println("2 Error : "+e);
            } catch(Exception ex) {
                System.out.println("Error 1:"+ex);
            }
}//GEN-LAST:event_SearchButtonActionPerformed

     private Vector toVector(String mother, String calf, String breed,String sex,  String barn, String date)
     {
        Vector vector = new Vector();
        vector.add(mother);
        vector.add(calf);
        vector.add(breed);
        vector.add(sex);
        vector.add(barn);
        vector.add(date);
        return vector;
      }
    private void Back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back1ActionPerformed

        SelectionWindow win = new SelectionWindow();
        win.setVisible(true);
        this.dispose();
}//GEN-LAST:event_Back1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CattleRecords().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back1;
    private javax.swing.JComboBox BarnID;
    private javax.swing.JLabel Breed;
    private javax.swing.JTextField Calf_breed;
    private javax.swing.JLabel Colour;
    private javax.swing.JFormattedTextField Date;
    private javax.swing.JTextField DisplayDate;
    private javax.swing.JLabel Gender;
    private javax.swing.JComboBox Gender1;
    private javax.swing.JComboBox Mother;
    private javax.swing.JLabel MotherIdentification;
    private javax.swing.JTextField Name;
    private javax.swing.JLabel NumberAssigned;
    private javax.swing.JButton SaveButton;
    private javax.swing.JTextField Search;
    private javax.swing.JButton SearchButton;
    private javax.swing.JComboBox SearchParameters;
    private javax.swing.JTable SearchTable1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

}
