package unrn.programacion2.tp2;

import java.util.TreeSet;

public class Test_MeleeIsland {

    public static void main(String[] args){
        
        Insulto i = new Insulto("bobo", 5);
        Pirata p = new Pirata("Ricardo", new TreeSet<Insulto>());
        Pelea pe = new Pelea("Vicente", true);

        System.out.println(i.toString());
        System.out.println(p.toString());
        System.out.println(pe.toString());
    }
}
