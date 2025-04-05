/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadenotas;

import java.util.Scanner;

/**
 *
 * @author felipe
 */
public class Turma {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Professor professor = new Professor();
        
        int quantidade;
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=");
        System.out.println("             BEM VINDO A SALA            ");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=");
        
        System.out.println("Qual é seu nome, professor? ");
        professor.setNome(scan.nextLine());
        System.out.println(professor.getNome() + ", de qual sala o senhor vai corrigir? ");
        professor.setSala(scan.nextLine());
        System.out.println("De qual curso? ");
        professor.setCurso(scan.nextLine());
        System.out.println("Quantos alunos tem nessa sala? ");
        int quant_aluno = scan.nextInt();
        
        Aluno[] alunos = new Aluno[quant_aluno];
        
        for(int i = 0; i < quant_aluno; i++){
            System.out.println("Informe seu nome: ");
            alunos[i] = new aluno();
            alunos[i].setNome(scan.nextLine());
        }
        
        
    }
    
}
