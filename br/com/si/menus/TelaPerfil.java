package br.com.si.menus;

import br.com.si.data.*;
import java.util.Scanner;

/**
 * A classe TelaPerfil representa a tela que exibe as informações do usuário,
 * como nome, email,
 * saldo total e saldo disponível.
 */
public class TelaPerfil {
    /**
     * Exibe as informações do usuário na tela.
     *
     * @param user o objeto Usuario associado à sessão atual
     */
    public static void showMenu(Usuario user) {
        Scanner input = new Scanner(System.in);

        try {
            // Exibe as informações do usuário.
            System.out.println("*-=- Informações do usuário -=-*");
            System.out.println("| Nome: " + user.getNome());
            System.out.println("| Email: " + user.getEmail());
            System.out.println("| CPF: " + user.getCpf());
            System.out.println("| Contato: " + user.getCelular());
            System.out.println("| Saldo total: " + user.getSaldoTotal());
            System.out.println("| Saldo disponível: " + user.getSaldoDisponivel());

            // Pergunta se o usuário quer alterar seus dados.
            System.out.print("Deseja alterar seus dados? (1 - Sim | 2 - Não)\n>");
            int opcao = Integer.parseInt(input.nextLine());

            switch (opcao) {
                // Caso o usuário decida alterar seus dados.
                case 1 -> {
                    // Altera o nome do usuário.
                    System.out.print("Novo nome: ");
                    user.setNome(input.nextLine());

                    // Altera o email do usuário.
                    System.out.print("Novo email: ");
                    user.setEmail(input.nextLine());

                    // Altera a senha do usuário.
                    System.out.print("Nova senha: ");
                    user.setSenha(input.nextLine());

                    // Altera o CPF do usuário.
                    System.out.print("Novo CPF: ");
                    user.setCpf(input.nextLine());

                    // Altera o contato do usuário.
                    System.out.print("Novo telefone: ");
                    user.setCelular(input.nextLine());
                }

                // Caso o usuário não queira alterar seus dados.
                case 2 -> {
                    System.out.println();
                    
                }

                // Opção caso nenhuma das alternativas disponíveis sejam selecionadas.
                default -> {
                    System.out.println("Opção não encontrada.");
                }
            }
        } catch (Exception e) {
            System.out.println("Opção inválida.");
        }
    }
}
