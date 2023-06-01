package menus;

public class MenuInterfaces {
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
            |  4  |  CASO 4                 |
            |  5  |  CASO 5                 |
            |  6  |  CASO 6                 |
            |  7  |  Sair                   |
            +-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-+
            >\s""";

    private final static String telaGerenciamentoDeSaldo = """
            +-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-+
            |  1  |  Alterar saldo          |
            |  2  |  Ver saldo disponível   |
            |  3  |  CASO 3                 |
            |  4  |  CASO 4                 |
            |  5  |  CASO 5                 |
            |  6  |  CASO 6                 |
            |  7  |  Voltar                 |
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

    /*
     * -----------------------------------------------------------------------------
     */

    // Getters
    public static String getMenuInicial() {
        return menuInicial;
    }

    public static String getTelaInicial() {
        return telaInicial;
    }

    public static String getTelaGerenciamentoDeSaldo() {
        return telaGerenciamentoDeSaldo;
    }

    public static String getTelaGerenciamentoDeCofrinhos() {
        return telaGerenciamentoDeCofrinhos;
    }

    public static int getLimpaTela() {
        return limpaTela();
    }
}
