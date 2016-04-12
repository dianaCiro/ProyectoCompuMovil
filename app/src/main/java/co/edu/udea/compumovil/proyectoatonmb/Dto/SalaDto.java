package co.edu.udea.compumovil.proyectoatonmb.Dto;

/**
 * Created by caterine.ciro on 11/04/16.
 */
public class SalaDto {
    private long id;
    private LaboratorioDto laboratorio;
    private String medios,enseres;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LaboratorioDto getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(LaboratorioDto laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getMedios() {
        return medios;
    }

    public void setMedios(String medios) {
        this.medios = medios;
    }

    public String getEnseres() {
        return enseres;
    }

    public void setEnseres(String enseres) {
        this.enseres = enseres;
    }
}
