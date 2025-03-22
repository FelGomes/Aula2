/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaheranca;

/**
 *
 * @author felipe
 */
public class Leao extends Animal{
    
    private boolean juba;
    
    Leao(){
        
    }

    public Leao(boolean juba, String cor, float tamanho) {
        super(cor, tamanho);
        this.juba = juba;
    }
    
    
    
    

    public boolean isJuba() {
        return juba;
    }

    public void setJuba(boolean juba) {
        this.juba = juba;
    }
    
    
    public String cacar(String animal){
        return (animal);
    }
    
    
    public void imprimirLeao(Leao leao, String comida, String caca){
        System.out.println("O leao tem a cor " + leao.getCor());
        System.out.println("O leao tem a cor " + leao.getTamanho());
        System.out.println("O leao tem juba? " + this.juba);
        System.out.println("O leao esta comendo " +leao.comer(comida));
        System.out.println("O leao esta caçando " +  leao.cacar(caca));
        
    }
}
