import java.util.Scanner;
public class MediaDeNotas {
    public static void main(String[] args) {
        double not, soma=0;
        int cont = 0;
        Scanner leia = new Scanner(System.in);
        for(int i = 1; i <= 5; i++){
            System.out.println("Digite a "+i+" ° nota");
            not = leia.nextDouble();
            if(not > 10){
                continue;
            }else if(not < 0){
                break;
            }
        }
    }
    
}
