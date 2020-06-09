package it.start.stars;

import java.util.Scanner;

public class Riga {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
	
		System.out.println("inserisci ampiezza linea");
		n=sc.nextInt();
		
		
		for(int j=0;j<n;j++) {
			System.out.print("* ");
		}
		sc.close();
	}

}
