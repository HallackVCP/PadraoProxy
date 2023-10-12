import org.example.BD;
import org.example.Funcionario;
import org.example.Loja;
import org.example.LojaProxy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class LojaProxyTest {
    @BeforeEach
    void setUp() {
        BD.addLoja(new Loja(1, "Loja A", "12345", "Cidade A", "Bairro A", "Rua A", 1000.0));
        BD.addLoja(new Loja(2, "Loja B", "67890", "Cidade B", "Bairro B", "Rua B", 750.0));
    }

    @Test
    void deveRetornarDadosPessoaisLojaA() {
        LojaProxy loja = new LojaProxy(1);

        assertEquals("Loja A, Cidade A, Bairro A, Rua A, 12345", loja.obterDadosLoja());
    }
    @Test
    void deveRetornarDadosPessoaisLojaB() {
        LojaProxy loja = new LojaProxy(2);

        assertEquals("Loja B, Cidade B, Bairro B, Rua B, 67890", loja.obterDadosLoja());
    }

    @Test
    void deveRetonarNotasLoja() {
        Funcionario funcionario = new Funcionario("Joao", true);
        LojaProxy loja = new LojaProxy(2);

        assertEquals(750.0, loja.obterFaturamento(funcionario));
    }

    @Test
    void deveRetonarExcecaoUsuarioNaoAutorizadoConsultarNotasLoja() {
        try {
            Funcionario funcionario = new Funcionario("Joao", false);
            LojaProxy loja = new LojaProxy(2);

            loja.obterFaturamento(funcionario);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Funcionário não é gerente, sem autorizacao", e.getMessage());
        }
    }
}
