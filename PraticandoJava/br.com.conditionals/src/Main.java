
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
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
        
        

        //Formando triângulos

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
        
       


        //Compatibilidade para doar sangue

        System.out.println("Digite a idade do doador: ");
        int idadeDoador = scan.nextInt();
        System.out.println("Digite o peso do doador(em kg): ");
        int pesoDoador = scan.nextInt();

        if(idadeDoador >= 18 && idadeDoador <= 65 && pesoDoador > 50) {
            System.out.println("O doador é compatível.");
        } else if (idadeDoador < 18 || idadeDoador > 65) {
            System.out.println("O doador não é compatível.");
            System.out.println("Motivo: Deve ter entre 18 e 65 anos.");
        } else if (pesoDoador < 50) {
            System.out.println("O doador não é compatível.");
            System.out.println("Motivo: Deve ter mais de 50kg.");
        }


        //Verificação de acesso e de permissões

        final int CODIGO_DE_ACESSO = 2023;

        System.out.println("Digite o código de acesso: ");
        int codigoAcessoUsuario = scan.nextInt();
        System.out.println("Digite o nível de permissão: ");
        int nivelPermissaoUsuario = scan.nextInt();

        boolean nivelEncontrado = false;
        int[] niveisDePermissao = {1, 2, 3};

        for (int nivel : niveisDePermissao) {
            if (nivel == nivelPermissaoUsuario) {
                nivelEncontrado = true;
                break;
            } else {
                nivelEncontrado = false;
            }
        }

        if (codigoAcessoUsuario == CODIGO_DE_ACESSO && nivelEncontrado) {
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");

        } else if (nivelEncontrado == false) {
            System.out.println("Acesso negado.");
            System.out.println("Motivo: Nível de permissão não encontrado.");
        } else if (codigoAcessoUsuario != CODIGO_DE_ACESSO) {
            System.out.println("Acesso negado.");
            System.out.println("Motivo: O código de acesso está incorreto.");
        }
        scan.close();
    }
}
