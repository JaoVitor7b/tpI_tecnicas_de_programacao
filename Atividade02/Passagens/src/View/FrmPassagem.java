package View;

import Model.Passagem;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/** Tela de cadastro e CRUD de passagens. */
public class FrmPassagem extends javax.swing.JFrame {
    private final Passagem passagem = new Passagem();
    private final Color MAGENTA = new Color(224, 36, 137);
    private final Color AZUL = new Color(23, 52, 87);
    private final Color FUNDO = new Color(245, 247, 250);

    private JTextField txtCodigo, txtNomePassageiro, txtTelefone, txtRg,
            txtLocalViagem, txtData, txtHorario, txtNumPoltrona;
    private JTable tblPassagem;

    /** JFrame principal do cadastro de passagens. */
    public FrmPassagem() {
        setTitle("Cadastro de Passagens");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1120, 700);
        setMinimumSize(new Dimension(950, 620));
        setLocationRelativeTo(null);
        montarTela();
        consultar();
    }

    private void montarTela() {
        JPanel principal = new JPanel(new BorderLayout(0, 8));
        principal.setBackground(FUNDO);
        principal.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));

        JPanel topo = new JPanel(new BorderLayout());
        topo.setBackground(MAGENTA);
        topo.setBorder(BorderFactory.createEmptyBorder(16, 20, 16, 20));
        JLabel titulo = new JLabel("CADASTRO DE PASSAGENS", SwingConstants.CENTER);
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 24));
        topo.add(titulo, BorderLayout.CENTER);

        JPanel dados = new JPanel(new GridBagLayout());
        dados.setBackground(Color.WHITE);
        dados.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(220, 220, 220)),
                BorderFactory.createEmptyBorder(12, 18, 12, 18)));

        txtCodigo = campo();
        txtNomePassageiro = campo();
        txtTelefone = campo();
        txtRg = campo();
        txtLocalViagem = campo();
        txtData = campo();
        txtHorario = campo();
        txtNumPoltrona = campo();

        adicionarCampo(dados, 0, 0, "Código:", txtCodigo, 1);
        adicionarCampo(dados, 0, 1, "Nome do passageiro:", txtNomePassageiro, 3);
        adicionarCampo(dados, 1, 0, "Telefone:", txtTelefone, 1);
        adicionarCampo(dados, 1, 1, "RG:", txtRg, 1);
        adicionarCampo(dados, 1, 2, "Nº poltrona:", txtNumPoltrona, 1);
        adicionarCampo(dados, 2, 0, "Local da viagem:", txtLocalViagem, 3);
        adicionarCampo(dados, 3, 0, "Data:", txtData, 1);
        adicionarCampo(dados, 3, 1, "Horário:", txtHorario, 1);

        JPanel botoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 12, 8));
        botoes.setBackground(Color.WHITE);
        botoes.setBorder(BorderFactory.createEmptyBorder(2, 0, 2, 0));
        JButton btnCadastrar = criarBotao("Cadastrar", "/icones/novo.png");
        JButton btnAlterar = criarBotao("Alterar", "/icones/pencil.png");
        JButton btnExcluir = criarBotao("Excluir", "/icones/delete.png");
        JButton btnLimpar = criarBotao("Limpar", "/icones/edit_clear.png");
        JButton btnVoltar = criarBotao("Voltar", "/icones/exit.png");
        botoes.add(btnCadastrar); botoes.add(btnAlterar); botoes.add(btnExcluir);
        botoes.add(btnLimpar); botoes.add(btnVoltar);

        JPanel superior = new JPanel(new BorderLayout(0, 5));
        superior.setOpaque(false);
        superior.add(dados, BorderLayout.CENTER);
        superior.add(botoes, BorderLayout.SOUTH);

        String[] colunas = {"Código", "Nome do passageiro", "Telefone", "RG", "Local da viagem", "Data", "Horário", "Poltrona"};
        tblPassagem = new JTable(new DefaultTableModel(new Object[0][8], colunas) {
            @Override public boolean isCellEditable(int row, int column) { return false; }
        });
        tblPassagem.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tblPassagem.setRowHeight(26);
        tblPassagem.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tblPassagem.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        tblPassagem.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) carregarSelecionada();
        });
        JScrollPane scroll = new JScrollPane(tblPassagem);
        scroll.setBorder(BorderFactory.createTitledBorder("Passagens cadastradas"));

        btnCadastrar.addActionListener(e -> cadastrar());
        btnAlterar.addActionListener(e -> alterar());
        btnExcluir.addActionListener(e -> excluir());
        btnLimpar.addActionListener(e -> limpar());
        btnVoltar.addActionListener(e -> dispose());

        principal.add(topo, BorderLayout.NORTH);
        principal.add(superior, BorderLayout.CENTER);
        principal.add(scroll, BorderLayout.SOUTH);
        scroll.setPreferredSize(new Dimension(1000, 285));
        setContentPane(principal);
    }

    private JTextField campo() {
        JTextField t = new JTextField();
        t.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        t.setPreferredSize(new Dimension(170, 32));
        return t;
    }

    private void adicionarCampo(JPanel painel, int linha, int coluna, String texto, JTextField campo, int largura) {
        GridBagConstraints l = new GridBagConstraints();
        l.gridx = coluna * 2; l.gridy = linha;
        l.insets = new Insets(5, 5, 5, 8);
        l.anchor = GridBagConstraints.LINE_END;
        JLabel label = new JLabel(texto);
        label.setFont(new Font("Segoe UI", Font.BOLD, 13));
        label.setForeground(AZUL);
        painel.add(label, l);

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = coluna * 2 + 1; c.gridy = linha;
        c.gridwidth = largura * 2 - 1;
        c.weightx = largura;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(5, 0, 5, 10);
        painel.add(campo, c);
    }

    private JButton criarBotao(String texto, String icone) {
        JButton b = new JButton(texto);
        b.setFont(new Font("Segoe UI", Font.BOLD, 12));
        b.setPreferredSize(new Dimension(125, 48));
        b.setFocusPainted(false);
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        java.net.URL url = getClass().getResource(icone);
        if (url != null) b.setIcon(new ImageIcon(url));
        return b;
    }

    private boolean preencherObjeto() {
        try {
            if (txtCodigo.getText().trim().isEmpty()) throw new NumberFormatException();
            passagem.setCodigo(Integer.parseInt(txtCodigo.getText().trim()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Informe um código numérico válido.", "Validação", JOptionPane.WARNING_MESSAGE);
            txtCodigo.requestFocus();
            return false;
        }
        if (txtNomePassageiro.getText().trim().isEmpty() || txtLocalViagem.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe o nome do passageiro e o local da viagem.", "Validação", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        passagem.setNomePassageiro(txtNomePassageiro.getText().trim());
        passagem.setTelefone(txtTelefone.getText().trim());
        passagem.setRg(txtRg.getText().trim());
        passagem.setLocalViagem(txtLocalViagem.getText().trim());
        passagem.setData(txtData.getText().trim());
        passagem.setHorario(txtHorario.getText().trim());
        passagem.setNumPoltrona(txtNumPoltrona.getText().trim());
        return true;
    }

    private void cadastrar() {
        if (preencherObjeto() && passagem.cadastrar()) {
            consultar();
            limpar();
        }
    }

    private void alterar() {
        if (preencherObjeto() && passagem.alterar()) {
            consultar();
            limpar();
        }
    }

    private void excluir() {
        try {
            passagem.setCodigo(Integer.parseInt(txtCodigo.getText().trim()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Informe o código da passagem que deseja excluir.", "Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int opcao = JOptionPane.showConfirmDialog(this,
                "Deseja realmente excluir a passagem " + passagem.getCodigo() + "?",
                "Confirmar exclusão", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION && passagem.excluir()) {
            consultar();
            limpar();
        }
    }

    public void consultar() {
        ResultSet tabela = passagem.consultar();
        DefaultTableModel modelo = (DefaultTableModel) tblPassagem.getModel();
        modelo.setRowCount(0);
        if (tabela == null) return;
        try {
            while (tabela.next()) {
                modelo.addRow(new Object[]{
                    tabela.getInt("Codigo"),
                    tabela.getString("NomePassageiro"),
                    tabela.getString("Telefone"),
                    tabela.getString("RG"),
                    tabela.getString("LocalViagem"),
                    tabela.getString("Data"),
                    tabela.getString("Horario"),
                    tabela.getString("NumPoltrona")
                });
            }
            tabela.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(this, "Erro ao preencher tabela: " + erro.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void carregarSelecionada() {
        int linha = tblPassagem.getSelectedRow();
        if (linha < 0) return;
        txtCodigo.setText(String.valueOf(tblPassagem.getValueAt(linha, 0)));
        txtNomePassageiro.setText(String.valueOf(tblPassagem.getValueAt(linha, 1)));
        txtTelefone.setText(String.valueOf(tblPassagem.getValueAt(linha, 2)));
        txtRg.setText(String.valueOf(tblPassagem.getValueAt(linha, 3)));
        txtLocalViagem.setText(String.valueOf(tblPassagem.getValueAt(linha, 4)));
        txtData.setText(String.valueOf(tblPassagem.getValueAt(linha, 5)));
        txtHorario.setText(String.valueOf(tblPassagem.getValueAt(linha, 6)));
        txtNumPoltrona.setText(String.valueOf(tblPassagem.getValueAt(linha, 7)));
    }

    private void limpar() {
        txtCodigo.setText(""); txtNomePassageiro.setText(""); txtTelefone.setText(""); txtRg.setText("");
        txtLocalViagem.setText(""); txtData.setText(""); txtHorario.setText(""); txtNumPoltrona.setText("");
        tblPassagem.clearSelection();
        txtCodigo.requestFocus();
    }
}
