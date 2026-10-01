package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexao {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/Clinica?useSSL=false&serverTimezone=UTC";
    private static final String USUARIO = "root";
    private static final String SENHA = "";

    private Connection conexao;
    public Statement statement;
    public ResultSet resultset;

    public boolean conecta() {
        try {
            if (conexao != null && !conexao.isClosed()) return true;
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            return true;
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver MySQL não localizado: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco: " + e.getMessage());
        }
        return false;
    }

    public void desconecta() {
        try {
            if (conexao != null && !conexao.isClosed()) conexao.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fechar o banco: " + e.getMessage());
        }
    }

    public boolean executeSQL(String sql) {
        if (!conecta()) return false;
        try (Statement st = conexao.createStatement()) {
            st.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
            return false;
        }
    }

    public ResultSet RetornarResultset(String sql) {
        if (!conecta()) return null;
        try {
            statement = conexao.createStatement();
            resultset = statement.executeQuery(sql);
            return resultset;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar: " + e.getMessage());
            return null;
        }
    }
}