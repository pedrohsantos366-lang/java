public class ContadorDeImpar {
    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++){
            if(i %2 == 0){
                System.out.printf("o numero %d e par \n", i);
            }else{
                System.out.printf("o numero %d e impar \n", i);
            }
        }    
    }
}
