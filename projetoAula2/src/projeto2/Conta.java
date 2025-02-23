/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto2;

/**
 *
 * @author felipe
 */
public class Conta {
    private double saldo;
    private String nome;

    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    /**
    /**
    /**
     * Acumula no saldo o valor e mais 10% desse valor
     * @param valor - Double - indica o valor a ser depositado 
     * @param porcentagem 
     */
    public void depositar(double valor, double porcentagem){
        this.saldo = saldo + valor + (valor * (porcentagem/100));
    }
}
