package view;

import view.categoria.*;
import view.conta.*;
import view.transacao.*;
import view.relatorio.*;
import view.usuario.*;
import core.Sistema;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JOptionPane;

/**
 * @author Grupo
 * @version 1.0
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        try {
            Sistema.instance.atualizaSaldoCategorias();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nomeLabel = new javax.swing.JLabel();
        emailLabel2 = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        nomeLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        botaoHome = new javax.swing.JMenu();
        botaoEditarPerfil = new javax.swing.JMenuItem();
        Separador = new javax.swing.JPopupMenu.Separator();
        botaoSobre = new javax.swing.JMenuItem();
        botaoSair = new javax.swing.JMenuItem();
        botaoTransacao = new javax.swing.JMenu();
        botaoAdicionarTransacao = new javax.swing.JMenuItem();
        botaoRemoverTransacao = new javax.swing.JMenuItem();
        botaoEditarTransacao = new javax.swing.JMenuItem();
        botaoExtrato = new javax.swing.JMenuItem();
        botaoCategoria = new javax.swing.JMenu();
        botaoAdicionarCategoria = new javax.swing.JMenuItem();
        botaoRemoverCategoria = new javax.swing.JMenuItem();
        botaoEditarCategoria = new javax.swing.JMenuItem();
        botaoConta = new javax.swing.JMenu();
        botaoAdicionarConta = new javax.swing.JMenuItem();
        botaoRemoverConta = new javax.swing.JMenuItem();
        botaoEditarConta = new javax.swing.JMenuItem();
        botaoRelatorios = new javax.swing.JMenu();
        botaoRelatorioHistograma = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dark Side of the Grana - Home");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getLogo());
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(251, 251, 251));

        jPanel2.setBackground(new java.awt.Color(251, 251, 251));

        nomeLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/user.png"))); // NOI18N
        nomeLabel.setText("Nome:");

        emailLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailLabel2.setText(Sistema.instance.getUsuarioLogado().getEmail());

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/email.png"))); // NOI18N
        emailLabel.setText("E-mail:");

        nomeLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomeLabel2.setText(Sistema.instance.getUsuarioLogado().getNome());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeLabel)
                    .addComponent(emailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLabel2)
                    .addComponent(nomeLabel2))
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeLabel)
                    .addComponent(nomeLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/dsotg.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        MenuBar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MenuBar.setPreferredSize(new java.awt.Dimension(173, 40));

        botaoHome.setBackground(java.awt.Color.lightGray);
        botaoHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/house.png"))); // NOI18N
        botaoHome.setText("Home");

        botaoEditarPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/user_edit.png"))); // NOI18N
        botaoEditarPerfil.setText("Editar Perfil");
        botaoEditarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarPerfilActionPerformed(evt);
            }
        });
        botaoHome.add(botaoEditarPerfil);
        botaoHome.add(Separador);

        botaoSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/information2.png"))); // NOI18N
        botaoSobre.setText("Sobre");
        botaoSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSobreActionPerformed(evt);
            }
        });
        botaoHome.add(botaoSobre);

        botaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/cross.png"))); // NOI18N
        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });
        botaoHome.add(botaoSair);

        botaoHome.setBackground(Color.GRAY);

        MenuBar.add(botaoHome);

        botaoTransacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/money_dollar.png"))); // NOI18N
        botaoTransacao.setText("Transações");

        botaoAdicionarTransacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/add.png"))); // NOI18N
        botaoAdicionarTransacao.setText("Adicionar");
        botaoAdicionarTransacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarTransacaoActionPerformed(evt);
            }
        });
        botaoTransacao.add(botaoAdicionarTransacao);

        botaoRemoverTransacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/delete.png"))); // NOI18N
        botaoRemoverTransacao.setText("Remover");
        botaoRemoverTransacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverTransacaoActionPerformed(evt);
            }
        });
        botaoTransacao.add(botaoRemoverTransacao);

        botaoEditarTransacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/pencil.png"))); // NOI18N
        botaoEditarTransacao.setText("Editar");
        botaoEditarTransacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarTransacaoActionPerformed(evt);
            }
        });
        botaoTransacao.add(botaoEditarTransacao);

        botaoExtrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/script.png"))); // NOI18N
        botaoExtrato.setText("Extrato");
        botaoExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExtratoActionPerformed(evt);
            }
        });
        botaoTransacao.add(botaoExtrato);

        MenuBar.add(botaoTransacao);

        botaoCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/tag_blue.png"))); // NOI18N
        botaoCategoria.setText("Categorias");

        botaoAdicionarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/add.png"))); // NOI18N
        botaoAdicionarCategoria.setText("Adicionar");
        botaoAdicionarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarCategoriaActionPerformed(evt);
            }
        });
        botaoCategoria.add(botaoAdicionarCategoria);

        botaoRemoverCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/delete.png"))); // NOI18N
        botaoRemoverCategoria.setText("Remover");
        botaoRemoverCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverCategoriaActionPerformed(evt);
            }
        });
        botaoCategoria.add(botaoRemoverCategoria);

        botaoEditarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/pencil.png"))); // NOI18N
        botaoEditarCategoria.setText("Editar");
        botaoEditarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarCategoriaActionPerformed(evt);
            }
        });
        botaoCategoria.add(botaoEditarCategoria);

        MenuBar.add(botaoCategoria);

        botaoConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/coins.png"))); // NOI18N
        botaoConta.setText("Contas");

        botaoAdicionarConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/add.png"))); // NOI18N
        botaoAdicionarConta.setText("Adicionar");
        botaoAdicionarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarContaActionPerformed(evt);
            }
        });
        botaoConta.add(botaoAdicionarConta);

        botaoRemoverConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/delete.png"))); // NOI18N
        botaoRemoverConta.setText("Remover");
        botaoRemoverConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverContaActionPerformed(evt);
            }
        });
        botaoConta.add(botaoRemoverConta);

        botaoEditarConta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/pencil.png"))); // NOI18N
        botaoEditarConta.setText("Editar");
        botaoEditarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarContaActionPerformed(evt);
            }
        });
        botaoConta.add(botaoEditarConta);

        MenuBar.add(botaoConta);

        botaoRelatorios.setBackground(new java.awt.Color(255, 255, 255));
        botaoRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/chart_pie.png"))); // NOI18N
        botaoRelatorios.setText("Relatórios");

        botaoRelatorioHistograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/chart_bar.png"))); // NOI18N
        botaoRelatorioHistograma.setText("Relatórios");
        botaoRelatorioHistograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRelatorioHistogramaActionPerformed(evt);
            }
        });
        botaoRelatorios.add(botaoRelatorioHistograma);

        MenuBar.add(botaoRelatorios);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private Image getLogo() {
        URL url = this.getClass().getResource("/view/imagens/dsotglogin.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        return iconeTitulo;
    }

    private void botaoEditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarPerfilActionPerformed
        EditarPerfil editarPerfil = new EditarPerfil(this, rootPaneCheckingEnabled);
        editarPerfil.setVisible(true);
    }//GEN-LAST:event_botaoEditarPerfilActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        Sistema.instance.deslogar();
        dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoRemoverTransacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverTransacaoActionPerformed
        RemoverTransacao removerTransacao = new RemoverTransacao(this, rootPaneCheckingEnabled);
        removerTransacao.setVisible(true);
    }//GEN-LAST:event_botaoRemoverTransacaoActionPerformed

    private void botaoAdicionarTransacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarTransacaoActionPerformed
        AdicionarTransacao adicionarTransacao = new AdicionarTransacao(this, rootPaneCheckingEnabled);
        adicionarTransacao.setVisible(true);
    }//GEN-LAST:event_botaoAdicionarTransacaoActionPerformed

    private void botaoEditarTransacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarTransacaoActionPerformed
        EditarTransacao editartransacao = new EditarTransacao(this, rootPaneCheckingEnabled);
        editartransacao.setVisible(true);
    }//GEN-LAST:event_botaoEditarTransacaoActionPerformed

    private void botaoAdicionarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarCategoriaActionPerformed
        AdicionarCategoria adicionarCategoria = new AdicionarCategoria(this, rootPaneCheckingEnabled);
        adicionarCategoria.setVisible(true);
    }//GEN-LAST:event_botaoAdicionarCategoriaActionPerformed

    private void botaoRemoverCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverCategoriaActionPerformed
        RemoverCategoria removerCategoria = new RemoverCategoria(this, rootPaneCheckingEnabled);
        removerCategoria.setVisible(true);
    }//GEN-LAST:event_botaoRemoverCategoriaActionPerformed

    private void botaoAdicionarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarContaActionPerformed
        AdicionarConta adicionar = new AdicionarConta(this, rootPaneCheckingEnabled);
        adicionar.setVisible(true);
    }//GEN-LAST:event_botaoAdicionarContaActionPerformed

    private void botaoEditarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarContaActionPerformed
        EditarConta editarConta = new EditarConta(this, rootPaneCheckingEnabled);
        editarConta.setVisible(true);
    }//GEN-LAST:event_botaoEditarContaActionPerformed

    private void botaoExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExtratoActionPerformed
        Extrato extrato = new Extrato(this, rootPaneCheckingEnabled);
        extrato.setVisible(true);
    }//GEN-LAST:event_botaoExtratoActionPerformed

    private void botaoRelatorioHistogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRelatorioHistogramaActionPerformed
        Relatorio relatorio = new Relatorio(this, rootPaneCheckingEnabled);
        relatorio.setVisible(true);
    }//GEN-LAST:event_botaoRelatorioHistogramaActionPerformed

    private void botaoEditarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarCategoriaActionPerformed
        EditarCategoria editaCategoria = new EditarCategoria(this, rootPaneCheckingEnabled);
        editaCategoria.setVisible(true);
    }//GEN-LAST:event_botaoEditarCategoriaActionPerformed

    private void botaoSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSobreActionPerformed
        Sobre sobre = new Sobre(this, rootPaneCheckingEnabled);
        sobre.setVisible(true);
    }//GEN-LAST:event_botaoSobreActionPerformed

    private void botaoRemoverContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverContaActionPerformed
        RemoverConta removerConta = new RemoverConta(this, rootPaneCheckingEnabled);
        removerConta.setVisible(true);
    }//GEN-LAST:event_botaoRemoverContaActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        nomeLabel2.setText(Sistema.instance.getUsuarioLogado().getNome());
        emailLabel2.setText(Sistema.instance.getUsuarioLogado().getEmail());
    }//GEN-LAST:event_formWindowGainedFocus


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JPopupMenu.Separator Separador;
    private javax.swing.JMenuItem botaoAdicionarCategoria;
    private javax.swing.JMenuItem botaoAdicionarConta;
    private javax.swing.JMenuItem botaoAdicionarTransacao;
    private javax.swing.JMenu botaoCategoria;
    private javax.swing.JMenu botaoConta;
    private javax.swing.JMenuItem botaoEditarCategoria;
    private javax.swing.JMenuItem botaoEditarConta;
    private javax.swing.JMenuItem botaoEditarPerfil;
    private javax.swing.JMenuItem botaoEditarTransacao;
    private javax.swing.JMenuItem botaoExtrato;
    private javax.swing.JMenu botaoHome;
    private javax.swing.JMenuItem botaoRelatorioHistograma;
    private javax.swing.JMenu botaoRelatorios;
    private javax.swing.JMenuItem botaoRemoverCategoria;
    private javax.swing.JMenuItem botaoRemoverConta;
    private javax.swing.JMenuItem botaoRemoverTransacao;
    private javax.swing.JMenuItem botaoSair;
    private javax.swing.JMenuItem botaoSobre;
    private javax.swing.JMenu botaoTransacao;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JLabel nomeLabel2;
    // End of variables declaration//GEN-END:variables
}
