public class Placton implements Comida {
    private int placton = 8;

    public void darComida(Elemento elemento){

        elemento.modificarEnergia(placton);
    }
}
