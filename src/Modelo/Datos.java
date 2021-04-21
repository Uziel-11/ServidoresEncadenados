package Modelo;


public class Datos{

    private int idAlumno;
    private String nomAlumno;
    private String nomEstado;
    private String nomCiudad;
    private String nomUsuario;

    public Datos(int idAlumno, String nomAlumno, String nomCiudad, String nomEstado, String nomUsuario) {
        this.idAlumno = idAlumno;
        this.nomAlumno = nomAlumno;
        this.nomEstado = nomEstado;
        this.nomCiudad = nomCiudad;
        this.nomUsuario = nomUsuario;
    }

    public Datos (){

    }
    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNomAlumno() {
        return nomAlumno;
    }

    public void setNomAlumno(String nomAlumno) {
        this.nomAlumno = nomAlumno;
    }

    public String getNomEstado() {
        return nomEstado;
    }

    public void setNomEstado(String nomEstado) {
        this.nomEstado = nomEstado;
    }

    public String getNomCiudad() {
        return nomCiudad;
    }

    public void setNomCiudad(String nomCiudad) {
        this.nomCiudad = nomCiudad;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

}
