package unrn.programacion2.tp2;

import java.util.TreeMap;

public class Grog {

    private Integer alcohol;
    private Integer unidades;

    public Integer getAlcohol(){
        return alcohol;
    }

    public Integer getUnidades(){
        return unidades;
    }

    public void modificarCantidad(Integer delta){
        if(unidades + delta < 0){
            throw new IllegalArgumentException("No se puede modificar por el monto deseado.");
        } else {
            unidades += delta;
        }
    }
}
