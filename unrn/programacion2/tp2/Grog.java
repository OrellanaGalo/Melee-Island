package unrn.programacion2.tp2;

// Hay que implementar la interfaz Comparable<Grog> para poder construir un TreeSet de Grogs.

public class Grog{

    final String grog;
    final int alcohol;

    public String getNombre(){return grog;}

    public Integer getAlcohol(){
        return alcohol;
    }

    public Grog(String Grog, int Alcohol, int Unidades){
        this.grog = Grog;
        this.alcohol = Alcohol;
    }
}
