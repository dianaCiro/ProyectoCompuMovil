package co.edu.udea.compumovil.proyectoatonmb.Dto;

/**
 * Created by caterine.ciro on 11/04/16.
 */
public class EquipoDto {
    private String mac,ip,descripcion;
    private SalaDto sala;

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public SalaDto getSala() {
        return sala;
    }

    public void setSala(SalaDto sala) {
        this.sala = sala;
    }
}
