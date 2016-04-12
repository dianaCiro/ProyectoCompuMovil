package co.edu.udea.compumovil.proyectoatonmb.Dto;

/**
 * Created by caterine.ciro on 11/04/16.
 */
public class LaboratorioDto {
    private long id;
    private String ubicacion;
    private String administracion;

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAdministracion() {
        return administracion;
    }

    public void setAdministracion(String administracion) {
        this.administracion = administracion;
    }
}
