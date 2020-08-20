package it.start.stars;

import java.util.Scanner;

public class QuadratoVerticale {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
	
		System.out.println("inserisci ampiezza lato");
		n=sc.nextInt();
		
		int k=1;
		String ks;
		
		for(int i=0;i<n;i++) {

			for(int j=0;j<n;j++) {

				k=j+1;
				if(k<10) {
					ks="0"+k;
					
				}
				else
					ks=""+k;
				
				System.out.print(ks+" ");
			}
			System.out.println("");
			
	    }
		sc.close();

	}

}
