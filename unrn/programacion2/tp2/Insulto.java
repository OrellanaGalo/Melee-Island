package unrn.programacion2.tp2;

public class Insulto {

    private String nombre_insulto;
    private Integer aggro;

    public Integer getAggro() {
        return aggro;
    }

    public String getNombre_insulto() {
        return nombre_insulto;
    }

    public Insulto(String texto, int agresividad){
        this.nombre_insulto = texto;
        this.aggro = agresividad;
    }

    @Override
    public String toString() {
        return "Insulto{" +
                "nombre_insulto='" + nombre_insulto + '\'' +
                ", aggro=" + aggro + '}';
    }
}
