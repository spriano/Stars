package it.start.stars;

import java.util.Scanner;

public class TringoloRiflesso {

	public static void main(String[] args) {
		int n;
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("inserisci dimensione");
		n=sc.nextInt();
		
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(j>n-1-i)
				    System.out.print("* "); //due spazi
				else
					System.out.print(". "); //2 caratteri * e spazio
				
			}
			System.out.println("");
	    }


	}

}
