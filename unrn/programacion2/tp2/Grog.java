package unrn.programacion2.tp2;

// Hay que implementar la interfaz Comparable<Grog> para poder construir un TreeSet de Grogs.

public class Grog implements Comparable<Grog>{

    final String grog;
    final int alcohol;

    public String getNombre(){return grog;}

    public Grog(String Grog, int Alcohol){
        this.grog = Grog;
        this.alcohol = Alcohol;
    }

    @Override
    public int compareTo(Grog o){
        if(this.getNombre().equals(o.getNombre())){
            throw new IllegalArgumentException("Esa variedad de Grog ya existe");
        }

        return 0;
    }
}
