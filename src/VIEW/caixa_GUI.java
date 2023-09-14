
package VIEW;


import static VIEW.login_GUI.password;
import static com.itextpdf.text.pdf.PdfFileSpecification.url;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class caixa_GUI extends javax.swing.JFrame {
    double total_produtos=0.0;
    
    String url = "jdbc:mysql://localhost/qualimarket"; // enderço do BD
    String username = "root";        //nome de um usuário de seu BD
    String password = "";  // senha do BD

    public caixa_GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonAero1 = new org.edisoncor.gui.button.ButtonAero();
        buttonGroup2 = new javax.swing.ButtonGroup();
        labelCustom4 = new org.edisoncor.gui.label.LabelCustom();
        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        labelCustom5 = new org.edisoncor.gui.label.LabelCustom();
        Pagamento = new org.edisoncor.gui.button.ButtonTextDown();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        arroz = new javax.swing.JTextField();
        feijao = new javax.swing.JTextField();
        oleo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        alho = new javax.swing.JTextField();
        cc = new javax.swing.JRadioButton();
        cd = new javax.swing.JRadioButton();
        din = new javax.swing.JRadioButton();
        pix = new javax.swing.JRadioButton();
        labelCustom1 = new org.edisoncor.gui.label.LabelCustom();
        calcular = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        buttonAero1.setText("buttonAero1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        labelCustom4.setBackground(new java.awt.Color(102, 0, 204));
        labelCustom4.setText("VALOR  DO ITEM");
        labelCustom4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        getContentPane().add(labelCustom4);
        labelCustom4.setBounds(0, 417, 260, 40);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(0, 445, 256, 80);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.setLayout(null);

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/LOGO.png"))); // NOI18N

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel1.add(panelImage2);
        panelImage2.setBounds(0, 72, 160, 140);

        labelCustom5.setBackground(new java.awt.Color(102, 0, 204));
        labelCustom5.setText("LISTA DE PRODUTOS");
        jPanel1.add(labelCustom5);
        labelCustom5.setBounds(249, 72, 229, 38);

        Pagamento.setBackground(new java.awt.Color(102, 0, 204));
        Pagamento.setText("PAGAMENTO");
        Pagamento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Pagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagamentoActionPerformed(evt);
            }
        });
        jPanel1.add(Pagamento);
        Pagamento.setBounds(220, 360, 217, 50);

        jLabel1.setText("Arroz = 20R$");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(300, 130, 90, 14);

        jLabel2.setText("Feijão = 25R$");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(300, 160, 90, 14);

        jLabel3.setText("Óleo = 10R$");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 190, 80, 14);

        arroz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrozActionPerformed(evt);
            }
        });
        jPanel1.add(arroz);
        arroz.setBounds(390, 130, 25, 20);
        jPanel1.add(feijao);
        feijao.setBounds(390, 160, 25, 20);
        jPanel1.add(oleo);
        oleo.setBounds(390, 220, 24, 20);

        jLabel4.setText("Alho = 5R$");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 220, 80, 14);

        alho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alhoActionPerformed(evt);
            }
        });
        jPanel1.add(alho);
        alho.setBounds(390, 190, 24, 20);

        buttonGroup2.add(cc);
        cc.setText("CARTÃO DE CRÉDITO");
        jPanel1.add(cc);
        cc.setBounds(450, 240, 170, 23);

        buttonGroup2.add(cd);
        cd.setText("CARTÃO DE DÉBITO");
        jPanel1.add(cd);
        cd.setBounds(450, 260, 170, 23);

        buttonGroup2.add(din);
        din.setText("DINHEIRO");
        jPanel1.add(din);
        din.setBounds(450, 280, 170, 23);

        buttonGroup2.add(pix);
        pix.setText("PIX");
        jPanel1.add(pix);
        pix.setBounds(450, 300, 170, 23);

        labelCustom1.setBackground(new java.awt.Color(102, 0, 204));
        labelCustom1.setText("CAIXA ABERTO");
        labelCustom1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jPanel1.add(labelCustom1);
        labelCustom1.setBounds(-60, 0, 740, 60);

        calcular.setLabel("CALCULAR PREÇO");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });
        jPanel1.add(calcular);
        calcular.setBounds(240, 250, 190, 30);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(680, 0, 39, 20);

        jButton2.setText("Gerar Nota Fiscal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(520, 380, 140, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 720, 410);

        setSize(new java.awt.Dimension(720, 410));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
       
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        String arr = (arroz.getText());
        String feij = (feijao.getText());
        String al = (alho.getText());
        String ol = (oleo.getText());int arr_conv = Integer.parseInt(arr);
        double total_arr = arr_conv * 20;

        int feij_conv = Integer.parseInt(feij);
        double total_feij = feij_conv * 25;

        int al_conv = Integer.parseInt(al);
        double total_al = al_conv * 10;

        int ol_conv = Integer.parseInt(ol);
        double total_ol = ol_conv * 10;

        double total_produtos = (arr_conv + feij_conv + al_conv + ol_conv);
        JOptionPane.showMessageDialog(null,total_produtos);
    }//GEN-LAST:event_calcularActionPerformed

    private void alhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alhoActionPerformed

    private void arrozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrozActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arrozActionPerformed

    private void PagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagamentoActionPerformed
        String arr = (arroz.getText());
        String feij = (feijao.getText());
        String al = (alho.getText());
        String ol = (oleo.getText());
        String qntdp = arr+feij+al+ol;

        int arr_conv = Integer.parseInt(arr);
        double total_arr = arr_conv * 20;

        int feij_conv = Integer.parseInt(feij);
        double total_feij = feij_conv * 25;

        int al_conv = Integer.parseInt(al);
        double total_al = al_conv * 10;

        int ol_conv = Integer.parseInt(ol);
        double total_ol = ol_conv * 10;

        double total_produtos = (arr_conv + feij_conv + al_conv + ol_conv);

        if (cc.isSelected() || cd.isSelected() || pix.isSelected()){
            new SS2_GUI().setVisible(true);
        }

        else{
            String val = JOptionPane.showInputDialog(null,"Digite a quantia de dinheiro: \n");
            double val_conv = Integer.parseInt(val);
            double troco = val_conv - total_produtos;
            JOptionPane.showMessageDialog(null,troco);
        }
//--------------------------------------------------------------------------------------------------
        LocalTime hora = LocalTime.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss"); // Define o formato desejado
        String timeString = hora.format(formatter);
        System.out.println(timeString);
        
        Controller.ConectaDriver.CarregaDriver();
        
           try { 
            Connection con = null; 
            try {
        con = (Connection) DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Erro - S002");
                   }
            // Recebendo os dados a serem inseridos na tabela
        String sql = "INSERT INTO vendas(ven_horario, ven_qntd) values('"+timeString+"', '"+total_produtos+"')";
     
            try { // Tratamento de Erros para inserção

                // Criando varialvel que executara a inserção
                PreparedStatement inserir = (PreparedStatement) con.prepareStatement(sql);
                inserir.execute(); // Executando a inserção

        JOptionPane.showMessageDialog(null,"\nInserção realizada com sucesso!!!\n","",-1);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"\nErro na inserção!","ERRO!",0);
            }

        }catch(NumberFormatException erro){
            // Tratamento de erro caso o usuario não digite o telefone corretamente
            JOptionPane.showMessageDialog(null,"Digite os dados corretamente","ERRO",0);
        }
    }//GEN-LAST:event_PagamentoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            Model.PDF_DAO.pdf();
        } catch (Exception ex) {
            Logger.getLogger(caixa_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(caixa_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(caixa_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(caixa_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(caixa_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new caixa_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonTextDown Pagamento;
    private javax.swing.JTextField alho;
    private javax.swing.JTextField arroz;
    private org.edisoncor.gui.button.ButtonAero buttonAero1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton calcular;
    private javax.swing.JRadioButton cc;
    private javax.swing.JRadioButton cd;
    private javax.swing.JRadioButton din;
    private javax.swing.JTextField feijao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private org.edisoncor.gui.label.LabelCustom labelCustom1;
    private org.edisoncor.gui.label.LabelCustom labelCustom4;
    private org.edisoncor.gui.label.LabelCustom labelCustom5;
    private javax.swing.JTextField oleo;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private javax.swing.JRadioButton pix;
    // End of variables declaration//GEN-END:variables
}
