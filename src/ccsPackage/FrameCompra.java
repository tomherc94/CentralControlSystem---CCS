package ccsPackage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;

public class FrameCompra extends javax.swing.JDialog {

    public FrameCompra() {
        initComponents();

        this.setModal(true);
        this.setIconImage(new ImageIcon("C:\\Users\\Alyph\\OneDrive\\Documentos\\NetBeansProjects\\CentralControlSystem\\src\\ccsImagens\\Icons\\iconCompra.png").getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("teste?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        comprasQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Compras c");
        comprasList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : comprasQuery.getResultList();
        cadastroQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cadastro c");
        cadastroList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : cadastroQuery.getResultList();
        comprasQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Compras c");
        comprasList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : comprasQuery1.getResultList();
        labelCompra = new javax.swing.JLabel();
        btnFechar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        txtDescricao = new javax.swing.JTextField();
        jScrollPaneCompras = new javax.swing.JScrollPane();
        tblCompras = new javax.swing.JTable();
        txtQtdCompra = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDataCompra = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtValorCompra = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Central Control System - Compra");
        setFocusTraversalPolicyProvider(true);
        setMaximumSize(new java.awt.Dimension(916, 400));
        setMinimumSize(new java.awt.Dimension(916, 400));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        labelCompra.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        labelCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCompra.setText("Compra");

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
        btnIncluir.setText("Comprar");
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

        tblCompras.setDropMode(javax.swing.DropMode.INSERT);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, comprasList1, tblCompras);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${descricao}"));
        columnBinding.setColumnName("Descricao");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valor}"));
        columnBinding.setColumnName("Valor");
        columnBinding.setColumnClass(java.math.BigDecimal.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${quantidade}"));
        columnBinding.setColumnName("Quantidade");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        tblCompras.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                tblComprasVetoableChange(evt);
            }
        });
        jScrollPaneCompras.setViewportView(tblCompras);

        txtQtdCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel2.setText("Descrição");

        jLabel3.setText("Valor");

        try {
            txtDataCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataCompra.setToolTipText("");

        jLabel4.setText("Data");

        jLabel6.setText("Qtd");

        txtValorCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.00"))));

        jLabel7.setText("Codigo");

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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtValorCompra))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(txtQtdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPaneCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelCompra)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void btnFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseClicked

        int opcao = JOptionPane.showConfirmDialog(null, "Realmente deseja sair?", "Central Control System - Compra", JOptionPane.YES_NO_CANCEL_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            this.dispose();
        } else if (opcao == JOptionPane.NO_OPTION) {
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

        String codigo = txtCodigo.getText();
        String descricao = txtDescricao.getText();
        String valorCompra = txtValorCompra.getText().replace(",", ".");
        String dataDia = txtDataCompra.getText().substring(0, 2);
        String dataMes = txtDataCompra.getText().substring(3, 5);
        String dataAno = txtDataCompra.getText().substring(6, 10);
        String dataCompra = dataAno + "-" + dataMes + "-" + dataDia;
        String qtdCompra = txtQtdCompra.getText();

        try {
            // cria uma variavel de conexão
            Connection con;

            // cria "pega" uma conexão com o banco
            con = DriverManager.getConnection("jdbc:mysql://localhost/teste", "root", "admin");

            // cria a string para inserir no banco
            String query = "INSERT INTO compras (codigo, descricao, valor, data, quantidade) VALUES (?, ?,?,?,?)";

            // cria o comando
            PreparedStatement stmt = con.prepareStatement(query);

            // set os valores na String de inserção
            stmt.setString(1, codigo);
            stmt.setString(2, descricao);
            stmt.setString(3, valorCompra);
            stmt.setString(4, dataCompra);
            stmt.setString(5, qtdCompra);

            // executa o comando no banco de dados
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso.");

            // fecha o comando e a conexão
            stmt.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível gravar os dados.");
            System.out.println("Ocorreu um erro de SQL");
        }

        txtCodigo.setText("");
        txtDescricao.setText("");
        txtValorCompra.setText("");
        txtDataCompra.setText("");
        txtQtdCompra.setText("");

        updateTable();


    }//GEN-LAST:event_btnIncluirActionPerformed

    public void updateTable() {
        comprasList = comprasQuery.getResultList();
        tblCompras = new javax.swing.JTable();
        tblCompras.setDropMode(javax.swing.DropMode.INSERT);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, comprasList, tblCompras);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${descricao}"));
        columnBinding.setColumnName("Descricao");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valor}"));
        columnBinding.setColumnName("Valor");
        columnBinding.setColumnClass(java.math.BigDecimal.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${quantidade}"));
        columnBinding.setColumnName("Quantidade");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        tblCompras.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt) throws java.beans.PropertyVetoException {
                tblComprasVetoableChange(evt);
            }
        });

        jScrollPaneCompras.setViewportView(tblCompras);

        if (tblCompras.getColumnModel().getColumnCount() > 0) {
            tblCompras.getColumnModel().getColumn(0).setHeaderValue("Codigo");
            tblCompras.getColumnModel().getColumn(1).setHeaderValue("Descricao");
            tblCompras.getColumnModel().getColumn(2).setHeaderValue("Valor");
            tblCompras.getColumnModel().getColumn(3).setHeaderValue("Quantidade");
        }

    }

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void tblComprasVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_tblComprasVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblComprasVetoableChange

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
            java.util.logging.Logger.getLogger(FrameCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCompra().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnIncluir;
    private java.util.List<ccsPackage.Cadastro> cadastroList;
    private javax.persistence.Query cadastroQuery;
    private java.util.List<ccsPackage.Compras> comprasList;
    private java.util.List<ccsPackage.Compras> comprasList1;
    private javax.persistence.Query comprasQuery;
    private javax.persistence.Query comprasQuery1;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPaneCompras;
    private javax.swing.JLabel labelCompra;
    private javax.swing.JTable tblCompras;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtDataCompra;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JFormattedTextField txtQtdCompra;
    private javax.swing.JFormattedTextField txtValorCompra;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
