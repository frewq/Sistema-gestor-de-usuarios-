package clases;

import java.sql.*;

public class Coneccion {

    public static Connection conectar() {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3999/bd_ds", "root", "fabian");
            return cn;
        } catch (SQLException ev) {
            System.out.println("Error de conexión local a la Base de datos " + ev);
        }
        return (null);
    }
}
