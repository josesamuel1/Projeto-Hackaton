package br.com.si.menus;

import java.util.Scanner;

import br.com.si.data.*;

/**
 * A classe TelaInicial representa a tela inicial do programa, onde são exibidas
 * as opções de menu para o usuário. Permite a navegação para outras telas,
 * como a tela de perfil, gerenciamento de saldo, gerenciamento de cofrinhos,
 * etc.
 */
public class TelaInicial {

    /**
     * Exibe o menu da tela inicial e permite ao usuário navegar para outras telas
     * do programa.
     *
     * @param user o objeto Usuario associado à sessão atual
     */
    public static void showMenu(Usuario user) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem vindo, " + user.getNome() + "!");

        int sair = 0;
        while (sair == 0) {
            try {
                // Mostra o menu da tela inicial do programa.
                System.out.print(MenuInterfaces.getTelaInicial());
                int opcao = Integer.parseInt(input.nextLine());

                switch (opcao) {
                    case 1 -> { // Tela de Perfil
                        TelaPerfil.showMenu(user);
                    }

                    case 2 -> { // Gerenciamento de saldo
                        TelaGerenciamentoDeSaldo.showMenu(user);
                    }

                    case 3 -> { // Gerenciamento de cofrinhos
                        TelaGerenciamentoDeCofrinhos.showMenu(user);
                    }

                    case 4 -> {
                        System.out.println("Saindo da conta...");
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
