package unrn.programacion2.tp2;

import java.util.*;

public class MeleeIsland {

    private TreeMap<String, Pirata> Info_pirata;
    private TreeMap<String, Grog> grogs;
    private TreeSet<String> piratas;
    private String mas_buscapleitos;
    private String mas_picante;
    private String proximo_grog;

    public TreeMap<String, Pirata>Info_pirata(){
        return Info_pirata;
    }

    public TreeSet<String> pirata(){
        return piratas;
    }

    public void agregarPirata(String pirata, TreeSet<Insulto> insultos){
        if(piratas.contains(pirata)){
            throw new IllegalStateException("El pirata que se desea agregar ya esta en el diccionario.");
        } else {
            this.piratas.add(pirata);
            this.Info_pirata.put(pirata, new Pirata(pirata, insultos));
        }
    }

    public String masBuscapleitos(){
        return mas_buscapleitos;
    }

    public String masPicante(){
        return mas_picante;
    }

    public String proximoGrog(){
        return proximo_grog;
    }

    public TreeMap<String, Grog> grogs(){
        return grogs;
    }

    public MeleeIsland empezar(){

    }

    public MeleeIsland beberGrog(){

    }

    
}
