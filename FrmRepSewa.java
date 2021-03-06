
package Forms;

import Class.DBFunction;
import Class.Functions;
import java.io.File;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class FrmRepSewa extends javax.swing.JInternalFrame {

    
    public FrmRepSewa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TxtTgl = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        TxtTgl1 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("CETAK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jLabel2.setText("dari Tanggal");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));
        getContentPane().add(TxtTgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 130, -1));

        jLabel3.setText("hingga Tanggal");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        getContentPane().add(TxtTgl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 130, -1));

        jButton2.setText("keluar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try {
           
            
           
            Functions s=new Functions();
            String reportName = s._getPathReport() + "repSewa.jasper";
            HashMap parameter = new HashMap();
            File reportFile = new File(reportName);           
            parameter.put("tgl",this.TxtTgl.getDate());            
            parameter.put("tgl2",this.TxtTgl1.getDate());            
          
            JasperReport jReport = (JasperReport)JRLoader.loadObject(reportFile.getPath());
            JasperPrint jPrint = JasperFillManager.fillReport(jReport, parameter, DBFunction.OpenDB());
            JasperViewer.viewReport(jPrint, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
           
            } catch (Exception ex) {
                System.out.println(ex);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser TxtTgl;
    private com.toedter.calendar.JDateChooser TxtTgl1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
