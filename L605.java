import java.util.Scanner;

public class L605 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        int contpares = 0;
        int contimpares = 0;

        for (int i = 0; i < 20; i++){
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0){
                pares[contpares] = numeros[i];
                contpares++;
            } else {
                impares[contimpares] = numeros[i];
                contimpares++;
            }
        }
        System.out.println("Os numeros digitados foram: ");
        for (int i = 0; i < 20; i++){
            System.out.println(numeros[i]);
        }
        System.out.println("Os numeros pares foram: ");
        for (int i = 0; i < contpares; i++){
            System.out.println(pares[i]);
        }
        System.out.println("Os numeros impares foram: ");
        for (int i = 0; i < contimpares; i++){
            System.out.println(impares[i]);
        }


        
    }
}
