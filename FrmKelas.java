package Forms;

import Class.DBFunction;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FrmKelas extends javax.swing.JInternalFrame {

    
    public FrmKelas() {
        initComponents();
        awal();
    }

private void awal()
{
     ambil_tabel();
     this.clear();
}

private void clear()
{
    this.jTextField1.setText("Auto");
    this.jTextField2.setText("");
    this.csimpan.setText("simpan");
    this.chapus.setEnabled(false);
}

private void isubah()
{
    this.csimpan.setText("ubah");
    this.chapus.setEnabled(true);
}
 private void ambil_tabel()
 {
     DBFunction p=new DBFunction();
     p._bindingTable("Select * from kelas", jTable1);
 }
 
 private void tambah()
 {
     DBFunction p=new DBFunction();
     
         p.RunSQL("Insert into kelas (`nama_kelas`,`harga`) values ('"+this.jTextField2.getText()+"','"+this.jTextField3.getText()+"')");         
         JOptionPane.showMessageDialog(null, "Berhasil tambah"); 
         awal();
 }
 
 private void update()
 {
     DBFunction p=new DBFunction();
     
         p.RunSQL("Update kelas SET nama_kelas='"+this.jTextField2.getText()+"',harga='"+this.jTextField3.getText()+"' Where id_kelas='"+this.jTextField1.getText()+"'");         
         JOptionPane.showMessageDialog(null, "Berhasil ubah");   
         awal();
 }
 
 private void hapus()
 {
     DBFunction p=new DBFunction();
     
         p.RunSQL("Delete from kelas  Where id_kelas='"+this.jTextField1.getText()+"'");         
         JOptionPane.showMessageDialog(null, "Berhasil ubah");   
         awal();
 }

 private void simpan()
 {
     String a=csimpan.getText();
     if("simpan".equals(a))
     {
         this.tambah();
     }else if(("ubah").equals(a))
     {
         this.update();
     }
 }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        csimpan = new javax.swing.JButton();
        chapus = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Kode Kelas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 38, -1, -1));

        jLabel2.setText("Tipe Kamar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 76, -1, -1));

        jTextField1.setEditable(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 120, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 170, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 290, 150));

        jButton1.setText("keluar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        csimpan.setText("simpan");
        csimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csimpanActionPerformed(evt);
            }
        });
        getContentPane().add(csimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        chapus.setText("hapus");
        chapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chapusActionPerformed(evt);
            }
        });
        getContentPane().add(chapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel3.setText("Harga");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 170, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void csimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csimpanActionPerformed
        // TODO add your handling code here:
        this.simpan();
    }//GEN-LAST:event_csimpanActionPerformed

    private void chapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chapusActionPerformed
        // TODO add your handling code here:
        this.hapus();
    }//GEN-LAST:event_chapusActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       this.isubah();
       int i=this.jTable1.getSelectedRow();
        if(i==-1)
        {
            return;
        }
       this.jTextField1.setText(String.valueOf(jTable1.getModel().getValueAt(i,0)));
       this.jTextField2.setText((String)jTable1.getModel().getValueAt(i,1));
       this.jTextField3.setText((String)jTable1.getModel().getValueAt(i,2));
       
    }//GEN-LAST:event_jTable1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chapus;
    private javax.swing.JButton csimpan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
