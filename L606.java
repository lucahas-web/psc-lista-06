import java.util.Scanner;

public class L606 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] medias = new double[10];
        double notas;

      
        for (int i = 0; i < 10; i++){
            System.out.println("Digite as notas do aluno " + (i+1));
                double soma = 0;

            for (int j = 0; j < 4; j++){
                System.out.print("Digite a nota " + (j+1) + ": ");
                notas = scanner.nextDouble();
                soma += notas;
            }
            medias[i] = soma/4;
        }

        for (int i = 0; i < 10; i++){
            if (medias[i] >= 7){
                System.out.println("Aluno " + (i+1) + ", média " + medias[i]);
            }
        }

        scanner.close();


        
    }
}
