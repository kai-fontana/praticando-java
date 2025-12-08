
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* 
        //Contagem de degraus
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de degraus: ");
        int quantidadeDegraus = scan.nextInt();

        for (int i = 1; i <= quantidadeDegraus; i++) {
            System.out.println("Subindo o degrau " + i);

        }
        System.out.println("Você chegou ao topo!");
         
        //Soma de valores

        int[] valores = {10, 20, 30, 40, 50};
        int somaDeValores = 0;

        for (int valor : valores) {
            somaDeValores += valor;
        
        }
        System.out.println("A soma total das receitas é: " + somaDeValores);
        

        //Soma de números pares
        int somaNumerosPares = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {
                somaNumerosPares += i;
            }
        }
        System.out.println("A soma dos números pares de 1 a 100 é: " + somaNumerosPares);
        */

        //Calculando o fatorial
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();

        long fatorialNumero = 1;

        for (int i = 1; i <= numero; i++) {
            fatorialNumero *= i; 
        }
        System.out.printf("O fatorial de %d é de: " + fatorialNumero, numero ); 
        scan.close();
    }
}
