package unrn.programacion2.tp2;

import java.util.TreeSet;
public class Pirata {

    private String nombre_pirata;
    private TreeSet<Insulto> insultos;

    public String getNombre_pirata(){
        return nombre_pirata;
    }

    public TreeSet<Insulto> getInsultos(){
        return insultos;
    }

    public Pirata(String nombre, TreeSet<Insulto> insultos){
        this.nombre_pirata = nombre;
        this.insultos = insultos;
    }

    @Override
    public String toString() {
        return "Pirata [" + "Nombre Pirata: '" + nombre_pirata + '\'' + ", Insultos: " + insultos + ']';
    }
}

