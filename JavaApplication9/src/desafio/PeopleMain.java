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
        Fornecedor f1 = new Fornecedor();
        
        
       
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
        

        System.out.println("Deseja fazer o cadastro de um cliente ou um fornecedor?");
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
                        c1.setCpf(scan.nextLine());
                        System.out.println("Informe a rua: ");
                        c1.setEndereco(scan.nextLine());
                        System.out.println("Informe sua idade: ");
                        c1.setIdade(scan.nextLine());
                        System.out.println("Informe o telefone: ");
                        c1.setTelefone(scan.nextLine());
                        System.out.println("Informe seu RG: ");
                        c1.setRg(scan.nextLine());

                        System.out.println("Informe o valor do salario: ");
                        c1.setSalario(scan.nextFloat());
                        System.out.println("Informe o valor do imposto de renda: ");
                        c1.setIr(scan.nextFloat());
                        scan.nextLine();
                        
                        c1.fazertabela();
                        c1.calcularSalarioFinal(c1.getSalario(), c1.getIr());
                        c1.imprimirCliente();
                        System.out.println("===========================================");
                        
                        
                    break;
                    case 2:
                            System.out.println("Digite a razao social da empresa: ");
                            f1.setNome(scan.nextLine());
                            System.out.println("DIgite o telefone da empresa: ");
                            f1.setTelefone(scan.nextLine());
                            System.out.println("Digite o tempo de idade da empresa: ");
                            f1.setIdade(scan.nextLine());
                            System.out.println("Digite o endereco da emrpesa: ");
                            f1.setEndereco(scan.nextLine());
                            System.out.println("Digite o Cnpj: ");
                            f1.setCnpj(scan.nextLine());
                            System.out.println("Digite o Rg da empresa: ");
                            f1.setRg(scan.nextLine());
                            
                            System.out.println("Informe o preco do produto a venda R$: ");
                            f1.setValor_produto(scan.nextFloat());
                            System.out.println("Informe o valor do imposto atribulado a esse produto: ");
                            f1.setImposto(scan.nextFloat());
                            scan.nextLine();
                            
                            f1.fazertabela();
                            f1.calcularProduto(f1.getValor_produto(), f1.getImposto());
                            f1.imprimirFornecedor();
                            System.out.println("========================================");
                            
                            
                        break;
                    
                    default:
                        System.out.println("Nao existe essa opçao!");
                        break;
                }
                
                  
            } catch (Exception e) {
                System.out.println("Erro na entrada de dado!" + e.getLocalizedMessage());
            }
            System.out.println("Deseja fazer o cadastro o cadastro novamente? ");
            resposta = scan.nextLine().toLowerCase();
            
              
        }


            
        
        
        
        
    }
    
}
