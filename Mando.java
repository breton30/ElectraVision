
public class Mando{
    private int horasUsado;
    private int canales;
    private Pila pila;
    public Mando(int horasUsado, int canales, Pila pila){
        this.horasUsado = horasUsado;
        this.canales = canales;
        this.pila = pila;
    }
    
    public int getCanales () {
        return canales;
    }
    
    public void setCanales (int numeroCanales) {
        canales = numeroCanales;
    }
    
    public int getHorasUsado () {
        return horasUsado;
    }
    
    public void setHorasUsado (int horasDeVida) {
        horasUsado = horasDeVida;
    }
    
    public void setPila (String nombreTipoPila ) {
        pila.setTipoPila(nombreTipoPila);
    }
    
    public String getPila () {
        return pila.getTipoPila();
    }
}
