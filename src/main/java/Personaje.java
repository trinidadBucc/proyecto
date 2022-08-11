public class Personaje {

    final String nombre;
    final Elemento elemento;

    public Personaje(String nombre, Elemento elemento){
        this.nombre = nombre;
        this.elemento = elemento;
    }

    public String obtenerNombre(){
        return this.nombre;
    }

    public Elemento obtenerElemento(){
        return this.elemento;
    }
}
