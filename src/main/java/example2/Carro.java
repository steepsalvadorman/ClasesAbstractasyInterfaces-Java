package example2;

public class Carro implements  Rueda{

    @Override
    public void avanzar() {
        System.out.println("El carro avanza");
    }

    @Override
    public void detenerse() {
        System.out.println("El carro se detiene");
    }
}
