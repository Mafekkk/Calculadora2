package calculadora;

public class Ventana extends javax.swing.JFrame {
    Trigonometrica miTrigo = new Trigonometrica();
    Calculadora miCalc= new Calculadora();
    int cambio;
    
    public Ventana() {
        initComponents();
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonSeno = new javax.swing.JButton();
        display = new javax.swing.JTextField();
        botonTangente = new javax.swing.JButton();
        botonSuma = new javax.swing.JButton();
        botonMultiplicar = new javax.swing.JButton();
        botonResta = new javax.swing.JButton();
        botonDividir = new javax.swing.JButton();
        botonCoseno = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonSeno.setText("SENO");
        botonSeno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSenoMouseClicked(evt);
            }
        });
        botonSeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSenoActionPerformed(evt);
            }
        });

        botonTangente.setText("TANGENTE");
        botonTangente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonTangenteMouseClicked(evt);
            }
        });
        botonTangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTangenteActionPerformed(evt);
            }
        });

        botonSuma.setText("+");
        botonSuma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSumaMouseClicked(evt);
            }
        });

        botonMultiplicar.setText("x");
        botonMultiplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMultiplicarMouseClicked(evt);
            }
        });

        botonResta.setText("-");
        botonResta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRestaMouseClicked(evt);
            }
        });

        botonDividir.setText("/");
        botonDividir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonDividirMouseClicked(evt);
            }
        });

        botonCoseno.setText("COSENO");
        botonCoseno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCosenoMouseClicked(evt);
            }
        });
        botonCoseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCosenoActionPerformed(evt);
            }
        });

        botonIgual.setText("=");
        botonIgual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonIgualMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonSeno, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonCoseno, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonTangente, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(botonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSeno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCoseno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonTangente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSenoMouseClicked
        miTrigo.numero1=Double.valueOf(display.getText());
        miTrigo.seno();
        display.setText("" + miTrigo.respuesta);
    }//GEN-LAST:event_botonSenoMouseClicked

    private void botonTangenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTangenteMouseClicked
        miTrigo.numero1=Double.valueOf(display.getText());
        miTrigo.tangente();
        display.setText("" + miTrigo.respuesta);
    }//GEN-LAST:event_botonTangenteMouseClicked

    private void botonSumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSumaMouseClicked

         miCalc.operando1=Float.valueOf(display.getText());
         display.setText("");
         cambio = 1;
    }//GEN-LAST:event_botonSumaMouseClicked

    private void botonTangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTangenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonTangenteActionPerformed

    private void botonMultiplicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMultiplicarMouseClicked
        miCalc.operando1=Float.valueOf(display.getText());
        display.setText("");
        cambio = 3;
    }//GEN-LAST:event_botonMultiplicarMouseClicked

    private void botonRestaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRestaMouseClicked
        miCalc.operando1=Float.valueOf(display.getText());
         display.setText("");
         cambio = 2;
    }//GEN-LAST:event_botonRestaMouseClicked

    private void botonDividirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDividirMouseClicked
        miCalc.operando1=Float.valueOf(display.getText());
        display.setText("");
        cambio = 4;
    }//GEN-LAST:event_botonDividirMouseClicked

    private void botonCosenoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCosenoMouseClicked
        miTrigo.numero1=Double.valueOf(display.getText());
        miTrigo.coseno();
        display.setText("" + miTrigo.respuesta);
    }//GEN-LAST:event_botonCosenoMouseClicked

    private void botonIgualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIgualMouseClicked

        switch (cambio) {
            case 1:     miCalc.operando2 = Float.valueOf(display.getText());
                    miCalc.sumar();
                    display.setText("" + miCalc.resultado);
                     break;
            case 2:  miCalc.operando2 = Float.valueOf(display.getText());
                    miCalc.restar();
                    display.setText("" + miCalc.resultado);
                     break;
            case 3:  miCalc.operando2 = Float.valueOf(display.getText());
                    miCalc.multiplicar();
                    display.setText("" + miCalc.resultado);
                     break;
            case 4:  miCalc.operando2 = Float.valueOf(display.getText());
                    miCalc.dividir();
                    display.setText("" + miCalc.resultado);
                     break;
        }
    }//GEN-LAST:event_botonIgualMouseClicked

    private void botonSenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSenoActionPerformed

    private void botonCosenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCosenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCosenoActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCoseno;
    private javax.swing.JButton botonDividir;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonMultiplicar;
    private javax.swing.JButton botonResta;
    private javax.swing.JButton botonSeno;
    private javax.swing.JButton botonSuma;
    private javax.swing.JButton botonTangente;
    private javax.swing.JTextField display;
    // End of variables declaration//GEN-END:variables
}
