package LeilaoVeiculosJavaMTec;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class AInicio extends javax.swing.JFrame {

    public AInicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CadastrarVeiculo = new javax.swing.JButton();
        cadastrarparticipante = new javax.swing.JButton();
        iniciarleilao = new javax.swing.JButton();
        loginparticipante = new javax.swing.JButton();
        encerrarleilao = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        listaveiculo = new javax.swing.JButton();
        ListarLeiloesEmAdamento = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("      Sistema de Leilão de Veiculos");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 102, 255)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 820, 90));

        CadastrarVeiculo.setBackground(new java.awt.Color(204, 204, 204));
        CadastrarVeiculo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        CadastrarVeiculo.setForeground(new java.awt.Color(51, 0, 255));
        CadastrarVeiculo.setText("Cadastrar Veiculo");
        CadastrarVeiculo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 255)));
        CadastrarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarVeiculoActionPerformed(evt);
            }
        });
        getContentPane().add(CadastrarVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 210, 40));

        cadastrarparticipante.setBackground(new java.awt.Color(204, 204, 204));
        cadastrarparticipante.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cadastrarparticipante.setForeground(new java.awt.Color(51, 0, 255));
        cadastrarparticipante.setText("Cadastrar Participantes");
        cadastrarparticipante.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 255)));
        cadastrarparticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarparticipanteActionPerformed(evt);
            }
        });
        getContentPane().add(cadastrarparticipante, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 200, 40));

        iniciarleilao.setBackground(new java.awt.Color(204, 204, 204));
        iniciarleilao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        iniciarleilao.setForeground(new java.awt.Color(51, 0, 255));
        iniciarleilao.setText("Iniciar Leilao");
        iniciarleilao.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 255)));
        iniciarleilao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarleilaoActionPerformed(evt);
            }
        });
        getContentPane().add(iniciarleilao, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 210, 40));

        loginparticipante.setBackground(new java.awt.Color(204, 204, 204));
        loginparticipante.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        loginparticipante.setForeground(new java.awt.Color(51, 0, 255));
        loginparticipante.setText("Login Participante");
        loginparticipante.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 255)));
        loginparticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginparticipanteActionPerformed(evt);
            }
        });
        getContentPane().add(loginparticipante, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 200, 40));

        encerrarleilao.setBackground(new java.awt.Color(204, 204, 204));
        encerrarleilao.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        encerrarleilao.setForeground(new java.awt.Color(51, 0, 255));
        encerrarleilao.setText("Encerrar Leilao");
        encerrarleilao.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 255)));
        encerrarleilao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encerrarleilaoActionPerformed(evt);
            }
        });
        getContentPane().add(encerrarleilao, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 210, 40));

        Sair.setBackground(new java.awt.Color(204, 204, 204));
        Sair.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Sair.setForeground(new java.awt.Color(51, 0, 255));
        Sair.setText("sair");
        Sair.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 255)));
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        getContentPane().add(Sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 210, 40));

        listaveiculo.setBackground(new java.awt.Color(204, 204, 204));
        listaveiculo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        listaveiculo.setForeground(new java.awt.Color(51, 0, 255));
        listaveiculo.setText("Listar Veiculos");
        listaveiculo.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 255)));
        listaveiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaveiculoActionPerformed(evt);
            }
        });
        getContentPane().add(listaveiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 200, 40));

        ListarLeiloesEmAdamento.setBackground(new java.awt.Color(204, 204, 204));
        ListarLeiloesEmAdamento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ListarLeiloesEmAdamento.setForeground(new java.awt.Color(51, 0, 255));
        ListarLeiloesEmAdamento.setText("Listar leilos");
        ListarLeiloesEmAdamento.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 255)));
        ListarLeiloesEmAdamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarLeiloesEmAdamentoActionPerformed(evt);
            }
        });
        getContentPane().add(ListarLeiloesEmAdamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 200, 40));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/background-IMG.jpg"))); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarVeiculoActionPerformed
        // TODO add your handling code here:
        try{
            setVisible(false);
            new CadastrarVeiculo().setVisible(true);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_CadastrarVeiculoActionPerformed

    private void cadastrarparticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarparticipanteActionPerformed
        // TODO add your handling code here:
        try{
            setVisible(false);
            new CadastrarParticipante().setVisible(true);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_cadastrarparticipanteActionPerformed

    private void iniciarleilaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarleilaoActionPerformed
        try{
            setVisible(false);
            new IniciarLeilao().setVisible(true);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_iniciarleilaoActionPerformed

    private void loginparticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginparticipanteActionPerformed
        try{
            setVisible(false);
            new LoginParticipante().setVisible(true);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_loginparticipanteActionPerformed

    private void encerrarleilaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encerrarleilaoActionPerformed
        // TODO add your handling code here:
        try{
            setVisible(false);
            new EncerraLeilao().setVisible(true);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_encerrarleilaoActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        //Encerrar aplicação
        try{
            int a = JOptionPane.showConfirmDialog(null, "Queres terminar a aplicacão?", "Alert", JOptionPane.YES_NO_OPTION);
            if(a==0){
                System.exit(0);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error ao terminar");
        }
    }//GEN-LAST:event_SairActionPerformed

    private void listaveiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaveiculoActionPerformed
        try{
            setVisible(false);
            new ListarVeiculo().setVisible(true);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_listaveiculoActionPerformed

    private void ListarLeiloesEmAdamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarLeiloesEmAdamentoActionPerformed
        // TODO add your handling code here:
        try{
            setVisible(false);
            new ListarLeiloes().setVisible(true);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_ListarLeiloesEmAdamentoActionPerformed

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
            java.util.logging.Logger.getLogger(AInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarVeiculo;
    private javax.swing.JButton ListarLeiloesEmAdamento;
    private javax.swing.JButton Sair;
    private javax.swing.JButton cadastrarparticipante;
    private javax.swing.JButton encerrarleilao;
    private javax.swing.JLabel fundo;
    private javax.swing.JButton iniciarleilao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton listaveiculo;
    private javax.swing.JButton loginparticipante;
    // End of variables declaration//GEN-END:variables
}
