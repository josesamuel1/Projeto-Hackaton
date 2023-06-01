package menus;

import java.util.Scanner;

import data.DataUsers;
import data.Usuario;

public class MenuCadastro {
    static Scanner input = new Scanner(System.in);

    public static void showMenu() {
        try {
            System.out.print("Nome completo: ");
            String nome = input.nextLine();

            System.out.print("Email: ");
            String email = input.nextLine();

            System.out.print("Senha: ");
            String senha = input.nextLine();

            Usuario user = new Usuario(nome, email, senha);
            DataUsers.adicionarUsuario(user);

        } catch (Exception e) {
            System.out.println("Algum problema de digitação encontrado. Voltando pra tela inicial...");
        }
    }
}
