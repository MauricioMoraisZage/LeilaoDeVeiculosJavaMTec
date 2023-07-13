package LeilaoVeiculosJavaMTec;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EncerraLeilao extends javax.swing.JFrame {
    private static VeiculoFuncoes veiculoDAO = new VeiculoFuncoes();
    private static ParticipanteFunções participanteDAO = new ParticipanteFunções();
    private static LeilaoFuncões leilaoDAO = new LeilaoFuncões();
    public int idV;
    public String NomeV;
    private Connection connection;
            
    public EncerraLeilao() {
        initComponents();
         // Configurar a conexão com o banco de dados (exemplo)
        String url = "jdbc:mysql://localhost:3306/leilao_db";
        String username = "root";
        String password = "";
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idLeilao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        NomeIdVencedor = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        Encerrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idvencedor = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idLeilao.setForeground(new java.awt.Color(51, 102, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("ID do Leilao a encerrar:");

        NomeIdVencedor.setFont(new java.awt.Font("Californian FB", 0, 24)); // NOI18N
        NomeIdVencedor.setForeground(new java.awt.Color(102, 102, 102));
        NomeIdVencedor.setText("Nome Vencedor");

        voltar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        voltar.setForeground(new java.awt.Color(51, 102, 255));
        voltar.setText("Voltar");
        voltar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)));
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        Encerrar.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        Encerrar.setForeground(new java.awt.Color(51, 102, 255));
        Encerrar.setText("Encerrar");
        Encerrar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)));
        Encerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncerrarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Californian FB", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 255));
        jLabel4.setText("ENCERRAR O LEILAO");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("NOME:");

        idvencedor.setFont(new java.awt.Font("Californian FB", 0, 24)); // NOI18N
        idvencedor.setForeground(new java.awt.Color(102, 102, 102));
        idvencedor.setText("Id Vencedor");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 255));
        jLabel5.setText("ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Encerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(idLeilao, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(341, 341, 341))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NomeIdVencedor)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idvencedor)
                        .addContainerGap(594, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(318, 318, 318)
                    .addComponent(jLabel4)
                    .addContainerGap(476, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLeilao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(50, 50, 50)
                .addComponent(Encerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(idvencedor)
                        .addComponent(jLabel5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NomeIdVencedor)
                        .addComponent(jLabel3)))
                .addGap(59, 59, 59))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(jLabel4)
                    .addContainerGap(431, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        //voltar...
        setVisible(false);
        new AInicio().setVisible(true); //voltando para o sistema principal
    }//GEN-LAST:event_voltarActionPerformed

    private void EncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncerrarActionPerformed
        // TODO add your handling code here:
        try{
                int leilaoId = Integer.parseInt(idLeilao.getText());
                Leilao leilao = leilaoDAO.obterLeilaoPorId(leilaoId);
                if (leilao != null) {
                    try {
                        String sql = "SELECT participante_id FROM lance WHERE leilao_id = ? ORDER BY valor DESC LIMIT 1";
                        PreparedStatement statement = connection.prepareStatement(sql);
                        statement.setInt(1, leilao.getId());
                        ResultSet resultSet = statement.executeQuery();
                        if (resultSet.next()) {
                            idV = resultSet.getInt("participante_id");   //Pegando o Id do Vencedor....
                            
                            String sql1 = "SELECT nome FROM participante WHERE id = ?";
                            statement = connection.prepareStatement(sql1);
                            statement.setInt(1, idV);
                            resultSet = statement.executeQuery();
                            if (resultSet.next()){
                               NomeV = resultSet.getString("nome");    //Pegando o Nome do Vencedor...
                            }
                            
                        }                       
                        NomeIdVencedor.setText(NomeV);  
                        idvencedor.setText("ID: "+idV+" Parabens!");
                        try {
                            String sql2 = "UPDATE leilao SET encerrado = ?, vencedor_id=? WHERE id = ?";
                            statement = connection.prepareStatement(sql2);
                            statement.setBoolean(1, true);
                            statement.setInt(2, idV);
                            statement.setInt(3, leilaoId);
                            statement.executeUpdate();
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null,"Erro ao actualizar os dados na base...");
                        }
                        
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null,"Erro ao Pegar o Id e o Nome do Vencedor");
                    } 
                    //-----------------------------
                    //leilaoDAO.encerrarLeilao(leilao);
                    //Participante vencedor = leilao.getVencedor();
                    //JOptionPane.showMessageDialog(null,"Leilão encerrado com sucesso!");
                    //JOptionPane.showMessageDialog(null,"O vencedor do leilão é: " + vencedor.getNome());
                    //............................
                 
                } else {
                    JOptionPane.showMessageDialog(null,"Leilão não encontrado.");
                }       
        }
        catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_EncerrarActionPerformed

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
            java.util.logging.Logger.getLogger(EncerraLeilao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EncerraLeilao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EncerraLeilao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncerraLeilao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EncerraLeilao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Encerrar;
    private javax.swing.JLabel NomeIdVencedor;
    private javax.swing.JTextField idLeilao;
    private javax.swing.JLabel idvencedor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables

}
