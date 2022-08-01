package unrn.programacion2.tp2;

public class Pelea {

    final String nombre_pirata;
    final boolean resultado;

    public String getNombre(){
        return nombre_pirata;
    }

    public boolean gano(){
        return resultado;
    }

    public Pelea(String nombrePirata, boolean resultado){
        this.nombre_pirata = nombrePirata;
        this.resultado = resultado;
    }

    @Override
    public String toString(){
        return "Pelea [" + "Nombre Pirata: '" + nombre_pirata + "'" + ". Resultado: " + resultado + "]";
    }
}
