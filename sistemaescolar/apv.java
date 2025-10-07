package sistemaescolar;
public class apv {
    
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
void MostrarDados(int num){
    System.out.println("dados do %dº aluno \n nome:");
}
}