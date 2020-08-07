package it.start.stars;

import java.util.Scanner;

public class QuadratoNumeribrutto {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
	
		System.out.println("inserisci ampiezza lato");
		n=sc.nextInt();
		
		int k=0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
				System.out.print(k+" ");
				k++;
			}
			System.out.println("");
	    }
		sc.close();

	}

}
