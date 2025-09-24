public class mediaAprovado {
    public static void main(String[] args) {
        double av1 = 10, av2 = 10;
        double media = (av1 + av2)/2;
        if(media >=7){
            System.out.println("aprovado");
        }else if(media == 10){
            System.out.println("aprovado parabens");
        }else if(media < 7){
            System.out.println("reprovado");
        }
    }
    
}
