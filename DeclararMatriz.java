public class DeclararMatriz {
    public static void main(String[] args) {
        int [][] tabela ={{1,2,3},{3,2,1,},{4,5,6},{6,5,4,}};
        for (int linha = 0; linha < tabela.length; linha++ ){
            for (int coluna = 0; coluna < tabela[linha].length; coluna++ ){
                System.out.print(tabela[linha][coluna]+" ");
            }
            System.out.println();
        }  
    }
    
}
