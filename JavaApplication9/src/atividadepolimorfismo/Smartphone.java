/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadepolimorfismo;

/**
 *
 * @author felipe
 */
public class Smartphone implements Gps, Radio{
    
    @Override
    public void obterCoordenadas(){
        //retornar coordenadas
        System.out.println("Cordenada: 09123414-12");
    }
    
    @Override
    public void ligarRadio(){
        System.out.println("O radio esta ligado");
    }
    
    @Override
    public void pararRadio(){
        System.out.println("O radio esta desligado");
    }
}
