import java.util.Scanner;

import menus.*;

public class main {
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
