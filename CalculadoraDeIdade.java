public class CalculadoraDeIdade {
    public static void main(String[] args) {
        int idd = 11;
        if(idd <= 11){
            System.out.println("criança");
        }else if(idd <=18){
            System.out.println("adolescente");
        }else if(idd <=60){
            System.out.println("adulto");
        }else if(idd >= 61){
            System.out.println("idoso");
        }
    }
}
