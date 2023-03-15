package unrn.programacion2.tp2;

import java.util.TreeSet;

public class Test_MeleeIsland {

    public static void main(String[] args){

        // Creamos un TreeSet de Piratas y de Insultos, para luego poder llenarlos con info.
        TreeSet<Pirata> Habitantes = new TreeSet<>();
        TreeSet<Insulto> insultosFlorencio = new TreeSet<>();
        TreeSet<Insulto> insultosRoberto = new TreeSet<>();
        MeleeIsland melee = new MeleeIsland(Habitantes);

        // Con "Insulto nombre = new Insulto(Texto, Agresividad), creamos un insulto."
        Insulto tonto = new Insulto("Tonto", 8);
        Insulto bobo = new Insulto("Bobo", 6);
        Insulto gato = new Insulto("Gato", 7);

        // Creamos variedades de Grogs.
        Grog xd = new Grog("Grog XD", 10);

        // Agregamos los insultos creados a un TreeSet de Insulto.
        insultosFlorencio.add(tonto);
        insultosRoberto.add(bobo);
        insultosFlorencio.add(gato);

        // Creamos nuevos piratas y luego les asignamos un nombre y un TreeSet de Insultos.
        melee.agregarPirata("Florencio", insultosFlorencio);
        melee.agregarPirata("Roberto", insultosRoberto);

        // Imprime los nombres de los piratas en la lista.
        System.out.println(melee.piratas());

        // Imprime los insultos que conoce cada pirata.
        System.out.println(melee.insultosQueConoce("Florencio"));
        System.out.println(melee.insultosQueConoce("Roberto"));

        // Llamamos las funciones de Melee Island.
        melee.masBuscapleitos();
        melee.masPicante();
        melee.grogsBebidos("Florencio");
        melee.comprarGrog(xd, 1);
    }
}
