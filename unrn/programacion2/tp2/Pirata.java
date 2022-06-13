package unrn.programacion2.tp2;

import java.util.TreeSet;

public class Pirata {

    private String nombre_pirata;
    private TreeSet<Insulto> insultos;

    public String getNombre_pirata() {
        return nombre_pirata;
    }

    public TreeSet<Insulto> getInsultos() {
        return insultos;
    }

    public Pirata(String nombre_pirata, TreeSet<Insulto> insultos){
        this.nombre_pirata = nombre_pirata;
        this.insultos = new TreeSet<>();

        for(Insulto in : insultos){
            this.insultos.add(in);
        }
    }
}
