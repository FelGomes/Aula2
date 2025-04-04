/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesabstract;

/**
 *
 * @author felipe
 */
public class ProgramaAnimalAbstract {
    
    public static void main(String[] args) {
        
      AnimalAbstract gato = new GatoAbstract();
        System.out.println("A cota diaria de leite do gato é de: " + gato.obterCotaDiariaDeLeite());
        
      AnimalAbstract rato = new RatoAbstract();
        System.out.println("A cota diaria de leite do rato é de: " + rato.obterCotaDiariaDeLeite());
      
      
    }
    
}
