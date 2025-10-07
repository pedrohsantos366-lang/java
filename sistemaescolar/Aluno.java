package sistemaescolar;
public class Aluno {
    String nome;
    int matricula;
    double notaFinal;
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "carlos pereira";
        aluno.matricula = 201;
        aluno.notaFinal = 7.5;
        System.out.println("Matricula do aluno " +aluno.matricula);
    }
    
}
