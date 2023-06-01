package menus;

import data.*;

public class TelaPerfil {
    public static void showMenu(Usuario user) {
        System.out.println("*-=- Informações do usuário -=-*");
        System.out.println("| Nome: " + user.getNome());
        System.out.println("| Email: " + user.getEmail());
        System.out.println("| Saldo total: " + user.getSaldoTotal());
        System.out.println("| Saldo disponível: " + user.getSaldoDisponivel());
    }
}
