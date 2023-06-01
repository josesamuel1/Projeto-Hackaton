package menus;

public class MenuInterfaces {
    // Interfaces de usuário
    private final static String menuInicial = """
            +-=-=-=-=-=-=-=-=-=-+
            |  1  |  Login      |
            |  2  |  Cadastro   |
            |  3  |  Sair       |
            +-=-=-=-=-=-=-=-=-=-+
            >\s""";

    private final static String telaInicial = """
            +-=-=-=-=-=-=-=-=-=-=-=-=-=-+
            |  1  |  Gerenciar Saldo    |
            |  2  |  CASO 2             |
            |  3  |  CASO 3             |
            |  4  |  CASO 4             |
            |  5  |  CASO 5             |
            |  6  |  CASO 6             |
            |  7  |  Sair               |
            +-=-=-=-=-=-=-=-=-=-=-=-=-=-+
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
}
