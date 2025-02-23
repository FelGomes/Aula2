/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto2;

import java.util.Scanner;

/**
 *
 * @author felipe
 */
public class Main {
    public static void menu(){
            System.out.println("----------------------");
            System.out.println("        M E N U       ");
            System.out.println("----------------------");
            System.out.println("Digite 0 para sair");
            System.out.println("Digite 1 para continuar");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Conta conta1 = new Conta();

      
        System.out.println("Deseja fazer um calculo? ");
        String resposta = scan.nextLine().toLowerCase();
        
        while(resposta.equals("sim") || resposta.equals("s")){
            menu();
            System.out.println("Deseja escolher qual opçao? ");
            int num = scan.nextInt();
            scan.nextLine();
            switch(num){
                case 0:
                    System.out.println("Saindo...");
                   
                    break;
                case 1:
                    System.out.println("Informe seu nome: ");
                    String nome = scan.nextLine();
                    System.out.println("Informe o valor que deseja depositar: ");
                    Double valor = scan.nextDouble();
                    System.out.println("Informe o percentual que voce deseja que tenha: ");
                    Double percentual = scan.nextDouble();
                    scan.nextLine();
                    conta1.setNome(nome);
                    conta1.depositar(valor, percentual);
                    System.out.println(conta1.getNome() + " o seu saldo com a porcentagem é de R$: " + conta1.getSaldo());
                    break;
                default:
                    System.out.println("valor invalido!");
                    break;
            }

            System.out.println("Deseja fazer outro calculo?");
            resposta = scan.nextLine();
            
        }
       
        
        
        
       /* Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        
        conta1.setNome("Felipe");
        conta2.setNome("Gustavo");
        
        //Depositando valores na conta!!
        
        conta1.depositar(50);
        conta2.depositar(10);
        //CTRL + SHIFT + SETA ele copia tudo que esta em cima para baixo, duplica
        System.out.println("Conta1: Nome: " + conta1.getNome());
        System.out.printf("Conta 1: Saldo: %.5f \n", conta1.getSaldo());
        System.out.println("Conta 2: Nome: " + conta2.getNome());
        System.out.printf("Conta 2: Saldo: %.3f ",conta2.getSaldo());
        
        
        // %.0F ", serve para add numeros depois da virgula, antes da letra f, serve pra escolher a quantidade de numeros que vai aparecer depois da virgula de um numero */
        
        
        
    }
}


