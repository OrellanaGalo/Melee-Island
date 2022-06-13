package unrn.programacion2.tp2;

import java.util.ArrayList;
import java.util.TreeSet;

public class InfoPirata {
    private String nombre_pirata;
    private TreeSet<Insulto> insultos;
    private Integer nivel_alcohol;
    private ArrayList<String> grog;
    private ArrayList<Pelea> peleas;

    public String getNombre_pirata(){
        return nombre_pirata;
    }

    public TreeSet<Insulto> getInsultos(){
        return insultos;
    }

    public Integer alcoholEnSangre(){
        return nivel_alcohol;
    }

    public ArrayList<String> getGrog(){
        return grog;
    }

    public ArrayList<Pelea> getPeleas(){
        return peleas;
    }

    public InfoPirata(String nombre, TreeSet<Insulto> insultos){
        this.nombre_pirata = nombre;
        this.insultos = new TreeSet<>();

        for(Insulto in : insultos){
            this.insultos.add(in);
        }
    }
}
