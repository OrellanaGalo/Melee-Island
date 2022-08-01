package unrn.programacion2.tp2;

import java.util.Collection;
import java.util.TreeSet;

public class Grogs implements Comparable<Grog>{

    private int Alcohol;
    private int Unidades;

    public int getAlcohol(){
        return Alcohol;
    }

    public int getUnidades(){
        return Unidades;
    }

    public Grogs(int alcohol, Collection<Grog> grogs){
        this.Alcohol = 0;
        this.Unidades = 0;
    }

    public void modificarCantidad(Integer Delta){
        if(Unidades + Delta < 0){
            throw new IllegalArgumentException("No se puede modificar por el monto deseado.");
        } else {
            Unidades += Delta;
        }
    }

    @Override
    public int compareTo(Grog o) {
        return 0;
    }
}
