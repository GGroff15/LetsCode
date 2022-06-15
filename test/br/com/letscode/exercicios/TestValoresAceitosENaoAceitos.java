package br.com.letscode.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestValoresAceitosENaoAceitos {

	@Test
	void testValoresAceitos() {
		Valores valores = new Valores();
		assertEquals("Valores não aceitos", valores.testar(5, 6, 7, 8));
	}

	@Test
	void testValoresNaoAceitos() {
		Valores valores = new Valores();
		assertEquals("Valores aceitos", valores.testar(2, 3, 2, 6));
	}

}
