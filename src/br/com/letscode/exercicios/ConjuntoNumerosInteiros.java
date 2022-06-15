package br.com.letscode.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConjuntoNumerosInteiros {

	public String intersecao(String conjunto1, String conjunto2) {
		List<String> intersecao = new ArrayList<>();
		for (String inteiro1 : conjunto1.split(" ")) {
			for (String inteiro2 : conjunto2.split(" ")) {
				if (inteiro1.equals(inteiro2)) {
					intersecao.add(inteiro1);
				}
			}
		}
		return intersecao.stream().sorted().collect(Collectors.joining(" "));
	}

}
