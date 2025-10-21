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
        Scanner scan = new Scanner(System.in);
        double valorFinal;
        double desconto;

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
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um dia semana: ");
        String entradaUsuario = scan.nextLine();

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
        */

        //Valor de emprestimo
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do empréstimo: ");
        double entradaUsuario = scan.nextDouble();
    }
}