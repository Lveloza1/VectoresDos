/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectoresdos;

import javax.swing.JOptionPane;

/**
 *
 * @author lveloza1
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    double v[];
    public principal() {
        initComponents();
        txtLongitud.requestFocusInWindow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLongitud = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        cmdPrimos = new javax.swing.JButton();
        cmdImpares = new javax.swing.JButton();
        cmdPares = new javax.swing.JButton();
        cmdAutomatico = new javax.swing.JButton();
        cmdManual = new javax.swing.JButton();
        cmdCrear = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        cmdBorrar = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ejercicio 2");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Longitud");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        txtLongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLongitudKeyTyped(evt);
            }
        });
        jPanel2.add(txtLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 80, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 150, 120));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 36, 170, 100));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 210, 150));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdPrimos.setText("Mostrar Primos");
        cmdPrimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPrimosActionPerformed(evt);
            }
        });
        jPanel4.add(cmdPrimos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 130, 40));

        cmdImpares.setText("Mostrar Impares");
        jPanel4.add(cmdImpares, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, 40));

        cmdPares.setText("Mostrar Pares");
        jPanel4.add(cmdPares, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, 40));

        cmdAutomatico.setText("Llenado Automático");
        cmdAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAutomaticoActionPerformed(evt);
            }
        });
        jPanel4.add(cmdAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, 40));

        cmdManual.setText("Llenado Manual");
        cmdManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdManualActionPerformed(evt);
            }
        });
        jPanel4.add(cmdManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 40));

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel4.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 160, 270));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdBorrar.setText("Borrar");
        jPanel5.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 10, 70, 40));

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel5.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 200, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdPrimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPrimosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdPrimosActionPerformed

    private void txtLongitudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLongitudKeyTyped
    char c=evt.getKeyChar(); 
       
          if(!Character.isDigit(c)) { 
              getToolkit().beep();    
              evt.consume(); 
          }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLongitudKeyTyped

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
     int longitud;
        if(txtLongitud.getText().trim().isEmpty()){
      JOptionPane.showMessageDialog(this,"Digite la longitud del vector","Error",JOptionPane.ERROR_MESSAGE);
       txtLongitud.requestFocusInWindow();
       
        }   
      else if(Integer.parseInt(txtLongitud.getText().trim())==0){
      JOptionPane.showMessageDialog(this,"La longitud no puede ser 0","Error",JOptionPane.ERROR_MESSAGE); 
      txtLongitud.requestFocusInWindow();
      txtLongitud.selectAll();
   }
      else{
          longitud=Integer.parseInt(txtLongitud.getText().trim());
          v=new double[longitud];
          JOptionPane.showMessageDialog(this,"El vector ha sido creado exitoxamente");
 
          
      }
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdManualActionPerformed
double n;
   if(txtLongitud.getText().trim().isEmpty()){
      JOptionPane.showMessageDialog(this,"Digite la longitud del vector","Error",JOptionPane.ERROR_MESSAGE); 
      txtLongitud.requestFocusInWindow();
      
   }
     else{ 
  for (int i=0; i<v.length; i++){
  n=Double.parseDouble(JOptionPane.showInputDialog(this,"Ingrese el elemento número "+(i+1)));
  v[i]=n;
   } 
 }
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdManualActionPerformed

    private void cmdAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAutomaticoActionPerformed
double n, f;
    if(txtLongitud.getText().trim().isEmpty()){
      JOptionPane.showMessageDialog(this,"Digite la longitud del vector","Error",JOptionPane.ERROR_MESSAGE);
       txtLongitud.requestFocusInWindow();
       
        }
    else{
        f= Double.parseDouble (JOptionPane.showInputDialog(this, "Digite el numero hasta donde quiere el llenado automatico "));
           while (f<v.length){
            JOptionPane.showMessageDialog(this, "Digite un numero mayor a : "+v.length);
            f= Double.parseDouble (JOptionPane.showInputDialog(this, "Digite el numero hasta donde quiere el llenado automatico "));
           }
        for (int i = 0; i < v.length; i++) {
            
        n=(int)(Math.random()*f + 1);  
        v[i]=n;
        }
      JOptionPane.showMessageDialog(this,"Vector llenado con éxito");  
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdAutomaticoActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
if(txtLongitud.getText().trim().isEmpty()){
      JOptionPane.showMessageDialog(this,"Digite la longitud del vector","Error",JOptionPane.ERROR_MESSAGE);
       txtLongitud.requestFocusInWindow();
       
        }
else{
        for (int i=0 ; i<v.length ; i++){
    txtResultado.append(v[i]+"\n");
        }
}
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdMostrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAutomatico;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdImpares;
    private javax.swing.JButton cmdManual;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JButton cmdPares;
    private javax.swing.JButton cmdPrimos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}