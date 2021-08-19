package model.vo;

public class ProyectosQuibdoApartaestudio {

    private Integer idProyecto;
    private String constructora;
    private Double porcentajeCuotaInicial;
    private String acabados;

    public ProyectosQuibdoApartaestudio() {
    }

    public ProyectosQuibdoApartaestudio(Integer idProyecto, String constructora, Double porcentajeCuotaInicial, String acabados) {
        this.idProyecto = idProyecto;
        this.constructora = constructora;
        this.porcentajeCuotaInicial = porcentajeCuotaInicial;
        this.acabados = acabados;
    }

    
    public Integer getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(Integer idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public Double getPorcentajeCuotaInicial() {
        return porcentajeCuotaInicial;
    }

    public void setPorcentajeCuotaInicial(Double porcentajeCuotaInicial) {
        this.porcentajeCuotaInicial = porcentajeCuotaInicial;
    }

    public String getAcabados() {
        return acabados;
    }

    public void setAcabados(String acabados) {
        this.acabados = acabados;
    }
    
}