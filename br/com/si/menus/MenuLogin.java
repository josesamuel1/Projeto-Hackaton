package br.com.si.menus;

import java.util.Scanner;

import br.com.si.data.DataUsers;
import br.com.si.data.Usuario;
import br.com.si.data.*;

/**
 * Classe responsável por exibir o menu de login e autenticar os usuários.
 */
public class MenuLogin {
    static Scanner input = new Scanner(System.in);
    private static boolean usuarioNull = false;

    /**
     * Exibe o menu de login e realiza a autenticação do usuário.
     */
    public static void showMenu() {
        try {
            System.out.print("Email: ");
            String email = input.nextLine();

            System.out.print("Senha: ");
            String senha = input.nextLine();

            for (Usuario usuario : DataUsers.getUsuarios()) {
                if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                    MenuInterfaces.getLimpaTela();
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
            System.out.println("Algum problema encontrado. Voltando pra tela inicial...");
        }
    }
}
