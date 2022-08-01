package unrn.programacion2.tp2;

import java.util.*;

public class MeleeIsland {

    final TreeMap<String, InfoPirata> Info_pirata;
    private TreeMap<String, Grogs> Grogs;         //Revisar, antes llamado "Info_grogs".
    private TreeSet<String> piratas;
    private String mas_buscapleitos;
    private String mas_picante;
    private String proximo_grog;

    public Map<String, InfoPirata>Info_pirata(){
        return Info_pirata;
    }

    public Set<String> piratas(){ return piratas; }

    public String masBuscapleitos(){
        return mas_buscapleitos;
    }

    public String masPicante(){
        return mas_picante;
    }

    public String proximoGrog(){
        return proximo_grog;
    }

    public TreeMap<String, Grogs> grogs(){ return Grogs; }

    public MeleeIsland(TreeSet<Pirata> p){

        this.Info_pirata = new TreeMap<>();
        this.Grogs = new TreeMap<>();
        this.piratas = new TreeSet<>();
        this.mas_buscapleitos = "Norberto";
        this.mas_picante = "Mariano";
        this.proximo_grog = "Grog XD";

        for(Pirata pi : p){
            this.Info_pirata.put(pi.getNombre(), new InfoPirata(pi.getNombre(), pi.getInsultos()));
        }
    }

    public void agregarPirata(String pirata, TreeSet<Insulto> insultos){
        if(piratas.contains(pirata)){
            throw new IllegalStateException("El pirata que se desea agregar ya esta en el diccionario.");
        } else {
            this.piratas.add(pirata);
            if(Info_pirata.containsKey(pirata)){
                throw new IllegalStateException("Violamos el invariante de representacion.");
            } else {
                this.Info_pirata.put(pirata, new InfoPirata(pirata, insultos));
            }
        }
    }

    public void beberGrog(String nombre){

        Grogs proximo = null;
        Grog grog = null;

        //Preguntar a Nico si estas lineas deberían existir.
        this.Info_pirata.get(nombre).getGrog().add(proximo_grog);
        this.Grogs.get(proximo_grog).modificarCantidad(-1);
        this.Info_pirata.get(nombre).getAlcoholEnSangre();

        for(Grogs ig : Grogs.values()){
            if(proximo == null || proximo.getUnidades() < ig.getUnidades()){
                proximo = ig;
            }
        }

        proximo_grog = grog.getNombre();
    }

    public void pelear(String pirata1, String pirata2){
        // Rellenar //
    }

    public ArrayList<Pelea> peleas(){
        return null;
    }

    public ArrayList<String> grogsBebidos(String nombre){
        return this.Info_pirata.get(nombre).getGrog();
    }

    public int alcoholEnSangre(String nombre){
        return this.Info_pirata.get(nombre).getAlcoholEnSangre();
    }

    public TreeSet<Insulto> insultosQueConoce(String nombre){
        return this.Info_pirata.get(nombre).getInsultos();
    }

    public void comprarGrog(Grogs g, int n){

        // Preguntar por la "exception" que se genera.
        Grogs proximo = null;
        Grog nombre = null;

        if(this.Grogs.get(n).getUnidades() > 0) {
            for (Grogs gs : Grogs.values()) {
                if (proximo == null || proximo.getUnidades() < gs.getUnidades()) {
                    proximo = gs;
                }
            }

            proximo_grog = nombre.getNombre();
        }
    }
}
