package menus;

import java.util.Scanner;

import data.*;

public class TelaInicial {
    public static void showMenu(Usuario user) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem vindo, " + user.getNome() + "!");

        int sair = 0;
        while (sair == 0) {
            try {
                System.out.print(MenuInterfaces.getTelaInicial());
                int opcao = Integer.parseInt(input.nextLine());

                switch (opcao) {
                    case 1 -> { // Gerenciamento de saldo
                        System.out.println("GERENCIAR SALDO");
                    }

                    case 2 -> {
                        System.out.println("CASO 2");
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

                    case 7 -> {
                        System.out.println("Saindo da conta...");
                        sair = -1;
                    }

                    default -> {
                        System.out.println("Opção não encontrada.");
                    }
                }

            } catch (Exception e) {
                System.out.println("Opção inválida.");
            }
        }
    }
}
