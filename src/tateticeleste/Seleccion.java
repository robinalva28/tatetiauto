package tateticeleste;

public class Seleccion extends javax.swing.JFrame {

    public Seleccion() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Ta-te-ti V2");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnVsJugador = new javax.swing.JToggleButton();
        btnVsOrdenador = new javax.swing.JToggleButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Engravers MT", 3, 12)); // NOI18N
        jLabel1.setText("Seleccione Modalidad");

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btnVsJugador.setFont(new java.awt.Font("Engravers MT", 0, 24)); // NOI18N
        btnVsJugador.setText("1 vs 1");
        btnVsJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVsJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(btnVsJugador);

        btnVsOrdenador.setFont(new java.awt.Font("Engravers MT", 0, 24)); // NOI18N
        btnVsOrdenador.setText("vs ordernador");
        btnVsOrdenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVsOrdenadorActionPerformed(evt);
            }
        });
        jPanel1.add(btnVsOrdenador);

        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        boolean vsordenador;
    private void btnVsJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVsJugadorActionPerformed
        Inicio2 inicio2 = new Inicio2(0,vsordenador  = false);
        inicio2.setVisible(true);
        this.setVisible(false);
        System.out.println("VS jugador");

    }//GEN-LAST:event_btnVsJugadorActionPerformed

    private void btnVsOrdenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVsOrdenadorActionPerformed
        seleccionOrdenador inicio2 = new seleccionOrdenador();
        inicio2.setVisible(true);
        this.setVisible(false);
         System.out.println("VS ordenador");
    }//GEN-LAST:event_btnVsOrdenadorActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JToggleButton btnVsJugador;
    private javax.swing.JToggleButton btnVsOrdenador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}