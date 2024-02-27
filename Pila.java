public class Pila{
    private int horasDeVida;
    private String tipoPila;
    public Pila () {
        horasDeVida = 0;
        tipoPila = "Duracell";
    }
    public int getHorasDeVida(){
        return horasDeVida;
    }
    public void setTipoPila(String tipoDePila){
        tipoPila = tipoDePila;
    }
    
    public String getTipoPila () {
        return tipoPila;
    }
    
    public void setHorasDeVida (int horasUsado) {
        horasDeVida = horasUsado;
    }
}