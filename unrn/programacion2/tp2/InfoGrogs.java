package unrn.programacion2.tp2;

import java.util.Collection;
import java.util.TreeSet;

public class InfoGrogs implements Comparable<InfoGrogs> {

    private final String nombre;
    private int unidades;
    private final TreeSet<Grog> grogs;

    public InfoGrogs(String nombre, int unidades){
        this.nombre = nombre;
        this.unidades = unidades;
        this.grogs = new TreeSet<>();
    }

    public InfoGrogs(String nombre, Collection<Grog> grogs){
        this.nombre = nombre;
        this.unidades = 0;
        this.grogs = new TreeSet<>(grogs);
    }

    public String getNombre(){
        return nombre;
    }

    public int getUnidades(){
        return unidades;
    }

    public TreeSet<Grog> getGrogs(){
        return grogs;
    }

    public void modificarCantidad(Integer delta){
        if(unidades + delta < 0){
            throw new IllegalArgumentException("No se puede modificar por el monto establecido.");
        } else {
            unidades += delta;
        }
    }

    @Override
    public int compareTo(InfoGrogs o){
        return this.nombre.compareTo(o.getNombre());
    }
}
