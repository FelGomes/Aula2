/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

/**
 *
 * @author felipe
 */
public class Cliente extends People {
    
    private String cpf;
    private double salario, ir;

    Cliente() {
        
    }
   
    
    public void Cliente(){
    }
    
    
    public Cliente(String nome, String idade, String endereco, String telefone, String Rg, String cpf, double salario, double ir){
        super(nome, idade, endereco, telefone, Rg);
        this.cpf = cpf;
        this.ir = ir;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public double getIr() {
        return ir;
    }

    public void setIr(float ir) {
        this.ir = ir;
    }
    
    
    
    public void imprimirCliente(){
        System.out.println("O cpf do cliente é: " + this.getCpf());
        System.out.println("Nome do cliente é: " + super.getNome());
        System.out.println("O cliente tem " + this.getIdade() + " anos");
        System.out.println("O endereco do cliente é " + this.getEndereco());
        System.out.println("O valor do seu salario final descontado o imposto de renda é" + calcularSalarioFinal(salario, ir));
        
    }
    
    
    
    public double calcularSalarioFinal(double salario, double ir){
        return salario = salario - ir;
    }
}
