package unrn.programacion2.tp2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class InfoPirata {
    final String nombre_pirata;
    private Integer alcoholEnSangre;
    private ArrayList<String> grogsBebidos;
    final TreeSet<Insulto> insultos;
    private ArrayList<Pelea> peleas;

    public String getNombre(){
        return nombre_pirata;
    }

    public TreeSet<Insulto> getInsultos(){
        return insultos;
    }

    public Integer getAlcoholEnSangre(){
        return alcoholEnSangre;
    }

    public ArrayList<String> getGrog(){
        return grogsBebidos;
    }

    public ArrayList<Pelea> getPeleas(){
        return peleas;
    }

    public InfoPirata(String nombre, Collection<Insulto> insultos){
        this.nombre_pirata = nombre;
        this.insultos = new TreeSet<>();

        this.insultos.addAll(insultos);
    }
}
