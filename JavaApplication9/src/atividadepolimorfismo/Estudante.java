/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadepolimorfismo;

/**
 *
 * @author felipe
 */
public abstract class Estudante extends PessoaAbstract {
    
    @Override
    public void falar(){
        System.out.println("O estudante esta falando com o Secretário");
    }

    @Override
    public void andar() {
        System.out.println("O estudante esta andando para a sala do diretor");
    }
    
    public void respirar(){
        System.out.println("O aluno esta respirando ofegante apos a atividade física");
    }
    
}
