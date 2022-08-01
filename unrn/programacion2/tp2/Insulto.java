package unrn.programacion2.tp2;

public class Insulto implements Comparable<Insulto>{

    final String insulto;
    final int aggro;

    public Integer getAggro() {
        return aggro;
    }

    public String getNombre() {
        return insulto;
    }

    public Insulto(String Texto, int Agresividad){
        this.insulto = Texto;
        this.aggro = Agresividad;
    }

    @Override
    public String toString() {
        return "Insulto: '" + insulto + ", Agresividad: " + aggro;
    }

    // Uso el compareTo para revisar si hay un insulto similar preexistente en la isla y asi asignarle la misma agresividad.
    @Override
    public int compareTo(Insulto o){
        if(this.getNombre().equals(o.getNombre())){
            return this.getAggro().compareTo(o.getAggro());
        } else {
            return this.getNombre().compareTo(o.getNombre());
        }
    }
}
