import java.util.Scanner;
        public class Alunos {
            String nome;
            int matricula;
            double notaFinal;
           
            void verificarAprovado(){
                if (notaFinal >= 7){
                    System.out.println(nome + "esta APROVADO");
                }else{
                    System.out.println(nome + "esta REPROVADO");
                }
            }
            public static void main(String[] args) {
            Alunos[] turma = new Alunos[3];
            Scanner Leia = new Scanner(System.in);
            System.out.println("------Cadastro de Alunos-------\n");
            for(int i =0; i< turma.length; i++){
                turma[i] = new Alunos();
                
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
                turma[i].verificarAprovado();
            }
            Leia.close();
        }
        }
        
