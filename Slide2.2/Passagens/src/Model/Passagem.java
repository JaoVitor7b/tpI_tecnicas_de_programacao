package Model;

import Control.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/** Entidade e operações CRUD da passagem. */
public class Passagem {
    private final Conexao con = new Conexao();

    private int codigo;
    private String nomePassageiro;
    private String telefone;
    private String rg;
    private String localViagem;
    private String data;
    private String horario;
    private String numPoltrona;

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }
    public String getNomePassageiro() { return nomePassageiro; }
    public void setNomePassageiro(String nomePassageiro) { this.nomePassageiro = nomePassageiro; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public String getRg() { return rg; }
    public void setRg(String rg) { this.rg = rg; }
    public String getLocalViagem() { return localViagem; }
    public void setLocalViagem(String localViagem) { this.localViagem = localViagem; }
    public String getData() { return data; }
    public void setData(String data) { this.data = data; }
    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }
    public String getNumPoltrona() { return numPoltrona; }
    public void setNumPoltrona(String numPoltrona) { this.numPoltrona = numPoltrona; }

    public boolean cadastrar() {
        String sql = "INSERT INTO passagem "
                + "(Codigo, NomePassageiro, Telefone, RG, LocalViagem, Data, Horario, NumPoltrona) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        boolean ok = con.executeSQL(sql, codigo, nomePassageiro, telefone, rg,
                localViagem, data, horario, numPoltrona);
        if (ok) {
            JOptionPane.showMessageDialog(null, "Passagem cadastrada com sucesso!");
        }
        return ok;
    }

    public boolean alterar() {
        String sql = "UPDATE passagem SET NomePassageiro=?, Telefone=?, RG=?, "
                + "LocalViagem=?, Data=?, Horario=?, NumPoltrona=? WHERE Codigo=?";
        boolean ok = con.executeSQL(sql, nomePassageiro, telefone, rg, localViagem,
                data, horario, numPoltrona, codigo);
        if (ok) {
            JOptionPane.showMessageDialog(null, "Passagem alterada com sucesso!");
        }
        return ok;
    }

    public boolean excluir() {
        String sql = "DELETE FROM passagem WHERE Codigo=?";
        boolean ok = con.executeSQL(sql, codigo);
        if (ok) {
            JOptionPane.showMessageDialog(null, "Passagem excluída com sucesso!");
        }
        return ok;
    }

    public ResultSet consultar() {
        return con.retornarResultSet("SELECT Codigo, NomePassageiro, Telefone, RG, LocalViagem, Data, Horario, NumPoltrona FROM passagem ORDER BY Codigo");
    }
}
