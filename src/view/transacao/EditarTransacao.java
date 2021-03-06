package view.transacao;

import core.Sistema;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import models.Categoria;
import models.Conta;
import models.Despesa;
import models.Recorrencia;
import models.Transacao;

/**
 *
 * @author Grupo
 * @version 1.0
 */
public class EditarTransacao extends javax.swing.JDialog {

    private static Transacao transacao;
    private static Conta conta;

    /**
     * Creates new form AdicionarCategoria
     */
    public EditarTransacao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getRootPane().setDefaultButton(botaoEditar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tiposDeTransacao = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        inputValor = new javax.swing.JTextField();
        botaoEditar = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        selectTransacao = new javax.swing.JComboBox();
        escolhaDaContaLabel = new javax.swing.JLabel();
        selectConta = new javax.swing.JComboBox();
        descricaoLabel = new javax.swing.JLabel();
        inputDescricao = new javax.swing.JTextField();
        valorLabel = new javax.swing.JLabel();
        selectCategoria = new javax.swing.JComboBox();
        categoriaLabel = new javax.swing.JLabel();
        despesaRadioButton = new javax.swing.JRadioButton();
        proventoRadioButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        inputData = new com.toedter.calendar.JDateChooser();
        dataLabel = new javax.swing.JLabel();
        selectRecorrencia = new javax.swing.JComboBox();
        recorrenciaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dark Side of the Grana - Editar Transação");

        jPanel2.setBackground(new java.awt.Color(251, 251, 251));

        labelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        labelTitulo.setText("Edita Transacao");

        labelNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNome.setText("Transacao:");

        botaoEditar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        botaoEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/pencil.png"))); // NOI18N
        botaoEditar.setText("Editar");
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        botaoVoltar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        botaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/arrow_left.png"))); // NOI18N
        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        selectTransacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectTransacao.setPreferredSize(new java.awt.Dimension(300, 30));
        selectTransacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTransacaoActionPerformed(evt);
            }
        });

        escolhaDaContaLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        escolhaDaContaLabel.setText("Conta:");

        selectConta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectConta.setModel(listaDeConta(Sistema.instance.getContas()));
        selectConta.setPreferredSize(new java.awt.Dimension(300, 30));
        selectConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectContaActionPerformed(evt);
            }
        });

        descricaoLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descricaoLabel.setText("Descricao:");

        valorLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        valorLabel.setText("Valor:");

        selectCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectCategoria.setModel(listaDeCategoria(Sistema.instance.getCategorias()));

        categoriaLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        categoriaLabel.setText("Categoria:");

        tiposDeTransacao.add(despesaRadioButton);
        despesaRadioButton.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        despesaRadioButton.setText("Despesa");
        despesaRadioButton.setActionCommand("Despesa");

        tiposDeTransacao.add(proventoRadioButton);
        proventoRadioButton.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        proventoRadioButton.setSelected(true);
        proventoRadioButton.setText("Provento");
        proventoRadioButton.setActionCommand("Provento");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Tipo da transacao:");

        dataLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dataLabel.setText("Data:");

        selectRecorrencia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectRecorrencia.setModel(new DefaultComboBoxModel(Recorrencia.values()));
        selectRecorrencia.setPreferredSize(new java.awt.Dimension(300, 30));

        recorrenciaLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        recorrenciaLabel.setText("Recorrência:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(escolhaDaContaLabel)
                                    .addComponent(labelNome)
                                    .addComponent(descricaoLabel)
                                    .addComponent(valorLabel)
                                    .addComponent(categoriaLabel)
                                    .addComponent(dataLabel)
                                    .addComponent(recorrenciaLabel))
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectConta, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(botaoEditar)
                                .addGap(20, 20, 20)
                                .addComponent(botaoVoltar))
                            .addComponent(selectTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputValor, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputData, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectRecorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(proventoRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(despesaRadioButton)))
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addGap(244, 244, 244))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelTitulo)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectConta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escolhaDaContaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectTransacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricaoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputValor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriaLabel))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataLabel)
                    .addComponent(inputData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectRecorrencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recorrenciaLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(proventoRadioButton)
                    .addComponent(despesaRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar)
                    .addComponent(botaoEditar))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void selectContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectContaActionPerformed
        try {
            conta = Sistema.instance.pesquisaConta(getConta());
            selectTransacao.setModel(listaDeTransacao(conta));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_selectContaActionPerformed

    private void selectTransacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTransacaoActionPerformed
        try {
            transacao = Sistema.instance.pesquisaTransacao(getPosicaoTransacao(), conta.getNome());
            inputDescricao.setText(transacao.getDescricao());
            inputValor.setText("" + transacao.getValor());
            selectCategoria.setSelectedItem(transacao.getCategoria().getNome());
            inputData.setCalendar(transacao.getDataDeInsercao());
            selectRecorrencia.setSelectedItem(transacao.getRecorrencia());
            if (transacao instanceof Despesa) {
                tiposDeTransacao.setSelected(despesaRadioButton.getModel(), true);
            } else {
                tiposDeTransacao.setSelected(proventoRadioButton.getModel(), true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_selectTransacaoActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        try {
            Categoria categoria = Sistema.instance.pesquisaCategoria(getNovaCategoria());
            Sistema.instance.editaTransacao(getPosicaoTransacao(), conta.getNome(), getNovaDescricao(), getNovaData(),
                categoria, getNovoValor(), getNovaRecorrencia(), getNovoTipo());
            JOptionPane.showMessageDialog(rootPane, "Transação editada com sucesso.");
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_botaoEditarActionPerformed

    private int getPosicaoTransacao() throws Exception {
        if (selectTransacao.getSelectedIndex() < 0) {
            throw new Exception("Não ha transação selecionada.");
        }
        return selectTransacao.getSelectedIndex();
    }

    private String getNovaDescricao() {
        return inputDescricao.getText();
    }

    private double getNovoValor() {
        return Double.parseDouble(inputValor.getText().replaceAll(",", "."));
    }

    private Calendar getNovaData() {
        return inputData.getCalendar();
    }

    private String getNovoTipo() {
        return tiposDeTransacao.getSelection().getActionCommand();
    }

    private int getNovaRecorrencia() {
        Recorrencia nome = (Recorrencia) selectRecorrencia.getSelectedItem();
        return nome.getValor();
    }

    private String getNovaCategoria() throws Exception {
        if (selectCategoria.getSelectedItem() == null) {
            throw new Exception("Não ha categoria selecionada.");
        }
        return (String) selectCategoria.getSelectedItem();
    }

    private String getConta() throws Exception {
        if (selectConta.getSelectedItem() == null) {
            throw new Exception("Não ha contas.");
        }
        return (String) selectConta.getSelectedItem();
    }

    private DefaultComboBoxModel listaDeCategoria(List<Categoria> listaDeCategorias) {
        ArrayList<String> strings = new ArrayList<>();
        for (Iterator<Categoria> it = listaDeCategorias.iterator(); it.hasNext();) {
            Categoria cadaCategoria = it.next();
            strings.add(cadaCategoria.getNome());
        }
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Iterator<String> it = strings.iterator(); it.hasNext();) {
            String string = it.next();
            model.addElement(string);
        }
        return model;
    }

    private DefaultComboBoxModel listaDeConta(List<Conta> listaDeContas) {
        ArrayList<String> strings = new ArrayList<>();
        for (Iterator<Conta> it = listaDeContas.iterator(); it.hasNext();) {
            Conta cadaConta = it.next();
            strings.add(cadaConta.getNome());
        }
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Iterator<String> it = strings.iterator(); it.hasNext();) {
            String string = it.next();
            model.addElement(string);
        }
        return model;
    }

    private DefaultComboBoxModel listaDeTransacao(Conta conta) {
        ArrayList<String> strings = new ArrayList<>();

        List<Transacao> listaDeTransacoes = conta.getListaDeTransacoes();
        for (Iterator<Transacao> it = listaDeTransacoes.iterator(); it.hasNext();) {
            Transacao cadaTransacao = it.next();
            strings.add(cadaTransacao.getDescricao());
        }

        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        for (Iterator<String> it = strings.iterator(); it.hasNext();) {
            String string = it.next();
            model.addElement(string);
        }
        return model;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel categoriaLabel;
    private javax.swing.JLabel dataLabel;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JRadioButton despesaRadioButton;
    private javax.swing.JLabel escolhaDaContaLabel;
    private com.toedter.calendar.JDateChooser inputData;
    private javax.swing.JTextField inputDescricao;
    private javax.swing.JTextField inputValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JRadioButton proventoRadioButton;
    private javax.swing.JLabel recorrenciaLabel;
    private javax.swing.JComboBox selectCategoria;
    private javax.swing.JComboBox selectConta;
    private javax.swing.JComboBox selectRecorrencia;
    private javax.swing.JComboBox selectTransacao;
    private javax.swing.ButtonGroup tiposDeTransacao;
    private javax.swing.JLabel valorLabel;
    // End of variables declaration//GEN-END:variables
}
