
package Forms;

import Class.DBFunction;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class FrmRoom extends javax.swing.JInternalFrame {

    public FrmRoom() {
        initComponents();
        awal();
    }
private void awal()
{
    DBFunction p=new DBFunction();
    p._bindingCombo("Select * from kelas", jComboBox1, "nama_kelas");
     this.clear();
}

private void clear()
{
    this.jTextField1.setText("");
    this.jTextField2.setText("");
    this.csimpan.setText("simpan");
    
}

private void isubah()
{
    this.csimpan.setText("ubah");
   
}
 
 
 private void tambah()
 {
     DBFunction p=new DBFunction();
     Integer j=Integer.parseInt(this.jTextField2.getText());
     p.RunSQL("Delete from room Where id_kelas='"+this.lblid.getText()+"'");
     
     for(int x = 1; x < j; x++) {
        String ll=(String) this.jComboBox1.getSelectedItem() + x;
         p.RunSQL("Insert into room values ('"+ll+"','"+this.lblid.getText()+"','0')");         
      }
        
         JOptionPane.showMessageDialog(null, "Berhasil tambah"); 
         awal();
 }
  
 
 private void hapus()
 {
     DBFunction p=new DBFunction();
     
         p.RunSQL("Delete from room  Where id_kelas='"+this.lblid.getText()+"'");         
         JOptionPane.showMessageDialog(null, "Berhasil hapus");   
         awal();
 }

 private void simpan()
 {
     String a=csimpan.getText();
     if("simpan".equals(a))
     {
         this.tambah();
     }
 }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblid = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        csimpan = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        lblid.setText("-");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 136, -1));

        jLabel2.setText("Jumlah Room");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 136, -1));

        jLabel3.setText("Nama Room");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 64, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 60, -1));

        csimpan.setText("simpan");
        csimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csimpanActionPerformed(evt);
            }
        });
        getContentPane().add(csimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jButton1.setText("keluar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jLabel4.setText("Tipe Kamar");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 25, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void csimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csimpanActionPerformed
        // TODO add your handling code here:
        this.simpan();
    }//GEN-LAST:event_csimpanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        this.jTextField1.setText((String)this.jComboBox1.getSelectedItem());
        DBFunction p =new DBFunction();
        String kk;        
        try {
            kk = p._getValue("Select id_kelas from kelas Where nama_kelas='"+this.jComboBox1.getSelectedItem()+"'");
            String g=p._getValue("Select count(id_room) from room Where id_kelas='"+kk+"'");
            this.jTextField2.setText(g);
            this.lblid.setText(kk);
        } catch (SQLException ex) {
            Logger.getLogger(FrmRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton csimpan;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblid;
    // End of variables declaration//GEN-END:variables
}
