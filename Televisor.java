
public class Televisor{
    private int canales;
    private boolean encendido;
    private Mando mando;
    public Televisor(int canales, boolean encendido, Mando mando){
        this.canales = canales;
        this.encendido = encendido;
        this.mando = mando;
    }
    
    public int getMando () {
        return mando.getHorasUsado();
    }
    
    public void setMando (int horasDeUso) {
        mando.setHorasUsado(horasDeUso);
    }
    
    public int getCanales () {
        return canales;
    }
    
    public void setCanales (int numeroCanales) {
        canales = numeroCanales;
    }
    
    public boolean getEncendido() {
        return encendido;
    }
    
    public void setEncendido (boolean estaEncendido) {
        encendido = estaEncendido;
    }
}
