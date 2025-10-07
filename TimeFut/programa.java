package TimeFut;

import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        timeDeFut Flamengo = new timeDeFut("Flamengo");
        String nome , posi;
        int tamanho = 3;

        for(int i = 0; i <tamanho; i++ ){
            System.out.printf("digite o nome do %dº jogador: " i+1);
            nome = ler.nextLine();
            System.out.println("digite o nome do %dº jogador: " i+1);
            nome = ler.nextLine();
        }
        
    

    }
}
