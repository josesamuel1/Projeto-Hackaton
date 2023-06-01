package data;

import java.util.ArrayList;

public class DataUsers {
    private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    // Métodos
    public static void adicionarUsuario(Usuario user) {
        usuarios.add(user);
    }

    // Getters & Setters
    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
