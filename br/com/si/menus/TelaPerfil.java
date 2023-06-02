package br.com.si.menus;

import br.com.si.data.Usuario;
import br.com.si.data.*;

/**
 * A classe TelaPerfil representa a tela que exibe as informações do usuário, como nome, email,
 * saldo total e saldo disponível.
 */
public class TelaPerfil {

    /**
     * Exibe as informações do usuário na tela.
     *
     * @param user o objeto Usuario associado à sessão atual
     */
    public static void showMenu(Usuario user) {
        System.out.println("*-=- Informações do usuário -=-*");
        System.out.println("| Nome: " + user.getNome());
        System.out.println("| Email: " + user.getEmail());
        System.out.println("| Saldo total: " + user.getSaldoTotal());
        System.out.println("| Saldo disponível: " + user.getSaldoDisponivel());
    }
}
