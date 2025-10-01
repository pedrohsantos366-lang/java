public class DivisaoComResto {
    public static void main(String[] args){
        int TotalDeItens = 17;
        int CapacidadeDeCaixa = 5;
        int result = TotalDeItens / CapacidadeDeCaixa;
        int resto = TotalDeItens % CapacidadeDeCaixa;
        System.out.println("Serao preenchidas "+result+" caixas");
        System.out.println("sobrarao "+resto+ " itens");
    }
}
