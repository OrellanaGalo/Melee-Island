package unrn.programacion2.tp2;

import java.util.ArrayList;
import java.util.TreeSet;

public class Test_MeleeIsland {

    public static void main(String[] args){

        //Creamos nuevos insultos en la Isla.
        Insulto i1 = new Insulto("Tonto", 6);
        Insulto i2 = new Insulto("Salame", 8);
        Insulto i3 = new Insulto("Feo", 10);
        Insulto i4 = new Insulto("Piel seca", 2);
        Insulto i5 = new Insulto("Feo", 7);
        Insulto i6 = new Insulto("Salame", 9);
        Insulto i7 = new Insulto("Salame", 3);
        Insulto i8 = new Insulto("Narigon", 5);
        Insulto i9 = new Insulto("Narigon", 4);
        Insulto i0 = new Insulto("Perro", 1);

        //Creamos un TreeSet que contenga las variedades de Insultos.
        TreeSet<Insulto> TreeInsultos = new TreeSet<>();

        //Agregamos los nuevos insultos al TreeSet.
        TreeInsultos.add(i1);
        TreeInsultos.add(i2);
        TreeInsultos.add(i3);
        TreeInsultos.add(i4);
        TreeInsultos.add(i5);
        TreeInsultos.add(i6);
        TreeInsultos.add(i7);
        TreeInsultos.add(i8);
        TreeInsultos.add(i9);
        TreeInsultos.add(i0);

        //Imprimimos en consola los datos de los Insultos.
        System.out.println("\n/////////////INSULTOS/////////////");

        for(Insulto i : TreeInsultos){
            System.out.print("\n" + "Insulto: \t\t Agresividad:\n" + i.getNombre() + "\t\t\t\t\t" + i.getAggro() + "\n");
        }

        System.out.println("\n/////////////HABITANTES/////////////\n");

        //Lista de habitantes de la isla.
        Pirata p1 = new Pirata("Alberto", TreeInsultos);
        Pirata p2 = new Pirata("Ricardo", TreeInsultos);
        Pirata p3 = new Pirata("Miguel", TreeInsultos);
        Pirata p4 = new Pirata("Carlos", TreeInsultos);
        Pirata p5 = new Pirata("Florencio", TreeInsultos);

        //Creamos un TreeSet que contenga a todos los habitantes de la isla
        TreeSet<Pirata> Habitantes = new TreeSet<>();

        //Agregamos los habitantes al nuevo TreeSet.
        Habitantes.add(p1);
        Habitantes.add(p2);
        Habitantes.add(p3);
        Habitantes.add(p4);
        Habitantes.add(p5);

        //Imprimimos en consola a todos los habitantes.
        for(Pirata p : Habitantes){
            System.out.print(p.getNombre() + "\n");
            //System.out.print(p.getInsultos() + "\n");
        }

        System.out.println("\n/////////////VARIEDADES DE GROG/////////////\n");

        // Creamos nuevas variedades de Grogs.
        Grog g1 = new Grog("Grog XD", 10, 20);
        Grog g2 = new Grog("Grog IPA", 8, 60);
        Grog g3 = new Grog("Grog APA", 5, 30);
        Grog g4 = new Grog("Grog Energizante", 2, 50);
        Grog g5 = new Grog("Grog sin alcohol", 0, 100);

        // Creamos una lista que contenga las variedades de Grogs.
        ArrayList<Grog> Grogs = new ArrayList<>();

        // Agregamos las variedades a la lista.
        Grogs.add(g1);
        Grogs.add(g2);
        Grogs.add(g3);
        Grogs.add(g4);
        Grogs.add(g5);

        //Compramos una unidad de Grog.
        MeleeIsland m = new MeleeIsland(Habitantes);
        //m.comprarGrog(g2, 3);

        // Imprimimos en consola los datos de los Grogs ya ordenados de mayor a menor usando como parametro las cantidades.
        for(Grog g : Grogs){
            System.out.print("Nombre: " + g.getNombre() + "\n");
            System.out.print("Nivel de alcohol: " + g.getAlcohol() + "\n");
            System.out.print("Unidades restantes: " + "\n" + "-------------------" + "\n");
        }
    }
}
