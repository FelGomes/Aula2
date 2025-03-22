/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaheranca;

/**
 *
 * @author felipe
 * @since 21/03 at 19:30
 */
public class Animal {
    
    private String cor;
    private float tamanho;
    
    Animal(){
        
    }

    public Animal(String cor, float tamanho) {
        this.cor = cor;
        this.tamanho = tamanho;
    }
    


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }
    
    public String comer(String comida){
        return (comida);
    }
    
}
