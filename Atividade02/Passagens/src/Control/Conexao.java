package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/** Responsável pela conexão com o MySQL. */
public class Conexao {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/Passagens?useSSL=false&serverTimezone=America/Sao_Paulo&allowPublicKeyRetrieval=true";
    private static final String USUARIO = "root";
    private static final String SENHA = "";

    private Connection conexao;

    public boolean conecta() {
        try {
            if (conexao != null && !conexao.isClosed()) {
                return true;
            }
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            return true;
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "Driver MySQL não localizado. Adicione o mysql-connector-j ao projeto.\n" + e.getMessage(),
                    "Erro de conexão", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Não foi possível conectar ao banco Passagens.\n" + e.getMessage(),
                    "Erro de conexão", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    public boolean executeSQL(String sql, Object... parametros) {
        if (!conecta()) return false;
        try (PreparedStatement ps = conexao.prepareStatement(sql)) {
            for (int i = 0; i < parametros.length; i++) {
                ps.setObject(i + 1, parametros[i]);
            }
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public ResultSet retornarResultSet(String sql) {
        if (!conecta()) return null;
        try {
            Statement st = conexao.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar: " + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void desconecta() {
        try {
            if (conexao != null && !conexao.isClosed()) conexao.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fechar o banco: " + e.getMessage());
        }
    }
}
