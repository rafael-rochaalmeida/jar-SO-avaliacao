/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.api.captura.get.Capture;

//import Connection.Connection;
import com.mycompany.api.captura.get.Connection.ConnectionGetmobi;
import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import com.github.britooo.looca.api.group.discos.DiscosGroup;
import com.github.britooo.looca.api.group.memoria.Memoria;
import com.github.britooo.looca.api.group.processador.Processador;
import com.github.britooo.looca.api.group.processos.Processo;
import com.github.britooo.looca.api.group.processos.ProcessosGroup;
import java.awt.Color;
import static java.awt.Color.blue;
import static java.awt.Color.green;
import static java.awt.Color.red;
import static java.awt.Color.white;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import com.sun.jdi.Value;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import com.mycompany.api.captura.get.login.TelaLogin;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Luis
 */
public class TelaDados extends javax.swing.JFrame {

    private static int Width() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    //Instancia do login do usuario
    TelaLogin login = new TelaLogin();
    Integer idUsuario = login.getIdUsuario();
    
    
    
    ConnectionGetmobi conexao = new ConnectionGetmobi();

    Looca looca = new Looca();

    //Intancia das principais classes da API
    private Processador processador = looca.getProcessador();
    private Memoria memoria = looca.getMemoria();
    private DiscosGroup disco = looca.getGrupoDeDiscos();

    //String de conexao
    String urlConexao = conexao.getUrlConexao();

    //Criação de megabyte para conversão
    private Double mb = Double.valueOf(1024) * 1024;

    //Criação de Gygabyte para conversão 
    private Double gb = Double.valueOf(1024) * (1024 * 1024);

    //Criação das variaveis de retorno do processador
    private String nomeProcessador = processador.getNome();
    private String usoProcessador = String.format("%.2f", processador.getUso());
    private String totalMemoria = String.format("%.2f GB", (memoria.getTotal() / gb));
    private String fabriProcessador = String.format("%s", processador.getFabricante());
    private String nomesProcessador = String.format("%s", processador.getNome());
    
    private Double insertFreq = (processador.getFrequencia() / gb);
    private Double insertTotalMemoria = ((memoria.getTotal() / gb));
    
    
    private String freqProcessador = String.format("%.1f", Double.valueOf(processador.getFrequencia() / gb));
    private String numeroFisicoProcessador = String.format("%s", processador.getNumeroCpusFisicas());
    private String numeroLogicoProcessador = String.format("%s", processador.getNumeroCpusLogicas());

    //Criação das variaveis de retorno da memoria
    private String usoMemoria = String.format("%.2f GB", (memoria.getEmUso() / gb));
    private String memoriaDisponivel = String.format("%.2f GB", (memoria.getDisponivel() / gb));
    
    
    //Criação das variaveis de retorno do disco
    Double tamanhoTotal; 
    DiscosGroup grupoDeDiscos = looca.getGrupoDeDiscos();
    List<Disco> discos = grupoDeDiscos.getDiscos();

    /**
     * Creates new form TelaDados
     */
    public TelaDados() {

        initComponents();
        
        this.setLocationRelativeTo(null);
        
        lblUsuario.setText("Bem vindo, " + login.getUsuarioBanco());
        
        btnRam.setBackground(white);
        btnCPU.setBackground(Color.GRAY);
        btnArmaz.setBackground(white);
        
        lblTitulo2.setText("Fabricante:");
        lblTitulo1.setText("Nome:");
        lblTitulo3.setText("Utilização:");
        lblTitulo4.setText("Número de CPU`s físicas:");
        lblTitulo5.setText("Número de CPU`s lógicas:");
        
        
        lblResultado2.setText(fabriProcessador);
        lblResultado1.setText(nomesProcessador);
        lblResultado3.setText(usoProcessador + " %");
        lblResultado4.setText(numeroFisicoProcessador);
        lblResultado5.setText(numeroLogicoProcessador);
        
        
    }
    
       

    //Metodo para inserção de dados
    public void insereDadosDeMaquina() throws SQLException {
       
  
                
        try (Connection conexao = DriverManager.getConnection(urlConexao)) {
         
            PreparedStatement stmt = conexao.prepareStatement("INSERT INTO Computador (fabricanteCPU, freqTotalCPU, ramTotal, armazenamentoTotal, fkUsuario) "
                    + "VALUES (?, ?, ?, ?, ?);");
            stmt.setString(1, nomeProcessador);
            stmt.setDouble(2, insertFreq);
            stmt.setDouble(3, insertTotalMemoria);
            stmt.setDouble(4, tamanhoTotal);
            stmt.setInt(5, idUsuario);
            stmt.executeUpdate();
            
            System.out.println("Dados inseridos com sucesso");
            
        }catch(Exception e){
            System.out.println("Erro na inserção de dados");
            System.out.println(e);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        txtArEspecificacoes1 = new javax.swing.JTextArea();
        usoMem6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 200), new java.awt.Dimension(0, 200), new java.awt.Dimension(32767, 200));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 100), new java.awt.Dimension(0, 100), new java.awt.Dimension(32767, 100));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 120), new java.awt.Dimension(0, 120), new java.awt.Dimension(32767, 120));
        btnCPU = new javax.swing.JButton();
        btnArmaz = new javax.swing.JButton();
        btnRam = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblTitulo1 = new javax.swing.JLabel();
        lblResultado1 = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        lblResultado2 = new javax.swing.JLabel();
        lblTitulo3 = new javax.swing.JLabel();
        lblResultado3 = new javax.swing.JLabel();
        lblTitulo4 = new javax.swing.JLabel();
        lblResultado4 = new javax.swing.JLabel();
        lblTitulo5 = new javax.swing.JLabel();
        lblResultado5 = new javax.swing.JLabel();

        txtArEspecificacoes1.setEditable(false);
        txtArEspecificacoes1.setColumns(20);
        txtArEspecificacoes1.setRows(5);
        jScrollPane2.setViewportView(txtArEspecificacoes1);

        usoMem6.setText("Frequência:");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Dados da Máquina");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        filler2.setForeground(new java.awt.Color(0, 102, 102));

        filler3.setBackground(new java.awt.Color(0, 153, 153));

        btnCPU.setText("CPU");
        btnCPU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCPUActionPerformed(evt);
            }
        });

        btnArmaz.setText("Armazenamento");
        btnArmaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArmazActionPerformed(evt);
            }
        });

        btnRam.setText("Memória Ram");
        btnRam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRamActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("HARDWARE");

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblUsuario.setText("Bem vindo ");
        lblUsuario.setToolTipText("");

        btnSair.setBackground(new java.awt.Color(0, 0, 0));
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jButton1.setText("Processos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(29, 29, 29))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnArmaz, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRam, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuario)
                .addGap(40, 40, 40)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(243, 243, 243))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRam, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnArmaz, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTitulo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(0, 102, 255));
        lblTitulo1.setText("titulo1 aqui ");

        lblResultado1.setText("resultado titulo1");

        lblTitulo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(51, 102, 255));
        lblTitulo2.setText("titulo 2 aqui");

        lblResultado2.setText("resultado titulo 2");

        lblTitulo3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTitulo3.setForeground(new java.awt.Color(51, 102, 255));
        lblTitulo3.setText("titulo 3 aqui");

        lblResultado3.setText("resultado titulo 3");

        lblTitulo4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTitulo4.setForeground(new java.awt.Color(51, 102, 255));
        lblTitulo4.setText("titulo4 aqui");

        lblResultado4.setText("resultado titulo 4 ");

        lblTitulo5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTitulo5.setForeground(new java.awt.Color(51, 102, 255));
        lblTitulo5.setText("titulo 5 aqui");

        lblResultado5.setText("resultado titulo 5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblResultado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitulo2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblResultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitulo3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblResultado3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitulo4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblResultado4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitulo5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblResultado5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(203, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTitulo1)
                            .addComponent(lblResultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTitulo2)
                            .addComponent(lblResultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTitulo3)
                            .addComponent(lblResultado3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTitulo4)
                            .addComponent(lblResultado4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTitulo5)
                            .addComponent(lblResultado5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArmazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArmazActionPerformed
        
        
       
        
        btnRam.setBackground(white);
        btnCPU.setBackground(white);
        btnArmaz.setBackground(Color.GRAY);
        
        lblTitulo1.setText("Modelo:"); 
        lblTitulo2.setText("Tamanho:");
        lblTitulo3.setText("Leitura:");
        lblTitulo4.setText("Escrita:");
        lblTitulo5.setText("");
        
        lblResultado1.setText("");
        lblResultado2.setText("");
        lblResultado3.setText("");
        lblResultado4.setText("");
        lblResultado5.setText("");
        
        
        for (Integer i = 0; i < discos.size(); i++){
            lblResultado1.setText(discos.get(i).getModelo());
            lblResultado2.setText(String.format("%.2f GB", discos.get(i).getTamanho()/ gb));
            lblResultado3.setText(discos.get(i).getLeituras().toString() + " Kb/s");
            lblResultado4.setText(discos.get(i).getEscritas().toString() + " Kb/s");
        }
            
    }//GEN-LAST:event_btnArmazActionPerformed

    private void btnCPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCPUActionPerformed
        
        btnRam.setBackground(white);
        btnCPU.setBackground(Color.GRAY);
        btnArmaz.setBackground(white);
        
        lblTitulo2.setText("Fabricante:");
        lblTitulo1.setText("Nome:");
        lblTitulo3.setText("Utilização:");
        lblTitulo4.setText("Número de CPU`s físicas:");
        lblTitulo5.setText("Número de CPU`s lógicas:");
        
        
        lblResultado2.setText(fabriProcessador);
        lblResultado1.setText(nomesProcessador);
        lblResultado3.setText(usoProcessador + " %");
        lblResultado4.setText(numeroFisicoProcessador);
        lblResultado5.setText(numeroLogicoProcessador);
        
        
    }//GEN-LAST:event_btnCPUActionPerformed

    private void btnRamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRamActionPerformed
        
        
        lblResultado1.setText(usoMemoria );
        lblResultado2.setText(totalMemoria );
        lblResultado3.setText(memoriaDisponivel );
        lblResultado4.setText("");
        lblResultado5.setText("");
        
        lblTitulo1.setText("Uso:");
        lblTitulo2.setText("Total:");
        lblTitulo3.setText("Memória disponível:");
        lblTitulo4.setText("");
        lblTitulo5.setText("");
        
        btnRam.setBackground(Color.GRAY);
        btnCPU.setBackground(white);
        btnArmaz.setBackground(white);
        
    }//GEN-LAST:event_btnRamActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        try {
            // TODO add your handling code here:

            insereDadosDeMaquina();
        } catch (SQLException ex) {
            Logger.getLogger(TelaDados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        idUsuario = null;
        
        
        TelaLogin telalogin = new TelaLogin();
        telalogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        TelaProcessos telaProcessos = new TelaProcessos();
        telaProcessos.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArmaz;
    private javax.swing.JButton btnCPU;
    private javax.swing.JButton btnRam;
    private javax.swing.JButton btnSair;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblResultado1;
    private javax.swing.JLabel lblResultado2;
    private javax.swing.JLabel lblResultado3;
    private javax.swing.JLabel lblResultado4;
    private javax.swing.JLabel lblResultado5;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JLabel lblTitulo4;
    private javax.swing.JLabel lblTitulo5;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextArea txtArEspecificacoes1;
    private javax.swing.JLabel usoMem6;
    // End of variables declaration//GEN-END:variables

    private void inserirDadosDeMaquina() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
