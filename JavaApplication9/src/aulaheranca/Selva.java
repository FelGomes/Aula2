/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaheranca;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author felipe
 * @since 21/03 at 19:30
 */
public class Selva {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
        
       Leao leao = new Leao();
       Cavalo cavalo = new Cavalo();
       Cavalo ocavalo2 = new Cavalo("mustang", "cinza", 2);
       Leao oleao2 = new Leao(true, "preto", (float) 1.90);
       
       
        System.out.println("Seja bem vindo a SELVA!!!");
        System.out.println("=========================");
        
        System.out.println("Qual é o tamanho do leao? ");
        leao.setTamanho(scan.nextFloat());
        System.out.println("Qual é o tamanho do cavalo? ");
        cavalo.setTamanho(scan.nextFloat());
        scan.nextLine();
        System.out.println("Qual é a cor do leao? ");
        leao.setCor(scan.nextLine());
        System.out.println("Qual é a cor do cavalo? ");
        cavalo.setCor(scan.nextLine());
        System.out.println("O leao tem juba ?");
        leao.setJuba(scan.nextBoolean());
        scan.nextLine();
        System.out.println("Qual é a raça do cavalo? ");
        cavalo.setRaca(scan.nextLine());
        
        System.out.println("O que o leao esta comendo? ");
        String comidaL = scan.nextLine();
        System.out.println("O que o cavalo esta comendo? ");
        String comidaC = scan.nextLine();
        System.out.println("Para onde o cavalo esta fugindo? ");
        String lugar = scan.nextLine();
        System.out.println("O que o leao esta caçando? ");
        String caca = scan.nextLine();
        
        
        leao.imprimirLeao(leao, comidaL, caca);
        System.out.println("-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        cavalo.imprimirCavalo(cavalo, lugar, comidaC);
        System.out.println("Cavalo 2: " + ocavalo2.getRaca() + ocavalo2.getTamanho() + ocavalo2.getCor());
        System.out.println("Leao 2: " + oleao2.getCor() + oleao2.getTamanho() + oleao2.isJuba());
       
       
    }
    
}
