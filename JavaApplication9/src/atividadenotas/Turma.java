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
        
        int quantidade = 0;
        float maior = 0, menor = 0;
        String alunoMaior = null;
        String alunoMenor = null;
        float Smedia = 0;
        
        
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
        scan.nextLine();
        
        Aluno[] alunos = new Aluno[quant_aluno];
        
        for(int i = 0; i < quant_aluno; i++){
            alunos[i] = new Aluno();
            System.out.println("Informe o nome do aluno: ");
            alunos[i].setNome(scan.nextLine());
            System.out.println("Informe a nota do aluno: ");
            alunos[i].setNotas(scan.nextFloat());
            scan.nextLine();
            quantidade ++;
            
            Smedia += alunos[i].getNotas();
            
            
        }
        
        for (Aluno aluno : alunos) {
            maior = alunos[0].getNotas();
            menor = alunos[0].getNotas();
            alunoMaior = alunos[0].getNome();
            alunoMenor = alunos[0].getNome();
            if (aluno.getNotas() > maior) {
                maior = aluno.getNotas();
                alunoMaior = aluno.getNome();
            }

            if (aluno.getNotas() < menor) {
                menor = aluno.getNotas();
                alunoMenor = aluno.getNome();
            }
                
                
        }
           
        float media = Smedia/quantidade;

        
        professor.corrigir(quantidade);
        System.out.println("A maior nota é de " + alunoMaior + ", sua nota é: " + maior);
        System.out.println("A menor nota é de " + alunoMenor + ", sua nota é: " + menor);
        System.out.println("A media da turma é de " + media);
        
        
    }
    
}
