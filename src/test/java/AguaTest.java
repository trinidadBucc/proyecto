import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AguaTest {

    @Test
    public void vidaCorrectamenteInicializada(){
        Agua agua = new Agua();

        assertEquals(agua.obtenerVida(),100);
    }
    @Test
    public void energiaCorrectamenteInicializada(){
        Agua agua = new Agua();

        assertEquals(agua.obtenerEnergia(),20);
    }

    @Test
    public void alimentarAumentaEnergia(){
        Agua agua = new Agua();
        agua.modificarEnergia(-10);
        int energia = agua.obtenerEnergia();
        Comida placton = new Placton();
        agua.alimentar(placton);
        int energiaDespues = agua.obtenerEnergia();
        assertTrue(energiaDespues > energia);
    }
}
