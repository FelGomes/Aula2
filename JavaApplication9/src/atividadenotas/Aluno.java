/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadenotas;

/**
 *
 * @author felipe
 */
public class Aluno extends Usuario {
    
    private float notas;
    
    public void estudar(){
        System.out.println("O aluno estudou para essa atividade! ");
    }

    public float getNotas() {
        return notas;
    }

    public void setNotas(float notas) {
        this.notas = notas;
    }
    
    
}
