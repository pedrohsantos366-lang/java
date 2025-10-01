import java.util.Scanner;

public class ListaDeCompras { 
    public static void main(String[] args) { 
        
        Scanner sc = new Scanner(System.in); 
        String[] itens = new String[5]; 
        
        for (int i = 0; i < itens.length; i++) { 
            System.out.print("Digite o item " + (i + 1) + ": ");
            itens[i] = sc.nextLine();
            System.out.println("Item " + (i + 1) + " armazenado: " + itens[i]);   
        }
    }
}