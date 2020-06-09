package it.start.stars;

public class TringoloRiflesso {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j<=n-i)
				    System.out.print("  "); //due spazi
				else
					System.out.print("* "); //2 caratteri * e spazio
				
			}
			System.out.println("");
	    }


	}

}
