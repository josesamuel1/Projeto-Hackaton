package menus;

import java.util.Scanner;

import data.*;
import menus.TelaInicial;

public class MenuLogin {
    static Scanner input = new Scanner(System.in);
    private static boolean usuarioNull = false;

    public static void showMenu() {
        try {
            System.out.print("Email: ");
            String email = input.nextLine();

            System.out.print("Senha: ");
            String senha = input.nextLine();

            for (Usuario usuario : DataUsers.getUsuarios()) {
                if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                    TelaInicial.showMenu(usuario);
                    usuarioNull = true;
                } else {
                    usuarioNull = false;
                }
            }

            if (!usuarioNull) {
                System.out.println("Usuário não encontrado.");
            }

        } catch (Exception e) {
            System.out.println("Algum problema de digitação encontrado. Voltando pra tela inicial...");
        }
    }
}
