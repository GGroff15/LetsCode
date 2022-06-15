package br.com.letscode.exercicios;

public class Valores {
	public String testar(int a, int b, int c, int d) {

		if ((b > c) && (d > a) && ((c+d) > (a+b)) && (c>0) && (d> 0) && ((a%2)==0)) {
			return "Valores aceitos";
		}

		return "Valores não aceitos";

	}

}
