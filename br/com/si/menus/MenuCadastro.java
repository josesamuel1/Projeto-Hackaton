package br.com.si.menus;

import java.util.Scanner;

import br.com.si.data.DataUsers;
import br.com.si.data.Usuario;

/**
 * Classe que representa o menu de cadastro de usuários.
 */
public class MenuCadastro {
    static Scanner input = new Scanner(System.in);

    /**
     * Exibe o menu de cadastro de usuários.
     */
    public static void showMenu() {
        try {
            System.out.print("Nome completo: ");
            String nome = input.nextLine();

            System.out.print("Email: ");
            String email = input.nextLine();

            System.out.print("Senha: ");
            String senha = input.nextLine();

            System.out.print("CPF: ");
            String cpf = input.nextLine();

            System.out.println("Telefone: ");
            String cel = input.nextLine();

            Usuario user = new Usuario(nome, email, senha, cpf, cel);
            DataUsers.adicionarUsuario(user);

        } catch (Exception e) {
            System.out.println("Algum problema encontrado. Voltando pra tela inicial...");
        }
    }
}
