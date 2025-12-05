import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        //Um numero maior que o outro
        int numero1 = 10;
        int numero2 = 25;

        if (numero2 > numero1) {
            System.out.println("O numero: " + numero2 + " é maior!");
        } else {
            System.out.println("O numero: " + numero1 + " é maior!");
        }



        //Desconto de 10% em compras acima R$100
        
        double valorFinal;
        double desconto;
Scanner scan = new Scanner(System.in);
        System.out.println("Insira o valor da compra");
        double valorCompra = scan.nextDouble();

        if(valorCompra >= 100) {
            System.out.println("O valor da compra é de: R$" + valorCompra);
            System.out.println("Desconto de 10% aplicado com sucesso!");
            desconto = valorCompra * 0.10;
            valorFinal = valorCompra - desconto;
            System.out.println("O valor da compra ficou em R$ " + valorFinal);
        } else {
            System.out.println("O valor da compra é abaixo de R$100,\npor isso não houve aplicação de desconto!");
        }


        //Dias da semana
        System.out.println("Insira um dia semana: ");
        String entradaUsuario = scan.next();

        switch (entradaUsuario) {
            case "segunda":
            case "terça":
            case "quarta":
            case "quinta":
            case "sexta":
                    System.out.println(entradaUsuario + " é um dia útil");
                    break;
            case "sábado":
            case "domingo":
                System.out.println(entradaUsuario + " é um final de semana");
                break;
            default:
                System.out.println("Entrada inválida");
        }

        


        //Valor de emprestimo
        

        System.out.println("Digite o valor do empréstimo: ");
        int valorEmprestimo = scan.nextInt();

        if (valorEmprestimo >= 1000 && valorEmprestimo < 5000) {
            System.out.println("O valor foi aceito!");
        } else {
            System.out.printf("O valor %d, não está dentro do intervalo permitido para empréstimo.",  valorEmprestimo);
        
        }
        
        */

        //Formando triângulos

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o 1º lado: ");
        int ladoUm = scan.nextInt();

        System.out.println("Insira o 2º lado: ");
        int ladoDois = scan.nextInt();

        System.out.println("Insira o 3º lado: ");
        int ladoTres = scan.nextInt();

        int somaDosLados = 0;

        if ((ladoUm + ladoDois) > ladoTres) {
            System.out.println("Os lados podem formar um triângulo. ");
        } else {
            System.out.println("Os lados NÃO podem formar um triângulo!");
        }
        

        scan.close();
    }
}