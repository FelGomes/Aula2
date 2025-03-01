/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

/**
 *
 * @author felipe
 * @since 28/02/2025 at 19:56
 */
public class SaudeIMC {
    
      private double imc;
    
    /**
     * 
     * @param pessoa
     * Metodo para fazer calculo de IMC
     * @return 
     */
    public double calcIMC(Pessoa pessoa){
        imc = pessoa.getPeso()/(pessoa.getAltura() * pessoa.getAltura());
        return imc;
    }
    
    /**
     * 
     * @param imc
     * Metodo para verificar a faixa de IMC do usuario
     * @return 
     */
    public String verificarfaixaPeso(double imc){
        
        String interpretacao;
        
        if(this.imc >= 18.50 && this.imc <= 24.99){
            return interpretacao = "peso normal!";
            
        } else if (this.imc >= 25.00 && this.imc <= 29.99){
            return interpretacao =  "PRÉ-OBESIDADE";
            
        } else if (this.imc >= 30.00 && this.imc <= 34.99){
            return interpretacao =  "OBESIDADE GRAU I";
            
        } else if (this.imc >= 35 && this.imc <= 39.99){
             return interpretacao = "OBESIDADE GRAU II";
            
        } else if (this.imc >= 40){
            return interpretacao = "OBESDIDADE GRAU III";
            
        } else {
             return interpretacao = "MUITO MAGRO";
        }
          
    }
    
}
