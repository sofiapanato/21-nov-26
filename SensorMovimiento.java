public class SensorMovimiento extends DispositivoMonitoreo {
    //att
    private double rangoMetros;
    //cons
    public SensorMovimiento(String codigo, String ubicacion, double rangoMetros) {
        super(codigo, ubicacion);
        this.rangoMetros = rangoMetros;
    }
    //getset
    public double getRangoMetros() {
        return rangoMetros;
    }
    public void setRangoMetros(double rangoMetros) {
        this.rangoMetros = rangoMetros;
    }
    @Override
    public void activarAlerta() {
        System.out.println("Reporta detección de movimiento dentro de su rango en "
         + getRangoMetros() + "metros y activa la sirena local.");
    } //se usa el get para llamar a la variable en los metodos. 

    
    
}
