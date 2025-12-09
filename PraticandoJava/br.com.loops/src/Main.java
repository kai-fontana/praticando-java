
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
        

        //Calculando o fatorial

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();

        long fatorialNumero = 1;

        for (int i = 1; i <= numero; i++) {
            fatorialNumero *= i; 
        }
        System.out.printf("O fatorial de %d é de: " + fatorialNumero, numero ); 
        

        //Encontrando o maior número
        

        System.out.println("Digite os números separados por espaço: ");

        String[] numerosString = scan.nextLine().split(" ");

        int maiorNumero = Integer.MIN_VALUE;

        for (String numeroString : numerosString) {
            int numero = Integer.parseInt(numeroString);
            if (numero > maiorNumero) {
                maiorNumero = numero;
                
            }
        }
        System.out.println("O maior número é: " + maiorNumero);

         */
        //Limite de tentativas 
        Scanner scan = new Scanner(System.in);
        int senhaCorreta = 123456;

        System.out.println("Insira a sua senha: ");
        int senhaUsuario = scan.nextInt();
        boolean estaCorreta = false;
        do {
            int numeroTentativas = 3;
            int tentativasUsadas = 0;

            if (senhaUsuario == senhaCorreta && tentativasUsadas < numeroTentativas) {
                estaCorreta = true;
                System.out.println("Senha correta! Liberando acesso...");
                break;
            } else if (senhaUsuario != senhaCorreta) {
                estaCorreta = false;
                System.out.println("Senha incorreta. Tente novamente!");
                tentativasUsadas++;
                
                if (tentativasUsadas == numeroTentativas) {
                    System.out.println("O seu número de tentativas se esgotou");
                    break;
                } else {
                    int tentativasRestantes = numeroTentativas - tentativasUsadas;
                    System.out.println("Você ainda tem " + tentativasRestantes + " tentativas restantes.");
                    continue;
                }
            }

        } while (estaCorreta == false);

        scan.close();
    }
}
