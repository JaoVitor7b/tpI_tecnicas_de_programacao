/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetocalculadoraoo;

import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Calculadora {
    private double num1;
    private double num2;
    private double result;

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
   
    //Metodo sem parametro e sem retorno
    public void Somar(){
        setNum1 (Double.parseDouble(JOptionPane.showInputDialog("Digite o número da soma")));
        setNum2 (Double.parseDouble(JOptionPane.showInputDialog("Digite o número da soma")));
        setResult (getNum1() + getNum2());
        JOptionPane.showMessageDialog(null, "O valor da soma é" + getResult());    
        
    }
    
    //Metodo com parametro e sem retorno
    public void Subtrair(double a, double b){
        setResult(a - b);
        JOptionPane.showMessageDialog(null, "O valor da subtracao é" + getResult());
    }
    //Metodo com retorno sem parametro
    public double Multiplicar(){
        setNum1 (Double.parseDouble(JOptionPane.showInputDialog("Digite o número da soma")));
        setNum2 (Double.parseDouble(JOptionPane.showInputDialog("Digite o número da soma")));
        setResult(getNum1() * getNum2());
        return getResult();
    }
    //Metodo com parametro e com retorno
public double divisao(double a, double b) {
    setResult(a / b);
    return getResult();
}
}

