package LeilaoVeiculosJavaMTec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ListarLeiloes extends javax.swing.JFrame {
    private static final String URL = "jdbc:mysql://localhost:3306/leilao_db";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    public ListarLeiloes() {
        initComponents();
        try {                       
            verTabela();
            verLances();            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao mostrar todas as contas "+e);
        }  
    } 
    
    public void verTabela() throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {    
            String Mysql = "SELECT *FROM leilao";
            Statement st;  
            DefaultTableModel Tab = new DefaultTableModel();
            Tab.addColumn("id");
            Tab.addColumn("veiculo_id");
            Tab.addColumn("encerrado");  
            Tab.addColumn("vencedor_id");  
            TabV.setModel(Tab);

            String[] ver = new String[4];
            try{
                st = con.createStatement();
                ResultSet rs = st.executeQuery(Mysql);
                while(rs.next()){
                    ver[0]=rs.getString(1);
                    ver[1]=rs.getString(2);
                    ver[2]=rs.getString(3);
                    ver[3]=rs.getString(4);
                    Tab.addRow(ver);
                }
            }catch(SQLException erro){
                JOptionPane.showMessageDialog(null, "Erro" + erro.toString());
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro");
        }
        
    }

    public void ExcluirLeilao(int numeroconta) {
        try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String query = "DELETE FROM leilao WHERE id = ?";
            try (PreparedStatement statement = con.prepareStatement(query)) {
                statement.setInt(1, numeroconta);
                statement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Leilao Excluido");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Apagar a Leilao");
        }
    }
      
    public void ExcluirLances(int lance) {
        try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String query = "DELETE FROM lance WHERE id = ?";
            try (PreparedStatement statement = con.prepareStatement(query)) {
                statement.setInt(1, lance);
                statement.executeUpdate();
                JOptionPane.showMessageDialog(null,"Lance Excluido");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Apagar o Lance");
        }
    }

    public void verLances() throws SQLException{
        try (Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {    
            String Mysql = "SELECT *FROM lance";
            Statement st;  
            DefaultTableModel Tab = new DefaultTableModel();
            Tab.addColumn("id");
            Tab.addColumn("leilao_id");
            Tab.addColumn("participante_id");  
            Tab.addColumn("valor");  
            TabLances.setModel(Tab);

            String[] ver = new String[4];
            try{
                st = con.createStatement();
                ResultSet rs = st.executeQuery(Mysql);
                while(rs.next()){
                    ver[0]=rs.getString(1);
                    ver[1]=rs.getString(2);
                    ver[2]=rs.getString(3);
                    ver[3]=rs.getString(4);
                    Tab.addRow(ver);
                }
            }catch(SQLException erro){
                JOptionPane.showMessageDialog(null, "Erro" + erro.toString());
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro");
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voltar = new javax.swing.JButton();
        telaidLeilao = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabV = new javax.swing.JTable();
        remover = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TabLances = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        remover1 = new javax.swing.JButton();
        telaidLances = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        voltar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        voltar.setForeground(new java.awt.Color(51, 102, 255));
        voltar.setText("Voltar");
        voltar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)));
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        telaidLeilao.setForeground(new java.awt.Color(0, 51, 255));
        telaidLeilao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaidLeilaoActionPerformed(evt);
            }
        });

        TabV.setForeground(new java.awt.Color(0, 51, 255));
        TabV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "veiculo_id", "encerrado", "vencedor_id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabVMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TabV);

        remover.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        remover.setForeground(new java.awt.Color(0, 51, 255));
        remover.setText("remover");
        remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setText("digita o id:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 255));
        jLabel6.setText("Lances Efetuados");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("Todos Leiloes");

        TabLances.setForeground(new java.awt.Color(0, 51, 255));
        TabLances.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "leilao_id", "participante_id", "valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabLances.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabLancesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TabLances);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Para Remover Leilao, voce precisa remover os lances primeiros.");

        remover1.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        remover1.setForeground(new java.awt.Color(0, 51, 255));
        remover1.setText("remover");
        remover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remover1ActionPerformed(evt);
            }
        });

        telaidLances.setForeground(new java.awt.Color(0, 51, 255));
        telaidLances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaidLancesActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("digita o id:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(telaidLeilao, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(remover, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                        .addComponent(jScrollPane3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(telaidLances, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(51, 51, 51)
                            .addComponent(remover1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(telaidLeilao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(remover, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(telaidLances, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(remover1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        //voltar...
        setVisible(false);
        new AInicio().setVisible(true); //voltando para o sistema principal
    }//GEN-LAST:event_voltarActionPerformed

    private void TabVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabVMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TabVMouseClicked

    private void removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerActionPerformed
        int id = Integer.parseInt(telaidLeilao.getText());
        try {
            ExcluirLeilao(id);
        } catch (Exception e) {
                            
        }
    }//GEN-LAST:event_removerActionPerformed

    private void TabLancesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabLancesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TabLancesMouseClicked

    private void telaidLeilaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaidLeilaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telaidLeilaoActionPerformed

    private void remover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remover1ActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(telaidLances.getText());
        try {
            ExcluirLances(id);
        } catch (Exception e) {
                                                  
        }
    }//GEN-LAST:event_remover1ActionPerformed

    private void telaidLancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaidLancesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telaidLancesActionPerformed

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
            java.util.logging.Logger.getLogger(ListarLeiloes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarLeiloes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarLeiloes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarLeiloes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarLeiloes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabLances;
    private javax.swing.JTable TabV;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton remover;
    private javax.swing.JButton remover1;
    private javax.swing.JTextField telaidLances;
    private javax.swing.JTextField telaidLeilao;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
