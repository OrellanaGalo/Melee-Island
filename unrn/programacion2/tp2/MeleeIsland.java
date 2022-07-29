package unrn.programacion2.tp2;

import java.util.*;

public class MeleeIsland {

    private TreeMap<String, InfoPirata> Info_pirata;
    private TreeMap<String, InfoGrogs> Info_grogs;
    private TreeMap<String, Grog> grogs;
    private TreeSet<String> piratas;
    private String mas_buscapleitos;
    private String mas_picante;
    private String proximo_grog;

    public TreeMap<String, InfoPirata>Info_pirata(){
        return Info_pirata;
    }

    public TreeSet<String> piratas(){
        return piratas;
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

    public MeleeIsland(TreeSet<Pirata> piratas){
        for(Pirata pirata : piratas){
            this.Info_pirata.put(pirata.getNombre_pirata(), new InfoPirata(pirata.getNombre_pirata(), pirata.getInsultos()));
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

    public void beberGrog(String nombrePirata){
        String nombreSiguiente = "";
        int cantidadSiguiente = 0;
        //Grog nombresGrogs = this.grogs.get(grogs); --> No se si deberia dejar esta linea.

        this.Info_pirata.get(nombrePirata).getGrog().add(proximo_grog);
        this.grogs.get(proximo_grog).modificarCantidad(-1);
        this.Info_pirata.get(nombrePirata).alcoholEnSangre();

        while(!this.Info_grogs.isEmpty()){
            if(cantidadSiguiente <= this.Info_grogs.get(nombreSiguiente).getUnidades()){
                cantidadSiguiente = this.Info_grogs.get(nombreSiguiente).getUnidades();
            } else {
                cantidadSiguiente = cantidadSiguiente - 1;
            }

            proximo_grog = nombreSiguiente;
        }
    }

    public MeleeIsland pelear(){ // Falta desarrollar el algoritmo
        return null;
    }

    public MeleeIsland peleas(){ // Falta desarrollar el algoritmo --> ???? de donde sale este metodo?
        return null;
    }

    public ArrayList<String> grogsBebidos(String nombre_pirata){ // Puede que esto en vez de ser un ArrayList, deba ser un TreeSet.
        return this.Info_pirata.get(nombre_pirata).getGrog();
    }

    public Integer alcoholEnSangre(String nombre_pirata){
        return this.Info_pirata.get(nombre_pirata).alcoholEnSangre();
    }

    public TreeSet<Insulto> insultosQueConoce(String nombrePirata){
        return this.Info_pirata.get(nombrePirata).getInsultos();
    }

    public void comprarGrog(){ // --> Falta completar.
        // Rellenar // 
    }
}
