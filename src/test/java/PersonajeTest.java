import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonajeTest {

    @Test
    public void testPersonajeTieneUnNombre() {
        Elemento elemento = new Agua();
        Personaje personaje = new Personaje("nombre", elemento);

        assertNotNull(personaje.obtenerNombre());

    }
    @Test
    public void testPersonajeTieneUnNombreDistintoAvacio() {
        Elemento elemento = new Agua();
        Personaje personaje = new Personaje("nombre", elemento);

        assertNotSame(personaje.obtenerNombre(),"");
    }

    @Test
    public void testPeronsjaeTieneUnElemento(){
        Elemento elemento = new Agua();
        Personaje personaje = new Personaje("nombre", elemento);

        assertNotNull(personaje.obtenerElemento());
    }

}
