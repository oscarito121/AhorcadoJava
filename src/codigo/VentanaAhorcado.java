/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author oscar
 */
public class VentanaAhorcado extends javax.swing.JFrame {
String palabraOculta= "CETYS";
int numeroFallos=0;
    
    
    /**
     * Creates new form VentanaAhorcado
     */
    public VentanaAhorcado() {
        initComponents();
        // dibujamos la imagen del ahorcado sin fallos 
        dibujaImagen(0);
    }
        private void chequeaLetra(String letra){
    letra=letra.toUpperCase();
    
  //  String palabraConGuiones  = pantalla.getText();
    StringBuilder  palabraConGuiones  =  new StringBuilder (pantalla.getText());
    if(palabraOculta.contains(letra)){
  
        for (int i=0; i <palabraOculta.length(); i++){
         if(palabraOculta.charAt(i) == letra.charAt(0)){
      palabraConGuiones.setCharAt(2*i, letra.charAt(0));
         }
    
    }
        pantalla.setText(palabraConGuiones.toString());
    }
    else {
    
        numeroFallos++;
        dibujaImagen(numeroFallos);
    }
      }
      private void chequeaBoton(JButton miBoton){
          miBoton.setEnabled(false);
          chequeaLetra(miBoton.getText());
      }
    
    private void dibujaImagen(int numeroFallos){
    ImageIcon  miImagen=null;
    URL nombreImagen= null;
    int ancho= panelAhorcado.getWidth();
    int alto= panelAhorcado.getHeight();
       
        
  
            miImagen =new ImageIcon((getClass().getResource("/imagenes/ahorcado_0.png")));
    
        
            panelAhorcado.setIcon(miImagen);
    } 
    
   
        

  
    @SuppressWarnings("unchecked")
   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantalla = new javax.swing.JLabel();
        letraI = new javax.swing.JButton();
        letraJ = new javax.swing.JButton();
        letraK = new javax.swing.JButton();
        letraL = new javax.swing.JButton();
        letraH = new javax.swing.JButton();
        letraM = new javax.swing.JButton();
        letraN = new javax.swing.JButton();
        letraT = new javax.swing.JButton();
        letraO = new javax.swing.JButton();
        letraP = new javax.swing.JButton();
        letraQ = new javax.swing.JButton();
        letraR = new javax.swing.JButton();
        letraÑ = new javax.swing.JButton();
        letraS = new javax.swing.JButton();
        letraZ = new javax.swing.JButton();
        letraV = new javax.swing.JButton();
        letraW = new javax.swing.JButton();
        espacio = new javax.swing.JButton();
        letraX = new javax.swing.JButton();
        letraU = new javax.swing.JButton();
        letraY = new javax.swing.JButton();
        letraC = new javax.swing.JButton();
        letraD = new javax.swing.JButton();
        letraE = new javax.swing.JButton();
        letraA = new javax.swing.JButton();
        letraF = new javax.swing.JButton();
        letraG = new javax.swing.JButton();
        letraB = new javax.swing.JButton();
        panelAhorcado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pantalla.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pantalla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pantalla.setText("_ _ _ _ _ ");

        letraI.setText("I");
        letraI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraIMousePressed(evt);
            }
        });

        letraJ.setText("J");
        letraJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraJMousePressed(evt);
            }
        });
        letraJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraJActionPerformed(evt);
            }
        });

        letraK.setText("K");
        letraK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraKMousePressed(evt);
            }
        });

        letraL.setText("L");
        letraL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraLMousePressed(evt);
            }
        });

        letraH.setText("H");
        letraH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraHMousePressed(evt);
            }
        });
        letraH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraHActionPerformed(evt);
            }
        });

        letraM.setText("M");
        letraM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraMMousePressed(evt);
            }
        });

        letraN.setText("N");
        letraN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraNMousePressed(evt);
            }
        });
        letraN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraNActionPerformed(evt);
            }
        });

        letraT.setText("T");
        letraT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraTMousePressed(evt);
            }
        });

        letraO.setText("O");
        letraO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraOMousePressed(evt);
            }
        });

        letraP.setText("P");
        letraP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraPMousePressed(evt);
            }
        });

        letraQ.setText("Q");
        letraQ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraQMousePressed(evt);
            }
        });

        letraR.setText("R");
        letraR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraRMousePressed(evt);
            }
        });

        letraÑ.setText("Ñ");
        letraÑ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraÑMousePressed(evt);
            }
        });

        letraS.setText("S");
        letraS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraSMousePressed(evt);
            }
        });
        letraS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraSActionPerformed(evt);
            }
        });

        letraZ.setText("Z");
        letraZ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraZMousePressed(evt);
            }
        });

        letraV.setText("V");

        letraW.setText("W");
        letraW.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraWMousePressed(evt);
            }
        });

        letraX.setText("X");
        letraX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraXMousePressed(evt);
            }
        });

        letraU.setText("U");
        letraU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraUMousePressed(evt);
            }
        });

        letraY.setText("Y");
        letraY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraYMousePressed(evt);
            }
        });

        letraC.setText("C");
        letraC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraCMousePressed(evt);
            }
        });

        letraD.setText("D");
        letraD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraDMousePressed(evt);
            }
        });

        letraE.setText("E");
        letraE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraEMousePressed(evt);
            }
        });

        letraA.setText("A");

        letraF.setText("F");
        letraF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraFMousePressed(evt);
            }
        });

        letraG.setText("G");
        letraG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraGMousePressed(evt);
            }
        });
        letraG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraGActionPerformed(evt);
            }
        });

        letraB.setText("B");
        letraB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                letraBMousePressed(evt);
            }
        });
        letraB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(letraU, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(letraV, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(letraW, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(espacio, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(letraX, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(letraY, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(letraZ, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(letraÑ, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(letraO, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(letraP, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(letraQ, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(letraR, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(letraS, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(letraT, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(letraH, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(letraI, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(letraJ, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(letraK, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(letraL, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(letraM, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(letraN, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(letraA, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(letraB, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(letraC, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(letraD, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(letraE, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(letraF, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(letraG, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(panelAhorcado, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAhorcado, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letraB, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letraC, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letraD, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letraE, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letraA, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letraF, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letraG, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letraI, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letraJ, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letraK, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letraL, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letraH, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letraM, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letraN, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letraO, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letraP, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letraQ, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letraR, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letraÑ, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letraS, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letraT, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(letraV, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letraW, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(espacio, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letraX, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letraU, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letraY, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letraZ, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    
    private void letraBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraBActionPerformed

    private void letraGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraGActionPerformed

    private void letraHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraHActionPerformed

    private void letraJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraJActionPerformed

    private void letraSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraSActionPerformed

    private void letraIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraIMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraIMousePressed

    private void letraNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraNActionPerformed

    private void letraJMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraJMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraJMousePressed

    private void letraKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraKMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraKMousePressed

    private void letraLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraLMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraLMousePressed

    private void letraHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraHMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraHMousePressed

    private void letraMMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraMMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraMMousePressed

    private void letraNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraNMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraNMousePressed

    private void letraTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraTMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraTMousePressed

    private void letraOMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraOMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraOMousePressed

    private void letraPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraPMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraPMousePressed

    private void letraQMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraQMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraQMousePressed

    private void letraRMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraRMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraRMousePressed

    private void letraÑMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraÑMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraÑMousePressed

    private void letraSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraSMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraSMousePressed

    private void letraZMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraZMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraZMousePressed

    private void letraWMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraWMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraWMousePressed

    private void letraXMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraXMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraXMousePressed

    private void letraUMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraUMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraUMousePressed

    private void letraYMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraYMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraYMousePressed

    private void letraCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraCMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraCMousePressed

    private void letraDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraDMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraDMousePressed

    private void letraEMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraEMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraEMousePressed

    private void letraFMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraFMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraFMousePressed

    private void letraGMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraGMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraGMousePressed

    private void letraBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_letraBMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraBMousePressed

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
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAhorcado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton espacio;
    private javax.swing.JButton letraA;
    private javax.swing.JButton letraB;
    private javax.swing.JButton letraC;
    private javax.swing.JButton letraD;
    private javax.swing.JButton letraE;
    private javax.swing.JButton letraF;
    private javax.swing.JButton letraG;
    private javax.swing.JButton letraH;
    private javax.swing.JButton letraI;
    private javax.swing.JButton letraJ;
    private javax.swing.JButton letraK;
    private javax.swing.JButton letraL;
    private javax.swing.JButton letraM;
    private javax.swing.JButton letraN;
    private javax.swing.JButton letraO;
    private javax.swing.JButton letraP;
    private javax.swing.JButton letraQ;
    private javax.swing.JButton letraR;
    private javax.swing.JButton letraS;
    private javax.swing.JButton letraT;
    private javax.swing.JButton letraU;
    private javax.swing.JButton letraV;
    private javax.swing.JButton letraW;
    private javax.swing.JButton letraX;
    private javax.swing.JButton letraY;
    private javax.swing.JButton letraZ;
    private javax.swing.JButton letraÑ;
    private javax.swing.JLabel panelAhorcado;
    private javax.swing.JLabel pantalla;
    // End of variables declaration//GEN-END:variables

    private ImageIcon ImageIcon(URL url) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
