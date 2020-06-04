/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package physicslab;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Jowen
 */
public class VenEjercicio2 extends javax.swing.JFrame {

    Integer error=1;
    Integer auxiliar =100;
    Integer puntaje=0;
    public VenEjercicio2() {
       
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        ImageIcon Img_Mov;
        Img_Mov = new ImageIcon(getClass().getResource("/Imagenes/pelota.jpeg"));
        Icon Icono_Mov = new ImageIcon(Img_Mov.getImage().getScaledInstance(LabelImagen.getWidth(),LabelImagen.getHeight(), Image.SCALE_DEFAULT)); 
        LabelImagen.setIcon(Icono_Mov);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonRespuesta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ResVelocidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ResAltura = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        ButtonCalculadora = new javax.swing.JButton();
        ButtonAyuda = new javax.swing.JButton();
        ButtonDetenerC = new javax.swing.JButton();
        ButtonCaida = new javax.swing.JButton();
        LabelImagen = new javax.swing.JLabel();
        ResTiempo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonRespuesta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ButtonRespuesta.setText("Guardar solucion");
        ButtonRespuesta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRespuestaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel1.setText("  Velocidad?");

        jLabel7.setText("(m/s)");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel2.setText("Tiempo?");

        ResAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResAlturaActionPerformed(evt);
            }
        });

        jLabel6.setText("(s)");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel3.setText(" Altura?");

        jLabel5.setText("(m)");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel4.setText("EJERCICIO 2");

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Se deja caer una pelota\ndesde una altura de 50\nmetros,Calcular el \ntiempo que demora en \ncaer, y la velocidad \ncon la que llega al \npiso. ");
        jScrollPane1.setViewportView(jTextArea1);

        ButtonCalculadora.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ButtonCalculadora.setText("Calculadora");
        ButtonCalculadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCalculadoraActionPerformed(evt);
            }
        });

        ButtonAyuda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ButtonAyuda.setText("Ayuda?");
        ButtonAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAyudaActionPerformed(evt);
            }
        });

        ButtonDetenerC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ButtonDetenerC.setText("Detener Caida");
        ButtonDetenerC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonDetenerC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDetenerCActionPerformed(evt);
            }
        });

        ButtonCaida.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ButtonCaida.setText("Iniciar Caida");
        ButtonCaida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonCaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCaidaActionPerformed(evt);
            }
        });

        LabelImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pelota.jpeg"))); // NOI18N

        ResTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResTiempoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(564, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(100, 100, 100))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(ButtonCaida)
                        .addGap(39, 39, 39)
                        .addComponent(ButtonDetenerC)
                        .addGap(34, 34, 34)
                        .addComponent(ButtonAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(ButtonCalculadora)
                        .addGap(37, 37, 37)
                        .addComponent(ButtonRespuesta))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ResVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ResAltura)
                                    .addComponent(ResTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ResVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonDetenerC, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonCaida, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRespuestaActionPerformed
 if(Float.parseFloat(ResVelocidad.getText())==31.26f && Float.parseFloat(ResTiempo.getText())==3.19f){
           
           
           puntaje= auxiliar;
          JOptionPane.showMessageDialog(null, "respuesta correcta,tu puntaje es: ("+auxiliar+ ")"); 
          
          VenEjercicio2 ventana = new VenEjercicio2();
          ventana.setVisible(true); 
          this.dispose();
          
        
          
        }else{
           puntaje= auxiliar;
           JOptionPane.showMessageDialog(null, "respuesta incorrecta*");
           
            auxiliar = 100 -error*10 ;
           error ++;
        }
       

    }//GEN-LAST:event_ButtonRespuestaActionPerformed

    private void ResAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResAlturaActionPerformed

    private void ButtonCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCalculadoraActionPerformed
  VenCalculadora ventana = new VenCalculadora();
  ventana.setVisible(true);        
    }//GEN-LAST:event_ButtonCalculadoraActionPerformed

    private void ButtonAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAyudaActionPerformed
       
    }//GEN-LAST:event_ButtonAyudaActionPerformed

    private void ButtonDetenerCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDetenerCActionPerformed
 ImageIcon Img_Mov;
        Img_Mov = new ImageIcon(getClass().getResource("/Imagenes/pelota.jpeg"));
        Icon Icono_Mov = new ImageIcon(Img_Mov.getImage().getScaledInstance(LabelImagen.getWidth(),LabelImagen.getHeight(), Image.SCALE_DEFAULT)); 
        LabelImagen.setIcon(Icono_Mov);      
    }//GEN-LAST:event_ButtonDetenerCActionPerformed

    private void ButtonCaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCaidaActionPerformed
ImageIcon Img_Mov;
       Img_Mov = new ImageIcon(getClass().getResource("/Imagenes/pelota.gif"));
       Icon Icono_Mov = new ImageIcon(Img_Mov.getImage().getScaledInstance(LabelImagen.getWidth(),LabelImagen.getHeight(), Image.SCALE_DEFAULT)); 
       LabelImagen.setIcon(Icono_Mov);        
    }//GEN-LAST:event_ButtonCaidaActionPerformed

    private void ResTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResTiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResTiempoActionPerformed

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
            java.util.logging.Logger.getLogger(VenEjercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VenEjercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VenEjercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VenEjercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VenEjercicio2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAyuda;
    private javax.swing.JButton ButtonCaida;
    private javax.swing.JButton ButtonCalculadora;
    private javax.swing.JButton ButtonDetenerC;
    private javax.swing.JButton ButtonRespuesta;
    private javax.swing.JLabel LabelImagen;
    private javax.swing.JTextField ResAltura;
    private javax.swing.JTextField ResTiempo;
    private javax.swing.JTextField ResVelocidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
