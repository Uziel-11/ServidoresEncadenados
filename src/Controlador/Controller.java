package Controlador;

import Modelo.DaoDatos;
import Modelo.Datos;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    DaoDatos daoDatos = new DaoDatos();


    ObservableList<Datos> datos2 = FXCollections.observableArrayList();

    @FXML
    private TableView<Datos> tabla;
    @FXML
    private TableColumn<Datos, Integer> id;
    @FXML
    private TableColumn<Datos, String> nomAlumno;
    @FXML
    private TableColumn<Datos, String> ciudad;
    @FXML
    private TableColumn<Datos, String> estado;
    @FXML
    private TableColumn<Datos, String> nomUsuario;


    @FXML
    public void iniciar(){
        datos2.clear();
        id.setCellValueFactory(new PropertyValueFactory<Datos, Integer>("idAlumno"));
        nomAlumno.setCellValueFactory(new PropertyValueFactory<Datos, String>("nomAlumno"));
        estado.setCellValueFactory(new PropertyValueFactory<Datos, String>("nomEstado"));
        ciudad.setCellValueFactory(new PropertyValueFactory<Datos, String>("nomCiudad"));
        nomUsuario.setCellValueFactory(new PropertyValueFactory<Datos, String>("nomUsuario"));
        Cargar();
    }


    public void Cargar(){
        List<Datos> datosList = daoDatos.getdato();


        for (int i=0; i<datosList.size(); i++){
            Datos datos = new Datos();
            datos.setNomCiudad(datosList.get(i).getNomCiudad());
            datos.setNomEstado(datosList.get(i).getNomEstado());
            datos.setIdAlumno(datosList.get(i).getIdAlumno());
            datos.setNomAlumno(datosList.get(i).getNomAlumno());
            datos.setNomUsuario(datosList.get(i).getNomUsuario());

            datos2.add(datos);
        }
        tabla.setItems(datos2);
    }


    public void salir(){
        System.exit(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        iniciar();
    }

}
