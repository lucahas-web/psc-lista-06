import java.util.Scanner;

public class L607 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;
        int multi = 1;

      
        for (int i = 0; i < 5; i++){
            System.out.println("Digite o " + (i+1) + "º número: ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
            multi *= numeros[i];
            }
        
        System.out.print("\nOs números digitados foram: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + " ");
            }
        
        System.out.println();
        System.out.println("A soma dos números é " + soma);
        System.out.println("A multiplicação dos números é " + multi);



        scanner.close();


        
    }
}
