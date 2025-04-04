/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapolimorfismo;

/**
 *
 * @author felipe
 */
public class ProgramaOperacaoMatematica {
    //Utilizando  o polimorfismo 
    //Utilizando o metodo static para poder utilizar dentro da mesma classe
    public static void calculaOperacao(OperacaoMatematica operacao, double x, double y){
        System.out.println(operacao.calcular(x, y));
    }
    
    public static void main(String[] args) {
        
        calculaOperacao(new Soma(), 10,10);
        calculaOperacao(new Subtrair(), 10,10);
        calculaOperacao(new Dividir(), 10,10);
        calculaOperacao(new Multiplicar(), 10,10);
        
        
    }
}
