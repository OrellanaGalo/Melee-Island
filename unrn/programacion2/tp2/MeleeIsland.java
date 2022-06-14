package unrn.programacion2.tp2;

import java.util.*;

public class MeleeIsland {

    private TreeMap<String, InfoPirata> Info_pirata;
    private TreeMap<String, Grog> grogs;
    private TreeSet<String> piratas;
    private TreeSet<InfoPirata> empezar;
    private String mas_buscapleitos;
    private String mas_picante;
    private String proximo_grog;

    public TreeMap<String, InfoPirata>Info_pirata(){
        return Info_pirata;
    }

    public TreeSet<String> piratas(){
        return piratas;
    }

    public String masBuscapleitos(){ // for each
        return mas_buscapleitos;
    }

    public String masPicante(){ // for each --> secuencias de peleas (true)
        return mas_picante;
    }

    public String proximoGrog(){
        return proximo_grog;
    }

    public TreeMap<String, Grog> grogs(){
        return grogs;
    }

    public TreeSet<InfoPirata> empezar(){
        return empezar;
    }

    public void agregarPirata(String pirata, TreeSet<Insulto> insultos){
        if(piratas.contains(pirata)){
            throw new IllegalStateException("El pirata que se desea agregar ya esta en el diccionario.");
        } else {
            this.piratas.add(pirata);
            if(Info_pirata.containsKey(insultos)){
                this.Info_pirata.get(insultos);
            } else {
                this.Info_pirata.put(pirata, new InfoPirata(pirata, insultos));
            }
        }
    }

    public MeleeIsland beberGrog(){
        return null;
    }

    public MeleeIsland pelear(){
        return null;
    }

    public MeleeIsland peleas(){
        return null;
    }

    public MeleeIsland grogsBebidos(){
        return null;
    }

    public MeleeIsland alcoholEnSangre(){
        return null;
    }

    public MeleeIsland insultosQueConoce(){
        return null;
    }
}
