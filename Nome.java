import java.util.Scanner;
public class Nome {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        System.out.println("Qual seu nome");
        String nome = leia.nextLine();
        System.out.println("Ola " + nome + "!");
    }
    
}
