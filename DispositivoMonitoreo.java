public abstract class DispositivoMonitoreo{
    protected String codigo;
    protected String ubicacion;
    protected boolean activo;

//constructores
    public DispositivoMonitoreo(){}

    public DispositivoMonitoreo(String codigo, String ubicacion) {
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.activo = true;//no es necesario inicializarlo arriba para dar un valor booleano x defec
    }

//getters y setters
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
          //get del booleano = is...
    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
// metodos
    public String mostrarEstado() {
        String estado = "Inactivo y no puede emitir alertas";
        if (isActivo())
            estado = "Activo";
        return "DispositivoMonitoreo: Codigo = " + getCodigo() + 
        ", Ubicacion = " + getUbicacion() + 
        ", Estado = " + estado;
    }
    //el metodo concreto cambiar estado ya esta hecho (activo o inactivo)
    //clase abstracta
    public abstract void activarAlerta();
}