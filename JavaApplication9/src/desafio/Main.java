/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author felipe
 */

  
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in).useLocale(Locale.US);
        Pessoa p = new Pessoa();

        
        System.out.println("----------------------------------");
        System.out.println("              MEDIÇAO             ");
        System.out.println("----------------------------------");
        SaudeIMC s = new SaudeIMC();
        System.out.println("Deseja fazer o calculo do seu IMC? ");
        String resposta = scan.nextLine().toLowerCase();
        
        while(resposta.equals("sim") || (resposta.equals("s"))){
            try {
            System.out.println("Informe seu nome: ");
            p.setNome(scan.nextLine());
            System.out.println("Informe seu CPF: ");
            p.setCpf(scan.nextLine());
            System.out.println("Informe seu peso: ");
            p.setPeso(scan.nextDouble());
            System.out.println("Informe sua altura: ");
            p.setAltura(scan.nextDouble());
            System.out.println("------------------------");
            s.calcIMC(p);
            System.out.println(p.getNome() + " seu IMC É: " + String.format("%.2f", s.calcIMC(p)) + "\n"+ s.verificarfaixaPeso(s.calcIMC(p)));
            System.out.println("------------------------");
            p.toString();
            scan.nextLine();
            
            System.out.println("Desja fazer um novo calculo ?");
            resposta = scan.nextLine().toLowerCase();
                
            } catch (Exception e) {
                System.out.println("Erro na inserção de dados " + e.getMessage());
            }
            
        }
        
    }
   
}
