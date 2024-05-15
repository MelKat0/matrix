package lpa5;

import java.util.Scanner;

public class ArceusMATRIZ {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		
		int m[][]= new int [3][3];
		
		for (int l=0; l<3; l++) {
			for (int c=0; c<3; c++) {
				m[l][c] = (int)Math.round(Math.random()*100);
			}
		}

		for (int l=0; l<3; l++) {
			for (int c=0; c<3; c++) {
				System.out.println(" Os valores são " + m[l][c]);
			}
		}
		ler.close();
	}

}
