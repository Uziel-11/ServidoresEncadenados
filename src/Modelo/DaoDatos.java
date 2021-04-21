package Modelo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoDatos {

    private Connection conexcion = null;

    public DaoDatos(){
        Conector conector = new Conector();
        conexcion = conector.ConexionsqlServer();
    }



    public ObservableList<Datos> getdato(){
        //String sql = "SELECT * FROM MYSQLLOCAL...ciudad INNER JOIN MYSQLLOCAL...estado ON ciudad.idEstado = estado.idEstado";
        String sql = "SELECT alumno.idAlumno, alumno.Nombre, ciudad.Nombre ,estado.Nombre, usuario.Nombre  FROM bdesc.dbo.alumno alumno " +
                "LEFT JOIN POSTGRESQL...usuario usuario ON alumno.idUsuario = usuario.idUsuario  LEFT JOIN MYSQLLOCAL...ciudad ciudad " +
                "ON alumno.idCiudad = ciudad.idCiudad LEFT JOIN MYSQLLOCAL...estado estado ON ciudad.idEstado = estado.idEstado ORDER BY idAlumno;";

        ObservableList <Datos> lista = FXCollections.observableArrayList();

        try {
            PreparedStatement statement = conexcion.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();


            while (resultado.next()){

                int idAlumno = resultado.getInt(1);
                String nomAlumno = resultado.getString(2);
                String nomCiudad = resultado.getString(3);
                String nomEstado = resultado.getString(4);
                String nomUsuario = resultado.getString(5);

                //System.out.println("\n"+idCiudad + " "+ idestado+ " " + nombre + " " + idEstado + " " + nomEstado+"");

                Datos datos = new Datos(idAlumno, nomAlumno,nomCiudad, nomEstado, nomUsuario);
                lista.add(datos);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return lista;
    }
}
