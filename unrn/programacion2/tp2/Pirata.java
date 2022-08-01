package unrn.programacion2.tp2;

import java.util.Set;
import java.util.TreeSet;

public class Pirata implements Comparable<Pirata>{

    final String nombre_pirata;
    final Set<Insulto> insultos;

    public String getNombre(){
        return nombre_pirata;
    }

    public Set<Insulto> getInsultos(){
        return insultos;
    }

    public Pirata(String Nombre, TreeSet<Insulto> Insultos){
        this.nombre_pirata = Nombre;
        this.insultos = Insultos;
    }

    @Override
    public String toString() {
        return "Pirata [" + "Nombre Pirata: '" + nombre_pirata + '\'' + ", Insultos: " + insultos + ']';
    }

    @Override
    public int compareTo(Pirata o) {
        return 0;
    }
}

