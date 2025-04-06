/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadenotas;

/**
 *
 * @author felipe
 */
public class Professor extends Usuario {

    @Override
    public void estudar() {
        System.out.println("O professor estudou para dar essa aula");
    }
    
    public void corrigir(int quantidade){
        System.out.println("O professor corrigiu " + quantidade + " notas dessa sala! ");
    }
    
    
    
}
