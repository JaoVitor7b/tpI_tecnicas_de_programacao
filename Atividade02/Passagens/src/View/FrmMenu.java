package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/** Tela inicial para chamar as telas do projeto. */
public class FrmMenu extends JFrame {
    private final Color MAGENTA = new Color(224, 36, 137);
    private final Color AZUL = new Color(23, 52, 87);

    public FrmMenu() {
        setTitle("Projeto PASSAGEM - Menu Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 450);
        setLocationRelativeTo(null);
        setResizable(false);
        montarTela();
    }

    private void montarTela() {
        JPanel fundo = new JPanel(new BorderLayout());
        fundo.setBackground(new Color(238, 243, 248));

        JPanel topo = new JPanel(new BorderLayout());
        topo.setBackground(MAGENTA);
        topo.setBorder(javax.swing.BorderFactory.createEmptyBorder(22, 20, 22, 20));
        JLabel titulo = new JLabel("PROJETO PASSAGEM", SwingConstants.CENTER);
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Segoe UI", Font.BOLD, 26));
        topo.add(titulo, BorderLayout.CENTER);

        JPanel centro = new JPanel(new GridBagLayout());
        centro.setOpaque(false);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(12, 12, 12, 12);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel subtitulo = new JLabel("Sistema de cadastro de passagens", SwingConstants.CENTER);
        subtitulo.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        subtitulo.setForeground(AZUL);
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
        centro.add(subtitulo, gbc);

        JButton btnPassagens = criarBotao("Passagens", "/icones/cadastros.png");
        JButton btnSair = criarBotao("Sair", "/icones/sair.png");
        gbc.gridwidth = 1; gbc.gridy = 1; gbc.gridx = 0;
        centro.add(btnPassagens, gbc);
        gbc.gridx = 1;
        centro.add(btnSair, gbc);

        btnPassagens.addActionListener(e -> {
            FrmPassagem tela = new FrmPassagem();
            tela.setVisible(true);
        });
        btnSair.addActionListener(e -> System.exit(0));

        JLabel rodape = new JLabel("Escolha uma opção para continuar", SwingConstants.CENTER);
        rodape.setFont(new Font("Segoe UI", Font.ITALIC, 13));
        rodape.setForeground(new Color(90, 90, 90));
        rodape.setBorder(javax.swing.BorderFactory.createEmptyBorder(12, 10, 18, 10));

        fundo.add(topo, BorderLayout.NORTH);
        fundo.add(centro, BorderLayout.CENTER);
        fundo.add(rodape, BorderLayout.SOUTH);
        setContentPane(fundo);
    }

    private JButton criarBotao(String texto, String icone) {
        JButton b = new JButton(texto);
        b.setPreferredSize(new Dimension(190, 80));
        b.setFont(new Font("Segoe UI", Font.BOLD, 16));
        b.setBackground(Color.WHITE);
        b.setForeground(AZUL);
        b.setFocusPainted(false);
        b.setCursor(new Cursor(Cursor.HAND_CURSOR));
        java.net.URL url = getClass().getResource(icone);
        if (url != null) b.setIcon(new ImageIcon(url));
        return b;
    }

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ignored) { }
        java.awt.EventQueue.invokeLater(() -> new FrmMenu().setVisible(true));
    }
}
