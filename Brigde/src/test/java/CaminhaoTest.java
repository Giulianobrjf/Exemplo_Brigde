import org.example.*;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CaminhaoTest {

    @Test
    public void deveRetornarLucroCaminhaoMinerio() {
        Carga carga = new Minerio();
        Caminhao caminhao = new Caminhao(3.0f);
        caminhao.setEntrega(carga);
        caminhao.setVelocidadeEntrega(1);
        assertEquals(3.9, caminhao.calcularLucro(), 0.03f);
    }

    @Test
    public void deveRetornarLucroCaminhaoMetal() {
        Carga carga = new Metal();
        Caminhao caminhao = new Caminhao(2.0f);
        caminhao.setEntrega(carga);
        caminhao.setVelocidadeEntrega(2);
        assertEquals(4.8, caminhao.calcularLucro(), 0.03f);

    }

    @Test
    public void deveRetornarLucroCaminhaoMadeira() {
        Carga carga = new Madeira();
        Caminhao caminhao = new Caminhao(1.0f);
        caminhao.setEntrega(carga);
        caminhao.setVelocidadeEntrega(3);
        assertEquals(3.3, caminhao.calcularLucro(), 0.03f);
    }
}
