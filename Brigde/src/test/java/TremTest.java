import org.example.*;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TremTest {

    @Test
    public void deveRetornarLucroTremMinerio() {
        Carga carga = new Minerio();
        Trem trem = new Trem(30.0f);
        trem.setEntrega(carga);
        trem.setVelocidadeEntrega(1);
        assertEquals(39, trem.calcularLucro(), 0.03f);
    }

    @Test
    public void deveRetornarLucroTremMetal() {
        Carga carga = new Metal();
        Trem trem = new Trem(20.0f);
        trem.setEntrega(carga);
        trem.setVelocidadeEntrega(2);
        assertEquals(48, trem.calcularLucro(), 0.03f);

    }

    @Test
    public void deveRetornarLucroTremMadeira() {
        Carga carga = new Madeira();
        Trem trem = new Trem(10.0f);
        trem.setEntrega(carga);
        trem.setVelocidadeEntrega(3);
        assertEquals(33, trem.calcularLucro(), 0.03f);
    }
}
