import static org.junit.Assert.*;
import org.junit.Test;

public class TestVaso {
    @Test
    public void deberiaDevolverVerdaderoSiExistenVasos() {
        Vaso vasosPequenos = new Vaso(2, 10);
        assertEquals(true, vasosPequenos.hasVasos(1));
    }

    @Test
    public void deberiaDevolverFalsoSiNoExistenVasos() {
        Vaso vasosPequenos = new Vaso(1, 10);
        assertEquals(false, vasosPequenos.hasVasos(2));
    }

    @Test
    public void deberiaRestarCantidadDeVaso() {
        Vaso vasosPequenos = new Vaso(5, 10);
        vasosPequenos.giveVasos(1);
        assertEquals(4, vasosPequenos.getCantidadVasos());
    }
}
