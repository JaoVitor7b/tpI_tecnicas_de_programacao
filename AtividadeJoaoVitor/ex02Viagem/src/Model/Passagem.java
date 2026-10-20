/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Control.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Passagem {
    Conexao con = new Conexao();
    private int codigo;
    private String nomePassageiro;
    private String telefone;
    private String rg;
    private String localViagem;
    private String data;
    private String horario;
    private String numPoltrona;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getLocalViagem() {
        return localViagem;
    }

    public void setLocalViagem(String localViagem) {
        this.localViagem = localViagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNumPoltrona() {
        return numPoltrona;
    }

    public void setNumPoltrona(String numPoltrona) {
        this.numPoltrona = numPoltrona;
    }
    
    public void cadastrar(){
        String sql;
        sql= "Insert into passagem(codigo,nome_passageiro,telefone,rg,local_viagem,data_viagem,horario,num_poltrona)values"+ "( "
                + "" + getCodigo()+ " ,'" + getNomePassageiro()+ "' ,'" + getTelefone()+ "', '" + getRg()+ "','"+getLocalViagem()+"','"+getData()+"','"+getHorario()+"','"+getNumPoltrona()+"')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Gravado com Sucesso...");              
    }
    
    public void excluir(){
        String sql;
        sql = "Delete FROM passagem WHERE codigo=" +getCodigo()+ "";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro Excluido com sucesso...");
    }
    
    public void Alterar(){
        String sql;
        sql = "UPDATE passagem set nome_passageiro='" + getNomePassageiro()+"' ,telefone= '" + getTelefone()+ "' ,rg= '" + getRg() + "' ,local_viagem= '" + getLocalViagem() + "' ,data_viagem= '" + getData() + "' ,horario= '" + getHorario() +"' ,num_poltrona= '" + getNumPoltrona() + "' WHERE codigo='" +this.getCodigo()+"' ";
        
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro Alterado com sucesso...");
    }
    
    public ResultSet consultar()
    {
        ResultSet tabela;
        tabela= null;
        
        String sql= "Select * from passagem;";
        tabela= con.RetornarResultset(sql);
        return tabela;
    }
}
