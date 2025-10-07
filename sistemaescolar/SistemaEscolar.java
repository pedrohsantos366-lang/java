package sistemaescolar;

import java.util.Scanner;

public class SistemaEscolar {
    
    public static void main(String[] args) {
        Aluno2[] turma = new Aluno2[3];
        Scanner Leia = new Scanner(System.in);
        System.out.println("------Cadastro de Alunos-------\n");
        for(int i =0; i< turma.length; i++){
            turma[i] = new Aluno2();
            
            System.out.printf("Digite o nome do %dº Aluno: ", i+1);
            turma[i].nome = Leia.nextLine();
            
            System.out.printf("Digite a matriculado %dº aluno: ", i+1);
            turma[i].matricula = Leia.nextInt();
        
            System.out.printf("Digite a nota do %dº Aluno: ", i+1 );
            turma[i].notaFinal = Leia.nextDouble();
            System.out.println("------------------------------\n");

            Leia.nextLine();
        }
        for(int i=0; i< turma.length; i++){
            System.out.printf(" Dados do %dº Aluno sao: \nnome %s \n matricula %d nota: %.2f\n ", i+1, turma[i].nome, turma[i].matricula, turma[i].notaFinal);
        }
        Leia.close();
    }
}
