package Model;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Control.Conexao;

public class Paciente {

    Conexao con = new Conexao();

    private int CodPaciente;
    private String Nome;
    private String Endereco;
    private String Complemento;
    private String Rg;
    private String Cpf;
    private String Data;

    // GETTERS E SETTERS

    public int getCodPaciente() {
        return CodPaciente;
    }

    public void setCodPaciente(int CodPaciente) {
        this.CodPaciente = CodPaciente;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String Rg) {
        this.Rg = Rg;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    // CADASTRAR

    public void cadastrar() {

        String sql;

        sql = "INSERT INTO paciente "
                + "(CodPaciente, Nome, Endereco, Complemento, Rg, Cpf, Data) "
                + "VALUES ("
                + getCodPaciente() + ", "
                + "'" + getNome() + "', "
                + "'" + getEndereco() + "', "
                + "'" + getComplemento() + "', "
                + "'" + getRg() + "', "
                + "'" + getCpf() + "', "
                + "'" + getData() + "')";

        con.executeSQL(sql);

        JOptionPane.showMessageDialog(
                null,
                "Paciente cadastrado com sucesso!"
        );
    }

    // EXCLUIR

    public void excluir() {

        String sql;

        sql = "DELETE FROM paciente "
                + "WHERE CodPaciente = " + getCodPaciente();

        con.executeSQL(sql);

        JOptionPane.showMessageDialog(
                null,
                "Paciente excluído com sucesso!"
        );
    }

    // ALTERAR

    public void alterar() {

        String sql;

        sql = "UPDATE paciente SET "
                + "Nome = '" + getNome() + "', "
                + "Endereco = '" + getEndereco() + "', "
                + "Complemento = '" + getComplemento() + "', "
                + "Rg = '" + getRg() + "', "
                + "Cpf = '" + getCpf() + "', "
                + "Data = '" + getData() + "' "
                + "WHERE CodPaciente = " + getCodPaciente();

        con.executeSQL(sql);

        JOptionPane.showMessageDialog(
                null,
                "Paciente alterado com sucesso!"
        );
    }

    // CONSULTAR

    public ResultSet consultarr() {
        
        ResultSet tabela;
        tabela = null;
        
        String sql;
        sql = "SELECT * FROM paciente";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
}