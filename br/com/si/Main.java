package br.com.si;

import java.util.Scanner;

import br.com.si.menus.MenuCadastro;
import br.com.si.menus.MenuInterfaces;
import br.com.si.menus.MenuLogin;
import br.com.si.menus.*;

/**
 * Classe principal que inicia a execução do programa e exibe o menu inicial.
 */
public class Main {

    /**
     * Método principal que é executado quando o programa é iniciado.
     *
     * @param args os argumentos de linha de comando
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MenuInterfaces.getLimpaTela();

        int sair = 0;
        while (sair == 0) {
            try {
                System.out.print(MenuInterfaces.getMenuInicial());
                int opcao = Integer.parseInt(input.nextLine());

                switch (opcao) {
                    // Login
                    case 1 -> {
                        MenuInterfaces.getLimpaTela();
                        MenuLogin.showMenu();
                    }

                    // Cadastro
                    case 2 -> {
                        MenuInterfaces.getLimpaTela();
                        MenuCadastro.showMenu();
                    }

                    // Sair
                    case 3 -> {
                        System.out.println("Volte sempre!");
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
