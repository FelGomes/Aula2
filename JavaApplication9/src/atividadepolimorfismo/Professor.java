/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadepolimorfismo;

/**
 *
 * @author felipe
 */
public class Professor extends PessoaAbstract {
    
    @Override
    public void falar(){
        System.out.println("O professor esta falando com a turma sobre o trabalho");
    }
    
    @Override
    public void andar(){
        System.out.println("O professor esta andando para a sala dos professores, porque esta no intervalo");
    }
    
    @Override
    public void respirar(){
        System.out.println("O professor esta respirando! ");
    }
}
