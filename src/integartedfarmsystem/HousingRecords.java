/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * HousingRecords.java
 *
 * Created on Jul 3, 2010, 10:06:47 PM
 */

package integartedfarmsystem;

import java.sql.*;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Magondu
 */
public class HousingRecords extends javax.swing.JFrame {
private Vector<Vector> tableData;
    /** Creates new form HousingRecords */
    public HousingRecords() {
        initComponents();
        setLocationRelativeTo(null);
        tableData = new Vector<Vector>();
        Date();

        tableData = new Vector<Vector>();
       ImageIcon goImage =  new ImageIcon("go.gif");
       SaveButton.setIcon(goImage);
       ImageIcon backImage =  new ImageIcon("back.gif");
       Back1.setIcon(backImage);

         try{
         Class.forName("com.mysql.jdbc.Driver");
  Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/integratedfarmsystemnnew", "root", "");
             Statement stmt = conect.createStatement(ResultSet.TYPE_FORWARD_ONLY,
                              ResultSet.CONCUR_READ_ONLY);
ResultSet srs = stmt.executeQuery(

    "SELECT farmID FROM farmrecords");

while (srs.next())

{
     String batch  = srs.getString("farmID");
     FarmID.addItem(batch);
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

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MotherIdentification = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Colour = new javax.swing.JLabel();
        Capacity = new javax.swing.JTextField();
        SaveButton = new javax.swing.JButton();
        Location = new javax.swing.JTextField();
        Gender = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FarmID = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        DisplayDate = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();
        SearchButton1 = new javax.swing.JButton();
        Back1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        SearchTable1 = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        SearchParameters = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MotherIdentification.setText("Location:");

        Colour.setText("Capacity:");

        SaveButton.setBorder(null);
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        Gender.setText("Name:");

        jLabel4.setText("Farm ID:");

        FarmID.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "----" }));

        jLabel9.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 12));
        jLabel9.setText("Barn ID:");

        ID.setBackground(new java.awt.Color(204, 204, 204));
        ID.setFont(new java.awt.Font("Tahoma", 0, 14));
        ID.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(51, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel3.setForeground(new java.awt.Color(51, 255, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CATTLE BARN RECORDS");
        jLabel3.setOpaque(true);

        jLabel8.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14));
        jLabel8.setText("Records your data here:");

        DisplayDate.setEditable(false);

        jLabel12.setBackground(new java.awt.Color(0, 153, 153));
        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jLabel12.setForeground(new java.awt.Color(51, 255, 51));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("MARINA LIVESTOCK FARM");
        jLabel12.setOpaque(true);

        jLabel14.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 14)); // NOI18N
        jLabel14.setText("Search records here by:");

        SearchButton1.setText(">>");
        SearchButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButton1ActionPerformed(evt);
            }
        });

        Back1.setBorder(null);
        Back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel13.setText("Back");

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

        SearchParameters.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "","BarnID","BarnName","Capacity","Location","FarmID" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Gender)
                    .addComponent(Colour)
                    .addComponent(MotherIdentification, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FarmID, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Capacity)
                    .addComponent(Name, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Location, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaveButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(157, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(DisplayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchParameters, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel13))
                                    .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SearchButton1))))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DisplayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MotherIdentification)
                        .addGap(18, 18, 18)
                        .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Colour, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Capacity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(FarmID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 8, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(SearchParameters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchButton1))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Back1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
        if (option == JOptionPane.YES_OPTION) {
            try{
                String location = Location.getText();
                String barnname = Name.getText();
                String capacity = Capacity.getText();
                String farm = (String)FarmID.getSelectedItem();


                Class.forName("com.mysql.jdbc.Driver");
                Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/integratedfarmsystemnnew", "root", "");
                PreparedStatement pstmt = conect.prepareStatement(
                        "INSERT into cattleshelter(Barnname,capacity,location,farmID) values(?,?,?,?)");
                pstmt.setString(1, barnname);
                pstmt.setString(2, capacity);
                pstmt.setString(3, location);
                pstmt.setString(4, farm);
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Your records have been saved");

                Statement stmt = conect.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);
                ResultSet srs = stmt.executeQuery(
                        "SELECT BarnID FROM cattleshelter where location =\"" +location+"\"");
                while (srs.next()) {
                    String id = srs.getString("BarnID");
                    ID.setText(id);
                }

            }catch(SQLException e) {
                System.out.println("2 Error : "+e);
            } catch(Exception ex) {
                System.out.println("Error 1:"+ex);
            }


        }
        else{JOptionPane.showMessageDialog(null, "You have not saved your data!!\nCheck the barn number below");}
}//GEN-LAST:event_SaveButtonActionPerformed

    private void SearchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButton1ActionPerformed
        String search = Search.getText();
        String parameter = (String) SearchParameters.getSelectedItem();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/integratedfarmsystemnnew", "root", "");
            Statement stmt = conect.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            ResultSet srs = stmt.executeQuery(
                    "SELECT * FROM cattleshelter where "+parameter+" = \"" +search+"\"");
            while (srs.next()) {
                String barnID = srs.getString("barnID");
                String barnname = srs.getString("barnname");
                String capacity = srs.getString("capacity");
                String location = srs.getString("location");
                String farm = srs.getString("farmID");
                
                
                tableData.add(toVector(barnID, barnname,capacity,location,farm));
                
            }
            Vector columns = new Vector();
            columns.add("BarnID");
            columns.add("Location");
            columns.add("Size");
            columns.add("Owner");
            columns.add("FarmID");
            SearchTable1.setModel(new DefaultTableModel(tableData, columns));
        }
        
        
        
        catch(SQLException e) {
            System.out.println("2 Error : "+e);
        } catch(Exception ex) {
            System.out.println("Error 1:"+ex);
        }
}//GEN-LAST:event_SearchButton1ActionPerformed

    private Vector toVector(String barnID, String barnname, String capacity,String location,  String farm){
        Vector vector = new Vector();
        vector.add(barnID);
        vector.add(barnname);
        vector.add(capacity);
        vector.add(location);
        vector.add(farm);
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
                new HousingRecords().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back1;
    private javax.swing.JTextField Capacity;
    private javax.swing.JLabel Colour;
    private javax.swing.JTextField DisplayDate;
    private javax.swing.JComboBox FarmID;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel ID;
    private javax.swing.JTextField Location;
    private javax.swing.JLabel MotherIdentification;
    private javax.swing.JTextField Name;
    private javax.swing.JButton SaveButton;
    private javax.swing.JTextField Search;
    private javax.swing.JButton SearchButton1;
    private javax.swing.JComboBox SearchParameters;
    private javax.swing.JTable SearchTable1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

}
