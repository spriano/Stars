package it.start.stars;

import java.util.Scanner;

public class Piramide {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
	
		System.out.println("inserisci numero di righe");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*n-1;j++) {
				if(j>=n-(i-1)&& j<=n+(i-1))
				    System.out.print("* "); //2 caratteri * e spazio
				else
					System.out.print("  "); //due spazi
				
			}
			System.out.println("");
	    }
		sc.close();
	}
}


