import java.util.Scanner;

public class L603 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }
        System.out.println("As notas inseridas foram:");
        
        for (int i = 0; i <4; i++){
            System.out.println(notas[i]);
        }

        double media = soma/4;
        System.out.println(" A média do aluno é " + media);

        scanner.close();
    }
}