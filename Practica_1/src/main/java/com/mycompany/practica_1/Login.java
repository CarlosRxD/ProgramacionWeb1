package com.mycompany.practica_1;

import java.util.LinkedList;

/**
 *
 * @author cardo
 */
public class Login {

    public static boolean existeUsuario(String usuario, String contrasenia) {
        BDUsuariosMYSQL bd = new BDUsuariosMYSQL();
        LinkedList<Usuario> usuarios = bd.obtenerTodos();
        if (usuarios == null) {
            return false;
        }
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuario.equals(usuarios.get(i).getUsuario()) && contrasenia.equals(usuarios.get(i).getContrasenia())) {
                return true;
            }
        }
        return false;
    }

    public static void insertarUsuario(int idUsuario, String usuario, String contrasenia, int tipo_usuario) {
        BDUsuariosMYSQL bd = new BDUsuariosMYSQL();
        Usuario u = new Usuario(idUsuario, usuario, contrasenia, tipo_usuario);
        bd.registrar(u);
    }

    public static String obtenerTodo() {
        BDUsuariosMYSQL bd = new BDUsuariosMYSQL();
        LinkedList<Usuario> u = bd.obtenerTodos();
        String tabla = "";
        if (u != null) {
            for (int i = 0; i < u.size(); i++) {
                tabla += "<tr><td>" + u.get(i).getIdUsuario() + "</td><td>"
                        + u.get(i).getUsuario() + "</td><td>" + u.get(i).getContrasenia() + "</td><td>"
                        + u.get(i).getTipo_usuario() + "</td><td><form method=\"post\" action=\"eliminar.jsp\">\n"
                        + "<input type=\"hidden\" id=\"txtID\" name=\"txtID\" value=\"" + u.get(i).getIdUsuario() + "\">"
                        + "            <input type=\"submit\" value=\"Eliminar\">\n"
                        + "        </form></td></tr>";
            }
        }
        return tabla;
    }

    public static void eliminar(int id) {
        BDUsuariosMYSQL bd = new BDUsuariosMYSQL();
        bd.eliminar(id);
    }
}
