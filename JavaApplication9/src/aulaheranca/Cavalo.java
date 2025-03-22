/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaheranca;

/**
 *
 * @author felipe
 */
public class Cavalo extends Animal {
    
    private String raca;

    Cavalo() {
        
    }
    
    
    public Cavalo(String raca, String cor, float tamanho) {
        super(cor, tamanho);
        this.raca = raca;
    }
    

    
    
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    
    public String fugir(String lugar){
        return ("O cavalo esta fugindo para" + lugar);
        
    }
    
    public void imprimirCavalo(Animal animal, String lugar, String comida){;
        System.out.println("O cavalo tem o tamanho de " + animal.getTamanho());
        System.out.println("O Cavalo tem a cor " + animal.getCor());
        System.out.println("O cavalo é da raça " + this.raca);
        System.out.println("O cavalo esta fugindo " + fugir(lugar));
        System.out.println("O cavalo esta comendo " + animal.comer(comida));
        
    }
    
}
