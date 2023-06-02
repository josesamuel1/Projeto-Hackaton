package br.com.si.menus;

import java.util.Scanner;

import br.com.si.data.*;

/**
 * Classe responsável por exibir o menu de gerenciamento de saldo do usuário.
 */
public class TelaGerenciamentoDeSaldo {

    /**
     * Exibe o menu de gerenciamento de saldo do usuário.
     * O método exibe um menu com opções relacionadas ao saldo do usuário,
     * como alterar o saldo e ver o saldo disponível. O usuário pode escolher
     * uma opção digitando o número correspondente. O método realiza as ações
     * de acordo com a opção selecionada e exibe mensagens adequadas.
     * Caso seja selecionada a opção "Voltar", o loop é interrompido e o usuário
     * retorna ao menu anterior.
     *
     * @param user O objeto de usuário que representa o usuário atual.
     */
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

                    case 3 -> { // Voltar
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
