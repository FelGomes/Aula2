/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

/**
 *
 * @author felipe
 */
public class Fornecedor extends People {
    
    private String cnpj;
    private float valor_produto, imposto;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public float getValor_produto() {
        return valor_produto;
    }

    public void setValor_produto(float valor_produto) {
        this.valor_produto = valor_produto;
    }

    public float getImposto() {
        return imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }
    
    
    public void imprimirFornecedor(){
        System.out.println("O nome do fornecedor é: " + this.getNome());
        System.out.println("O endereco do fornecedor é: " + this.getEndereco());
        System.out.println("O cnpj do fornecedor é " + this.getCnpj());
        System.out.println("A idade da empresa é de: " + this.getIdade() + " anoss");
        System.out.println("O telefone da empresa é de: " + this.getTelefone());
        System.out.println("O Rg da empresa: " + this.getRg());
        System.out.println("O valor do produto com imposto é de R$:" +this.calcularProdutor(valor_produto, imposto));
    }
    
    
    public float calcularProdutor(float valor_produto, float imposto){
        return valor_produto + imposto;
    }
            
}
