package exercicio_matriz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int l = sc.nextInt(); 
		int c = sc.nextInt(); 
		
		int[][] matriz = new int[l][c]; 
		
		for(int i=0; i<l; i++) {
			for(int j=0; j<c; j++) {
				matriz[i][j] = sc.nextInt(); 
			}
		}
		
		int buscar = sc.nextInt(); 
		
		for(int i=0; i<l; i++) {
			for(int j=0; j<c; j++) {
				if(matriz[i][j] == buscar) {
					System.out.println("Esquerda: " + matriz[i][j-1]);
					System.out.println("Direita: " + matriz[i][j+1]);
					System.out.println("Acima: " + matriz[i-1][j]);
					System.out.println("Abaixo: " + matriz[i+1][j]);
				}
			}
		}
		
		sc.close();
	}
}
