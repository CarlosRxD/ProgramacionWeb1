package com.mycompany.practica_1;

import java.sql.*;

public class MYSQL {

    private java.sql.Connection conexion = null;

    public MYSQL() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");            
        } catch (ClassNotFoundException ex) {
            throw new ClassCastException(ex.getMessage());
        }
    }

    public Connection abrir() {
        try {
            if (conexion == null || conexion.isClosed()) {
                System.out.println("conexion cerrada");
                String url = "jdbc:mysql://localhost:3306/Login?user=root&password=12345678&serverTimezone=UTC&useSSL=false";
                conexion = DriverManager.getConnection(url);
                System.out.println("conexion abierta");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return conexion;
    }

    public void cerrar() {
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    //DELETE INSERT UPDATE
    public boolean ejecutarUpdate(String querySQL) {
        try {
            abrir();
            Statement r = conexion.createStatement();
            if (r.executeUpdate(querySQL) != 0) {
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            cerrar();
        }
        return false;
    }

    //SELECT
    public ResultSet ejecutarQuery(String querySQL) {
        try {
            abrir();
            Statement r = conexion.createStatement();
            return r.executeQuery(querySQL);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
