package com.mycompany.practica_1;

import java.sql.*;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author el profe ariel
 */
public class BDUsuariosMYSQL {

    public LinkedList<Usuario> obtenerTodos() {
        String sql = "SELECT * FROM tbl_usuario";
        LinkedList<Usuario> lista = null;
        MYSQL mysql = new MYSQL();
        ResultSet r = mysql.ejecutarQuery(sql);
        if (r != null) {
            try {
                lista = new LinkedList<>();
                while (r.next()) {
                    
                    int idUsuario = r.getInt("idUsuario");
                    String usuario = r.getString("usuario");
                    String contrasenia = r.getString("contrasenia");
                    int tipo_usuario = r.getInt("tipo_usuario");
                    
                    lista.add(new Usuario(idUsuario, usuario, contrasenia, tipo_usuario));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        return lista;
    }

    public Usuario obtener(String codigo) {
        return null;
    }

    public boolean eliminar(int id) {
        String sql = "delete from  tbl_usuario where idUsuario="
                + id;
        System.out.println(sql);
        MYSQL mysql = new MYSQL();
        return mysql.ejecutarUpdate(sql);
    }

    public boolean actualizar(Usuario usuario) {
        String sql = "update  tbl_usuario set nombre='"
                + usuario.getIdUsuario()+ "',idUsuario='"
                + usuario.getUsuario()+ "',usuario="
                + usuario.getContrasenia()+ ",contrasenia="
                + usuario.getTipo_usuario()+ " where codigo=";
               
        System.out.println(sql);
        MYSQL mysql = new MYSQL();
        return mysql.ejecutarUpdate(sql);
    }

    public boolean registrar(Usuario usuario) {
        String sql = "insert into tbl_usuario values('"
                + usuario.getIdUsuario() + "','"
                + usuario.getUsuario() + "','"
                + usuario.getContrasenia() + "',"
                + usuario.getTipo_usuario() +");";
        System.out.println(sql);
        MYSQL mysql = new MYSQL();
        return mysql.ejecutarUpdate(sql);
    }

}
