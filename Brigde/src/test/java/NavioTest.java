import org.example.*;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class NavioTest {

    @Test
    public void deveRetornarLucroNavioMinerio() {
        Carga carga = new Minerio();
        Navio navio = new Navio(300.0f);
        navio.setEntrega(carga);
        navio.setVelocidadeEntrega(1);
        assertEquals(390, navio.calcularLucro(), 0.03f);
    }

    @Test
    public void deveRetornarLucroNavioMetal() {
            Carga carga = new Metal();
            Navio navio = new Navio(200.0f);
            navio.setEntrega(carga);
            navio.setVelocidadeEntrega(2);
            assertEquals(480, navio.calcularLucro(), 0.03f);

    }

    @Test
    public void deveRetornarLucroNavioMadeira() {
        Carga carga = new Madeira();
        Navio navio = new Navio(100.0f);
        navio.setEntrega(carga);
        navio.setVelocidadeEntrega(3);
        assertEquals(330, navio.calcularLucro(), 0.03f);
    }
}
