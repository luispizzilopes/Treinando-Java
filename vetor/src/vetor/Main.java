package vetor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int qnt = sc.nextInt(); 
		double[] alturas = new double[qnt]; 
		double media = 0; 
		
		for(int i=0; i<qnt; i++) {
			alturas[i] = sc.nextDouble(); 
			media += alturas[i]; 
		}
		
		media = media / qnt; 
		System.out.println(media);
		
		sc.close();
	}

}
