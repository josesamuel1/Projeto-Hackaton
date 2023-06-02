package br.com.si.data;

import java.util.ArrayList;

/**
 * Classe que representa uma fonte de dados para os usuários.
 */
public class DataUsers {

    private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();


    /**
     * Adiciona um usuário à lista de usuários.
     *
     * @param user O usuário a ser adicionado.
     */
    public static void adicionarUsuario(Usuario user) {
        usuarios.add(user);
    }


    /**
     * Obtém a lista de usuários.
     *
     * @return A lista de usuários.
     */
    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * Define a lista de usuários.
     *
     * @param usuarios A nova lista de usuários.
     */
    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
