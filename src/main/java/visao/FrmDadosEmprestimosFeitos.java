/**
 * Classe FrmDadosEmprestimosFeitos
 * 
 * Esta classe representa a interface gráfica para exibir informações sobre empréstimos feitos.
 */
package visao;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Amigo;
import model.Emprestimo;
import model.Ferramenta;

public class FrmDadosEmprestimosFeitos extends javax.swing.JFrame {

    private Emprestimo objetoEmprestimoFeito;
    private Ferramenta objetoFerramenta;
    /**
     * Construtor FrmDadosEmprestimosFeitos
     * 
     * Cria uma nova instância da interface gráfica FrmDadosEmprestimosFeitos e inicializa os componentes da interface, além de imprimir a tabela de empréstimos, o total de empréstimos e o maior devedor.
     */
    public FrmDadosEmprestimosFeitos() {
        initComponents();
        this.objetoEmprestimoFeito = new Emprestimo();
        this.objetoFerramenta = new Ferramenta();
        this.imprimirTabela();
        this.imprimirTotalEmprestimos();
        this.imprimirMaiorDevedor();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTotalEmprestimosRealizadosTitulo = new javax.swing.JLabel();
        JBApagar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaEmprestimo = new javax.swing.JTable();
        jMaiorDevedorRealizadoTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("RELATÓRIO EMPRÉSTIMOS REALIZADOS");

        jTotalEmprestimosRealizadosTitulo.setText("Total empréstimos:");
        jTotalEmprestimosRealizadosTitulo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTotalEmprestimosRealizadosTituloAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        JBApagar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JBApagar.setForeground(new java.awt.Color(255, 153, 153));
        JBApagar.setText("Apagar");
        JBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarActionPerformed(evt);
            }
        });

        JBCancelar.setBackground(new java.awt.Color(242, 242, 242));
        JBCancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        jTabelaEmprestimo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Ferramentas", "Amigo", "Data inicial", "Data final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabelaEmprestimo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTabelaEmprestimoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTabelaEmprestimo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelaEmprestimoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabelaEmprestimo);
        if (jTabelaEmprestimo.getColumnModel().getColumnCount() > 0) {
            jTabelaEmprestimo.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        jMaiorDevedorRealizadoTitulo.setText("Maior devedor:");
        jMaiorDevedorRealizadoTitulo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jMaiorDevedorRealizadoTituloAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jMaiorDevedorRealizadoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTotalEmprestimosRealizadosTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(jTotalEmprestimosRealizadosTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jMaiorDevedorRealizadoTitulo)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBApagar)
                    .addComponent(JBCancelar))
                .addGap(112, 112, 112))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTotalEmprestimosRealizadosTituloAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTotalEmprestimosRealizadosTituloAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTotalEmprestimosRealizadosTituloAncestorAdded

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
        try {
            if (this.jTabelaEmprestimo.getSelectedRow() != -1) {
                int id = Integer.parseInt(this.jTabelaEmprestimo.getValueAt(this.jTabelaEmprestimo.getSelectedRow(), 0).toString());

                int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover este empréstimo para sempre?");

                if (respostaUsuario == 0) {// clicou em SIM
                    if (this.objetoEmprestimoFeito.deleteEmprestimoDb(id)) {
                        JOptionPane.showMessageDialog(rootPane, "Empréstimo removido!", "Empréstimo removido com sucesso!", JOptionPane.PLAIN_MESSAGE);
                    }
                }

            } else {
                throw new Mensagem("Selecione um emprestimo na tabela!");
            }

        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(rootPane, erro.getMessage());
        } finally {
            this.imprimirTabela();
            this.imprimirTotalEmprestimos();
            this.imprimirMaiorDevedor();

        }
    }

    private void imprimirTotalEmprestimos() {
        ArrayList<Emprestimo> EmprestimoLista = new Emprestimo().getEmprestimoQuery(false);

        int totalEmprestimos = EmprestimoLista.size();

        jTotalEmprestimosRealizadosTitulo.setText("Total: " + totalEmprestimos + " empréstimos realizados");
    }

    private void imprimirMaiorDevedor() {
        int emprestimosNumero = 0;
        int idMaiorDevedor = 0;
        ArrayList<Amigo> AmigoLista = new Amigo().getListaAmigo();
        ArrayList<Emprestimo> EmprestimoLista = new Emprestimo().getEmprestimoQuery(false);
        int counter = 0;
        String nomeMaiorDevedor = "";

        // pegar Amigo com maior número de empréstimos
        for (Amigo amigo : AmigoLista) {
            int idToSearch = amigo.getId();
            for (Emprestimo emprestimo : EmprestimoLista) {
                if (emprestimo.getAmigoId() == idToSearch) {
                    counter++;

                    if (counter > emprestimosNumero) {
                        emprestimosNumero = counter;
                        idMaiorDevedor = emprestimo.getAmigoId();
                        nomeMaiorDevedor = emprestimo.getNomeAmigo();
                    }
                }
            }

            counter = 0;
        }

        if (emprestimosNumero > 0) {
            jMaiorDevedorRealizadoTitulo.setText("Maior devedor: " + nomeMaiorDevedor + " (" + emprestimosNumero + " empréstimos realizados)");
            jMaiorDevedorRealizadoTitulo.setForeground(Color.black);

        } else {
            jMaiorDevedorRealizadoTitulo.setText("Não há empréstimos realizados");
            jMaiorDevedorRealizadoTitulo.setForeground(Color.red);
        }

    }

    public void imprimirTabela() {
        DefaultTableModel modeloTabela = (DefaultTableModel) this.jTabelaEmprestimo.getModel();
        modeloTabela.setNumRows(0); //Posiciona na primeira linha da tabela
        ArrayList<Emprestimo> listaEmprestimos = this.objetoEmprestimoFeito.getEmprestimoQuery(false);

        for (Emprestimo e : listaEmprestimos) {
            System.out.println("ids");
            ArrayList<Ferramenta> listaFerramentas = new ArrayList<Ferramenta>();
            String[] indexesString = e.getFerramentasId().split(" ");
            ArrayList<Integer> indexesInt = new ArrayList<Integer>();
            String nomeFerramenta = "";

            for (String index : indexesString) {
                if(index!=""){
                    indexesInt.add(Integer.parseInt(index));
                }
            }

            for (int index : indexesInt) {
                nomeFerramenta += this.objetoFerramenta.getFerramentaById(index).getNome() + ",";
            }

            modeloTabela.addRow(new Object[]{
                e.getId(),
                nomeFerramenta,
                e.getNomeAmigo(),
                e.getDataInicio(),
                e.getDataFinal()
            });

            // centralizar valores das colunas
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);

            for (int i = 0; i < jTabelaEmprestimo.getColumnCount(); i++) {
                jTabelaEmprestimo.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            }
        }


    }//GEN-LAST:event_JBApagarActionPerformed

    private void jTabelaEmprestimoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTabelaEmprestimoAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabelaEmprestimoAncestorAdded

    private void jTabelaEmprestimoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaEmprestimoMouseClicked

    }//GEN-LAST:event_jTabelaEmprestimoMouseClicked

    private void jMaiorDevedorRealizadoTituloAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jMaiorDevedorRealizadoTituloAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jMaiorDevedorRealizadoTituloAncestorAdded

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
            java.util.logging.Logger.getLogger(FrmDadosEmprestimosFeitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDadosEmprestimosFeitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDadosEmprestimosFeitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDadosEmprestimosFeitos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDadosEmprestimosFeitos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jMaiorDevedorRealizadoTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelaEmprestimo;
    private javax.swing.JLabel jTotalEmprestimosRealizadosTitulo;
    // End of variables declaration//GEN-END:variables
}
