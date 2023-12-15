/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import domino.Ficha;
import domino.Jugador;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import presenter.PresenterPartida;

/**
 *
 * @author Equipo 02
 */
public class FrmPartida extends javax.swing.JFrame {

    PanelFichas panelFichasExterno;
    PanelFichasJugador panelFichasJugador;
    PresenterPartida presenterPartida;

    /**
     * Creates new form frmPartida
     */
    public FrmPartida(List<Ficha> fichasJugador, Jugador jugador, PresenterPartida presenterPartida,
            List<Ficha> fichasTablero) {
        initComponents();
        panelFichasExterno = new PanelFichas(this, fichasTablero);
        this.presenterPartida = presenterPartida;
        panelFichasJugador = new PanelFichasJugador(fichasJugador, this);
        this.cargarTablero();
        this.cargarTableroJugador();
        this.namePlayer1.setText(jugador.getNombre());
    }

    public FrmPartida() {
        initComponents();
        this.cargarTablero();
        this.cargarTableroJugador();
    }

    public void cargarTableroJugador() {
        this.panelFichasJugador.setSize(panelFichas.getWidth(),
                panelFichas.getHeight());
//        this.panelFichasExterno.setBackground(gameBoardPanel.getBackground());
        this.panelFichasJugador.setLocation(0, 0);
        panelFichas.removeAll();
        panelFichas.add(this.panelFichasJugador, BorderLayout.CENTER);
        panelFichas.revalidate();
        panelFichas.repaint();
    }

    public void cargarTablero() {
        this.panelFichasExterno.setSize(gameBoardPanel.getWidth(),
                gameBoardPanel.getHeight());
//        this.panelFichasExterno.setBackground(gameBoardPanel.getBackground());
        this.panelFichasExterno.setLocation(0, 0);
        gameBoardPanel.removeAll();
        gameBoardPanel.add(this.panelFichasExterno, BorderLayout.CENTER);
        gameBoardPanel.revalidate();
        gameBoardPanel.repaint();
    }

    public void validarFichas() {
        Ficha fichajugador = panelFichasJugador.fichaSeleccionadaJugador;
        Ficha fichaTablero = panelFichasExterno.fichaSeleccionadaTablero != null
                ? panelFichasExterno.fichaSeleccionadaTablero.getFicha()
                : null;
        if (panelFichasExterno.fichas.isEmpty()) {
            if (fichajugador.validarMula()) {
                presenterPartida.moverFicha(fichajugador, null);
                panelFichasJugador.fichaSeleccionadaJugador = null;
            }
        } else if (fichajugador != null && fichaTablero != null) {
            presenterPartida.moverFicha(fichajugador, fichaTablero);
            panelFichasJugador.fichaSeleccionadaJugador = null;
            panelFichasExterno.fichaSeleccionadaTablero = null;
        }
        panelFichasExterno.repaint();
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
        gameBoardPanel = new javax.swing.JPanel();
        avatarP2 = new javax.swing.JPanel();
        avatarP3 = new javax.swing.JPanel();
        avatarP1 = new javax.swing.JPanel();
        btnLeave = new javax.swing.JButton();
        namePlayer1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnPullFromPond = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panelFichas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(220, 244, 255));

        gameBoardPanel.setBackground(new java.awt.Color(255, 255, 255));
        gameBoardPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 204), 4, true));
        gameBoardPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gameBoardPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout gameBoardPanelLayout = new javax.swing.GroupLayout(gameBoardPanel);
        gameBoardPanel.setLayout(gameBoardPanelLayout);
        gameBoardPanelLayout.setHorizontalGroup(
            gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 892, Short.MAX_VALUE)
        );
        gameBoardPanelLayout.setVerticalGroup(
            gameBoardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        avatarP2.setBackground(new java.awt.Color(255, 255, 255));
        avatarP2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 2, true));

        javax.swing.GroupLayout avatarP2Layout = new javax.swing.GroupLayout(avatarP2);
        avatarP2.setLayout(avatarP2Layout);
        avatarP2Layout.setHorizontalGroup(
            avatarP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        avatarP2Layout.setVerticalGroup(
            avatarP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        avatarP3.setBackground(new java.awt.Color(255, 255, 255));
        avatarP3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 2, true));

        javax.swing.GroupLayout avatarP3Layout = new javax.swing.GroupLayout(avatarP3);
        avatarP3.setLayout(avatarP3Layout);
        avatarP3Layout.setHorizontalGroup(
            avatarP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        avatarP3Layout.setVerticalGroup(
            avatarP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        avatarP1.setBackground(new java.awt.Color(255, 255, 255));
        avatarP1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 153), 2, true));

        javax.swing.GroupLayout avatarP1Layout = new javax.swing.GroupLayout(avatarP1);
        avatarP1.setLayout(avatarP1Layout);
        avatarP1Layout.setHorizontalGroup(
            avatarP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        avatarP1Layout.setVerticalGroup(
            avatarP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        btnLeave.setBackground(new java.awt.Color(255, 204, 204));
        btnLeave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLeave.setForeground(new java.awt.Color(204, 0, 0));
        btnLeave.setText("Leave");
        btnLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeaveActionPerformed(evt);
            }
        });

        namePlayer1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        namePlayer1.setText("Player 1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Player 2");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Player 3");

        btnPullFromPond.setBackground(new java.awt.Color(204, 204, 255));
        btnPullFromPond.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPullFromPond.setForeground(new java.awt.Color(153, 0, 255));
        btnPullFromPond.setText("Pull from pond");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("(TokenNumber)");

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 153, 0));
        jButton1.setText("Place");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 153, 0));
        jButton2.setText("Skip turn");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFichasLayout = new javax.swing.GroupLayout(panelFichas);
        panelFichas.setLayout(panelFichasLayout);
        panelFichasLayout.setHorizontalGroup(
            panelFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        panelFichasLayout.setVerticalGroup(
            panelFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(namePlayer1)
                    .addComponent(avatarP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(gameBoardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avatarP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(avatarP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(534, 534, 534)
                .addComponent(btnLeave, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPullFromPond)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel4)
                        .addGap(11, 11, 11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelFichas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelFichas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(avatarP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(104, 104, 104)
                                        .addComponent(avatarP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(namePlayer1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2)
                                        .addGap(9, 9, 9)
                                        .addComponent(gameBoardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(btnLeave)
                                .addGap(63, 63, 63)
                                .addComponent(avatarP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPullFromPond, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeaveActionPerformed
        // TODO add your handling code here:
        int respuesta = JOptionPane.showConfirmDialog(rootPane, "¿Seguro que desea abandonar la partida?");
        if (respuesta == 0) {

            //.setVisibleInicio();
            this.dispose();
        } else {

        }

    }//GEN-LAST:event_btnLeaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void gameBoardPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gameBoardPanelMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_gameBoardPanelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel avatarP1;
    private javax.swing.JPanel avatarP2;
    private javax.swing.JPanel avatarP3;
    private javax.swing.JButton btnLeave;
    private javax.swing.JButton btnPullFromPond;
    private javax.swing.JPanel gameBoardPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel namePlayer1;
    private javax.swing.JPanel panelFichas;
    // End of variables declaration//GEN-END:variables
}
