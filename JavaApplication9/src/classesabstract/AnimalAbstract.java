/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesabstract;

/**
 *
 * @author felipe
 */
public abstract class AnimalAbstract {
    
    public abstract double obterCotaDiariaDeLeite();
    
    //Tambem é permitido que se cria metodos não abstratos para classes abstrata
    public void impimir(){
        System.out.println("SO TESTANDO!!!!");
    }
    
}
