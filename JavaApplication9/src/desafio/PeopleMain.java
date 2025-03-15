/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

import java.util.Scanner;

/**
 *
 * @author felipe
 * @since 14/03 at 19:51
 */
public class PeopleMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        Cliente c1 = new Cliente();
        
        
       
//        System.out.println("===================================================");
//        System.out.println("                    CLIENTE                        ");
//        System.out.println("===================================================");
//        //c1.setCpf("080.871.951-32");
//        //c1.setNome("Felipe");
//        //c1.setEndereco("Rua 18");
//        //c1.setIdade("19");
//        Cliente c1 = new Cliente("Felipe", "19", "Rua 18", "080.871.951-32");
//        Fornecedor f1 = new Fornecedor();
//        c1.imprimirCliente();
//        System.out.println("===================================================");
//        System.out.println("===================================================");
//        System.out.println("                       Fornecedor                  ");
//        System.out.println("===================================================");
//        
//        
//        f1.setCnpj("999.999.999/0001-99");
//        f1.setNome("Coca Cola");
//        f1.setIdade("90");
//        f1.setEndereco("Rua da cascata");
////        f1.imprimirFornecedor();
        

          System.out.println("Deseja fazer o cadastro de Um cliente ou um fornecedor?");
          String resposta = scan.nextLine().toLowerCase();
          
          while (resposta.equals("sim") || resposta.equals("s")){
              try {
                System.out.println("Digite 1 para cliente e 2 para fornecedor: ");
                int valor = scan.nextInt();
                scan.nextLine();
                switch(valor){
                    case 1: 
                        System.out.println("Informe o nome do cliente: ");
                        c1.setNome(scan.nextLine());
                        System.out.println("Informe o seu cpf: ");
                        String cpf = scan.nextLine();
                        System.out.println("Informe a rua: ");
                        String endereco = scan.nextLine();
                        System.out.println("Informe sua idade: ");
                        String idade = scan.nextLine();
                        System.out.println("Informe o telefone: ");
                        String telefone = scan.nextLine();
                        System.out.println("Informe seu RG: ");
                        String rg = scan.nextLine();
                        
                        
                        System.out.println("Informe o valor do salario: ");
                        double salario = scan.nextDouble();
                        System.out.println("Informe o valor do imposto de renda: ");
                        double imposto_renda = scan.nextDouble();
                        
                        c1.calcularSalarioFinal(salario, imposto_renda);
                        c1.imprimirCliente();
                        
                        
                        break;
                }
                
                  
              } catch (Exception e) {
              }
              
              
          }


            
        
        
        
        
    }
    
}
