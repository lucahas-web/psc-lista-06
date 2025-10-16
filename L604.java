import java.util.Scanner;

public class L604 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] letras = new char[10];
        int consoantes = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "ª caracter: ");
            letras[i] = scanner.next().toLowerCase().charAt(0);
        }
        System.out.println("As consoantes digitadas foram:");
        
        for (int i = 0; i <10; i++){
            char c = letras[i];
            if (c!='a' && c!='e' && c!='i' && c!='o' && c!='u'){
                System.out.println(c);
                consoantes++;
            }
            
        }

        System.out.println("O total de consoantes é " + consoantes);

        scanner.close();
    }
} 