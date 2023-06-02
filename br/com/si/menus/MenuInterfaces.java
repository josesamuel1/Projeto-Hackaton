package br.com.si.menus;

/**
 * Classe que contém as interfaces de usuário utilizadas pelo programa.
 */
public class MenuInterfaces {
    /**
     * Limpa a tela exibindo várias linhas em branco.
     *
     * @return 0.
     */
    private static int limpaTela() {
        for (int i = 0; i <= 50; i++) {
            System.out.println();
        }
        return 0;
    }

    // Interfaces de usuário
    private final static String menuInicial = """
            +-=-=-=-=-=-=-=-=-=-+
            |  1  |  Login      |
            |  2  |  Cadastro   |
            |  3  |  Sair       |
            +-=-=-=-=-=-=-=-=-=-+
            >\s""";

    private final static String telaInicial = """
            +-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-+
            |  1  |  Tela de Perfil         |
            |  2  |  Gerenciar saldo        |
            |  3  |  Gerenciar cofrinhos    |
            |  4  |  Sair                   |
            +-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-+
            >\s""";

    private final static String telaGerenciamentoDeSaldo = """
            +-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-+
            |  1  |  Alterar saldo          |
            |  2  |  Ver saldo disponível   |
            |  3  |  Voltar                 |
            +-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-+
            >\s""";

    private final static String telaGerenciamentoDeCofrinhos = """
            +-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-+
            |  1  |  Ver cofrinhos          |
            |  2  |  Criar novo cofrinho    |
            |  3  |  Alterar cofrinhos      |
            |  4  |  Excluir cofrinho       |
            |  5  |  Voltar                 |
            +-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-+
            >\s""";

    /**
     * Obtém o menu inicial.
     *
     * @return O menu inicial.
     */
    public static String getMenuInicial() {
        return menuInicial;
    }

    /**
     * Obtém a tela inicial.
     *
     * @return A tela inicial.
     */
    public static String getTelaInicial() {
        return telaInicial;
    }

    /**
     * Obtém a tela de gerenciamento de saldo.
     *
     * @return A tela de gerenciamento de saldo.
     */
    public static String getTelaGerenciamentoDeSaldo() {
        return telaGerenciamentoDeSaldo;
    }

    /**
     * Obtém a tela de gerenciamento de cofrinhos.
     *
     * @return A tela de gerenciamento de cofrinhos.
     */
    public static String getTelaGerenciamentoDeCofrinhos() {
        return telaGerenciamentoDeCofrinhos;
    }

    /**
     * Executa a ação de limpar a tela.
     *
     * @return O valor 0.
     */
    public static int getLimpaTela() {
        return limpaTela();
    }
}
