package ccsPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FrameVenda extends javax.swing.JDialog {

    public FrameVenda() {
        initComponents();
        this.setModal(true);
        
        this.setIconImage(new ImageIcon("C:\\CentralControlSystem\\src\\ccsImagens\\Icons\\iconVenda.png").getImage());
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("mysql?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        columnsPrivQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM ColumnsPriv c");
        columnsPrivList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : columnsPrivQuery.getResultList();
        entityManager0 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("teste?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        vendasQuery = java.beans.Beans.isDesignTime() ? null : entityManager0.createQuery("SELECT v FROM Vendas v");
        vendasList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : vendasQuery.getResultList();
        vendasQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager0.createQuery("SELECT v FROM Vendas v");
        vendasList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : vendasQuery1.getResultList();
        labelVenda = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        jScrollPaneCompras = new javax.swing.JScrollPane();
        tblVendas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        txtQtdVenda = new javax.swing.JFormattedTextField();
        txtDataVenda = new javax.swing.JFormattedTextField();
        txtValorVenda = new javax.swing.JFormattedTextField();
        txtIR = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtEstoque = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtValorCompra = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Central Control System - Venda");
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(904, 377));
        setMinimumSize(new java.awt.Dimension(904, 377));

        labelVenda.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        labelVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVenda.setText("Venda");

        btnFechar.setText("Fechar");
        btnFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFecharMouseClicked(evt);
            }
        });
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnIncluir.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnIncluir.setText("Vender");
        btnIncluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncluirMouseClicked(evt);
            }
        });
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, vendasList1, tblVendas);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${descricao}"));
        columnBinding.setColumnName("Descricao");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${quantidadeVenda}"));
        columnBinding.setColumnName("Quantidade Venda");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valorCompra}"));
        columnBinding.setColumnName("Valor Compra");
        columnBinding.setColumnClass(java.math.BigDecimal.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valorVenda}"));
        columnBinding.setColumnName("Valor Venda");
        columnBinding.setColumnClass(java.math.BigDecimal.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${lucroBruto}"));
        columnBinding.setColumnName("Lucro Bruto");
        columnBinding.setColumnClass(java.math.BigDecimal.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ir}"));
        columnBinding.setColumnName("Ir");
        columnBinding.setColumnClass(java.math.BigDecimal.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${lucroLiquido}"));
        columnBinding.setColumnName("Lucro Liquido");
        columnBinding.setColumnClass(java.math.BigDecimal.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataVenda}"));
        columnBinding.setColumnName("Data Venda");
        columnBinding.setColumnClass(java.util.Date.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPaneCompras.setViewportView(tblVendas);

        jLabel2.setText("Descrição");

        jLabel3.setText("Valor Venda");

        jLabel4.setText("Data");

        jLabel6.setText("Qtd");

        txtDescricao.setMaximumSize(new java.awt.Dimension(6, 22));

        txtQtdVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtQtdVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdVendaActionPerformed(evt);
            }
        });

        try {
            txtDataVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtValorVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtValorVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorVendaFocusLost(evt);
            }
        });

        txtIR.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        jLabel9.setText("IR");

        jLabel11.setText("Estoque");

        txtEstoque.setEditable(false);
        txtEstoque.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtEstoque.setMaximumSize(new java.awt.Dimension(6, 22));

        jLabel7.setText("Codigo");

        txtValorCompra.setEditable(false);
        txtValorCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        txtValorCompra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorCompraFocusLost(evt);
            }
        });

        jLabel5.setText("Valor Compra");

        txtCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel2)
                        .addGap(243, 243, 243)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(txtQtdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(txtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(txtValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(txtIR, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPaneCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPaneCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseClicked

        int opcao = JOptionPane.showConfirmDialog(null,"Realmente deseja sair?","Central Control System - Compra", JOptionPane.YES_NO_CANCEL_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            this.dispose();
        }
        else if (opcao == JOptionPane.NO_OPTION){
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        }
    }//GEN-LAST:event_btnFecharMouseClicked

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnIncluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncluirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIncluirMouseClicked

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed

    }//GEN-LAST:event_btnIncluirActionPerformed

    private void txtValorVendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorVendaFocusLost
       
        double valorCompra;
        double valorVenda = Double.parseDouble(txtValorVenda.getText());
        double lBruto;
        
        try {          
            // cria uma variavel de conexão
            Connection con;
            
            // cria "pega" uma conexão com o banco
            con = DriverManager.getConnection("jdbc:mysql://localhost/teste", "root", "admin");
            
            // cria a string para inserir no banco
            String query = "SELECT valor FROM compras WHERE codigo = ?";
            
            // cria o comando
            PreparedStatement cmd = con.prepareStatement(query);
            
            // set os valores na String de inserção
            cmd.setString(1, txtCodigo.getText());

            // executa o comando no banco de dados
            ResultSet rs = cmd.executeQuery();
            
            // percorre por cada linha da tabela populando
            while (rs.next()){
                valorCompra = Double.parseDouble(rs.getString("valor"));
                lBruto = valorVenda - valorCompra;             
                //txtLB.setText(Double.toString(lBruto));
            
            //insert vendas event
            //String query = "insert into vendas (codigo, descricao, valor_compra, valor_venda, lucro_bruto, ir, lucro_liquido, quantidade_venda, date_venda) values ();";
            
                
            }
            
            
            // fecha o comando e a conexão
            rs.close();
            cmd.close();
            con.close();
            
        } catch (SQLException e){
            System.out.println("Ocorreu um erro de SQL");
        }
    }//GEN-LAST:event_txtValorVendaFocusLost

    private void txtQtdVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdVendaActionPerformed

    private void txtValorCompraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorCompraFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorCompraFocusLost

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

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
            java.util.logging.Logger.getLogger(FrameVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnIncluir;
    private java.util.List<ccsPackage.ColumnsPriv> columnsPrivList;
    private javax.persistence.Query columnsPrivQuery;
    private javax.persistence.EntityManager entityManager;
    private javax.persistence.EntityManager entityManager0;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPaneCompras;
    private javax.swing.JLabel labelVenda;
    private javax.swing.JTable tblVendas;
    private javax.swing.JFormattedTextField txtCodigo;
    private javax.swing.JFormattedTextField txtDataVenda;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JFormattedTextField txtEstoque;
    private javax.swing.JFormattedTextField txtIR;
    private javax.swing.JFormattedTextField txtQtdVenda;
    private javax.swing.JFormattedTextField txtValorCompra;
    private javax.swing.JFormattedTextField txtValorVenda;
    private java.util.List<ccsPackage.Vendas> vendasList;
    private java.util.List<ccsPackage.Vendas> vendasList1;
    private javax.persistence.Query vendasQuery;
    private javax.persistence.Query vendasQuery1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
