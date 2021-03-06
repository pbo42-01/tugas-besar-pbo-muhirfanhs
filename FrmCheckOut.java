package Forms;

import Class.DBFunction;
import Class.Functions;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Calendar;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class FrmCheckOut extends javax.swing.JInternalFrame {

    
    public FrmCheckOut() {
        initComponents();
        DBFunction p=new DBFunction();
        p._bindingCombo("Select * from pelanggan Where tgl_out is NULL", jComboBox1, "nama");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblkelas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        lblIDCard = new javax.swing.JLabel();
        out = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbllama = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblnamaroom = new javax.swing.JLabel();
        in = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        lblkelas.setText("-");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nama Pelanggan :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 36, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 32, 186, -1));

        jLabel2.setText("ID Pelanggan :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 65, -1, -1));

        lblIDCard.setText("-");
        getContentPane().add(lblIDCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 65, 207, -1));

        out.setText("-");
        getContentPane().add(out, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 170, 20));

        jLabel4.setText("Lama  :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        lbllama.setText("-");
        getContentPane().add(lbllama, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 207, -1));

        jLabel5.setText("TOTAL :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        lblTotal.setText("-");
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 207, -1));

        jButton1.setText("Check Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 130, 30));

        jLabel6.setText("Room :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel7.setText("Tanggal Checkin     :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        lblnamaroom.setText("-");
        getContentPane().add(lblnamaroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 207, -1));

        in.setText("-");
        getContentPane().add(in, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 180, 20));

        jLabel8.setText("Tanggal Checkout   :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        jButton3.setText("keluar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 130, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        try {
            // TODO add your handling code here:
         
            DBFunction p=new DBFunction();
            Calendar cal = Calendar.getInstance(); 
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String hariini=format.format(cal.getTime());
            this.out.setText(hariini);
            this.in.setText(p._getValue("Select tgl_in from pelanggan Where nama='"+this.jComboBox1.getSelectedItem()+"'"));
            
            String nmroom=p._getValue("Select id_room from pelanggan Where nama='"+this.jComboBox1.getSelectedItem()+"'");
            this.lblnamaroom.setText(nmroom);
            this.lblkelas.setText(p._getValue("Select id_kelas from room Where id_room='"+nmroom+"'"));
            this.lblIDCard.setText(p._getValue("Select id_pelanggan from pelanggan Where nama='"+this.jComboBox1.getSelectedItem()+"'"));
            this.lbllama.setText(p._getValue("Select id_pelanggan from pelanggan Where nama='"+this.jComboBox1.getSelectedItem()+"'"));
        
          
            if(!"".equals(this.in.getText()) && !"".equals(this.out.getText()))
            {
                total();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FrmCheckOut.class.getName()).log(Level.SEVERE, null, ex);             
        }
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DBFunction p=new DBFunction();
        Calendar cal = Calendar.getInstance(); 
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String hariini=format.format(cal.getTime());
        p.RunSQL("Update pelanggan Set tgl_out='"+hariini+"',hari='"+this.lbllama.getText()+"',total='"+this.lblTotal.getText()+"' Where id_pelanggan='"+this.lblIDCard.getText()+"'");
        p.RunSQL("Update room Set status='0' Where id_room='"+this.lblnamaroom.getText()+"'");
        JOptionPane.showMessageDialog(null, "Berhasil update"); 
        print();
        this.dispose();
 
 
    }//GEN-LAST:event_jButton1ActionPerformed
    
        
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void print()
    {
        try {
           
            
           
            Functions s=new Functions();
            String reportName = s._getPathReport() + "RepInvoice.jasper";
            HashMap parameter = new HashMap();
            File reportFile = new File(reportName);           
            parameter.put("id",this.lblIDCard.getText());            
            parameter.put("total",this.lblTotal.getText());            
            parameter.put("diff",this.lbllama.getText());            
            JasperReport jReport = (JasperReport)JRLoader.loadObject(reportFile.getPath());
            JasperPrint jPrint = JasperFillManager.fillReport(jReport, parameter, DBFunction.OpenDB());
            JasperViewer.viewReport(jPrint, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
           
            } catch (Exception ex) {
                System.out.println(ex);
            }
    }
    private void total() throws SQLException
{
        try {
            DBFunction p=new DBFunction();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date tgl1= format.parse(this.in.getText());
            Date tgl2= format.parse(this.out.getText());
            long diffInMillies = tgl2.getTime() - tgl1.getTime();
            TimeUnit timeUnit = TimeUnit.DAYS;
            String harga=p._getValue("Select harga from kelas Where id_kelas='"+this.lblkelas.getText()+"'");
            Long hari=timeUnit.convert(diffInMillies,TimeUnit.DAYS)/ (24 * 60 * 60 * 1000);
            String hari2=String.valueOf(hari);
            int fharga=Integer.parseInt(harga);
            int fhari=Integer.parseInt(hari2);
            int total2=fharga*fhari;
            String totall=String.valueOf(total2);
            String harii=String.valueOf(hari);
            this.lbllama.setText(harii);
            this.lblTotal.setText(totall);
            
          //  return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
        } catch (ParseException ex) {
            Logger.getLogger(FrmCheckOut.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel in;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblIDCard;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblkelas;
    private javax.swing.JLabel lbllama;
    private javax.swing.JLabel lblnamaroom;
    private javax.swing.JLabel out;
    // End of variables declaration//GEN-END:variables

    private void setIconImage(Image image) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setPreferedSize(Dimension dimension) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setResizeable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
