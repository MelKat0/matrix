package lpa5;

import java.util.Scanner;

public class CaterpieMATRIZ {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int m[][] = new int [100][100], valor;
		
		for (int l = 0; l<4; l++) {
			for (int c = 0; c<4; c++) {
		
			if (l == c) {
			valor = (int) Math.round(Math.random()*100);
			m[l][c] = valor;
			
			
			System.out.println("A matriz resultante de " + l + "," + c + " é " + m[l][c]);
			}
			}
		}
		
	}

}
