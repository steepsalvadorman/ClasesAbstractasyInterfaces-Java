package org.example;

public class Main {
    public static void main(String[] args) {


        AnimalCarnivoro a1 = new AnimalCarnivoro();
        a1.alimentarse();

        AnimalHerbivoro ae1 = new AnimalHerbivoro();
        ae1.alimentarse();

        PlantaRosa pr1 = new PlantaRosa();
        pr1.alimentarse();



        //Conclusiones
        //Las clases abstractas son superclases
        //Tienen metodos abstractos
        //No se pueden instanciar
        //Se implementan cuando se necesitan logicamente
    }
}