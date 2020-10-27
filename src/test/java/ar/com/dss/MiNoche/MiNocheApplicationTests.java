package ar.com.dss.MiNoche;

import ar.com.minoche.domain.Cliente;
import ar.com.minoche.domain.Entrada;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MiNocheApplicationTests {

	@Test
	void contextLoads() {
	}

        @Test
        void crearEntrada() {
            Entrada entrada = Entrada.builder().cod_qr("asdas").cliente(new Cliente()).build();
        }
}
