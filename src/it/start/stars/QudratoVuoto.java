package it.start.stars;

import java.util.Scanner;

public class QudratoVuoto {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
	
		System.out.println("inserisci ampiezza lato");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || i==n || j==1 ||j==n)
				    System.out.print("* "); //2 caratteri * e spazio
				else
					System.out.print("  "); //due spazi
				
			}
			System.out.println("");
	    }
		sc.close();
	}
}
