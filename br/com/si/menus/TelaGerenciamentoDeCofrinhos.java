package br.com.si.menus;

import java.util.Scanner;

import br.com.si.data.Cofrinho;
import br.com.si.data.Usuario;
import br.com.si.data.*;

/**
 * Classe responsável por exibir o menu de gerenciamento de cofrinhos do usuário.
 */
public class TelaGerenciamentoDeCofrinhos {

    /**
     * Exibe o menu de gerenciamento de cofrinhos do usuário.
     *
     * @param user O objeto de usuário que representa o usuário atual.
     */
    public static void showMenu(Usuario user) {
        Scanner input = new Scanner(System.in);
        MenuInterfaces.getLimpaTela();

        int sair = 0;
        while (sair == 0) {
            try {
                // Mostra o menu de gerenciamento da tela de cofrinhos
                System.out.print(MenuInterfaces.getTelaGerenciamentoDeCofrinhos());
                String opcao = input.nextLine();

                switch (opcao) {
                    case "1" -> { // Ver cofrinhos
                        // Caso o usuário não possua cofrinhos
                        if (user.getCofrinhos().isEmpty()) {
                            System.out.println("O usuário não possui cofrinhos.");
                        } else {
                            /*
                             * Caso contrário, vai informar a quantidade de cofrinhos que
                             * ele tem, junto com nome, descrição e saldo guardado no cofrinho.
                             */
                            System.out.println("Cofrinhos encontrados: " + user.getCofrinhos().size());
                            for (int i = 0; i < user.getCofrinhos().size(); i++) {
                                System.out.println("| Nome: " + user.getCofrinhos().get(i).getNome());
                                System.out.println("| Descrição: " + user.getCofrinhos().get(i).getDescricao());
                                System.out.println("| Saldo guardado no cofrinho: RS"
                                        + user.getCofrinhos().get(i).getSaldoGuardado());
                                System.out.println("\n");
                            }
                        }
                    }

                    case "2" -> { // Criar novo cofrinho
                        System.out.print("Nome do cofrinho:\n> ");
                        String nome = input.nextLine();

                        System.out.print("Descrição do cofrinho:\n> ");
                        String descricao = input.nextLine();

                        System.out.println("Saldo atual disponível: " + user.getSaldoDisponivel());

                        /*
                         * Caso onde só poderá ser introduzido um saldo no cofrinho que
                         * seja abaixo ou igual ao saldo disponível na carteira.
                         */
                        int cond = 0;
                        while (cond == 0) {
                            System.out.print("Quanto deseja guardar no cofrinho?\n> ");
                            double guardarSaldo = input.nextDouble();

                            if (guardarSaldo > user.getSaldoDisponivel()) {
                                System.out.println("Saldo investido maior do que o disponível.");
                            } else {
                                /*
                                 * O saldo disponível decresce em "saldoDisponível" e é
                                 * acrescentado o mesmo valor em "saldoGuardado" no cofrinho e,
                                 * também, o novo cofrinho é adicionado na lista de cofrinhos do usuário
                                 */
                                user.alterarSaldoDisponivel(-guardarSaldo);
                                Cofrinho c = new Cofrinho(nome, descricao, guardarSaldo);
                                user.getCofrinhos().add(c);

                                System.out.println("Cofrinho criado com sucesso.");
                                cond = -1;
                            }
                        }
                    }

                    case "3" -> { // Alterar cofrinhos
                        // Caso o usuário não possua cofrinhos.
                        if (user.getCofrinhos().isEmpty()) {
                            System.out.println("O usuário não possui cofrinhos.");
                        } else {
                            // Caso contrário...
                            System.out.print("Qual o nome do cofrinho que deseja alterar?\s>");
                            String nomeCofre = input.nextLine();

                            // Verifica se há algum cofrinho na conta do usuário com o nome citado.
                            for (int i = 0; i < user.getCofrinhos().size(); i++) {
                                if (user.getCofrinhos().get(i).getNome().equals(nomeCofre)) {
                                    // Caso exista, seu nome, descrição e o "saldoGuardado" terão que ser alterados.

                                    /*
                                     * Linha abaixo -> Retorna o saldo que antes estava guardado no cofrinho para
                                     * "saldoDisponível",
                                     * para que assim, o mesmo valor de antes seja alterado sem que haja acréscimos
                                     * ou perdas de valores.
                                     */
                                    user.alterarSaldoDisponivel(+user.getCofrinhos().get(i).getSaldoGuardado());

                                    System.out.print("Novo nome:\n> ");
                                    String novoNome = input.nextLine();
                                    user.getCofrinhos().get(i).setNome(novoNome);

                                    System.out.print("Nova descrição:\n> ");
                                    String novaDesc = input.nextLine();
                                    user.getCofrinhos().get(i).setDescricao(novaDesc);

                                    System.out.print("Novo saldo:\n> RS");
                                    double novoSaldo = input.nextDouble();
                                    user.alterarSaldoDisponivel(-novoSaldo);
                                    user.getCofrinhos().get(i).setSaldoGuardado(novoSaldo);

                                    System.out.println("Dados do cofrinho alterados com sucesso.");
                                } else {
                                    // Caso contrário...
                                    System.out.println("Cofrinho não encontrado.");
                                }
                            }
                        }
                    }

                    case "4" -> { // Excluir cofrinho
                        // Caso o usuário possua cofrinhos.
                        if (user.getCofrinhos().isEmpty()) {
                            System.out.println("O usuário não possui cofrinhos.");
                        } else {
                            // Caso contrário...
                            System.out.print("Qual o nome do cofrinho que deseja apagar?\n>");
                            String nomeCofre = input.nextLine();

                            // Verifica se há algum cofrinho na conta com o nome citado.
                            for (int i = 0; i < user.getCofrinhos().size(); i++) {
                                // Caso exista, ele será excluído e o valor de "saldoDispoivel" será atualizado.
                                if (user.getCofrinhos().get(i).getNome().equals(nomeCofre)) {
                                    /*
                                     * Linha abaixo -> Retorna o saldo que antes estava guardado no cofrinho para
                                     * "saldoDisponível", para que assim, o mesmo valor de antes seja restaurado.
                                     */
                                    user.alterarSaldoDisponivel(+user.getCofrinhos().get(i).getSaldoGuardado());

                                    // Remoção de cofrinho da lista de cofrinhos do usuário
                                    user.getCofrinhos().remove(i);

                                    System.out.println("Cofrinho excluído com sucesso.");
                                }
                            }
                        }
                    }

                    case "5" -> { // Voltar
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
