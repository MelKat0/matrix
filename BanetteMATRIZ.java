package lpa5;

import java.util.Scanner;

public class BanetteMATRIZ {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		
		int m[][] = new int [5][5], soma = 0, valor;

		for (int l = 0; l <5; l++) {
			for (int c = 0; c<5; c++) {
				valor = (int)Math.round(Math.random()*100);
	
		if (valor % 2 == 0) {
			m[l][c] = valor;
			soma = soma + m[l][c];
		}
			}
			
		}
		for (int l = 0; l<5; l++) {
			for (int c = 0; c<5; c++) {
				System.out.println("Os valores são " + m[l][c]);
			}
		}
		System.out.println("A soma é " + soma);
		ler.close();
	}

}
