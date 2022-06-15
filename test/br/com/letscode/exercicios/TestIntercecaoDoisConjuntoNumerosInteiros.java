package br.com.letscode.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestIntercecaoDoisConjuntoNumerosInteiros {

	@Test
	void test() {
		ConjuntoNumerosInteiros conjunto = new ConjuntoNumerosInteiros();
		assertEquals("1 2 5", conjunto.intersecao("1 2 3 4 5", "2 5 7 1 9 18"));
	}

}
