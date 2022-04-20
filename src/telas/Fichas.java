package telas;

import telas.TelaInicial;

public class Fichas extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gbt_racas = new javax.swing.ButtonGroup();
        gbt_classes = new javax.swing.ButtonGroup();
        gbt_armaGuerreiro = new javax.swing.ButtonGroup();
        gbt_armaMago = new javax.swing.ButtonGroup();
        gbt_armaDruida = new javax.swing.ButtonGroup();
        gbt_armadurasBotas = new javax.swing.ButtonGroup();
        gbt_armadurasCalcas = new javax.swing.ButtonGroup();
        gbt_armadurasPeitorais = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ficha Fácil");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Tela Inicial"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("FICHAS ONLINE");
        jLabel2.setMaximumSize(new java.awt.Dimension(170, 32));
        jLabel2.setMinimumSize(new java.awt.Dimension(170, 32));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 90, 20));

        jLabel3.setText("NOME:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel4.setText("ARMA:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        jLabel5.setText("RAÇA:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel6.setText("CLASSE:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        jLabel7.setText("ARMADURA:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        jLabel9.setText("MOV");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        jLabel10.setText("C.A.");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, -1));

        jLabel11.setText("VIDA");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, -1, -1));

        jLabel12.setText("DES");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 73, 610, 10));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fichas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup gbt_armaDruida;
    private javax.swing.ButtonGroup gbt_armaGuerreiro;
    private javax.swing.ButtonGroup gbt_armaMago;
    private javax.swing.ButtonGroup gbt_armadurasBotas;
    private javax.swing.ButtonGroup gbt_armadurasCalcas;
    private javax.swing.ButtonGroup gbt_armadurasPeitorais;
    private javax.swing.ButtonGroup gbt_classes;
    private javax.swing.ButtonGroup gbt_racas;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
