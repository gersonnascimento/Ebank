/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ebank.view;

import br.com.ebank.business.BConta;
import br.com.ebank.business.BPagamento;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Positivo
 */
public class Tp_Correntista extends javax.swing.JFrame {

    private int nconta;
    private double saldo;
    private int senha;
    
    
    BConta bconta = new BConta();
    
    public void pegaSaldo(int num) throws SQLException{
        BConta bconta = new BConta();
        this.saldo=bconta.pegaSaldo(nconta);
    }
    
    //  public void pegaSenha(int num) throws SQLException{
      //  BConta bconta = new BConta();
        //this.senha=bconta.pegaSenha(nconta);
    //}

    public int getNconta(){
        return nconta;
    }

    public void setNconta(int nconta) {
        this.nconta = nconta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    /**
     * Creates new form Tp_Correntista
     */
    public Tp_Correntista() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSaldo = new javax.swing.JButton();
        btnSaque = new javax.swing.JButton();
        btnDeposito = new javax.swing.JButton();
        btnTransferencia = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnExtrato = new javax.swing.JButton();
        btnPagamento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSaldo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSaldo.setForeground(new java.awt.Color(102, 102, 255));
        btnSaldo.setText("Saldo");
        btnSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaldoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 550, 100));

        btnSaque.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSaque.setForeground(new java.awt.Color(102, 102, 255));
        btnSaque.setText("Saque");
        btnSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaqueActionPerformed(evt);
            }
        });
        getContentPane().add(btnSaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, 550, 100));

        btnDeposito.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDeposito.setForeground(new java.awt.Color(102, 102, 255));
        btnDeposito.setText("Depósito");
        btnDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositoActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 550, 100));

        btnTransferencia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTransferencia.setForeground(new java.awt.Color(102, 102, 255));
        btnTransferencia.setText("Transferência");
        btnTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferenciaActionPerformed(evt);
            }
        });
        getContentPane().add(btnTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 390, 550, 100));

        btnSair.setBackground(new java.awt.Color(0, 0, 153));
        btnSair.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 640, 120, 40));

        btnExtrato.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnExtrato.setForeground(new java.awt.Color(101, 101, 255));
        btnExtrato.setText("Extrato");
        btnExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExtratoActionPerformed(evt);
            }
        });
        getContentPane().add(btnExtrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 550, 100));

        btnPagamento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPagamento.setForeground(new java.awt.Color(102, 102, 255));
        btnPagamento.setText("Pagamentos");
        btnPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagamentoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 510, 550, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ebank/view/Imgf2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 0, 1570, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        Tp_Correntista.this.dispose();
        TelaPrincipal telaprincipal = new TelaPrincipal();
        telaprincipal.setLocationRelativeTo(null);
        telaprincipal.montarJanela();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaldoActionPerformed
        // TODO add your handling code here:
        BConta bconta = new BConta();
    try {
        JOptionPane.showMessageDialog(null,String.format("Saldo: R$%.2f", bconta.pegaSaldo(nconta)));
        
    } catch (SQLException ex) {
        Logger.getLogger(Tp_Correntista.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnSaldoActionPerformed

    private void btnSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaqueActionPerformed
        // TODO add your handling code here:
        BConta bconta = new BConta();
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para sacar"));
        try {
           
            if(bconta.sacar(valor, nconta, bconta.pegaSaldo(nconta))){
                JOptionPane.showMessageDialog(null,String.format("Retire o dinheiro no local indicado."));
                bconta.gravaSac(valor, this.nconta);
            }
            else{
                JOptionPane.showMessageDialog(null,String.format("Saldo Insuficiente."));
            }
        
                
        } catch (SQLException ex) {
            Logger.getLogger(Tp_Correntista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaqueActionPerformed

    private void btnDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositoActionPerformed
        // TODO add your handling code here:
        BConta bconta = new BConta();
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para depositar"));
        try {
            bconta.depositar(valor, nconta, bconta.pegaSaldo(nconta));
            bconta.gravaDep(valor, this.nconta);
            JOptionPane.showMessageDialog(null,String.format("Retire o comprovante no local indicado."));
        } catch (SQLException ex) {
            Logger.getLogger(Tp_Correntista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDepositoActionPerformed

    private void btnTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferenciaActionPerformed
        // TODO add your handling code here:
        BConta bconta = new BConta();
        int ndest = Integer.parseInt(JOptionPane.showInputDialog("Digite a conta do destinatário"));
        try {
            if(bconta.buscarTitular(ndest).getNome()!=null){
                try {
                    JOptionPane.showMessageDialog(null,String.format("%s", bconta.buscarTitular(ndest).getNome()));
                } catch (SQLException ex) {
                    Logger.getLogger(Tp_Correntista.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    if(bconta.buscarTitular(ndest).getNome()!=null){
                        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para transferencia"));
                        try {if (bconta.transferir(this.nconta, valor, ndest,bconta.pegaSaldo(nconta), bconta.pegaSaldo(ndest))){
                            JOptionPane.showMessageDialog(null,String.format("Transferência efetuada com sucesso."));
                            bconta.gravaTransf(valor,nconta,ndest);
                            bconta.gravaTransfR(valor,ndest,nconta);
                        }
                        else
                            JOptionPane.showMessageDialog(null,String.format("Saldo Insuficiente."));
                        } catch (SQLException ex) {
                            Logger.getLogger(Tp_Correntista.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Tp_Correntista.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
                JOptionPane.showMessageDialog(null,String.format("Conta Inexistente."));
        } catch (SQLException ex) {
            Logger.getLogger(Tp_Correntista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTransferenciaActionPerformed

    private void btnExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtratoActionPerformed
        
        TelaExtrato telajtable = new TelaExtrato();
        telajtable.setLocationRelativeTo(null);
        telajtable.setNconta(nconta);
        telajtable.exibirExtrato();
        telajtable.setVisible(true);
        
        // TODO add your handling code here:
        //BConta bconta = new BConta();
        //int p = bconta.pegaExtrato(this.nconta).size();
        //int vet[]= new int[p];
        //String result = "Extrato: \n";
        
        //for (int i=0;i<p;i++){
          //  result += String.format("\n%s | %s | %s", bconta.pegaExtrato(nconta).get(i).getMovimentacao()
            //        ,bconta.pegaExtrato(nconta).get(i).getContaDest(),
              //      bconta.pegaExtrato(nconta).get(i).getValor());
        //}
        //try {
          //  result += (String.format("\n\nSaldo atual: R$%.2f", bconta.pegaSaldo(nconta)));
        //} catch (SQLException ex) {
          //  Logger.getLogger(Tp_Correntista.class.getName()).log(Level.SEVERE, null, ex);
        //}
        //JOptionPane.showMessageDialog(null,result);
    }//GEN-LAST:event_btnExtratoActionPerformed

    private void btnPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagamentoActionPerformed
        // TODO add your handling code here:
        String npag = JOptionPane.showInputDialog("Posicione o leitor no código de barras ou insira o número do boleto:");
        BPagamento bpagamento = new BPagamento();
        if(bpagamento.buscar(npag).getValor()==0)
            JOptionPane.showMessageDialog(null,String.format("Fatura não encontrada."));
        else{
        FrmPagamento frmpagamento = new FrmPagamento();
        frmpagamento.setTexto(String.format("<html>Favorecido: %s \n\n<br>Detalhes: %s<br> \n\nValor: R$ %s</html>", bpagamento.buscar(npag).getEntidade(), bpagamento.buscar(npag).getEspecificacao(), bpagamento.buscar(npag).getValor()));
        frmpagamento.insereTexto();
        frmpagamento.setNboleto(npag);
        frmpagamento.setPaga(bpagamento.buscar(npag).isPaga());
        frmpagamento.setNconta(nconta);
        frmpagamento.setSenha(senha);
        frmpagamento.setLocationRelativeTo(null);
        frmpagamento.setVisible(true);
        }
    }//GEN-LAST:event_btnPagamentoActionPerformed

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
            java.util.logging.Logger.getLogger(Tp_Correntista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tp_Correntista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tp_Correntista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tp_Correntista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tp_Correntista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeposito;
    private javax.swing.JButton btnExtrato;
    private javax.swing.JButton btnPagamento;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSaldo;
    private javax.swing.JButton btnSaque;
    private javax.swing.JButton btnTransferencia;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
