/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import model.bean.moto;
import model.bean.motoClub;
import model.bean.pessoa;
import model.bean.usuario;
import model.dao.mcDAO;
import model.dao.pessoaDAO;
import model.dao.usuarioDAO;


/**
 *
 * @author papiro
 */
public class TelaEditarMC extends javax.swing.JFrame {

    private List<usuario> usuarios;
    private List<motoClub> MCs;
    private List<pessoa> pessoas;
    private List<moto> motos1;
    private usuarioDAO form;
    private pessoaDAO form1;
    private mcDAO form2;
    private moto moto;
    private pessoa pessoa;
    private usuario usuario;
    private motoClub mc;
    /**
     * Creates new form telaEditarMC
     */
    public TelaEditarMC() {
        initComponents();
        mc = new motoClub();
        form2 = new mcDAO();
        usuario = new usuario();
        grupoBotoes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblRegiao = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblQtd = new javax.swing.JLabel();
        checkNome = new javax.swing.JRadioButton();
        checkEstado = new javax.swing.JRadioButton();
        checkQtd = new javax.swing.JRadioButton();
        checkRegiao = new javax.swing.JRadioButton();
        lblEstado = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        boxRegião = new javax.swing.JComboBox<>();
        boxEstado = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtCampo = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        menuBar2 = new javax.swing.JMenuBar();
        menuArquivo2 = new javax.swing.JMenu();
        itemHome6 = new javax.swing.JMenuItem();
        itemSair = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        editarMC = new javax.swing.JMenuItem();
        editarUsuario = new javax.swing.JMenuItem();
        excluirUsuario = new javax.swing.JMenuItem();
        excluirMC = new javax.swing.JMenuItem();
        menuListar = new javax.swing.JMenu();
        motos = new javax.swing.JMenuItem();
        motoclubs = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 128, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar MotoClub", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(1, 1, 1));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("Selecione qual informação deseja alterar:");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Nome:");

        lblNome.setText("jLabel8");

        lblRegiao.setText("jLabel6");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Região:");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setText("Quantidade:");

        lblQtd.setText("jLabel7");

        checkNome.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        checkNome.setText("Nome");

        checkEstado.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        checkEstado.setText("Estado");
        checkEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkEstadoActionPerformed(evt);
            }
        });

        checkQtd.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        checkQtd.setText("Quantidade");

        checkRegiao.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        checkRegiao.setText("Região");
        checkRegiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRegiaoActionPerformed(evt);
            }
        });

        lblEstado.setText("jLabel9");

        btnConfirmar.setBackground(new java.awt.Color(1, 1, 1));
        btnConfirmar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(254, 254, 254));
        btnConfirmar.setText("Confimar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setText("Estado:");

        boxRegião.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Norte", "Nordeste", "Sul", "Sudeste", "Centro-Oeste" }));

        boxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setText("Informe novo:");

        btnVoltar.setBackground(new java.awt.Color(1, 1, 1));
        btnVoltar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(254, 254, 254));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblQtd))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(checkRegiao)
                                        .addGap(18, 18, 18)
                                        .addComponent(boxRegião, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(checkEstado)))
                                .addGap(12, 12, 12)
                                .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblRegiao, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(checkNome)
                                        .addGap(62, 62, 62)
                                        .addComponent(checkQtd)))
                                .addGap(18, 18, 18)
                                .addComponent(lblEstado))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnConfirmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblNome))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(lblRegiao)
                    .addComponent(lblEstado))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblQtd))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkNome)
                    .addComponent(checkQtd))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkEstado)
                    .addComponent(checkRegiao)
                    .addComponent(boxRegião, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnVoltar))
                .addContainerGap())
        );

        menuBar2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        menuBar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menuBar2.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));

        menuArquivo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/page.png"))); // NOI18N
        menuArquivo2.setText("Arquivo");

        itemHome6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user.png"))); // NOI18N
        itemHome6.setText("Home");
        itemHome6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemHome6ActionPerformed(evt);
            }
        });
        menuArquivo2.add(itemHome6);

        itemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/door_out.png"))); // NOI18N
        itemSair.setText("Sair");
        itemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSairActionPerformed(evt);
            }
        });
        menuArquivo2.add(itemSair);

        menuBar2.add(menuArquivo2);

        menuEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        menuEditar.setText("Editar");

        editarMC.setBackground(new java.awt.Color(1, 1, 1));
        editarMC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconMoto.png"))); // NOI18N
        editarMC.setText("MotoClub");
        editarMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarMCActionPerformed(evt);
            }
        });
        menuEditar.add(editarMC);

        editarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_edit.png"))); // NOI18N
        editarUsuario.setText("Info. Pessoais");
        editarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarUsuarioActionPerformed(evt);
            }
        });
        menuEditar.add(editarUsuario);

        excluirUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_delete.png"))); // NOI18N
        excluirUsuario.setText("Excluir Usuário");
        excluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirUsuarioActionPerformed(evt);
            }
        });
        menuEditar.add(excluirUsuario);

        excluirMC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/group_delete.png"))); // NOI18N
        excluirMC.setText("ExcluirMC");
        excluirMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirMCActionPerformed(evt);
            }
        });
        menuEditar.add(excluirMC);

        menuBar2.add(menuEditar);

        menuListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/printer.png"))); // NOI18N
        menuListar.setText("Listar");

        motos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/moto.png"))); // NOI18N
        motos.setText("Motos");
        motos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motosActionPerformed(evt);
            }
        });
        menuListar.add(motos);

        motoclubs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/group.png"))); // NOI18N
        motoclubs.setText("MotoClubs");
        motoclubs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motoclubsActionPerformed(evt);
            }
        });
        menuListar.add(motoclubs);

        menuBar2.add(menuListar);

        menuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/help.png"))); // NOI18N
        menuSobre.setText("Sobre");
        menuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSobreMouseClicked(evt);
            }
        });
        menuBar2.add(menuSobre);

        setJMenuBar(menuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void grupoBotoes(){
        ButtonGroup gb = new ButtonGroup();
        gb.add(checkNome);
        gb.add(checkEstado);
        gb.add(checkRegiao);
        gb.add(checkQtd);
    }
    
    private void itemHome6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemHome6ActionPerformed
        // TODO add your handling code here:
        TelaMenuInicial tela = new TelaMenuInicial();
        tela.getObjetos(usuarios, pessoas, MCs, motos1);
        tela.getMc(mc);
        tela.getPessoa(pessoa);
        tela.getUsuario(usuario);
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_itemHome6ActionPerformed

    private void itemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSairActionPerformed
        // TODO add your handling code here:
        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_itemSairActionPerformed

    private void editarMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarMCActionPerformed
        // TODO add your handling code here:
        TelaEditarMC tela = new TelaEditarMC();
        tela.getObjetos(usuarios, pessoas, MCs, motos1);
        tela.getMc(mc);
        tela.getPessoa(pessoa);
        tela.getUsuario(usuario);
        tela.inserir();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_editarMCActionPerformed

    private void editarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarUsuarioActionPerformed
        // TODO add your handling code here:
        TelaEditarPessoa tela = new TelaEditarPessoa();
        tela.getObjetos(usuarios, pessoas, MCs, motos1);
        tela.getMc(mc);
        tela.getPessoa(pessoa);
        tela.getUsuario(usuario);
        tela.inserir();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_editarUsuarioActionPerformed

    private void excluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirUsuarioActionPerformed
        // TODO add your handling code here:
        PopUpConfirmar conf = new PopUpConfirmar();
        conf.confirmar("usuario",usuario,mc,pessoa,MCs);
        conf.setVisible(true);
    }//GEN-LAST:event_excluirUsuarioActionPerformed

    private void excluirMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirMCActionPerformed
        // TODO add your handling code here:
        PopUpConfirmar conf = new PopUpConfirmar();
        conf.confirmar("mc",usuario,mc,pessoa,MCs); 
        conf.setVisible(true);
    }//GEN-LAST:event_excluirMCActionPerformed

    private void motosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motosActionPerformed
        // TODO add your handling code here:
        TelaMotos tela1 = new TelaMotos();
        tela1.setVisible(true);
        tela1.getObjetos(usuarios, pessoas, MCs, motos1);
        tela1.getMc(mc);
        tela1.getPessoa(pessoa);
        tela1.getUsuario(usuario);
        tela1.inserir();
        dispose();
    }//GEN-LAST:event_motosActionPerformed

    private void motoclubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motoclubsActionPerformed
        // TODO add your handling code here:
        TelaMCs tela1 = new TelaMCs();
        tela1.getObjetos(usuarios, pessoas, MCs, motos1);
        tela1.getMc(mc);
        tela1.getPessoa(pessoa);
        tela1.getUsuario(usuario);
        tela1.setVisible(true);
        dispose();
    }//GEN-LAST:event_motoclubsActionPerformed

    private void menuSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSobreMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Sistema de gerenciamento de MotorClubs\nVersão 1.0");
    }//GEN-LAST:event_menuSobreMouseClicked

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
        if(checkNome.isSelected() == true){
                mc.setNome(txtCampo.getText());
                if(form2.Alterar(mc, checkNome.getText())){
                    JOptionPane.showMessageDialog(null,"Alterado com sucesso!");
                }else
                    JOptionPane.showMessageDialog(null, "Erro ao alterar! Informação incorreta.");
        }else if(checkEstado.isSelected() == true){
                mc.setEstado(boxEstado.getSelectedItem().toString());
            if(form2.Alterar(mc, checkEstado.getText())){
                JOptionPane.showMessageDialog(null,"Alterado com sucesso!");
            }else
                JOptionPane.showMessageDialog(null, "Erro ao alterar! Informação incorreta.");
        }else if(checkQtd.isSelected() == true){
            mc.setId(Integer.parseInt(txtCampo.getText()));
            if(form2.Alterar(mc, checkQtd.getText())){
               JOptionPane.showMessageDialog(null,"Alterado com sucesso!");
           }else
               JOptionPane.showMessageDialog(null, "Erro ao alterar! Informação incorreta.");
        }else if(checkRegiao.isSelected() == true){
                mc.setRegiao(boxRegião.getSelectedItem().toString());
                if(form2.Alterar(mc, checkRegiao.getText())){
                   JOptionPane.showMessageDialog(null,"Alterado com sucesso!");
               }else
                   JOptionPane.showMessageDialog(null, "Erro ao alterar! Informação incorreta.");
        }else
            JOptionPane.showMessageDialog(null,"Selecione uma Opção.");
        inserir();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void checkRegiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRegiaoActionPerformed
        // TODO add your handling code here:
        if(checkRegiao.isSelected() == true)
                boxRegião.setEnabled(true);
    }//GEN-LAST:event_checkRegiaoActionPerformed

    private void checkEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkEstadoActionPerformed
        // TODO add your handling code here:
        if(checkEstado.isSelected() == true)
                boxEstado.setEnabled(true);
    }//GEN-LAST:event_checkEstadoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        TelaMenuInicial tela = new TelaMenuInicial();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed
    public void getObjetos(List<usuario> u, List<pessoa> p, List<motoClub> mc, List<moto> m){
        usuarios = u;
        MCs = mc; 
        pessoas = p;
        motos1 = m;
    }
    public void getMc(motoClub mc){this.mc = mc;}
    public void getPessoa(pessoa p){pessoa = p;}
    public void getUsuario(usuario u){usuario = u;}
    public void inserir(){
        boxRegião.setEnabled(false);
        boxEstado.setEnabled(false);
        for(motoClub mc:MCs){
            if(mc.getId() == usuario.getIdmc()){
                this.mc = mc;
            }
        }
        lblNome.setText(mc.getNome());
        lblRegiao.setText(mc.getRegiao());
        lblEstado.setText(mc.getEstado());
        lblQtd.setText(Integer.toString(mc.getQtd()));
    }
    
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
            java.util.logging.Logger.getLogger(TelaEditarMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEditarMC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxEstado;
    private javax.swing.JComboBox<String> boxRegião;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JRadioButton checkEstado;
    private javax.swing.JRadioButton checkNome;
    private javax.swing.JRadioButton checkQtd;
    private javax.swing.JRadioButton checkRegiao;
    private javax.swing.JMenuItem editarMC;
    private javax.swing.JMenuItem editarUsuario;
    private javax.swing.JMenuItem excluirMC;
    private javax.swing.JMenuItem excluirUsuario;
    private javax.swing.JMenuItem itemHome6;
    private javax.swing.JMenuItem itemSair;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQtd;
    private javax.swing.JLabel lblRegiao;
    private javax.swing.JMenu menuArquivo2;
    private javax.swing.JMenuBar menuBar2;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenu menuListar;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JMenuItem motoclubs;
    private javax.swing.JMenuItem motos;
    private javax.swing.JTextField txtCampo;
    // End of variables declaration//GEN-END:variables
}
