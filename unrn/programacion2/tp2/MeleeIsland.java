package unrn.programacion2.tp2;

import java.util.*;

public class MeleeIsland {

    final TreeMap<String, InfoPirata> Info_pirata;
    private final TreeMap<String, InfoGrogs> Grogs;
    private final TreeSet<String> piratas;
    private String mas_buscapleitos;
    private String mas_picante;
    private String proximo_grog;
    private final ArrayList<Grog> grogList = new ArrayList<>();

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

    public TreeMap<String, InfoGrogs> grogs(){ return Grogs; }

    public MeleeIsland(TreeSet<Pirata> p){

        this.Info_pirata = new TreeMap<>();
        this.Grogs = new TreeMap<>();
        this.piratas = new TreeSet<>();

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
        InfoGrogs proximo = null;
        Grog grog = null;

        // Busca el grog por el nombre.
        for(Grog g : grogList){
            if(g.getNombre().equals(nombre)){
                grog = g;
                break;
            }
        }

        // Busca el grog en info grogs con menos unidades.
        for(InfoGrogs ig : Grogs.values()){
            if(proximo == null || proximo.getUnidades() > ig.getUnidades()){
                if (grog == null || ig.getNombre().equals(grog.getNombre())){
                    proximo = ig;
                }
            }
        }
    }

    public void pelear(String pirata1, String pirata2){
        // Rellenar //
    }

    public ArrayList<Pelea> peleas(){
        return null;
    }

    public ArrayList<String> grogsBebidos(String nombre){
        return this.Info_pirata.get(nombre).getGrogsBebidos();
    }

    public int alcoholEnSangre(String nombre){
        return this.Info_pirata.get(nombre).getAlcoholEnSangre();
    }

    public TreeSet<Insulto> insultosQueConoce(String nombre){
        return this.Info_pirata.get(nombre).getInsultos();
    }

    public void comprarGrog(Grog proximo, int n){
        String NombreSiguiente = "";
        int CantidadSiguiente = 0;
        Set<String> NombresGrogs = Grogs.keySet();

        if(grogs().containsKey(proximo.getNombre())){
            Grogs.get(proximo.getNombre()).modificarCantidad(Grogs.get(proximo.getNombre()).getUnidades() + n);
        } else {
            Grogs.put(proximo.getNombre(), new InfoGrogs(proximo.getNombre(), n));
        }

        while(!NombresGrogs.isEmpty()){
            String nombre = NombresGrogs.iterator().next();
            if(CantidadSiguiente <= Grogs.get(nombre).getUnidades()){
                CantidadSiguiente = Grogs.get(nombre).getUnidades();
                NombresGrogs.remove(nombre);
            } else {
                NombreSiguiente = nombre;
                NombresGrogs.remove(nombre);
            }
        }

        this.proximo_grog = NombreSiguiente;
    }
}
