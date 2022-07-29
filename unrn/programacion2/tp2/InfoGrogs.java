package unrn.programacion2.tp2;

import java.util.TreeSet;

public class InfoGrogs {
    private String nombreGrog;
    private Integer Alcohol;
    private Integer Unidades;
    private TreeSet<Grog> grogs;

    public TreeSet<Grog> getGrogs(){
        return grogs;
    }

    public String getNombreGrog(){
        return nombreGrog;
    }

    public Integer getAlcohol(){
        return Alcohol;
    }

    public Integer getUnidades(){
        return Unidades;
    }

    public InfoGrogs(String nombre, TreeSet<Grog> grogs){ // Preguntar a Nico sobre esto.
        this.nombreGrog = nombre;
        this.grogs = new TreeSet<>();

        for(Grog in : grogs){
            this.grogs.add(in);
        }
    }
}
