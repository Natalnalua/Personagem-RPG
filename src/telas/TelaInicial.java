/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.awt.Color;
import observer.Ficha;
import observer.Mestre;
import observer.exemploFicha;
import telas.Fichas;

/**
 *
 * @author david
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    
    public String raca;
    public String classe;
    public String arma;
    public String bota;
    public String calca;
    public String peitoral;
    public String elmo;
    
    public TelaInicial() {
        
        initComponents();
      
    }
    
    public void ativarClasses(){
        rbt_classeGuerreiro.setEnabled(true);
        rbt_classeMago.setEnabled(true);
        rbt_classeDruida.setEnabled(true);
    }
    
    public void ativarArmasArmadurasGuerreiro(){
        rbt_armaEspada.setEnabled(true);
        rbt_armaMachado.setEnabled(true);
        rbt_armaCajado.setEnabled(false);
        rbt_armaVarinha.setEnabled(false);
        rbt_armaArco.setEnabled(false);
        rbt_armaChicote.setEnabled(false);
        
        rbt_botasCouro.setEnabled(true);
        rbt_botasGibao.setEnabled(true);
        rbt_botasPlacas.setEnabled(true);
        
        rbt_calcasCouro.setEnabled(true);
        rbt_calcasGibao.setEnabled(true);
        rbt_calcasPlacas.setEnabled(true);
        
        rbt_peitoralCouro.setEnabled(true);
        rbt_peitoralGibao.setEnabled(true);
        rbt_peitoralPlacas.setEnabled(true);
        
        rbt_elmoPlacas.setEnabled(true);
        
        // ######################################3
        
        rbt_armaEspada.setVisible(true);
        rbt_armaMachado.setVisible(true);
        rbt_armaCajado.setVisible(false);
        rbt_armaVarinha.setVisible(false);
        rbt_armaArco.setVisible(false);
        rbt_armaChicote.setVisible(false);        
        
        rbt_botasCouro.setVisible(true);
        rbt_botasGibao.setVisible(true);
        rbt_botasPlacas.setVisible(true);
        
        rbt_calcasCouro.setVisible(true);
        rbt_calcasGibao.setVisible(true);
        rbt_calcasPlacas.setVisible(true);
        
        rbt_peitoralCouro.setVisible(true);
        rbt_peitoralGibao.setVisible(true);
        rbt_peitoralPlacas.setVisible(true);
        
        rbt_elmoPlacas.setVisible(true);
    }
    
    public void ativarArmasArmadurasMago(){
        rbt_armaEspada.setEnabled(false);
        rbt_armaMachado.setEnabled(false);
        rbt_armaCajado.setEnabled(true);
        rbt_armaVarinha.setEnabled(true);
        rbt_armaArco.setEnabled(false);
        rbt_armaChicote.setEnabled(false);
        
        rbt_botasCouro.setEnabled(true);
        rbt_botasGibao.setEnabled(false);
        rbt_botasPlacas.setEnabled(false);
        
        rbt_calcasCouro.setEnabled(true);
        rbt_calcasGibao.setEnabled(false);
        rbt_calcasPlacas.setEnabled(false);
        
        rbt_peitoralCouro.setEnabled(true);
        rbt_peitoralGibao.setEnabled(false);
        rbt_peitoralPlacas.setEnabled(false);
        
        rbt_elmoPlacas.setEnabled(false);
        
        // ###########################################
        
        rbt_armaCajado.setVisible(true);
        rbt_armaVarinha.setVisible(true);      
       
        rbt_botasCouro.setVisible(true);
        
        rbt_calcasCouro.setVisible(true);
        
        rbt_peitoralCouro.setVisible(true);

    }
    
    public void ativarArmasArmadurasDruida(){
        rbt_armaEspada.setEnabled(false);
        rbt_armaMachado.setEnabled(false);
        rbt_armaCajado.setEnabled(false);
        rbt_armaVarinha.setEnabled(false);
        rbt_armaArco.setEnabled(true);
        rbt_armaChicote.setEnabled(true);
        
        rbt_botasCouro.setEnabled(true);
        rbt_botasGibao.setEnabled(true);
        rbt_botasPlacas.setEnabled(false);
        
        rbt_calcasCouro.setEnabled(true);
        rbt_calcasGibao.setEnabled(true);
        rbt_calcasPlacas.setEnabled(false);
        
        rbt_peitoralCouro.setEnabled(true);
        rbt_peitoralGibao.setEnabled(true);
        rbt_peitoralPlacas.setEnabled(false);
        
        rbt_elmoPlacas.setEnabled(false);
        
        // #################################
        
        rbt_armaArco.setVisible(true);
        rbt_armaChicote.setVisible(true);        
        
        rbt_botasCouro.setVisible(true);
        rbt_botasGibao.setVisible(true);
        
        rbt_calcasCouro.setVisible(true);
        rbt_calcasGibao.setVisible(true);
        
        rbt_peitoralCouro.setVisible(true);
        rbt_peitoralGibao.setVisible(true);
    }
    
    public void limparArmasArmaduras(){        
        rbt_armaEspada.setSelected(false);
        rbt_armaMachado.setSelected(false);
        rbt_armaCajado.setSelected(false);
        rbt_armaVarinha.setSelected(false);
        rbt_armaArco.setSelected(false);
        rbt_armaChicote.setSelected(false);        
        
        rbt_botasCouro.setSelected(false);
        rbt_botasGibao.setSelected(false);
        rbt_botasPlacas.setSelected(false);
        
        rbt_calcasCouro.setSelected(false);
        rbt_calcasGibao.setSelected(false);
        rbt_calcasPlacas.setSelected(false);
        
        rbt_peitoralCouro.setSelected(false);
        rbt_peitoralGibao.setSelected(false);
        rbt_peitoralPlacas.setSelected(false);
        
        rbt_elmoPlacas.setSelected(false);
        
        //#################################################
        
        rbt_armaEspada.setVisible(false);
        rbt_armaMachado.setVisible(false);
        rbt_armaCajado.setVisible(false);
        rbt_armaVarinha.setVisible(false);
        rbt_armaArco.setVisible(false);
        rbt_armaChicote.setVisible(false);        
        
        rbt_botasCouro.setVisible(false);
        rbt_botasGibao.setVisible(false);
        rbt_botasPlacas.setVisible(false);
        
        rbt_calcasCouro.setVisible(false);
        rbt_calcasGibao.setVisible(false);
        rbt_calcasPlacas.setVisible(false);
        
        rbt_peitoralCouro.setVisible(false);
        rbt_peitoralGibao.setVisible(false);
        rbt_peitoralPlacas.setVisible(false);
        
        rbt_elmoPlacas.setVisible(false);
    }


    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        lbl_imgRacaElfo = new javax.swing.JLabel();
        lbl_imgRacaOrc = new javax.swing.JLabel();
        lbl_imgClasseDruida = new javax.swing.JLabel();
        lbl_imgClasseMago = new javax.swing.JLabel();
        lbl_imgClasseGuerreiro = new javax.swing.JLabel();
        lbl_txtClasseGuerreiro = new javax.swing.JLabel();
        rbt_classeGuerreiro = new javax.swing.JRadioButton();
        rbt_classeMago = new javax.swing.JRadioButton();
        lbl_txtClasseMago = new javax.swing.JLabel();
        lbl_txtClasseDruida = new javax.swing.JLabel();
        rbt_classeDruida = new javax.swing.JRadioButton();
        lbl_imgArmaEspada = new javax.swing.JLabel();
        lbl_txtArmaEspada = new javax.swing.JLabel();
        rbt_armaEspada = new javax.swing.JRadioButton();
        lbl_imgArmaMachado = new javax.swing.JLabel();
        rbt_armaMachado = new javax.swing.JRadioButton();
        lbl_txtArmaMachado = new javax.swing.JLabel();
        lbl_imgArmaCajado = new javax.swing.JLabel();
        rbt_armaCajado = new javax.swing.JRadioButton();
        lbl_txtArmaCajado = new javax.swing.JLabel();
        lbl_imgArmaVarinha = new javax.swing.JLabel();
        rbt_armaVarinha = new javax.swing.JRadioButton();
        lbl_txtArmaVarinha = new javax.swing.JLabel();
        lbl_imgArmaArco = new javax.swing.JLabel();
        rbt_armaArco = new javax.swing.JRadioButton();
        lbl_txtArmaArco = new javax.swing.JLabel();
        lbl_imgArmaChicote = new javax.swing.JLabel();
        rbt_armaChicote = new javax.swing.JRadioButton();
        lbl_txtArmaChicote = new javax.swing.JLabel();
        lbl_imgBotasCouro = new javax.swing.JLabel();
        rbt_botasCouro = new javax.swing.JRadioButton();
        lbl_txtArmaduraCouro = new javax.swing.JLabel();
        lbl_imgCalcasCouro = new javax.swing.JLabel();
        rbt_calcasCouro = new javax.swing.JRadioButton();
        rbt_peitoralCouro = new javax.swing.JRadioButton();
        lbl_imgBotasGibao = new javax.swing.JLabel();
        rbt_botasGibao = new javax.swing.JRadioButton();
        lbl_txtArmaduraCouro1 = new javax.swing.JLabel();
        lbl_imgCalcasGibao = new javax.swing.JLabel();
        rbt_calcasGibao = new javax.swing.JRadioButton();
        lbl_imgPeitoralGibao = new javax.swing.JLabel();
        rbt_peitoralGibao = new javax.swing.JRadioButton();
        lbl_imgBotasPlacas = new javax.swing.JLabel();
        rbt_botasPlacas = new javax.swing.JRadioButton();
        lbl_txtArmaduraCouro2 = new javax.swing.JLabel();
        lbl_imgCalcasPlacas = new javax.swing.JLabel();
        rbt_calcasPlacas = new javax.swing.JRadioButton();
        lbl_imgPeitoralPlacas = new javax.swing.JLabel();
        rbt_peitoralPlacas = new javax.swing.JRadioButton();
        lbl_imgElmoPlacas = new javax.swing.JLabel();
        rbt_elmoPlacas = new javax.swing.JRadioButton();
        abt_sexo = new javax.swing.JToggleButton();
        bt_concluir = new javax.swing.JButton();
        lbl_imgRacaHumano = new javax.swing.JLabel();
        rbt_racaHumano = new javax.swing.JRadioButton();
        lbl_txtRacaHumano = new javax.swing.JLabel();
        lbl_txtRacaOrc = new javax.swing.JLabel();
        rbt_racaOrc = new javax.swing.JRadioButton();
        rbt_racaElfo = new javax.swing.JRadioButton();
        lbl_txtRacaElfo = new javax.swing.JLabel();
        lbl_imgPeitoralCouro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ficha Fácil");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Tela Inicial"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_imgRacaElfo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_imgRacaElfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensTelaInicial/Elfo.png"))); // NOI18N
        getContentPane().add(lbl_imgRacaElfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        lbl_imgRacaOrc.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_imgRacaOrc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensTelaInicial/Orc.png"))); // NOI18N
        getContentPane().add(lbl_imgRacaOrc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        lbl_imgClasseDruida.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_imgClasseDruida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensTelaInicial/Druida.png"))); // NOI18N
        getContentPane().add(lbl_imgClasseDruida, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        lbl_imgClasseMago.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_imgClasseMago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensTelaInicial/Mago.jpg"))); // NOI18N
        getContentPane().add(lbl_imgClasseMago, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        lbl_imgClasseGuerreiro.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_imgClasseGuerreiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensTelaInicial/Guerreiro.png"))); // NOI18N
        getContentPane().add(lbl_imgClasseGuerreiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        lbl_txtClasseGuerreiro.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_txtClasseGuerreiro.setText("Guerreiro");
        getContentPane().add(lbl_txtClasseGuerreiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 50, -1));

        gbt_classes.add(rbt_classeGuerreiro);
        rbt_classeGuerreiro.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbt_classeGuerreiro.setEnabled(false);
        rbt_classeGuerreiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbt_classeGuerreiroMouseClicked(evt);
            }
        });
        rbt_classeGuerreiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_classeGuerreiroActionPerformed(evt);
            }
        });
        getContentPane().add(rbt_classeGuerreiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 20, 20));

        gbt_classes.add(rbt_classeMago);
        rbt_classeMago.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbt_classeMago.setEnabled(false);
        rbt_classeMago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbt_classeMagoMouseClicked(evt);
            }
        });
        rbt_classeMago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_classeMagoActionPerformed(evt);
            }
        });
        getContentPane().add(rbt_classeMago, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 20, 20));

        lbl_txtClasseMago.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_txtClasseMago.setText("Mago");
        getContentPane().add(lbl_txtClasseMago, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 30, -1));

        lbl_txtClasseDruida.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_txtClasseDruida.setText("Druida");
        getContentPane().add(lbl_txtClasseDruida, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 50, -1));

        gbt_classes.add(rbt_classeDruida);
        rbt_classeDruida.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbt_classeDruida.setEnabled(false);
        rbt_classeDruida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbt_classeDruidaMouseClicked(evt);
            }
        });
        rbt_classeDruida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_classeDruidaActionPerformed(evt);
            }
        });
        getContentPane().add(rbt_classeDruida, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 20, 20));

        lbl_imgArmaEspada.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_imgArmaEspada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensTelaInicial/Espada.jpg"))); // NOI18N
        getContentPane().add(lbl_imgArmaEspada, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 40, 40));

        lbl_txtArmaEspada.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_txtArmaEspada.setText("Espada Longa");
        getContentPane().add(lbl_txtArmaEspada, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 70, -1));

        gbt_armaGuerreiro.add(rbt_armaEspada);
        rbt_armaEspada.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbt_armaEspada.setEnabled(false);
        rbt_armaEspada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_armaEspadaActionPerformed(evt);
            }
        });
        getContentPane().add(rbt_armaEspada, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 20, 20));

        lbl_imgArmaMachado.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_imgArmaMachado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensTelaInicial/Machado.png"))); // NOI18N
        getContentPane().add(lbl_imgArmaMachado, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 40, 40));

        gbt_armaGuerreiro.add(rbt_armaMachado);
        rbt_armaMachado.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbt_armaMachado.setEnabled(false);
        rbt_armaMachado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_armaMachadoActionPerformed(evt);
            }
        });
        getContentPane().add(rbt_armaMachado, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 20, 20));

        lbl_txtArmaMachado.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_txtArmaMachado.setText("Machado");
        getContentPane().add(lbl_txtArmaMachado, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 50, -1));

        lbl_imgArmaCajado.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_imgArmaCajado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensTelaInicial/Cajado.png"))); // NOI18N
        getContentPane().add(lbl_imgArmaCajado, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 40, 40));

        gbt_armaMago.add(rbt_armaCajado);
        rbt_armaCajado.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbt_armaCajado.setEnabled(false);
        rbt_armaCajado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_armaCajadoActionPerformed(evt);
            }
        });
        getContentPane().add(rbt_armaCajado, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 20, 20));

        lbl_txtArmaCajado.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_txtArmaCajado.setText("Cajado");
        getContentPane().add(lbl_txtArmaCajado, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 40, -1));

        lbl_imgArmaVarinha.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_imgArmaVarinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensTelaInicial/Varinha.jpg"))); // NOI18N
        getContentPane().add(lbl_imgArmaVarinha, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 40, 40));

        gbt_armaMago.add(rbt_armaVarinha);
        rbt_armaVarinha.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbt_armaVarinha.setEnabled(false);
        rbt_armaVarinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_armaVarinhaActionPerformed(evt);
            }
        });
        getContentPane().add(rbt_armaVarinha, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 20, 20));

        lbl_txtArmaVarinha.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_txtArmaVarinha.setText("Varinha");
        getContentPane().add(lbl_txtArmaVarinha, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, -1, -1));

        lbl_imgArmaArco.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_imgArmaArco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensTelaInicial/Arco.png"))); // NOI18N
        getContentPane().add(lbl_imgArmaArco, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 40, 40));

        gbt_armaDruida.add(rbt_armaArco);
        rbt_armaArco.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbt_armaArco.setEnabled(false);
        rbt_armaArco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_armaArcoActionPerformed(evt);
            }
        });
        getContentPane().add(rbt_armaArco, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, 20, 20));

        lbl_txtArmaArco.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_txtArmaArco.setText("Arco");
        getContentPane().add(lbl_txtArmaArco, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 40, -1));

        lbl_imgArmaChicote.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_imgArmaChicote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensTelaInicial/Chicote.png"))); // NOI18N
        getContentPane().add(lbl_imgArmaChicote, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 40, 40));

        gbt_armaDruida.add(rbt_armaChicote);
        rbt_armaChicote.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbt_armaChicote.setEnabled(false);
        rbt_armaChicote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_armaChicoteActionPerformed(evt);
            }
        });
        getContentPane().add(rbt_armaChicote, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, 20, 20));

        lbl_txtArmaChicote.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_txtArmaChicote.setText("Chicote");
        getContentPane().add(lbl_txtArmaChicote, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 40, -1));

        lbl_imgBotasCouro.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_imgBotasCouro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensTelaInicial/Botas.png"))); // NOI18N
        getContentPane().add(lbl_imgBotasCouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 40, 40));

        gbt_armadurasBotas.add(rbt_botasCouro);
        rbt_botasCouro.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbt_botasCouro.setEnabled(false);
        rbt_botasCouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_botasCouroActionPerformed(evt);
            }
        });
        getContentPane().add(rbt_botasCouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 20, 20));

        lbl_txtArmaduraCouro.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_txtArmaduraCouro.setText("Armaduras de Couro");
        getContentPane().add(lbl_txtArmaduraCouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 140, -1));

        lbl_imgCalcasCouro.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_imgCalcasCouro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensTelaInicial/Perneiras.png"))); // NOI18N
        getContentPane().add(lbl_imgCalcasCouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 40, 40));

        gbt_armadurasCalcas.add(rbt_calcasCouro);
        rbt_calcasCouro.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbt_calcasCouro.setEnabled(false);
        rbt_calcasCouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_calcasCouroActionPerformed(evt);
            }
        });
        getContentPane().add(rbt_calcasCouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 20, 20));

        gbt_armadurasPeitorais.add(rbt_peitoralCouro);
        rbt_peitoralCouro.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbt_peitoralCouro.setEnabled(false);
        rbt_peitoralCouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_peitoralCouroActionPerformed(evt);
            }
        });
        getContentPane().add(rbt_peitoralCouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 20, 20));

        lbl_imgBotasGibao.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_imgBotasGibao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensTelaInicial/Botas.png"))); // NOI18N
        getContentPane().add(lbl_imgBotasGibao, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 40, 40));

        gbt_armadurasBotas.add(rbt_botasGibao);
        rbt_botasGibao.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbt_botasGibao.setEnabled(false);
        rbt_botasGibao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_botasGibaoActionPerformed(evt);
            }
        });
        getContentPane().add(rbt_botasGibao, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 20, 20));

        lbl_txtArmaduraCouro1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_txtArmaduraCouro1.setText("Armaduras de Gibão de peles");
        getContentPane().add(lbl_txtArmaduraCouro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 150, 20));

        lbl_imgCalcasGibao.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_imgCalcasGibao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensTelaInicial/Perneiras.png"))); // NOI18N
        getContentPane().add(lbl_imgCalcasGibao, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 40, 40));

        gbt_armadurasCalcas.add(rbt_calcasGibao);
        rbt_calcasGibao.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbt_calcasGibao.setEnabled(false);
        rbt_calcasGibao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_calcasGibaoActionPerformed(evt);
            }
        });
        getContentPane().add(rbt_calcasGibao, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 20, 20));

        lbl_imgPeitoralGibao.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_imgPeitoralGibao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensTelaInicial/Peitoral 1.png"))); // NOI18N
        getContentPane().add(lbl_imgPeitoralGibao, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 40, 40));

        gbt_armadurasPeitorais.add(rbt_peitoralGibao);
        rbt_peitoralGibao.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbt_peitoralGibao.setEnabled(false);
        rbt_peitoralGibao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_peitoralGibaoActionPerformed(evt);
            }
        });
        getContentPane().add(rbt_peitoralGibao, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 20, 20));

        lbl_imgBotasPlacas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_imgBotasPlacas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensTelaInicial/Botas.png"))); // NOI18N
        getContentPane().add(lbl_imgBotasPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 40, 40));

        gbt_armadurasBotas.add(rbt_botasPlacas);
        rbt_botasPlacas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbt_botasPlacas.setEnabled(false);
        rbt_botasPlacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_botasPlacasActionPerformed(evt);
            }
        });
        getContentPane().add(rbt_botasPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 20, 20));

        lbl_txtArmaduraCouro2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_txtArmaduraCouro2.setText("Armaduras de Placas metalicas");
        getContentPane().add(lbl_txtArmaduraCouro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 160, -1));

        lbl_imgCalcasPlacas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_imgCalcasPlacas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensTelaInicial/Perneiras.png"))); // NOI18N
        getContentPane().add(lbl_imgCalcasPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 40, 40));

        gbt_armadurasCalcas.add(rbt_calcasPlacas);
        rbt_calcasPlacas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbt_calcasPlacas.setEnabled(false);
        rbt_calcasPlacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_calcasPlacasActionPerformed(evt);
            }
        });
        getContentPane().add(rbt_calcasPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 20, 20));

        lbl_imgPeitoralPlacas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_imgPeitoralPlacas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensTelaInicial/Peitoral 1.png"))); // NOI18N
        getContentPane().add(lbl_imgPeitoralPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, 40, 40));

        gbt_armadurasPeitorais.add(rbt_peitoralPlacas);
        rbt_peitoralPlacas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbt_peitoralPlacas.setEnabled(false);
        rbt_peitoralPlacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_peitoralPlacasActionPerformed(evt);
            }
        });
        getContentPane().add(rbt_peitoralPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 20, 20));

        lbl_imgElmoPlacas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_imgElmoPlacas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensTelaInicial/Elmo.jpg"))); // NOI18N
        getContentPane().add(lbl_imgElmoPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 40, 40));

        rbt_elmoPlacas.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbt_elmoPlacas.setEnabled(false);
        rbt_elmoPlacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_elmoPlacasActionPerformed(evt);
            }
        });
        getContentPane().add(rbt_elmoPlacas, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 20, 20));

        abt_sexo.setBackground(new java.awt.Color(102, 102, 255));
        abt_sexo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        abt_sexo.setSelected(true);
        abt_sexo.setText("Masculino");
        abt_sexo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abt_sexoMouseClicked(evt);
            }
        });
        getContentPane().add(abt_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 105, -1));

        bt_concluir.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        bt_concluir.setText("Concluir");
        bt_concluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_concluirActionPerformed(evt);
            }
        });
        getContentPane().add(bt_concluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 460, 110, 50));

        lbl_imgRacaHumano.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_imgRacaHumano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensTelaInicial/Humano.png"))); // NOI18N
        getContentPane().add(lbl_imgRacaHumano, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        gbt_racas.add(rbt_racaHumano);
        rbt_racaHumano.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbt_racaHumano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbt_racaHumanoMouseClicked(evt);
            }
        });
        rbt_racaHumano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_racaHumanoActionPerformed(evt);
            }
        });
        getContentPane().add(rbt_racaHumano, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 40, -1));

        lbl_txtRacaHumano.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_txtRacaHumano.setText("Humano");
        getContentPane().add(lbl_txtRacaHumano, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 50, -1));

        lbl_txtRacaOrc.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_txtRacaOrc.setText("Orc");
        getContentPane().add(lbl_txtRacaOrc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 20, -1));

        gbt_racas.add(rbt_racaOrc);
        rbt_racaOrc.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbt_racaOrc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbt_racaOrcMouseClicked(evt);
            }
        });
        rbt_racaOrc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_racaOrcActionPerformed(evt);
            }
        });
        getContentPane().add(rbt_racaOrc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 20, -1));

        gbt_racas.add(rbt_racaElfo);
        rbt_racaElfo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbt_racaElfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbt_racaElfoMouseClicked(evt);
            }
        });
        rbt_racaElfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_racaElfoActionPerformed(evt);
            }
        });
        getContentPane().add(rbt_racaElfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 20, -1));

        lbl_txtRacaElfo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_txtRacaElfo.setText("Elfo");
        getContentPane().add(lbl_txtRacaElfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 20, -1));

        lbl_imgPeitoralCouro.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lbl_imgPeitoralCouro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensTelaInicial/Peitoral 1.png"))); // NOI18N
        getContentPane().add(lbl_imgPeitoralCouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 40, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbt_racaElfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbt_racaElfoMouseClicked
        //System.out.println("Oi");

    }//GEN-LAST:event_rbt_racaElfoMouseClicked

    private void rbt_racaHumanoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbt_racaHumanoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rbt_racaHumanoMouseClicked

    private void rbt_racaOrcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbt_racaOrcMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rbt_racaOrcMouseClicked

    private void rbt_classeGuerreiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbt_classeGuerreiroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rbt_classeGuerreiroMouseClicked

    private void rbt_classeMagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbt_classeMagoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rbt_classeMagoMouseClicked

    private void rbt_classeDruidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbt_classeDruidaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rbt_classeDruidaMouseClicked

    private void rbt_botasCouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_botasCouroActionPerformed
        bota = "Couro";
    }//GEN-LAST:event_rbt_botasCouroActionPerformed

    private void rbt_calcasCouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_calcasCouroActionPerformed
        calca = "Couro";
    }//GEN-LAST:event_rbt_calcasCouroActionPerformed

    private void rbt_peitoralCouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_peitoralCouroActionPerformed
        peitoral = "Couro";
    }//GEN-LAST:event_rbt_peitoralCouroActionPerformed

    private void rbt_botasGibaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_botasGibaoActionPerformed
        bota = "Gibao";
    }//GEN-LAST:event_rbt_botasGibaoActionPerformed

    private void rbt_calcasGibaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_calcasGibaoActionPerformed
        calca = "Gibao";
    }//GEN-LAST:event_rbt_calcasGibaoActionPerformed

    private void rbt_peitoralGibaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_peitoralGibaoActionPerformed
        peitoral = "Gibao";
    }//GEN-LAST:event_rbt_peitoralGibaoActionPerformed

    private void rbt_botasPlacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_botasPlacasActionPerformed
        bota = "Placas";
    }//GEN-LAST:event_rbt_botasPlacasActionPerformed

    private void rbt_calcasPlacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_calcasPlacasActionPerformed
        calca = "Placas";
    }//GEN-LAST:event_rbt_calcasPlacasActionPerformed

    private void rbt_peitoralPlacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_peitoralPlacasActionPerformed
        peitoral = "Placas";
    }//GEN-LAST:event_rbt_peitoralPlacasActionPerformed

    private void rbt_elmoPlacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_elmoPlacasActionPerformed
        if (rbt_elmoPlacas.isSelected()== true){
            elmo = "Placas";
            //System.out.println(elmo);
        } else if (rbt_elmoPlacas.isSelected()== false){
            elmo = "";
            //System.out.println(elmo);
        }
        
    }//GEN-LAST:event_rbt_elmoPlacasActionPerformed

    private void abt_sexoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abt_sexoMouseClicked
        if ("Masculino".equals(abt_sexo.getText())){
            abt_sexo.setText("Feminino");
            abt_sexo.setBackground(Color.pink);
        } else {
            abt_sexo.setText("Masculino");
            abt_sexo.setBackground(Color.blue);
        }
    }//GEN-LAST:event_abt_sexoMouseClicked

    private void rbt_racaHumanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_racaHumanoActionPerformed
        ativarClasses();
    }//GEN-LAST:event_rbt_racaHumanoActionPerformed

    private void rbt_racaOrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_racaOrcActionPerformed
        ativarClasses();
    }//GEN-LAST:event_rbt_racaOrcActionPerformed

    private void rbt_racaElfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_racaElfoActionPerformed
        ativarClasses();
    }//GEN-LAST:event_rbt_racaElfoActionPerformed

    private void bt_concluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_concluirActionPerformed
        exemploFicha f = new exemploFicha();
        Mestre m1 = new Mestre("Willian", f);
        Ficha e1 = new Ficha();
        e1.setNome("Pedro");
        e1.setNumFicha(1);
        e1.setRaca(raca);
        e1.setClasse(classe);
        e1.setArma(arma);
        e1.setArma(bota);   
        e1.setArma(calca);   
        e1.setArma(peitoral);   
        e1.setArma(elmo);   
        f.setFicha(e1);
        f.notificarMestre();
        
        new Fichas().setVisible(true);
    }//GEN-LAST:event_bt_concluirActionPerformed

    private void rbt_classeGuerreiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_classeGuerreiroActionPerformed
        limparArmasArmaduras();
        ativarArmasArmadurasGuerreiro();
    }//GEN-LAST:event_rbt_classeGuerreiroActionPerformed

    private void rbt_classeMagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_classeMagoActionPerformed
        limparArmasArmaduras();
        ativarArmasArmadurasMago();
        
    }//GEN-LAST:event_rbt_classeMagoActionPerformed

    private void rbt_classeDruidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_classeDruidaActionPerformed
        limparArmasArmaduras();
        ativarArmasArmadurasDruida();
    }//GEN-LAST:event_rbt_classeDruidaActionPerformed

    private void rbt_armaEspadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_armaEspadaActionPerformed
        arma = "Espada";
    }//GEN-LAST:event_rbt_armaEspadaActionPerformed

    private void rbt_armaMachadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_armaMachadoActionPerformed
        arma = "Machado";
    }//GEN-LAST:event_rbt_armaMachadoActionPerformed

    private void rbt_armaCajadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_armaCajadoActionPerformed
        arma = "Cajado";
    }//GEN-LAST:event_rbt_armaCajadoActionPerformed

    private void rbt_armaVarinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_armaVarinhaActionPerformed
        arma = "Varinha";
    }//GEN-LAST:event_rbt_armaVarinhaActionPerformed

    private void rbt_armaArcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_armaArcoActionPerformed
        arma = "Arco";
    }//GEN-LAST:event_rbt_armaArcoActionPerformed

    private void rbt_armaChicoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_armaChicoteActionPerformed
        arma = "Chicote";
    }//GEN-LAST:event_rbt_armaChicoteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton abt_sexo;
    private javax.swing.JButton bt_concluir;
    private javax.swing.ButtonGroup gbt_armaDruida;
    private javax.swing.ButtonGroup gbt_armaGuerreiro;
    private javax.swing.ButtonGroup gbt_armaMago;
    private javax.swing.ButtonGroup gbt_armadurasBotas;
    private javax.swing.ButtonGroup gbt_armadurasCalcas;
    private javax.swing.ButtonGroup gbt_armadurasPeitorais;
    private javax.swing.ButtonGroup gbt_classes;
    private javax.swing.ButtonGroup gbt_racas;
    private javax.swing.JLabel lbl_imgArmaArco;
    private javax.swing.JLabel lbl_imgArmaCajado;
    private javax.swing.JLabel lbl_imgArmaChicote;
    private javax.swing.JLabel lbl_imgArmaEspada;
    private javax.swing.JLabel lbl_imgArmaMachado;
    private javax.swing.JLabel lbl_imgArmaVarinha;
    private javax.swing.JLabel lbl_imgBotasCouro;
    private javax.swing.JLabel lbl_imgBotasGibao;
    private javax.swing.JLabel lbl_imgBotasPlacas;
    private javax.swing.JLabel lbl_imgCalcasCouro;
    private javax.swing.JLabel lbl_imgCalcasGibao;
    private javax.swing.JLabel lbl_imgCalcasPlacas;
    private javax.swing.JLabel lbl_imgClasseDruida;
    private javax.swing.JLabel lbl_imgClasseGuerreiro;
    private javax.swing.JLabel lbl_imgClasseMago;
    private javax.swing.JLabel lbl_imgElmoPlacas;
    private javax.swing.JLabel lbl_imgPeitoralCouro;
    private javax.swing.JLabel lbl_imgPeitoralGibao;
    private javax.swing.JLabel lbl_imgPeitoralPlacas;
    private javax.swing.JLabel lbl_imgRacaElfo;
    private javax.swing.JLabel lbl_imgRacaHumano;
    private javax.swing.JLabel lbl_imgRacaOrc;
    private javax.swing.JLabel lbl_txtArmaArco;
    private javax.swing.JLabel lbl_txtArmaCajado;
    private javax.swing.JLabel lbl_txtArmaChicote;
    private javax.swing.JLabel lbl_txtArmaEspada;
    private javax.swing.JLabel lbl_txtArmaMachado;
    private javax.swing.JLabel lbl_txtArmaVarinha;
    private javax.swing.JLabel lbl_txtArmaduraCouro;
    private javax.swing.JLabel lbl_txtArmaduraCouro1;
    private javax.swing.JLabel lbl_txtArmaduraCouro2;
    private javax.swing.JLabel lbl_txtClasseDruida;
    private javax.swing.JLabel lbl_txtClasseGuerreiro;
    private javax.swing.JLabel lbl_txtClasseMago;
    private javax.swing.JLabel lbl_txtRacaElfo;
    private javax.swing.JLabel lbl_txtRacaHumano;
    private javax.swing.JLabel lbl_txtRacaOrc;
    private javax.swing.JRadioButton rbt_armaArco;
    private javax.swing.JRadioButton rbt_armaCajado;
    private javax.swing.JRadioButton rbt_armaChicote;
    private javax.swing.JRadioButton rbt_armaEspada;
    private javax.swing.JRadioButton rbt_armaMachado;
    private javax.swing.JRadioButton rbt_armaVarinha;
    private javax.swing.JRadioButton rbt_botasCouro;
    private javax.swing.JRadioButton rbt_botasGibao;
    private javax.swing.JRadioButton rbt_botasPlacas;
    private javax.swing.JRadioButton rbt_calcasCouro;
    private javax.swing.JRadioButton rbt_calcasGibao;
    private javax.swing.JRadioButton rbt_calcasPlacas;
    private javax.swing.JRadioButton rbt_classeDruida;
    private javax.swing.JRadioButton rbt_classeGuerreiro;
    private javax.swing.JRadioButton rbt_classeMago;
    private javax.swing.JRadioButton rbt_elmoPlacas;
    private javax.swing.JRadioButton rbt_peitoralCouro;
    private javax.swing.JRadioButton rbt_peitoralGibao;
    private javax.swing.JRadioButton rbt_peitoralPlacas;
    private javax.swing.JRadioButton rbt_racaElfo;
    private javax.swing.JRadioButton rbt_racaHumano;
    private javax.swing.JRadioButton rbt_racaOrc;
    // End of variables declaration//GEN-END:variables
}
