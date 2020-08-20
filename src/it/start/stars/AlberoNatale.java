package it.start.stars;

import java.util.Scanner;

public class AlberoNatale {

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
		for(int i=n+1;i<=n+3;i++) {
			for(int j=1;j<=2*n-1;j++) {
				if(j>=(n-1)&&j<=(n+1))
				    System.out.print("* "); //2 caratteri * e spazio
				else
					 System.out.print("  "); //2 caratteri * e spazio
				
			}
			System.out.println("");
	    }
		
		sc.close();
	}
}
