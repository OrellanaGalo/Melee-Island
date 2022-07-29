package unrn.programacion2.tp2;

public class Pelea {

    private String nombre_pirata;
    private Boolean resultado;

    public String getNombre_pirata(){
        return nombre_pirata;
    }

    public boolean getResultado(){
        return resultado;
    }

    public Pelea(String nombrePirata, boolean resultado){
        this.nombre_pirata = nombrePirata;
        this.resultado = resultado;
    }

    @Override
    public String toString(){
        return "Pelea [" + "Nombre Pirata: '" + nombre_pirata + "\'" + ". Resultado: " + resultado + "]";
    }
}
