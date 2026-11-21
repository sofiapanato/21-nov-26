public class CamaraIP extends DispositivoMonitoreo {
    //att
    private int resolucionMp;
    //cons
    public CamaraIP(String codigo, String ubicacion, int resolucionMp) {
        super(codigo, ubicacion);
        this.resolucionMp = resolucionMp;
    }
    //getset
    public int getResolucionMp() {
        return resolucionMp;
    }
    public void setResolucionMp(int resolucionMp) {
        this.resolucionMp = resolucionMp;
    }
    //metodo
    @Override
    public void activarAlerta() {
        System.out.println("Se informa que inicia grabacion en alta definicion de "+ 
        getResolucionMp() + " megapixeles y envia captura al servidor");
    }

    
}
