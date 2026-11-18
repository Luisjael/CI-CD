import static org.junit.Assert.*;
import org.junit.Test;

public class TestCafetera {
    @Test
    public void deberiaDevolverVerdaderoSiExisteCafe() {
        Cafetera cafetera = new Cafetera(10);
        assertEquals(true, cafetera.hasCafe(5));
    }

    @Test
    public void deberiaDevolverFalsoSiNoExisteCafe() {
        Cafetera cafetera = new Cafetera(10);
        assertEquals(false, cafetera.hasCafe(11));
    }

    @Test
    public void deberiaRestarcafeAlaCafetera() {
        Cafetera cafetera = new Cafetera(10);
        cafetera.giveCafe(7);
        assertEquals(3, cafetera.getCantidadCafe());
    }
}
