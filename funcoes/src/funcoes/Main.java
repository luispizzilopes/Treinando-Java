package funcoes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		int v1 = sc.nextInt(); 
		int v2 = sc.nextInt(); 
		int v3 = sc.nextInt(); 
		
		int maiorValor = maxValue(v1, v2, v3); 
		System.out.println("Maior valor: " + maiorValor);
	}

	public static int maxValue(int x, int y, int z) {
		int aux = 0; 
		if(x > y && x > z) {
			aux = x; 
		}
		else if(y > x && y > z) {
			aux = y; 
		}
		else if(z > x && z > y) {
			aux = z; 
		}
		return aux; 
	}
}
