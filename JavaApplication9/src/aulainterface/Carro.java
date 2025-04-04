/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulainterface;

/**
 *
 * @author felipe
 */
public class Carro implements Veiculo {
    
    @Override
    public void iniciar(){
        System.out.println("O carro começou a andar");
    }
    
    @Override
    public void parar(){
        System.out.println("O carro esta parando!");
        
    }
    
    
    
}
