package menus;

import java.util.Scanner;

import data.Usuario;

public class TelaGerenciamentoDeSaldo {
    public static void showMenu(Usuario user) {
        Scanner input = new Scanner(System.in);
        MenuInterfaces.getLimpaTela();

        int sair = 0;
        while (sair == 0) {
            try {
                System.out.print(MenuInterfaces.getTelaGerenciamentoDeSaldo());
                int opcao = Integer.parseInt(input.nextLine());

                switch (opcao) {
                    case 1 -> { // Alterar saldo
                        System.out.println("Saldo atual: " + user.getSaldoTotal());

                        System.out.print("Digite um novo valor para seu saldo:\n> RS");
                        double novoSaldo = input.nextDouble();
                        user.setSaldoTotal(novoSaldo);

                        System.out.println("Novo saldo alterado com sucesso para: " + user.getSaldoTotal());
                    }

                    case 2 -> { // Ver saldo disponível
                        System.out.println("Seu saldo disponível é de RS" + user.getSaldoDisponivel());
                    }

                    case 3 -> {
                        System.out.println("CASO 3");
                    }

                    case 4 -> {
                        System.out.println("CASO 4");
                    }

                    case 5 -> {
                        System.out.println("CASO 5");
                    }

                    case 6 -> {
                        System.out.println("CASO 6");
                    }

                    case 7 -> { // Voltar
                        sair = -1;
                    }

                    default -> {
                        System.out.println("Opção não encontrada.");
                    }
                }

            } catch (Exception e) {
                System.out.println("Opção inválida.");
                continue;
            }
        }
    }
}
