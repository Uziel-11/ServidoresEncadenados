package Modelo;

import java.sql.*;

public class Conector {

    Connection conexcion = null;

    public Connection ConexionsqlServer(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conexcion = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BDESC","sa","Upchiapas"); //SQL Server
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error al Conectar con SQLServer " + e);
        }
        return conexcion;
    }

}
